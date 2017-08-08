//red black Ʈ��

package tree.bst;

class TreeNode{
	char data;
	TreeNode left;
	TreeNode right;
}
class BinarySearchTree{
	private TreeNode root = new TreeNode();
	
	public TreeNode insertKey(TreeNode root , char x){
		TreeNode p = root;
		
		TreeNode newNode = new TreeNode();
		newNode.data = x;
		newNode.left = null;
		newNode.right = null;
		
		if(p == null)
			return newNode;
		else if(newNode.data < p.data){
			p.left = insertKey(p.left, x);
			return p;
		}else if(newNode.data > p.data){
			p.right =insertKey(p.right, x);
			return p;
		}else
			return p;
		
	}
	
	public void insertBST(char x){
		root = insertKey(root, x); //root�� ��� �������ش�.
	}
	
	public TreeNode searchBST(char x){
		TreeNode p =root;
		while(p != null){
			if(x < p.data) p = p.left;
			else if(x > p.data) p = p.right;
			else return p;
		}
		return p;
	}
	
	public void inorder(TreeNode root){
		if(root != null){
			inorder(root.left);
			System.out.printf("%c",root.data);
			inorder(root.right);
		}
	}
	public void printBST(){
		inorder(root);
		System.out.println();
	}
}
public class BinarySearchTreeTest {

	public static void main(String[] args) {
		BinarySearchTree bsT = new BinarySearchTree();
		bsT.insertBST('G');
		bsT.insertBST('I');
		bsT.insertBST('H');
		bsT.insertBST('D');
		bsT.insertBST('B');
		bsT.insertBST('M');
		bsT.insertBST('N');
		bsT.insertBST('A');
		bsT.insertBST('J');
		bsT.insertBST('E');
		bsT.insertBST('Q');
		
		System.out.printf("\nBinary Tree >>");
		bsT.printBST();
		
		System.out.printf("Is there \"A\" ? >>> ");
		TreeNode p1 = bsT.searchBST('A');
		
		if(p1 != null){
			System.out.printf("ã�� ���� : %c\n",p1.data);
		}else
			System.out.printf("ã�� ���� %c\n",p1.data);
	}
}