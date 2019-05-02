package ubordeaux.deptinfo.compilation.project.node;

import java.util.Iterator;

import ubordeaux.deptinfo.compilation.project.intermediateCode.ExpStm;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Seq;
import ubordeaux.deptinfo.compilation.project.intermediateCode.Stm;
import ubordeaux.deptinfo.compilation.project.intermediateCode.StmList;

public final class NodeList extends NodeStm {

	public NodeList(Node stm) {
		super(stm);
	}
	
	public NodeList() {
		super();
	}

	@Override
	public boolean checksType() {
		super.checksType();
		boolean result = true;
		for (Node elt : this.elts) {
			if (elt != null && !elt.checksType()) {
				result = false;
				break;
			}
		}
		return result;
	}

	public Iterator<Node> iterator() {
		return this.elts.iterator();
	}

	public int size() {
		return this.elts.size();
	}

	@Override
	public NodeList clone() {
		NodeList node = new NodeList();
		for (Node elt : this.elts) {
			node.add((Node) elt.clone());
		}
		return node;
	}
	public String ToString() {
		String x = "";
		NodeList node = new NodeList();
		for (Node elt : this.elts) {
			x+=elt.toString();
			x+=" ";
		}
		return x;
	}
	
	public Stm createSeq (int index) {
		Node n = this.get(index);
		if(index<this.size())  {
		//if(index<=Math.abs(this.size()-2) ) {
			Stm stm;
			if(NodeExp.class.isAssignableFrom(n.getClass()) ) {
				stm = new ExpStm (((NodeExp)this.get(index)).getExp());
			}else {
				stm = ((NodeStm)this.get(index)).getStm();
			}
			return stm;
		}
		Stm stm;
		if(NodeExp.class.isAssignableFrom(n.getClass())) {
			stm = new ExpStm (((NodeExp)this.get(index)).getExp());
		}else {
			stm = ((NodeStm)this.get(index)).getStm();
		}
		return new Seq(stm,createSeq(index++));
	}
	
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeCaseList failed on generateIntermediateCode");
			return;
		}
		
		//Genère le code intermédiaire des noeuds fils.
		for (int i = 0; i<this.size(); i++)
			this.get(i).generateIntermediateCode();

		super.stm=this.createSeq(0);
		
		
		System.out.println(super.stm.toString());
			
	}
	

}
