package hsi.ds.stack;
public class TestStack {
	public static void main(String[] args) {
		StackArr stack = new StackArr();
		stack.push("100");
		stack.push(20);
		stack.push("����");
		stack.push("{10,20,30}");
		//System.out.println(stack.toString());
		System.out.println("�[�J��ƫ᪺Stack\n---------------------");
		stack.printStackData();
		System.out.println("==============\n");
		System.out.println("����pop�⦸��\n---------------------");
		stack.pop();
		stack.pop();		
		stack.printStackData();
	}
}
