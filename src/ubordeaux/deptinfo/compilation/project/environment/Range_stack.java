package ubordeaux.deptinfo.compilation.project.environment;
import ubordeaux.deptinfo.compilation.project.type.Type;
public class Range_stack {
	private Type x;
	private int portee;
	
	public Type getType() {
		return x;
	}

	public void setType(Type x) {
		this.x = x;
	}

	public int getPortee() {
		return portee;
	}

	public void setPortee(int portee) {
		this.portee = portee;
	}

	public Range_stack (Type x , int portee) {
		this.x = x;
		this.portee = portee;
	}

}
