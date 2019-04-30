package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class ExpList implements IntermediateCode {
	private Exp head;
	private ExpList tail;

	public ExpList(Exp head, ExpList tail) {
		super();
		this.head = head;
		this.tail = tail;
	}

	public Exp getHead() {
		return head;
	}

	public ExpList getTail() {
		return tail;
	}
	
	public void add(Exp exp) {
		ExpList t = new ExpList(this.head,this.tail);
		this.head = exp;
		this.tail = t;
	}

	@Override
	public void canonicalTransformation() {
		// TODO Auto-generated method stub
		System.err.println("TODO: " + this.getClass().getSimpleName() + ".canonicalTransformation()()");
	}
	
    @Override
    public String toString() {
        String string="ExpList ( " +head.toString() +", ";
        ExpList args_clone = tail;
        while(args_clone.getTail()!=null) {
            string = string + args_clone.getHead().toString() +", ";
            args_clone = args_clone.getTail();
        }
        //à cause de la derniere virgule.
        string = string.substring(0,string.length()-2);
        string =string + " )";
        return string;
    }

}
