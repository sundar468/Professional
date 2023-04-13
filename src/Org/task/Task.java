package Org.task;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Task {
	
	public static void main(String[] args) {
		List<Integer> r= new ArrayList<>();
		r.add(310);
		r.add(410);
		r.add(1000);
		r.add(123);
		r.add(12);
		r.add(11);
		r.add(12);
		r.add(190);
		
		System.out.println(r);
		
		Set<Integer> l = new LinkedHashSet<>();
		l.addAll(r);
		System.out.println("New Set Data: "+l );
	}

	
}
