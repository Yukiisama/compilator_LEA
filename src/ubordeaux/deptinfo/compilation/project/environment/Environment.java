package ubordeaux.deptinfo.compilation.project.environment;
import java.util.HashMap;

import ubordeaux.deptinfo.compilation.project.type.Type;
import ubordeaux.deptinfo.compilation.project.type.TypeFeature;
import ubordeaux.deptinfo.compilation.project.type.TypeList;

import java.util.Map;

public class Environment implements EnvironmentInt {

	private Map<String, Type> table;
	private String str;
	
	public Environment(String str) {
		this.table = new HashMap<String, Type>();
		this.str = str;
		
	}

	@Override
	public void putVariable(String variable, Type value) {
		table.put(variable, value);
		System.out.println("Enregistre " + variable + " " + value);
	}

	@Override
	public Type getVariableValue(String variable) {
		System.out.println("Retrouve " + variable + " " + table.get(variable));
		return table.get(variable);
	}
	public void putFunction(String variable, Type value) {
		table.put(variable, value);
		//table.put(variable, );
		System.out.println("Enregistre " + variable + " " + value);
	}

	
	public Type getFunction(String variable) {
		System.out.println("Retrouve " + variable + " " + table.get(variable));
		return table.get(variable);
	}

	
	


}
