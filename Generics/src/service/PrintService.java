package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> {
	private List<Type> list = new ArrayList<>();
	
	public void addValue(Type value) {
		list.add(value);
	}
	
	public Type first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		
		return list.get(0);
	}	
	
	public void print() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		
		for(Type aux : list) {
			System.out.println(aux);
		}
	}
	
}
