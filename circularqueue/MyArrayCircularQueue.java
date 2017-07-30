package circularqueue;

interface IQueue {
	
	//void enQueue(Object object);
	void enQueue(char ch);
	char dqQueue();
	char peek();
	void printAll();
	
}

public class MyArrayCircularQueue implements IQueue{

	private int front;
	private int rear;
	private int QUEUE_SIZE;
	char[] itemArr;
	
	public MyArrayCircularQueue(int size) {//생성자
		front = 0;
		rear = 0;
		QUEUE_SIZE = size;
		itemArr = new char[QUEUE_SIZE];
	}
	
	
	@Override
	public void enQueue(char ch) {
		if(isFull()){
			System.out.println("queue is full");
			return;
		}
		rear = (rear + 1)% QUEUE_SIZE;
		itemArr[rear] = ch;
			
	}

	@Override
	public char dqQueue() {
		if(isEmpty()){
			System.out.println("비어있다.");
			return (char) -1;
		}
		front = (front+1)%QUEUE_SIZE;
		return itemArr[front];
	}

	@Override
	public char peek() {
		if(isEmpty()){
			System.out.println("비어있다.");
			return (char) -1;
		}
		
		return itemArr[(front+1)%QUEUE_SIZE];
	}

	@Override
	public void printAll() {
		if(isEmpty()){
			System.out.println("비어있다.");
			return;
		}
		for(int i =(front+1)% QUEUE_SIZE ;i != (rear+1)%QUEUE_SIZE ; i=(++i % QUEUE_SIZE)){
			System.out.print(itemArr[i] + " ");
		}
	}
	public boolean isEmpty(){
		return (front == rear);
	}
	public boolean isFull(){
		return ((rear+1)%QUEUE_SIZE == front);
	}

}
