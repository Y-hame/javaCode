//���֧����ʾ
//1.�ж����õȼ�
//	���÷�Ϊ100 �����ü���
//	���÷� (80,99) ��������
//	���÷�(60,80) ����3һ��
//	else  ���ò�����
import java.util.Scanner;


public class If03{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("�������������û��֣�");   

		//�������Ĳ�������������hello... 
		//==���������Ǻ�����漰���쳣������ƣ����㶨����
		

		int credit = 0;
		credit = in.nextInt();
		//�ȶ���������÷֣�����һ����Χ����Ч�ж� 1- 100 ��������ʾ �����д���
		if(credit >= 0 && credit <= 100){
			if (credit == 100){
				System.out.println("������õȼ������ü��ã�");
			}if (credit >80 && credit <=99){
				System.out.println("������õȼ����������㣡");
			}if (credit >=60 && credit <=80){
				System.out.println("������õȼ�������һ�㣡");
			}if(credit >= 0 && credit <60){
				System.out.println("������õȼ������ò�����");
			}

		}else{
				 System.out.println("�����������������룡����");
			}
		
		
		
	}
}