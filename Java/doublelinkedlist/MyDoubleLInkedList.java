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
			head = newNode; // 주소가 복사
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
			DListNode preNode = null; // 초기화 해줘야된다.튀어나와야 되니깐..
			for (int i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.prev = preNode;
			newNode.next = preNode.next; // null이라 상관없구만.
			preNode.next = newNode;
			if (tempNode != null) { // 맨 끝에일 상황에서 일어난다.
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
			System.out.println("position이 잘못 되었습니다.");
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
		System.out.println((position) + "번째 항목" + tempNode.getData() + "가 삭제되었습니다.");
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

			System.out.println("출력할 항목이 없습니다.");
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
