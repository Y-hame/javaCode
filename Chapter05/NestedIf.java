//�μӸ��ֱ�������������ɼ�����8.0���������������ʾ��̭�����Ҹ����Ա���ʾ
//���������黹��Ů���顣����ɼ����Ա𣬽����жϺ������Ϣ��
import java.util.Scanner;

public class NestedIf{

	public static void main(String[] args){
		char gender ;
		double score;
		Scanner in = new Scanner(System.in);
		System.out.println("�������������÷�����");
		
		score = in.nextDouble();
		
		if(score > 8.0){
			System.out.println("�����������Ա���/Ů����");
			gender = in.next().charAt(0);   //��ô���ַ���ת�����ַ�char -> ������ָ ���ַ����ĵ�һ���ַ��õ� 
										    //�õ�S5�ַ���  �ĵ�һ���ַ���1��
											//��� s5.charAt(0) �õ�s5 �ַ����ĵ�һ���ַ�'1'
			if(gender == '��'){                       //���ﱨ����ʾ���ﲻ��ת����boolean ���� Ӧ��ʹ��==  char���ͺ���ֵ����ϵ
				System.out.println("�ɹ�������������");
			}
			if(gender == 'Ů'){
				System.out.println("�ɹ�������Ů����");
			}
		}else{
			    System.out.println("����ʧ�ܡ�");
		}

	}
}

// public class NestedIf{

// 	public static void main(String[] args){
		
// 		Scanner in = new Scanner(System.in);
// 		System.out.println("�������������÷�����");
		
// 		double score = in.nextDouble();
		
// 		if(score > 8.0){
// 			System.out.println("�����������Ա�");
// 			char gender = in.next().charAt(0);  

// 			if(gender =='��'){
// 				System.out.println("�ɹ�������������");
// 			}else if(gender == 'Ů'){
// 				System.out.println("�ɹ�������Ů����");
// 			}else {
// 				System.out.println("��Ҫ���䣬��������");
// 			}
// 		}else{
// 			     System.out.println("����ʧ�ܡ�");
// 		}

// 	}
// }
