package linkedlistqueue;

public class MyListQueueTest {

	public static void main(String[] args) {
		Queue queue = new MyListQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		queue.printAll();
		System.out.println(queue.deQueue());
		queue.printAll();
	}

}
