package ubordeaux.deptinfo.compilation.project.environment;
import ubordeaux.deptinfo.compilation.project.type.Type;
public interface EnvironmentInt {
	
	void putVariable(String var, Type value);
	Type getVariableValue(String variable);
	

}
