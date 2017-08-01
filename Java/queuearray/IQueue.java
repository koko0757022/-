package queuearray;

public interface IQueue {
	
	//void enQueue(Object object);
	void enQueue(char ch);
	char deQueue();
	char peek();
	void printAll();
	
}
