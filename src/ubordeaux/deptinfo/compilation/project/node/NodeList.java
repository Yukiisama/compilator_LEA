package ubordeaux.deptinfo.compilation.project.node;

import java.util.Iterator;

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
		if(index<=this.size()-2) {
			NodeStm stm = (NodeStm)this.get(index);
			return stm.getStm();
		}
		NodeStm stm2 = (NodeStm)this.get(index);
		return new Seq(stm2.getStm(),createSeq(index++));
	}
	
	public void generateIntermediateCode() {
		if(!this.checksType()) {
			System.out.println("NodeCaseList failed on generateIntermediateCode");
			return;
		}
		
		//Genère le code intermédiaire des noeuds fils.
		for (int i = 0; i<this.size(); i++)
			this.get(i).generateIntermediateCode();
		
		super.stm = createSeq(0);
		
		System.out.println(super.stm.toString());
			
	}
	

}
