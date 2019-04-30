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
	
	
    public Stm getHead() {
		return head;
	}

	public StmList getTail() {
		return tail;
	}

	@Override
    public String toString() {
		if(head != null) {
	        String string="StmList ( " +head.toString() +", ";
	        StmList args_clone = tail;
	        while(args_clone.getTail()!=null) {
	            string = string + args_clone.getHead().toString() +", ";
	            args_clone = args_clone.getTail();
	        }
	        //à cause de la derniere virgule.
	        string = string.substring(0,string.length()-2);
	        string =string + " )";
	        return string;
		}else {
			return "StmList End";
		}

    }
}
