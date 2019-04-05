package ubordeaux.deptinfo.compilation.project.type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IdentifierList extends TypeAtomic implements Iterable<String> {

	private List<String> list;

	public IdentifierList() {
		this.list = new ArrayList<String>();
	}

	public IdentifierList(String id) {
		this();
		this.list.add(id);
	}

	@Override
	public Type clone() {
		IdentifierList result = new IdentifierList();
		for (String str : list)
			list.add(str);
		return result;
	}

	public void add(String id) {
		this.list.add(id);
	}

	@Override
	public Iterator<String> iterator() {
		Iterator<String> iprof = list.iterator();
		return iprof;
	}

	public String first() {
		return list.get(0);
	}

	public String last() {
		return list.get(list.size()-1);
	}

}
