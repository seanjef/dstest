package hsi.ds;

public class LinkListNode {
	/*
	Object data;
	LinkListNode link;
	public LinkListNode(){
		this(null);
	}
	public LinkListNode(Object data){
		this(data,new LinkListNode().link = null);
		System.out.println("obj");
	}
	public LinkListNode(Object data, LinkListNode listNode){
		listNode.link = new LinkListNode(data);
	}
	
	public void add(Object data){
		
	}
	*/
	Object data;
	LinkListNode link;
	public LinkListNode(Object data, LinkListNode nextNode){
		this.data = data;
		this.link = nextNode;
	}
	public LinkListNode(Object data){
		this(data,null);
	}
	/*public void addNode(Object data){
		new LinkListNode(data,this).link = this.link;
	}*/
	
}
