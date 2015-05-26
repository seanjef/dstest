package hsi.com;

class Person{
	String name;
	int age;
	static int eyeNum;
	public void info(){
		System.out.println("Name is "+ name + ", Age is "+ age);
	}
}

public class FieldTest {

	public static void main(String[] args) {
			
		Person.eyeNum =2;
		System.out.println("eyeNum :" +Person.eyeNum);
		Person p = new Person();
		p.name = "½Þ¤K§Ù";
		p.age = 30;
		System.out.println("eyeNum :" +p.eyeNum);
		p.info();
		
		Person p2 = new Person();
		p2.name = "®]®©ªÅ";
		p2.age = 500;
		System.out.println("eyeNum :" +p2.eyeNum);
		p2.eyeNum = 700;
		p2.info();
		System.out.println("eyeNum :" +Person.eyeNum);
	}

}
