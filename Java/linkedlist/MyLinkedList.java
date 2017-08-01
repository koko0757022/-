package linkedlist;

public class MyLinkedList {
	
	private ListNode head; //head�� �ִ°� ����.
	private int count;

	public MyLinkedList() {
		head = null;
		count = 0;
	}

	public ListNode addElement(String data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			ListNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}

	public ListNode insertElement(int position, String data) {
		if (position < 0 || position > count) {
			return null;

		}
		ListNode newNode = new ListNode(data);

		if (position == 0) {
			newNode.next = head;
			head = newNode;

		} else {

			ListNode preNode = null;
			ListNode tempNode = head;
			for (int i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++; // list ����
		return newNode;
	}

	public ListNode removeElement(int position) {
		// 3500��

		ListNode preNode = null;
		ListNode tempNode = head;
		
		if (isEmpty()) {
			System.out.println("������ �׸��� �����ϴ�.");
			return null;
		}

		if (position < 0 || position >= count) {
			System.out.println("������ ��ġ ����" + getSize());
			return null;
		}
		if (position == 0) {
			head = head.next;

		} else {
			for (int i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		return tempNode;
	}

	public int getSize() {
		return count;
	}

	public void Empty() {
		head = null;
		count = 0;
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public String getElement(int position) {
		ListNode preNode = null;
		ListNode tempNode = head;

		for (int i = 0; i < position; i++) {
			
			tempNode = tempNode.next;
		}
		return tempNode.getData();
	}

	public ListNode getNode(int position) {
		ListNode tempNode = head;

		if(position <0 || position >= count){
			System.out.println("�����Դϴ�.");
			return null;
		}
		if (position == 0) {
			return head;
		} else {
			for (int i = 0; i < position; i++) {
				tempNode = tempNode.next;
			}
			return tempNode;
		}
	}

	public void printAll() {
		if (count == 0) {
			System.out.println("����� ������ �����ϴ�!!!");
			return;
		}

		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if (temp != null)
				System.out.print("->");
		}
		System.out.println();
	}
	public void reverseList(){
		ListNode nextNode = head;
		ListNode curNode = null;
		ListNode preNode = null;
		
		while(nextNode != null){
			preNode = curNode;
			curNode = nextNode;
			nextNode = nextNode.next;			
			curNode.next = preNode;	
			
		}
		head = curNode;
	}
}
