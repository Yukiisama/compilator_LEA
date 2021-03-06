package ubordeaux.deptinfo.compilation.project.environment;
import java.util.HashMap;
import ubordeaux.deptinfo.compilation.project.main.*;
import ubordeaux.deptinfo.compilation.project.type.Type;
import ubordeaux.deptinfo.compilation.project.type.TypeEnumRange;
import ubordeaux.deptinfo.compilation.project.type.TypeFeature;
import ubordeaux.deptinfo.compilation.project.type.TypeFunct;
import ubordeaux.deptinfo.compilation.project.type.TypeItemEnum;
import ubordeaux.deptinfo.compilation.project.type.TypeList;
import ubordeaux.deptinfo.compilation.project.type.TypeTuple;
import ubordeaux.deptinfo.compilation.project.type.TypeVoid; 

import java.util.Map;

public class Environment implements EnvironmentInt {

	private Map<String, Type> table;
	private Map<String, TypeItemEnum> table_enum;
	//private Map<String, String> table_id_name;
	//private Map<TypeEnumRange, String> table_enum_to_name;
	private String str;
	
	public Environment(String str) {
		this.table = new HashMap<String, Type>();
		this.table_enum = new HashMap<String, TypeItemEnum>();
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
		
		if(table.get(variable)!=null && x.getDefined()!= true ) {
			table.put(variable, value);
		}
		else if(table.get(variable)==null)
			table.put(variable, value);

		System.out.println("Enregistre " + variable + " " + value);
	}
	


	public boolean is_null(String variable) {
		if(table.get(variable)==null) 
			return true;
		return false;
	}
	public Type getFunction(String variable) {
		if(table.get(variable) == null) {
			Main.add_error_type(new String("ERROR NodeCallFct : function not declared " + variable));
			return new TypeFunct(new String(""), new TypeTuple(), null);
		}
		System.out.println("Retrouve2 " + variable + " " + table.get(variable));
		return table.get(variable);
	}
	
	public void put_enum_value(String variable, TypeItemEnum value) {
		table_enum.put(variable, value);
		System.out.println("Enregistre " + variable + " " + value);
	}
	
	public TypeItemEnum get_enum_value(String variable) {
		System.out.println("Retrouve3 " + variable + " " + table_enum.get(variable));
		return table_enum.get(variable);
	}

	/*
	public void putEnumToName(TypeEnumRange variable, String value) {
		table_enum_to_name.put(variable, value);
		System.out.println("Enregistre " + variable + " " + value);
	}

	public String getEnumToName(TypeEnumRange variable) {
		System.out.println("Retrouve1 " + variable + " " + table_enum_to_name.get(variable));
		return table_enum_to_name.get(variable);
	}
	
	public void putIDtoName(String variable, String value) {
		table_id_name.put(variable, value);
		System.out.println("Enregistre " + variable + " " + value);
	}

	public String getIDtoName(String variable) {
		System.out.println("Retrouve1 " + variable + " " + table_id_name.get(variable));
		return table_id_name.get(variable);
	}

*/

}
