package hsi.dp.uml;
public class Client {
	public static void main(String[] args) {
		A a = new A();
		a.a1(5);
		//A.class.getR
	}
}
class A{
	public void a1(int a){
		int sum =0;
		B b = new B();
		for(int i=0;i<a;i++) sum+=b.b1(i);
		b.b2("求和的結果是", sum);
	}
}
class B{
	public int b1(int a){
		return a+1;
	}
	public void b2(String message, int sum){
		System.out.println(message+"="+sum);
	}
}