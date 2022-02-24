package Exercise2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrListEx {
	public static void main(String args[]) {
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(7);
		numbers.add(2);
		numbers.add(5);
		numbers.add(8);
		numbers.add(3);
		numbers.add(1);
		numbers.add(18);
		System.out.println(numbers.isEmpty());
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		System.out.println();
		/*Iterator Itr=numbers.iterator();
		for(;Itr.hasNext();) {
			System.out.println(Itr.next());
		}*/
		numbers.remove((Integer)18);
		System.out.print(numbers);
	}

}
