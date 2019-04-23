package ubordeaux.deptinfo.compilation.project.environment;
import java.util.HashMap;
import ubordeaux.deptinfo.compilation.project.main.*;
import ubordeaux.deptinfo.compilation.project.type.Type;
import ubordeaux.deptinfo.compilation.project.type.TypeFeature;
import ubordeaux.deptinfo.compilation.project.type.TypeFunct;
import ubordeaux.deptinfo.compilation.project.type.TypeList;

import java.util.Map;

public class Environment implements EnvironmentInt {

	private Map<String, Type> table;
	private Map<String, Integer> table_enum;
	private String str;
	
	public Environment(String str) {
		this.table = new HashMap<String, Type>();
		this.table_enum = new HashMap<String, Integer>();
		this.str = str;
		
	}

	@Override
	public void putVariable(String variable, Type value) {
		table.put(variable, value);
		System.out.println("Enregistre " + variable + " " + value);
	}

	@Override
	public Type getVariableValue(String variable) {
		System.out.println("Retrouve1 " + variable + " " + table.get(variable));
		return table.get(variable);
	}
	public void putFunction(String variable, Type value) {
		TypeFunct x = (TypeFunct)table.get(variable);
		if(table.get(variable)!=null && x.getDefined()!= true) {
			table.put(variable, value);
		}
		else if(table.get(variable)==null)
			table.put(variable, value);
		//table.put(variable, );
		System.out.println("Enregistre " + variable + " " + value);
	}
	


	
	public Type getFunction(String variable) {
		System.out.println("Retrouve2 " + variable + " " + table.get(variable));
		return table.get(variable);
	}
	
	public void put_enum_value(String variable, int value) {
		table_enum.put(variable, value);
		System.out.println("Enregistre " + variable + " " + value);
	}
	
	public int get_enum_value(String variable) {
		System.out.println("Retrouve3 " + variable + " " + table_enum.get(variable));
		return table_enum.get(variable);
	}

	
	


}
