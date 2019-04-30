package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.intermediateCode.Const;
import ubordeaux.deptinfo.compilation.project.intermediateCode.LabelLocation;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Name;
import ubordeaux.deptinfo.compilation.project.type.Type;
import ubordeaux.deptinfo.compilation.project.type.TypeBoolean;
import ubordeaux.deptinfo.compilation.project.type.TypeInt;
import ubordeaux.deptinfo.compilation.project.type.TypePointer;
import ubordeaux.deptinfo.compilation.project.type.TypeString;

public final class NodeLiteral extends NodeExp {

	private Object value;

	public NodeLiteral(Type type, Object value) {
		super();
		this.type = type;
		this.value = value;
	}

	public String toString() {
		return this.getClass().getSimpleName() + '#' + value + ':' + type + '#';
	}

	@Override
	public boolean checksType() {
		super.checksType();
		return true;
	}

	public String toDotNodeName() {
		return "NodeLiteral " + value.toString();
	}

	@Override
	public NodeLiteral clone() {
		return new NodeLiteral(type, value);
	}
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeLiteral failed on generateIntermediateCode");
			return;
		}
		
		if(type.equals(new TypeBoolean())) {
			boolean bool = (boolean) this.value;
			int val;
			if(bool==true) 
				val = 1;
			else
				val = 0;
			super.exp = new Const(val);
		}
		if(type.equals(new TypePointer())) {
			super.exp = new Const(0);
		}
		if(type.equals(new TypeString())) {
			String val = (String) this.value;
			LabelLocation labellolo= new LabelLocation(val);
			super.exp = new Name(labellolo);
		}
		if(type.equals(new TypeInt())) {
			int val = (int) this.value;
			
			super.exp = new Const(val);
		}
	}

}
