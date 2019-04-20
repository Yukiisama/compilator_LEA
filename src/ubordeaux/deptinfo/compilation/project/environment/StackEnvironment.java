package ubordeaux.deptinfo.compilation.project.environment;
import java.util.Stack;

import ubordeaux.deptinfo.compilation.project.type.*;

public class StackEnvironment {
	private String str;
	private Stack stack;
	
	public StackEnvironment(String str) {
		this.str = str;
		this.stack = new Stack();
	}
}
