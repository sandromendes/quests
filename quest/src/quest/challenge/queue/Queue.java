package quest.challenge.queue;

import java.util.Stack;

public class Queue {
	
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	
	public Queue() {
		this.s1 = new Stack<Integer>();
		this.s2 = new Stack<Integer>();
	}
	
	public void enqueue(Integer element) {
		this.s1.push(element);
	}

	public Integer dequeue() {
		if(s1.isEmpty() && s2.isEmpty()) {
			System.out.println("Não foi possível efetuar a operação: a fila está vazia.");
			return null;
		} else {
			if(!s1.isEmpty()) {
				while(!s1.isEmpty()) {
					s2.push(s1.pop());
				}
			} 
		}
		
		Integer element = s2.pop();
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
		return element;
	}
	
	public boolean isEmpty() {
		return s1.isEmpty();
	}
	
	@Override
	public String toString() {
		String value = "Empty";
		
		Stack<Integer> temp = new Stack<Integer>();
		temp.addAll(s1);
		
		if(!temp.isEmpty()) {
			value = "";
			
			while(!temp.isEmpty()) {
				value += " | " + temp.pop();
			}
		} 
		
		return value;
	}
}
