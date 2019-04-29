package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class LabelLocationList {
	private LabelLocation head;
	private LabelLocationList tail;

	public LabelLocationList(LabelLocation head, LabelLocationList tail) {
		super();
		this.head = head;
		this.tail = tail;
	}
	
	
    public LabelLocation getHead() {
		return head;
	}

	public LabelLocationList getTail() {
		return tail;
	}


	@Override
    public String toString() {
        String string="LabelLocationList ( " +head.toString() +", ";
        LabelLocationList args_clone = tail;
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
