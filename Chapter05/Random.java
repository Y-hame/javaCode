public class Random{
	//��дһ��main����
	public static void main(String[] args){
		for(int i = 0; i <= 10; i++){
			System.out.println((int)(Math.random() * 100 + 1)); 

			//(int)(Math.random() *100) ���� 0 - 99 �������
		}
		
	}
	//������� 1 - 100 ��һ������֪��������97 �������(int)(Math.random() * 100 + 1)
}