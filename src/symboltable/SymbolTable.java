package symboltable;

import AST.definitions.Definition;

import java.util.*;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String, Definition>> table;

	public SymbolTable()  {
		table = new ArrayList<>();
		table.add(new HashMap<String, Definition>());
	}

	public void set() {
		table.add(new HashMap<String, Definition>());
		scope++;
	}
	
	public void reset() {
		table.remove(table.size() - 1);
		scope--;
	}
	
	public boolean insert(Definition definition) {
		if(!table.get(table.size() - 1).containsKey(definition.getName())) {
			definition.setScope(scope);
			table.get(table.size() - 1).put(definition.getName(), definition);
			return true;
		}

		return false;
	}
	
	public Definition find(String id) {
		for (int i = table.size()-1; i>=0; i--){
			if(table.get(i).containsKey(id)) {
				return table.get(i).get(id);
			}
		}

		return null;
	}

	public Definition findInCurrentScope(String id) {
		return table.get(table.size() - 1).get(id);
	}
}
