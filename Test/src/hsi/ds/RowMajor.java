package hsi.ds;

public class RowMajor {

	public static void main(String[] args) {
		int [][] Array_Data = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		//int [][] Array_Data = {{0,1,2,3,4},{5,6,7,8,9},{10,11,12,13,14}};
		//Array_Data�O���Ĥ@�h�}�C����T�Ӱ}�C�����A���O�s����V�t�~int [] �Ŷ���5���Ѧ��ܼ�(����)
		//System.out.println(Array_Data[0].length);
		int r = Array_Data.length , c = Array_Data[0].length;
		int [] resultArr = new int[r * c];
		for(int row =0 ; row < Array_Data.length ; row++){
			
			for(int column = 0 ; column < Array_Data[row].length ; column++){
				//System.out.println(Array_Data[row][column]);   //���եi�H���\������
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
