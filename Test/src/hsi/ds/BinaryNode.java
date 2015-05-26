package hsi.ds;

public class BinaryNode {
	Object treeNodeElement;
	BinaryNode left;  //�C��node�������k�����A�H�@���s��node�����Цs��
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
			return 1 + size(t.left) + size(t.right); //�ϥλ��^�N���l��P�k�l����U�@�h�`�I�ɡA�|���_�I�ssize�hcount
		}	
	}
	static int height(BinaryNode t){
		if(t == null){
			return -1;
		}else{
			return 1 + Math.max(height(t.left), height(t.right));  //�ھ��C�K��p.7-7���סA�`�I��𸭪��h���ƥ�
		}
	}
	//�e�ǰl�� Preorder traversal
	void printPreOrder(){
		//���`�I�B�A���l��B�̫�k�l��
		System.out.println(treeNodeElement);
		if(this.left != null) this.left.printPreOrder();   
		if(this.right != null) this.right.printPreOrder();
	}
	//��ǰl��Postorder traversal
	void printPostOrder(){
		//�����l��B�A�k�l��B�̫�`�I
		if(this.left != null) this.left.printPostOrder();
		if(this.right != null) this.right.printPostOrder();
		System.out.println(treeNodeElement);
	}
	//���ǰl��Inorder traversal
	void printInOrder(){
		//�����l��B�A�`�I�B�̫�k�l��
		if(this.left != null) this.left.printInOrder();
		System.out.println(treeNodeElement);
		if(this.right != null) this.right.printInOrder();
	}
	
}
