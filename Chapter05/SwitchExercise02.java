// 2) ��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ����"���ϸ�"��(ע������ĳɼ����ܴ��� 100), ��ʾ �ɼ�/60
import java.util.Scanner;
//����ʹ�ñ��˼·�����ɼ��ķ�Χת����һ�����������������жϣ�
//  [0-60]ʹ�ó�����˼���ת����һ������
//  [60- 100] ͬ��ʹ����ͬ��˼·

public class SwitchExercise02{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.println("��������ķ�����");
 		int grade = in.nextInt();

 		if(grade>=0 && grade <=100){

 			switch((int)(grade / 60) ){

				case  0:
			 	System.out.println("���ϸ�");
			 		break;

		 		case  1:
			 	System.out.println("�ϸ�");
			 		break;

			 	default:
			 	System.out.println("�����������������룡����");
			 	
		}
 	// 		switch(grade){
		// 	case (int)(grade / 60) == 0:
		// 	 System.out.println("���ϸ�");
		// 	 break;

		//  	case (int)(grade / 60) ==1:
		// 	 System.out.println("�ϸ�");
		// 	 break;

		// 	 default:
		// 	 	System.out.println("�����������������룡����");

		// } //��δ���Ĵ���֮�����ڣ�����switch �����Ҫʹ�õ��������Ը��ģ�ע��case ��ʹ��ϸ��
		
 		}
		
	}
}