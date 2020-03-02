package quest.challenge.hannoi;

import java.util.Stack;

public class HannoiPuzzle {
	
	public static Stack<Integer> move(Stack<Integer> input) {

		Stack<Integer> left = new Stack<Integer>();
		Stack<Integer> middle = new Stack<Integer>();
		Stack<Integer> right = new Stack<Integer>();

		left.addAll(input);

		Integer finalSize = left.size();

		while (right.size() < finalSize) {
			// move from left to middle or right
			if (!left.isEmpty() && (middle.isEmpty() || middle.peek() > left.peek())) {
				middle.push(left.pop());
				continue;
			} else if (!left.isEmpty() && (right.isEmpty() || right.peek() > left.peek())) {
				right.push(left.pop());
				continue;
			}

			// move from middle to right or left
			if (!middle.isEmpty() && (right.isEmpty() || right.peek() > middle.peek())) {
				right.push(middle.pop());
				continue;
			} else if (!middle.isEmpty() && (left.isEmpty() || left.peek() > middle.peek())) {
				left.push(middle.pop());
				continue;
			}

			// move from right to left or middle
			if (!right.isEmpty() && (left.isEmpty() || left.peek() > right.peek())) {
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
