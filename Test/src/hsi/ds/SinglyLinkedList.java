package hsi.ds;

public class SinglyLinkedList {
	LinkListNode head;

	public SinglyLinkedList() {
		head = new LinkListNode(0);
	}
	public boolean isEmpty(){return head.link == null;}
	public void insert(Object data){
		LinkListNode newNode = new LinkListNode(data);
		newNode.link = head.link;
		head.link = newNode;
	}
}
