package arraystack;

public class MyArrayStackTest {

	public static void main(String[] args) {
		MyArrayStack arrayStack = new MyArrayStack();
		arrayStack.push(10);
		arrayStack.push(20);
		arrayStack.push(30);
		
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		System.out.println(arrayStack.pop());
		
	}
}
