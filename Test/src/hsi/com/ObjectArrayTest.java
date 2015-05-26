package hsi.com;

public class ObjectArrayTest {

	public static void main(String[] args) {
		/*	//hsi:簡易多維陣列範例
		int [][] a;							//stack陣列變數
		a= new int[4][];					//初始化一維陣列的空間，其內的陣列元素也是準備存放陣列變數
		for(int i =0 ; i< a.length ; i++){
			System.out.println(a[i]);
		}
		a[0] = new int[2];					//單純真對a[0][] 指向 兩個int陣列空間 default 0
		a[0][1] = 6;						//將a[0][1] 陣列元素賦值為 6
		for(int i =0; i<a[0].length ; i++){
			System.out.println(a[0][i]);
		}
		*/
		//陣列元素可以是參考變數也可以是普通物件
		Object[] objArr = new Object[3];
		objArr[1] = new Object[2];
		Object[] objArr2 = (Object[])objArr[1];
		objArr2[1] = new Object[3];
		Object[] objArr3 = (Object[])objArr2[1];
		objArr3[1] = new int[5];
		int[] iArr = (int[])objArr3[1];
		for(int i=0; i<iArr.length ; i++){
			iArr[i] = i* 3 + 1;
		}
		
		System.out.println(((int[])((Object[])((Object[])objArr[1])[1])[1])[2]);
		
	}

}
