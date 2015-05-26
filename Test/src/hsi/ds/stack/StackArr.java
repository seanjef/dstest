package hsi.ds.stack;
public class StackArr {
	Object[] size;
	int top;
	public StackArr(){
		this(5); //default 5 Object
	}
	public StackArr(int size){
		this.size = new Object[size];
		this.top = -1;
		
	}	
	public void push(Object input){
		size[++top] = input;
	}	
	public Object pop(){
		if(top != -1){
			Object data = size[top] !=null ? size[top] : new Exception();
			size[top] = null;
			top--;
			return data;
		}return "Stack is Empty";
	}	
	public Object TopItem(){
		return size[top];
	}	
	public boolean IsEmpty(){
		return top==-1;
	}
	public boolean IsFull(){
		return top==size.length-1;
	}	
	public Object[] getStackData(){
		return size;
	}
	public void printStackData(){
		for(int i=0; i<size.length; i++){
			System.out.print(size[i]+"\n");
		}
	}
}
