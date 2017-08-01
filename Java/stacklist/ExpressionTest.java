package stacklist;

public class ExpressionTest {
	String expr;
	MyListStack listStack;

	public boolean testPair(String expr) {
		char current, openPair;
		listStack = new MyListStack();
		
		for (int i = 0; i < expr.length(); i++) { //수식의 끝까지 본다.
			current = expr.charAt(i); //현재 보고 있는 문자
			switch (current) {
			case '(':
			case '{':
			case '[':
				listStack.push(current + ""); //String으로 하기 위함이다.
				break;
			case ')':
			case '}':
			case ']':
				
				if (listStack.isEmpty())//꺼낼것이 없다면
					return false;
				else {
					openPair = listStack.pop().charAt(0);
					if ((openPair == '(' && current == ')')|| //현재 보고 있는 문자와 stack에서 꺼낸 것 비교
						(openPair == '{' && current == '}')||
						(openPair == '[' && current == ']'))
						break;
					else
						return false; //다르면 오류
				}
			}//end switch
		}//end for
		if (listStack.isEmpty())
			return true;
		else
			return false; //스택이 비어있지 않다면 오류
	}

	public static void main(String[] args) {
		ExpressionTest exprTest = new ExpressionTest();
		System.out.println(exprTest.testPair("{(A+B)}"));
		System.out.println(exprTest.testPair("{(A+B)}"));
		System.out.println(exprTest.testPair("(A+B)"));
	}
}
