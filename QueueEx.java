package Exercise2;

import java.util.PriorityQueue;

public class QueueEx {
	public static void main(String args[]) {
		PriorityQueue<Integer> numbers= new PriorityQueue<Integer>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(7);
		numbers.add(2);
		numbers.add(5);
		numbers.add(8);
		PriorityQueue<String> check= new PriorityQueue<String>();
		check.add("dhinesh");
		check.add("Dhamo");
		check.add("siddhesh");
		check.add("Aishwary");
		check.add("lakhan");
		check.add("gopi");
		check.add("Rusikesh");
		System.out.println(check);
		System.out.println(numbers);
		System.out.println(numbers.element());
	}
}
