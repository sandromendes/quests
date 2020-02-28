package quest.challenge.hannoi;

import java.util.Stack;

public class StackMainApp {

	public static void main(String[] args) {

		Stack<Integer> origin = new Stack<Integer>();
		origin.push(1);
		origin.push(10);
		origin.push(4);
		origin.push(7);
		origin.push(3);
		origin.push(12);
		
		System.out.println("Pilha original: " + origin);
		
		Stack<Integer> swapSort = StackOrder.sortSwap(origin);
		
		System.out.println("Pilha ordenada por swap simples: " + swapSort);
		
		Stack<Integer> hannoiSort = StackOrder.sortHannoi(origin);
		
		System.out.println("Pilha ordenada por Hannoi: " + hannoiSort);
	}

}
