package hsi.ds.sorting;
/*
 * �~��i�����1�����ޭȡA��ک��^����ĤG�Ӱ}�C�����Y�i�A
 * �]����ڭ̨����óB�z��������A�Ĥ@�Ӥ����N���Τ�F
 * ����j���W��C���~��i�٥�����ɪ��ȡA�ӧP�_�� j<=i-1��
 * i�O��Ӱ}�C���̫�̭Ӥ������ޭȡA�Ӥ��h�j��u�n���Ӧ���
 * �����̫�ĤG�ӧY�i�A�]���p�G�g��j<=i �hif�����B�z�|�X�{
 * �S��data[j+1]�������i��������~�C���p�G�g��j<i�O�i�H��!
 * �]���Ĥ@���|�������X�A�]��if�����P�_�P�B�z�|�̧ǧ�j���������Ჾ�A�G�A
 * first run�N�|��̤j����������̫�@�Ӱ}�C��m�A�]��if�O���ӱ��ۤ@�Ӥ���P�B�z
 * */
public class BubSort {
	public static int[] sort(int[] data){  //data���ǤJ����ư}�C
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
