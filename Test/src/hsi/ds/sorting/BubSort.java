package hsi.ds.sorting;
/*
 * 外圈i遞減到1的索引值，實際往回比對到第二個陣列元素即可，
 * 因為當我們兩兩比對並處理移元素後，第一個元素就不用比了
 * 內圈j遞增到每次外圈i還未遞減時的值，而判斷式 j<=i-1的
 * i是整個陣列的最後依個元素索引值，而內層迴圈只要比到該次比
 * 較的最後第二個即可，因為如果寫成j<=i 則if內的處理會出現
 * 沒有data[j+1]的元素可比較的錯誤。但如果寫成j<i是可以的!
 * 因為第一次會全部探訪，因為if內的判斷與處理會依序把大的元素往後移，故，
 * first run就會把最大的元素移到最後一個陣列位置，因為if是ㄧ個接著一個比較與處理
 * */
public class BubSort {
	public static int[] sort(int[] data){  //data為傳入的資料陣列
		for(int i =data.length-1 ; i>=1 ; i--){  
			for(int j =0; j<=i-1; j++){			 
				if(data[j] > data[j+1]){
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		return data;
	}
}
