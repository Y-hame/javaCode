public class DoWhileExercise03{
	public static void main(String[] args){

    //ͳ��1--200 ֮���ܱ�5���������ܱ�3�����ĸ���
    //����Ϊ��
    //(1)ʹ��do--while��� 1 -- 200
    //(2) ���� �ܱ�5�����������ܱ�3��������%
    //(3) ͳ�����������ĸ��� int count = 0;
		int i = 1;
		int count = 0;
		do{
			if(i % 5 == 0 && i % 3 !=0){
				 // i++;  �������i++���ó���������ѭ��
				 System.out.println("i = " + i);
				 count++;

			}
			 i++; 

		}while(i>0 && i<=200);
		System.out.println("��������һ���У�"+ count);
	}
}