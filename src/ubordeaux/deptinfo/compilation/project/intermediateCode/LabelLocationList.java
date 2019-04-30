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
		if(head!=null) {
	        String string1="LabelLocationList ( " +head.toString() +", ";
	        LabelLocationList args_clone = this;
	        while(args_clone.getTail()!=null) {
	            string1 = string1 + args_clone.getHead().toString() +", ";
	            args_clone = args_clone.getTail();
	        }
	        //à cause de la derniere virgule.
	        string1 = string1.substring(0,string1.length()-2);
	        string1 =string1 + " )";
	        
	        return string1;
		}else {
			return "LabelLocationList()";
		}
    }

}
