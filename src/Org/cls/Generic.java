package Org.cls;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public interface Generic {

	public static void main(String[] args) {
		
		List<Integer> r= new LinkedList<Integer>();
		r.add(310);
		r.add(410);
		r.add(1000);
		r.add(123);
		r.add(12);
		r.add(11);
		r.add(190);
		
		LinkedlistUsingForloop(r);
		
	
		
		List<Integer> j = new Vector<Integer>();
		j.add(890);
		j.add(15);
		j.add(12);
		j.add(13);
		j.add(14);
		
	
		
		System.out.println(r);
		
		System.out.println("Second list : "+j);
		
		List<Integer> m = new ArrayList<>();
		m.addAll(j);
		
		System.out.println(m);
		
		int siz = r.size();
		System.out.println("Size:"+siz);
		
		int index = r.indexOf(1000);
		System.out.println("IndexOf:"+index);
		
		
		int ge = r.get(4);
		System.out.println("get value:"+ge);
		
		r.add(3, 707);
		System.out.println("Updated List added:"+r);
		
		r.set(5,1030 );
		System.out.println("Set value in list:"+r);
		
		 r.remove(3);
		 System.out.println("Remove 3rd index value:"+r);
		 
		 boolean contain = r.contains(200);
		 System.out.println("integer is here or not: "+contain);
		 
		 boolean empty = r.isEmpty();
		 System.out.println("list is empty or not:"+empty);
		 
		 int ind = r.indexOf(410);
		 System.out.println("410 index value is:" +ind);
		 
		 int lastInd = r.lastIndexOf(11);
		 System.out.println("11 index lastly denoted value is :" +lastInd);
		 

		 r.addAll(j);
		 System.out.println(r);
		 
		 r.removeAll(j);
		 System.out.println(r);
		 
		 r.retainAll(j);
		 System.out.println(r);
		 
			List<Integer> r1= new LinkedList<Integer>();
			r1.add(310);
			r1.add(410);
			r1.add(1000);
			r1.add(123);
			r1.add(12);
			r1.add(11);
			r1.add(190);
			
			LinkedlistUsingForloop(r1);
		 
		
		
		 
	}



	public static void LinkedlistUsingForloop(List<Integer> r1) {
		for (int i = 0; i <r1.size(); i++) {
			System.out.println(r1.get(i));
			
		}
		
	}
}
