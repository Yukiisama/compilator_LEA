package ubordeaux.deptinfo.compilation.project.environment;


import ubordeaux.deptinfo.compilation.project.type.Type;
import ubordeaux.deptinfo.compilation.project.type.TypeVoid;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;




public class StackEnvironment {

	private String str;

	private Stack<Map<String, Type>> stack;
	
	public StackEnvironment(String str) {
		//this.table = new HashMap<String, Type>();
		this.stack = new Stack<Map<String, Type>>();
		this.str = str;
	}
	
	public void putVariable(String variable, Type value) {
		if(!this.stack.empty()) 
			stack.peek().put(variable, value);
		System.out.println("Enregistre dans stack   " + variable + " " + value );
	}
	


	public Type getVariableValue(String variable) {
		if(!this.stack.isEmpty()) {
		stack.peek().get(variable);
		System.out.println("Retrouve dans stack   " + variable + " " + stack.peek().get(variable));
		return stack.peek().get(variable);
		}
		return new TypeVoid();
		
	}
	
	public void push_stack() {
		System.out.println("Stack PUSH");
		if(!this.stack.isEmpty())
			this.stack.push(new HashMap<String, Type>(this.stack.peek()));
		else
			this.stack.push(new HashMap<String, Type>());
	}
	public void pop_stack() {
		if(!this.stack.isEmpty()) {
			
			this.stack.pop();
			System.out.println("Stack PUSH");
		}
		
	}
}
