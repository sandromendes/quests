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
	
}
