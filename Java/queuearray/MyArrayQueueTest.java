package queuearray;

public class MyArrayQueueTest {

	public static void main(String[] args) {
		IQueue queue = new MyArrayQueue(4); //interface���ִ°͸� ����� �� �ִ�.
		queue.enQueue('F');
		queue.enQueue('A');
		queue.enQueue('B');
		queue.enQueue('C');
		
		queue.printAll();
		
//		System.out.println(queue.peek());
//		System.out.println(queue.dqQueue());
//		System.out.println(queue.dqQueue());
//		System.out.println(queue.dqQueue());
	}
}
