//�����һ������int[]�����ֵ{4,-1,9��10,23}�����õ���Ӧ���±�

public class ArrayExercise02{
	public static void main(String [] args){
		//�����һ������int[]�����ֵ{4,-1,9��10,23}�� ��������
		int arr[] = {4,-1,9,10,23,-99};
for(int j = 0; j < arr.length - 1; j++){
	for(int i = 0; i < arr.length - 1 - j; i++){
			int m = 0;
			 
			 if(arr[i] > arr[i + 1]){
				m = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = m;
			}
		}

}

		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}	
	}
}