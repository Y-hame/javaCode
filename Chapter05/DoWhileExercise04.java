import java.util.Scanner;

public class DoWhileExercise4{
	public static void main(String[] args){
		// �����������Ǯ����Yhameһֱʹ�������ޣ�֪������˵��ǮΪֹ
		// [System.out.println("Yhame�ʣ���Ǯ�� (y/n)")]  do... while
		Scanner in = new Scanner(System.in);
		char answer =' ';

		do{
			
			System.out.println("Yhame�ʣ���Ǯ��(y/n)");
			 answer = in.next().charAt(0);  //��ȡ����ĵ�һ���ַ�
			System.out.println("���Ļش���"+ answer);
			System.out.println("Yhameʹ�������ޣ�");
		}while(answer !='y');
		System.out.println("��ͦ����");

		
	}
}