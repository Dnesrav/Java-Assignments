package Exercise2;

import java.util.Stack;

public class StackEx {
	public static void main(String args[]) {
		Stack<Integer> numbers= new Stack<Integer>();
		System.out.println(numbers.isEmpty()+ " "+numbers.size());
		numbers.push(0);
		numbers.push(1);
		numbers.push(7);
		numbers.push(2);
		numbers.push(5);
		numbers.push(8);
		numbers.push(3);
		numbers.push(1);
		numbers.push(18);
		System.out.println(numbers);
		System.out.println(numbers.pop());
		System.out.println(numbers);
		System.out.println(numbers.peek());
		System.out.println(numbers);
		System.out.println(numbers.search(8));	
	}
	
}
