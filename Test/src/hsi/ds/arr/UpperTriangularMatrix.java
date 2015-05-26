package hsi.ds.arr;

public class UpperTriangularMatrix {

	public static void main(String[] args) {
		int [] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int length = ((data.length>>1 )- 2); //���H2�A��2�A����Τ�����Ӫ����T���Ϊ��̦y�ݨ���I������
		printTwoDimArray(transferUppTriMatrix(length, data));
	}
	private static int[][] transferUppTriMatrix(int length,int [] data){
		int [][] result = new int[length][length];
		for(int i=0,p=0; i<result.length; i++,p+=i){  //���R�Ȱ��ܤơA�h�W�[�@��p�ܼƧ@���S��x�}�Ȱ쪺���ޭȰ쵥�P�@���}�C���ޭȰ줧�޿�
			for(int j =i; j<result[i].length ;j++){   //�D�n������(i*length)+(j-p)
				result[i][j] = data[i*(length)+(j-p)];//��p�Ȱ��ܤƬ�{0,1,3,6}�A��n�i�H��row�����ޭȧ@���W���Ȱ��ܤƶq
			}
		}
		return result;
	}	
	private static void printTwoDimArray(int A[][]){
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[i].length; j++){
				System.out.print(A[i][j]+"\t");
				if(j==A[i].length-1)System.out.println();
			}
		}
	}
	
}
