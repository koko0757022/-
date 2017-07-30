package circularqueue;

public class MyCircularQueueTest {

	public static void main(String[] args) {
		MyArrayCircularQueue queue = new MyArrayCircularQueue(3);
		queue.enQueue('A');
		queue.enQueue('B');
		queue.dqQueue();
		queue.enQueue('C');
		//queue.dqQueue();
		System.out.println(queue.peek());
		queue.printAll();
//		System.out.println(queue.dqQueue());
//		queue.printAll();
	}

}
