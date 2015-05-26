package hsi.ds.sorting;

public class QuickSort {
	
	public static int[] enterSort(int[] data){
		QuickSort.sort(data, 0, data.length-1);
		return data;
	}
	
	public static void sort(int[] data, int left, int right){
		int keyValue = data[left];	//keyValue�N�OPivot(�ɩw����з�)
		int lower=left,upper=right;    //lower�Pupper�O���Ӱ����C�����^�I�s�ɡA�]�N�O�C���n���j�ɪ��ܰʯ���
		if(lower < upper){
			do{
				do{ //�]���Ĥ@�Ӥ����O�@��Pivot(�ɩw����з�)�A�G�ϥ�do while�i�H��++
					lower++;
				}while(data[lower]<=keyValue && lower <right);
				while(data[upper]>=keyValue && upper >left){//upper > left�S�������A�]���Ĥ@�ӳ��O���Ӱ����Ȯɤ�����
					upper--;	//�]���q�k�䩹���A�̫�@�Ӥ]�N�O�}�l���Ĥ@�Ӥ����n���A�ҥH��while loop�Ӥ���doWhile
				}; 
				if(lower < upper){ //�Y�O�ҥ�p8-18�A��i<j�hKi�PKj��խȡC�]�N�O�e�����dowhile�������F��A���榹�q
					int temp = data[lower];
					data[lower] = data[upper];
					data[upper] = temp;
				}
			}while(lower < upper); //�u�n�ܰʯ���lower�Pupper�O�ŦX����N�@��do�A����lower < upper
			if(lower > upper){
				int temp = data[left];
				data[left] = data[upper];
				data[upper] = temp;
			}
			//�e�b�q
			sort(data,left,upper-1);  //upper�n��1����]�O�Adata[upper]�w�g���e�@��sort�����Ȯɤ������ϥΤF�A�G�����٥��ƧǦn���}�C�϶��b�k����ޭn��Ӥ���
			//��b�q
			sort(data,upper+1,right); //�w��k��g�L�e���̦�sort��A�٥��ƧǦn���}�C�϶�����sort
		}
		
		
		
	}
}
