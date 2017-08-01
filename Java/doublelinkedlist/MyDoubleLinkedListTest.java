package doublelinkedlist;

public class MyDoubleLinkedListTest {

	public static void main(String[] args) {
		MyDoubleLInkedList list = new MyDoubleLInkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		
		list.removeElement(0);
		list.printAll();
		
	}
}
