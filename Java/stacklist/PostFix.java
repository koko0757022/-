package stacklist;

import arraystack.MyArrayStack;

public class PostFix {
	MyArrayStack evalStack;

	public int evaluation(String expr) {
		int op1, op2, value;
		char testCh;
		evalStack = new MyArrayStack();

		for (int i = 0; i < expr.length(); i++) {
			
			testCh = expr.charAt(i);
			if (testCh != '+' && testCh != '-' && testCh != '*' && testCh != '/') {
				value = testCh - '0'; // 아스키 코드값을 빼준다.
				evalStack.push(value);
				
			} else {
				op2 = evalStack.pop();
				op1 = evalStack.pop();
				switch (testCh) {
				case '+':
					evalStack.push(op1 + op2);
					break;
				case '-':
					evalStack.push(op1 - op2);
					break;
				case '*':
					evalStack.push(op1 * op2);
					break;
				case '/':
					evalStack.push(op1 / op2);
					break;
					
				}
			}
		} //end for
		return evalStack.pop();
	}

	public static void main(String[] args) {
		PostFix postFix = new PostFix();
		System.out.println(postFix.evaluation("123+*")); // 후위연산자
	}
}
