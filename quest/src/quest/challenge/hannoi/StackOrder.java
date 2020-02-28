package quest.challenge.hannoi;

import java.util.Stack;

public class StackOrder {

	// input [1, 10, 4, 7, 3, 12]
	// output [1, 3, 4, 7, 10, 12]
	public static Stack<Integer> sortSwap(Stack<Integer> input){
		Stack<Integer> origin = new Stack<Integer>();
		origin.addAll(input);
		
		Stack<Integer> output = new Stack<Integer>();
		
		while(!origin.isEmpty()) {
			
			Integer temp = origin.pop();
			
			while (!output.isEmpty() && output.peek() > temp) {
				origin.push(output.pop());
			}
			
			output.push(temp);
			
			System.out.println("Entrada: " + origin);
			System.out.println("Saída: " + output);
		}
		
		return output;
	}
	
	public static Stack<Integer> sortHannoi(Stack<Integer> input) {
		
		Stack<Integer> left = new Stack<Integer>();
		Stack<Integer> middle = new Stack<Integer>();
		Stack<Integer> right = new Stack<Integer>();
		
		left.addAll(input);
		
		Integer finalSize = left.size();
		
		while(right.size() < finalSize) {
			//move from left to middle or right
			if(!left.isEmpty() && (middle.isEmpty() || middle.peek() > left.peek())) {
				middle.push(left.pop());
				continue;
			} else if (!left.isEmpty() && (right.isEmpty() || right.peek() > left.peek())) {
				right.push(left.pop());
				continue;
			}
			
			//move from middle to right or left
			if(!middle.isEmpty() && (right.isEmpty() || right.peek() > middle.peek())) {
				right.push(middle.pop());
				continue;
			} else if (!middle.isEmpty() && (left.isEmpty() || left.peek() > middle.peek())) {
				left.push(middle.pop());
				continue;
			}
			
			//move from right to left or middle
			if(!right.isEmpty() && (left.isEmpty() || left.peek() > right.peek())) {
				left.push(right.pop());
				continue;
			} else if (!right.isEmpty() && (middle.isEmpty() || middle.peek() > right.peek())) {
				middle.push(right.pop());
				continue;
			}
		}
		
		return right;
	}
	
}
