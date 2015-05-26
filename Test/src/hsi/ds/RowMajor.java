package hsi.ds;

public class RowMajor {

	public static void main(String[] args) {
		int [][] Array_Data = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		//int [][] Array_Data = {{0,1,2,3,4},{5,6,7,8,9},{10,11,12,13,14}};
		//Array_Data是指第一層陣列指到三個陣列元素，都是存放指向另外int [] 空間為5的參考變數(指標)
		//System.out.println(Array_Data[0].length);
		int r = Array_Data.length , c = Array_Data[0].length;
		int [] resultArr = new int[r * c];
		for(int row =0 ; row < Array_Data.length ; row++){
			
			for(int column = 0 ; column < Array_Data[row].length ; column++){
				//System.out.println(Array_Data[row][column]);   //測試可以成功抓取到值
				resultArr[(column + row) + (row * (Array_Data[row].length-1))] = Array_Data[row][column];
				
				System.out.println(resultArr[(column + row) + (row * (Array_Data[row].length-1))]);
			}
		}
		System.out.println("--------------------Testing ResultArray on way-------------------------");
		for(int i = 0; i< resultArr.length ; i++){
			System.out.println(resultArr[i]);
		}
		
	}

}
