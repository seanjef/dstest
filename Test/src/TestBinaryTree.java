import hsi.ds.BinaryTree;
import hsi.ds.BinaryNode;
public class TestBinaryTree {

	public static void main(String[] args) {
		//Level 2�� BinaryNode
		BinaryTree treeA = new BinaryTree(new Integer(1));
		BinaryTree treeC = new BinaryTree(new Integer(3));
		BinaryTree treeE = new BinaryTree(new Integer(5));
		BinaryTree treeG = new BinaryTree(new Integer(7));
		//��Ҥ�level 0 �P level 1�� BinaryNode
		BinaryTree treeB = new BinaryTree();
		BinaryTree treeD = new BinaryTree();
		BinaryTree treeF = new BinaryTree();
		//�걵�UNode
		treeB.mergeTrees(new Integer(2), treeA, treeC);
		treeD.mergeTrees(new Integer(4), treeB, treeF);
		treeF.mergeTrees(new Integer(6), treeE, treeG);
		System.out.printf("Node(2)��height=%d size=%d; Node(4)��height=%d�@size=%d%n", treeB.height(),treeB.size(),treeD.height(),treeD.size());
		
		System.out.println("treeD�e�ǰl��");
		treeD.printInOrder();
		
		
	}

}
