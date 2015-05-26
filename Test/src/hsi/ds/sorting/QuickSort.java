package hsi.ds.sorting;

public class QuickSort {
	
	public static int[] enterSort(int[] data){
		QuickSort.sort(data, 0, data.length-1);
		return data;
	}
	
	public static void sort(int[] data, int left, int right){
		int keyValue = data[left];	//keyValue就是Pivot(界定比較標準)
		int lower=left,upper=right;    //lower與upper是拿來做為每次遞回呼叫時，也就是每次要巡迴時的變動索引
		if(lower < upper){
			do{
				do{ //因為第一個元素是作為Pivot(界定比較標準)，故使用do while可以先++
					lower++;
				}while(data[lower]<=keyValue && lower <right);
				while(data[upper]>=keyValue && upper >left){//upper > left沒有等號，因為第一個都是拿來做為暫時中間值
					upper--;	//因為從右邊往左，最後一個也就是開始的第一個元素要算到，所以用while loop而不用doWhile
				}; 
				if(lower < upper){ //即是課本p8-18，當i<j則Ki與Kj對調值。也就是前面兩個dowhile都巡走了後，執行此段
					int temp = data[lower];
					data[lower] = data[upper];
					data[upper] = temp;
				}
			}while(lower < upper); //只要變動索引lower與upper是符合條件就一直do，直到lower < upper
			if(lower > upper){
				int temp = data[left];
				data[left] = data[upper];
				data[upper] = temp;
			}
			//前半段
			sort(data,left,upper-1);  //upper要減1的原因是，data[upper]已經給前一次sort中的暫時中間直使用了，故左邊還未排序好的陣列區間在右邊索引要減ㄧ個元素
			//後半段
			sort(data,upper+1,right); //針對右邊經過前面依次sort後，還未排序好的陣列區間執行sort
		}
		
		
		
	}
}
