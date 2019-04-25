package ubordeaux.deptinfo.compilation.project.intermediateCode;

public class Call extends Exp {
	private Exp func;
	private ExpList args;

	public Call(Exp func, ExpList args) {
		super();
		this.func = func;
		this.args = args;
	}
	
    @Override
    public String toString() {
        String string="IC: Call " +func.toString() +"( ";
        ExpList args_clone = args;
        while(args_clone.getTail()!=null) {
            string = string + args_clone.getHead().toString() +", ";
        }
        string = string.substring(0,string.length()-1);
        string =string + ")";
        return string;
    }
}
