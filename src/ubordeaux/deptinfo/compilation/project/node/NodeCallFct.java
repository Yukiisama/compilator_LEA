package ubordeaux.deptinfo.compilation.project.node;

import java.util.Iterator;

import ubordeaux.deptinfo.compilation.project.type.TypeFeature;
import ubordeaux.deptinfo.compilation.project.type.TypeFunct;
import ubordeaux.deptinfo.compilation.project.type.Type;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Call;
import ubordeaux.deptinfo.compilation.project.intermediateCode.ExpList;
import ubordeaux.deptinfo.compilation.project.intermediateCode.LabelLocation;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Name;

import java.util.List;

public final class NodeCallFct extends NodeExp {

	protected String name;

	// Application
	// (f : E1 x E2 ... x Ek -> F), (arg1, arg2, ..., argk)
	public NodeCallFct(String name, TypeFunct type, NodeList args) {
		super(args);
		this.name = name;
		this.type = type;
	}

	// Application
	// (f : E1 x E2 ... x Ek -> F), (arg1, arg2, ..., argk)
	public NodeCallFct(String name, TypeFunct type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Type getType() {
		return ((TypeFunct) this.type).getRet();
	}
	public Type getTypeFUNC() {
		return ((TypeFunct) this.type);
	}
	public void setTypeFUNC(Type f) {
		this.type = f;
	}
	
	public String getName() {
		return name ;
	}
	public String toString() {
		return name + '_' + super.toString();
	}

	// On parcourt les arguments et on vérifie qu'ils sont bien typés
	// On parcourt aussi les paramètres de la fonction
	// et on regarde que les types sont égaux
	public boolean checksType() {
		boolean result2 =super.checksType();

		boolean result = true;
		Iterator<Node> itArgs = this.getArgs().iterator();
		Iterator<Type> itParams = ((TypeFunct) type).getParams().iterator();
		while (itArgs.hasNext() && itParams.hasNext()) {
			NodeExp arg = (NodeExp) itArgs.next();
			if (!arg.checksType()) {
				result = false;
				break;
			}
			Type argType = arg.getType();
			// chaque paramètre est une feature nom : type
			Type paramType = ((TypeFeature) itParams.next()).getType();
			if (!paramType.equals(argType)) {
				
				System.err.println("*** Erreur de typage  " + argType + " != " + paramType);
				result = false;
				break;
			}
		}
		// Plus ou moins d'arguments que de paramètres
		if (result && (itArgs.hasNext() || itParams.hasNext())) {
			System.err.println("*** Erreur de typage: pas le même nombre de paramètres ");
			return false;
		}
		return result;
	}

	private NodeList getArgs() {
		return (NodeList) elts.get(0);
	}

	@Override
	public NodeCallFct clone() {
		NodeCallFct node = new NodeCallFct(name, (TypeFunct) type);
		for (Node elt : this.elts) {
			node.add((Node) elt.clone());
		}
		return node;
	}

	@Override
	protected String toDotNodeName() {
		return "NodeCallFct " + name + "()";
	}

	private ExpList listArgs(int index, List<Node> list) {
		NodeExp head = (NodeExp) list.get(index);
		if(index == list.size()-1) {
			return new ExpList(head.getExp(),null);
		}
		ExpList args = new ExpList(head.getExp(), listArgs(index++, list));
		return args;
	}

	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeCallFct failed on generateIntermediateCode");
			return;
		}
		ExpList args = new ExpList(null,null);

		//Genère le code intermédiaire des noeuds fils.
		this.get(0).generateIntermediateCode();
		//On commence par le dernier élément, on rajoute petit à petit càd en tête de la liste.
		for(int i = (this.get(0)).size()-1; i>=0; i--) {
			NodeExp exp = (NodeExp) this.getArgs().get(i);
			args.add(exp.getExp());
		}
		
		
		LabelLocation label = new LabelLocation(this.name);
		super.exp = new Call(new Name(label),args);
		System.out.println("Callfct =>" + super.exp.toString());
		
	}
}
