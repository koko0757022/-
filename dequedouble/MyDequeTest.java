package dequedouble;

public class MyDequeTest {

	public static void main(String[] args) {
		MyDeque deque = new MyDeque();
		deque.insertFront("A");
		deque.insertFront("B");
		deque.insertFront("C");
		
		deque.printAll();
		
		deque.insertRear("Y");
		deque.insertRear("Z");
		
		deque.printAll();
		
		deque.deleteFront();
		deque.printAll();
		
		deque.deleteRear();
		deque.printAll();
		
		deque.deleteFront();
		deque.printAll();
	}

}
