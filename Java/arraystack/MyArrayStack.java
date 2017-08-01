package arraystack;

import array.MyArray;

public class MyArrayStack {
	
	private MyArray stack;
	private int top;
	
	public MyArrayStack() {
		stack = new MyArray();
		top = 0;
	}
	
	public void push(int data){
		if(top==stack.ARRAY_SIZE){
			System.out.println("stack is full");
		}
		stack.addElement(data);
		top++;
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return MyArray.ERROR_NUM;  //static이기 때문이다.
		}
		int num = stack.removeElement(top-1);
		top--;
		return num;
	}
	
	public int peek(){
		
		if(isEmpty()){
			System.out.println("Stack is empty");
			return MyArray.ERROR_NUM;
		}
		return stack.getElement(top-1);
	}
	
	public boolean isEmpty(){
		if(top <= 0)return true;
		else return false;
	}
	
	public void printAll(){
		stack.printAll();
	}
	public int getSize(){
		return stack.getSize();
	}
}
