package ubordeaux.deptinfo.compilation.project.environment;
import java.util.HashMap;
import java.util.Map;

public class Environment implements EnvironmentInt {

	private Map<String, Double> table;
	private String str;
	public Environment(String str) {
		this.table = new HashMap<String, Double>();
		this.str = str;
	}

	@Override
	public void putVariable(String variable, Double value) {
		table.put(variable, value);
		System.out.println("Enregistre " + variable + " " + value);
	}

	@Override
	public Double getVariableValue(String variable) {
		System.out.println("Retrouve " + variable + " " + table.get(variable));
		return table.get(variable);
	}


}
