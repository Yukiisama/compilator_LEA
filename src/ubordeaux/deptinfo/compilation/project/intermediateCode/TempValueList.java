package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class TempValueList {
	private TempValue head;
	private TempValueList tail;

	public TempValueList(TempValue head, TempValueList tail) {
		super();
		this.head = head;
		this.tail = tail;
	}
	
	public TempValue getHead() {
		return head;
	}

	public TempValueList getTail() {
		return tail;
	}

	@Override
    public String toString() {
        String string="TempValueList ( " +head.toString() +", ";
        TempValueList args_clone = tail;
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
