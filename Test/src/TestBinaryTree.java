import hsi.ds.BinaryTree;
import hsi.ds.BinaryNode;
public class TestBinaryTree {

	public static void main(String[] args) {
		//Level 2的 BinaryNode
		BinaryTree treeA = new BinaryTree(new Integer(1));
		BinaryTree treeC = new BinaryTree(new Integer(3));
		BinaryTree treeE = new BinaryTree(new Integer(5));
		BinaryTree treeG = new BinaryTree(new Integer(7));
		//實例化level 0 與 level 1的 BinaryNode
		BinaryTree treeB = new BinaryTree();
		BinaryTree treeD = new BinaryTree();
		BinaryTree treeF = new BinaryTree();
		//串接各Node
		treeB.mergeTrees(new Integer(2), treeA, treeC);
		treeD.mergeTrees(new Integer(4), treeB, treeF);
		treeF.mergeTrees(new Integer(6), treeE, treeG);
		System.out.printf("Node(2)的height=%d size=%d; Node(4)的height=%d　size=%d%n", treeB.height(),treeB.size(),treeD.height(),treeD.size());
		
		System.out.println("treeD前序追蹤");
		treeD.printInOrder();
		
		
	}

}
