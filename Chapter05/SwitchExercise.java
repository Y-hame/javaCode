import java.util.Scanner;

public class SwitchExercise{
	public static void main(String[] args){

// 1) ʹ�� switch ��Сд���͵� char ��תΪ��д(��������)��ֻת�� a, b, c, d, e. ��������� "other"��
// 2) ��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ����"���ϸ�"��(ע������ĳɼ����ܴ��� 100), ��ʾ �ɼ�/60
// 3) ��������ָ���·ݣ���ӡ���·������ļ��ڡ�3,4,5 ���� 6,7,8 �ļ� 9,10,11 �＾ 12, 1, 2 ���� [������ϰ, ��ʾ ʹ
// 	�ô�͸ ]
// 	
		 
		Scanner in = new Scanner(System.in);
		System.out.println("������һ��СдӢ����ĸa-e��");
		
		char c1 =in.next().charAt(0);
		switch(c1){
			case 'a' :
				System.out.println(c1+"�Ĵ�д��"+(char)( c1 - 32));
				break; 
			case 'b' :
				System.out.println( c1+"�Ĵ�д��"+(char)( c1 - 32));
				break; 
			case 'c' :
				System.out.println(c1+"�Ĵ�д��"+(char)( c1 - 32));
				break; 
			case 'd' :
				System.out.println(c1+"�Ĵ�д��"+(char)( c1 - 32));
				break; 
			case 'e' :
				System.out.println(c1+"�Ĵ�д��"+(char)( c1 - 32));
				break; 
			default:
		 		System.out.println("other");
		}
	}
}