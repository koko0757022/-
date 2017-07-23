package stacklist;

import linkedlist.ListNode;
import linkedlist.MyLinkedList;

public class MyListStack {
	MyLinkedList stack;
	ListNode top;
	int count;

	public MyListStack() {
		stack = new MyLinkedList();
		top = null;
		count = 0;
	}

	public void push(String data) {
		top = stack.addElement(data);
		count++;
	}

	public String pop() {
		if (isEmpty()) {
			System.out.println("비어있다.");
			return null;
		}
		ListNode topNode = stack.removeElement(count - 1);
		count--;

		top = stack.getNode(count-1);
		return topNode.getData();
	}

	public String peek() {
		return top.getData();
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}
	public void printAll(){
		stack.printAll();
	}
	public int getSize(){
		return stack.getSize();
	}
}
