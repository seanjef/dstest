package hsi.ds;

public class BinaryTree {
	private BinaryNode TreeRoot;
	public BinaryTree(){
		TreeRoot = null;
	}
	public BinaryTree(Object TreeRootData){
		TreeRoot = new BinaryNode(TreeRootData); //把root 跟節點的資料透過BinaryNode初始化時帶入
	}
	public void printPreOrder(){
		if(TreeRoot != null) this.TreeRoot.printPreOrder();
	}
	public void printInOrder(){
		if(TreeRoot != null) this.TreeRoot.printInOrder();
	}
	public void printPostOrder(){
		if(TreeRoot != null) this.TreeRoot.printPostOrder();
	}
	public void makeEmpty(){
		TreeRoot = null;
	}
	public boolean isEmpty(){
		return TreeRoot == null;
	}
	public int size(){
		return BinaryNode.size(TreeRoot);
	}
	public int height(){
		return BinaryNode.height(TreeRoot);
	}
	public void mergeTrees(Object TreeRootData, BinaryTree treeA, BinaryTree treeB){//要合併的時候，level 0節點才賦值
		if(treeA.TreeRoot == treeB.TreeRoot && treeA.TreeRoot != null){ //先判斷要合併的兩棵樹是否為同一棵
			System.out.println("同一棵樹無法合併!");
			return ;
		}
		this.TreeRoot = new BinaryNode(TreeRootData,treeA.TreeRoot,treeB.TreeRoot); //合併兩顆沒有交集的樹，要有一個根節點去串連
		if(this != treeA) treeA.TreeRoot = null;
		if(this != treeB) treeB.TreeRoot = null;
	}
}
