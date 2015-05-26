package hsi.ds;

public class BinaryTree {
	private BinaryNode TreeRoot;
	public BinaryTree(){
		TreeRoot = null;
	}
	public BinaryTree(Object TreeRootData){
		TreeRoot = new BinaryNode(TreeRootData); //��root ��`�I����Ƴz�LBinaryNode��l�Ʈɱa�J
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
	public void mergeTrees(Object TreeRootData, BinaryTree treeA, BinaryTree treeB){//�n�X�֪��ɭԡAlevel 0�`�I�~���
		if(treeA.TreeRoot == treeB.TreeRoot && treeA.TreeRoot != null){ //���P�_�n�X�֪���ʾ�O�_���P�@��
			System.out.println("�P�@�ʾ�L�k�X��!");
			return ;
		}
		this.TreeRoot = new BinaryNode(TreeRootData,treeA.TreeRoot,treeB.TreeRoot); //�X�֨����S���涰����A�n���@�Ӯڸ`�I�h��s
		if(this != treeA) treeA.TreeRoot = null;
		if(this != treeB) treeB.TreeRoot = null;
	}
}
