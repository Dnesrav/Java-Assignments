package Exercise2;

import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {
	public static void main(String args[]) {
		Vector<Integer> numbers= new Vector<Integer>();
		Vector<Integer> additional= new Vector<Integer>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(7);
		numbers.add(2);
		numbers.addElement(199);
		numbers.add(5);
		numbers.add(8);
		numbers.add(3);
		numbers.addElement(1999);
		numbers.add(1);
		numbers.add(18);
		additional.add(11);
		additional.add(12);
		additional.add(13);
		additional.add(14);
		numbers.addAll(additional);
		
		System.out.println("Vector contains 12 "+numbers.contains(12));
		System.out.println(""+numbers.firstElement());
		System.out.println(numbers.lastElement());
		System.out.println(numbers.isEmpty());
		System.out.println(numbers.capacity());
		System.out.println(numbers.size());
		System.out.println(numbers.get(10));
		System.out.println(numbers.hashCode());
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		System.out.println();
		numbers.remove(12);
		numbers.remove((Integer)18);
		numbers.removeElementAt(4);
		System.out.print(numbers);
		Vector<Integer> duplicate= new Vector<Integer>();
		duplicate= (Vector<Integer>) numbers.clone();
		System.out.println(numbers.indexOf(additional));
		duplicate.setElementAt(1,9);
		
		System.out.println(duplicate.get(-2));
	}

}
