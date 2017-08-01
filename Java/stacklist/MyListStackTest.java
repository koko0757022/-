package stacklist;

public class MyListStackTest {

	public static void main(String[] args) {
		MyListStack listStack = new MyListStack();
		
		listStack.push("A");
		listStack.push("B");
		listStack.push("C");
		
		listStack.printAll();
		
		System.out.println(listStack.pop());
		System.out.println(listStack.pop());
	}

}
