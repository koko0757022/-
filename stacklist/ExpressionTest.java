package stacklist;

public class ExpressionTest {
	String expr;
	MyListStack listStack;

	public boolean testPair(String expr) {
		char current, openPair;
		listStack = new MyListStack();
		
		for (int i = 0; i < expr.length(); i++) { //������ ������ ����.
			current = expr.charAt(i); //���� ���� �ִ� ����
			switch (current) {
			case '(':
			case '{':
			case '[':
				listStack.push(current + ""); //String���� �ϱ� �����̴�.
				break;
			case ')':
			case '}':
			case ']':
				
				if (listStack.isEmpty())//�������� ���ٸ�
					return false;
				else {
					openPair = listStack.pop().charAt(0);
					if ((openPair == '(' && current == ')')|| //���� ���� �ִ� ���ڿ� stack���� ���� �� ��
						(openPair == '{' && current == '}')||
						(openPair == '[' && current == ']'))
						break;
					else
						return false; //�ٸ��� ����
				}
			}//end switch
		}//end for
		if (listStack.isEmpty())
			return true;
		else
			return false; //������ ������� �ʴٸ� ����
	}

	public static void main(String[] args) {
		ExpressionTest exprTest = new ExpressionTest();
		System.out.println(exprTest.testPair("{(A+B)}"));
		System.out.println(exprTest.testPair("{(A+B)}"));
		System.out.println(exprTest.testPair("(A+B)"));
	}
}
