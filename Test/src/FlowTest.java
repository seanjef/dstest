
public class FlowTest {

	public static void main(String[] args) {
		/*int data = 10;
		if(data > 10){
			if(data>50) System.out.println("inner if");
		}else System.out.println("outter else");
		*/
		/*   
		int i=0;
		int s =0;
		while( i <=30){
			s+=i;
			i++;
		}
		System.out.println(s);
		*/
		/*
		int s =0;
		for(int i = 5; i<=110; i+=15){
			s+=i;
		}
		System.out.println(s);
		*/
		int s = 0;
		for(int i =1; i<=10 ; i+=2){
			for(int j = 15; j>=0; j-=3){
				s++;
			}
		}
		System.out.println(s);
	}

}
