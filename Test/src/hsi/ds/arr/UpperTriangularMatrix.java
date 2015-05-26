package hsi.ds.arr;

public class UpperTriangularMatrix {

	public static void main(String[] args) {
		int [] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int length = ((data.length>>1 )- 2); //埃2搭2よちだㄢàà程狠ㄢ翴常Τ
		printTwoDimArray(transferUppTriMatrix(length, data));
	}
	private static int[][] transferUppTriMatrix(int length,int [] data){
		int [][] result = new int[length][length];
		for(int i=0,p=0; i<result.length; i++,p+=i){  //だ猂办跑て糤p跑计疭痻皚办ま办单蝴皚ま办ぇ呸胯
			for(int j =i; j<result[i].length ;j++){   //璶そΑ(i*length)+(j-p)
				result[i][j] = data[i*(length)+(j-p)];//τp办跑て{0,1,3,6}ノrowま患糤办跑て秖
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
