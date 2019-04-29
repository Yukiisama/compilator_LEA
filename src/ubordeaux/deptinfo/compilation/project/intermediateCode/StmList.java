package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class StmList extends Stm{
	private Stm head;
	private StmList tail;

	public StmList(Stm head, StmList tail) {
		super();
		this.head = head;
		this.tail = tail;
	}
	
	public void add(Stm stm) {
		StmList t = new StmList(this.head,this.tail);
		this.head = stm;
		this.tail = t;
	}
}
