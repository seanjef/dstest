package hsi.com;

public class ObjectArrayTest {

	public static void main(String[] args) {
		/*	//hsi:²���h���}�C�d��
		int [][] a;							//stack�}�C�ܼ�
		a= new int[4][];					//��l�Ƥ@���}�C���Ŷ��A�䤺���}�C�����]�O�ǳƦs��}�C�ܼ�
		for(int i =0 ; i< a.length ; i++){
			System.out.println(a[i]);
		}
		a[0] = new int[2];					//��¯u��a[0][] ���V ���int�}�C�Ŷ� default 0
		a[0][1] = 6;						//�Na[0][1] �}�C������Ȭ� 6
		for(int i =0; i<a[0].length ; i++){
			System.out.println(a[0][i]);
		}
		*/
		//�}�C�����i�H�O�Ѧ��ܼƤ]�i�H�O���q����
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
