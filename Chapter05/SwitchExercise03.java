// 3) ��������ָ���·ݣ���ӡ���·������ļ��ڡ�3,4,5 ���� 6,7,8 �ļ� 9,10,11 �＾ 12, 1, 2 ���� [������ϰ, 
// ��ʾ ʹ�ô�͸ ]  �ҵ���� 
// ��͸����˼����ʹ��һ�������ܹ�ʹ���е��������ܹ�����ʹ��

import java.util.Scanner;

public class SwitchExercise03{
	public static void main(String[] args){

     	Scanner in = new Scanner(System.in);
     	System.out.println("������һ���·�:");
     	int month = in.nextInt();

     	switch(month){
     		case 3:
     		case 4:
     		case 5:
     			System.out.println("����");
     			break;
     		case 6:
     		case 7:
     		case 8:
     			System.out.println("�ļ�");
     			break;
     		case 9:
     		case 10:
     		case 11:
     			System.out.println("�＾");
     			break;
     		case 12:
     		case 1:
     		case 2:
     			System.out.println("����");
     			break;

     		default:
     			System.out.println("�����������������룡����");
     	}

	}
}