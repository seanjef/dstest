package hsi.ds;

public class BinaryNode {
	Object treeNodeElement;
	BinaryNode left;  //每個node都有左右兩個鏈，以作為連接node的指標存放
	BinaryNode right;
	BinaryNode(){
		this(null);
	}
	BinaryNode(Object dataTreeNodeElement){
		this(dataTreeNodeElement,null,null);
	}
	BinaryNode(Object dataTreeNodeElement,BinaryNode lTree,BinaryNode rTree){
		this.treeNodeElement = dataTreeNodeElement;
		this.left = lTree;
		this.right = rTree;
		
	}
	static int size(BinaryNode t){
		if(t == null){
			return 0;
		}else{
			return 1 + size(t.left) + size(t.right); //使用遞回將左子樹與右子樹當有下一層節點時，會不斷呼叫size去count
		}	
	}
	static int height(BinaryNode t){
		if(t == null){
			return -1;
		}else{
			return 1 + Math.max(height(t.left), height(t.right));  //根據顏春煌p.7-7高度，節點到樹葉的層次數目
		}
	}
	//前序追蹤 Preorder traversal
	void printPreOrder(){
		//先節點、再左子樹、最後右子樹
		System.out.println(treeNodeElement);
		if(this.left != null) this.left.printPreOrder();   
		if(this.right != null) this.right.printPreOrder();
	}
	//後序追蹤Postorder traversal
	void printPostOrder(){
		//先左子樹、再右子樹、最後節點
		if(this.left != null) this.left.printPostOrder();
		if(this.right != null) this.right.printPostOrder();
		System.out.println(treeNodeElement);
	}
	//中序追蹤Inorder traversal
	void printInOrder(){
		//先左子樹、再節點、最後右子樹
		if(this.left != null) this.left.printInOrder();
		System.out.println(treeNodeElement);
		if(this.right != null) this.right.printInOrder();
	}
	
}
