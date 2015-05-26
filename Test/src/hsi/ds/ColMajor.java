package hsi.ds;

public class ColMajor {

	public static void main(String[] args) {
		int [][] Array_Data = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		int r = Array_Data.length , c = Array_Data[0].length;  //r:row.length ; c:column.length
		int [] resultArr = new int[r * c];
		for(int row =0 ; row < Array_Data.length ; row++){
			for(int column = 0 ; column < Array_Data[row].length ; column++){
				//System.out.printf("%d=",column % r);
				//resultArr[(column + row) + (row * (Array_Data[row].length-1))] = Array_Data[column % r][row]; //這個演算法會忽略col每次都到3與4時的演算結果
				
				//真正解法
				int i = row + column * Array_Data.length;
				resultArr[i] = Array_Data[row][column];
				//System.out.printf("%d, ",resultArr[i]);
			}
		}
		
				
		System.out.println("--------------------Testing ResultArray on way-------------------------");
		for(int i = 0; i< resultArr.length ; i++){
			System.out.printf("%d, ",resultArr[i]);
		}
		
	}

}
