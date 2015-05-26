package hsi.ds.stack;
public class TestStack {
	public static void main(String[] args) {
		StackArr stack = new StackArr();
		stack.push("100");
		stack.push(20);
		stack.push("中文");
		stack.push("{10,20,30}");
		//System.out.println(stack.toString());
		System.out.println("加入資料後的Stack\n---------------------");
		stack.printStackData();
		System.out.println("==============\n");
		System.out.println("執行pop兩次後\n---------------------");
		stack.pop();
		stack.pop();		
		stack.printStackData();
	}
}
