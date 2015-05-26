package hsi.ds;

public class Matrices {

	public static void main(String[] args) {
		int [][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		printTwoDimArray(array);
		System.out.println("°}¦CÂà¸m«á");
		printTwoDimArray(matrix_Transpose(array.length,array[0].length,array,new int [array[0].length][array.length]));
	}
	
	private static void printTwoDimArray(int A[][]){
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[i].length; j++){
				System.out.print(A[i][j]+"\t");
				if(j==A[i].length-1)System.out.println();
			}
		}
	}
	
	private static int[][] matrix_Transpose(int m, int n, int A[][] , int B[][]){
		for(int i=0; i<A.length; i++){
			for(int j=0; j<A[i].length; j++){
				B[j][i]=A[i][j];
			}
		}
		return B;
	}
	
}
