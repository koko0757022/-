package doublelinkedlist;

public class MyDoubleLInkedList {
	private DListNode head;
	int count;

	public MyDoubleLInkedList() {
		head = null;
		count = 0;
	}

	public DListNode addElement(String data) {
		DListNode newNode = new DListNode(data);
		
		newNode.prev = null;
		newNode.next = null;

		if (head == null) {
			head = newNode; // �ּҰ� ����
		} else {
			DListNode tempNode = head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
			newNode.prev = tempNode;
		}
		count++;
		return newNode;
	}

	public DListNode insertElement(int position, String data) {
		if (position < 0 || position > count) {
			return null;
		}

		DListNode newNode = new DListNode(data);
		DListNode tempNode = head;

		if (position == 0) {
			newNode.next = tempNode;
			tempNode.prev = newNode;
			head = newNode;
		} else {
			DListNode preNode = null; // �ʱ�ȭ ����ߵȴ�.Ƣ��;� �Ǵϱ�..
			for (int i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.prev = preNode;
			newNode.next = preNode.next; // null�̶� ���������.
			preNode.next = newNode;
			if (tempNode != null) { // �� ������ ��Ȳ���� �Ͼ��.
				tempNode.prev = newNode;
			}
		}
		count++;
		return newNode;
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public DListNode removeElement(int position) {
		if (position < 0 || position >= count) {
			System.out.println("position�� �߸� �Ǿ����ϴ�.");
			return null;
		}
		DListNode tempNode = head;
		if (position == 0) {
			head.next.prev = null;
			head = tempNode.next;
		} else {
			DListNode preNode = new DListNode();
			for (int i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
			if (tempNode.next != null) {
				tempNode.next.prev = preNode;
			}
		}
		count--;
		System.out.println((position) + "��° �׸�" + tempNode.getData() + "�� �����Ǿ����ϴ�.");
		return tempNode;

	}

	public int getSize() {
		return count;
	}
	
//	 public DListNode getNode(int position) {
//		 
//	 }
	
	 public void removeAll() {
		 head = null;
		 count = 0;
	 }

	public void printAll() {
		if (isEmpty()) {

			System.out.println("����� �׸��� �����ϴ�.");
			return;
		}
		DListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if (temp != null) {
				System.out.print("<->");
			}
		}
		System.out.println("");
	}
}
