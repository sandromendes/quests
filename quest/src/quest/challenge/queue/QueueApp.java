package quest.challenge.queue;

public class QueueApp {

	public static void main(String[] args) {
		Queue queue = new Queue();

		queue.enqueue(1);
		queue.enqueue(10);
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(2);
		queue.enqueue(7);
		queue.enqueue(13);
		queue.enqueue(19);
		queue.enqueue(8);
		
		System.out.println(queue.toString());
		
		while(!queue.isEmpty()) {
			queue.dequeue();
			System.out.println(queue.toString());
		}
	}

}
