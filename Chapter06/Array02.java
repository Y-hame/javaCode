import java.util.Scanner;

public class Array02{
	//��дһ��main����
	public static void main(String[] args){
		//��ʾ �������� ������[]=new ��������[��С]
		//ѭ������5���ɼ������浽double���飬�����
		
		//���� 
		//1. ����һ��double ���� ��С5
		
		double scores[] = new double [5];

		//2. ѭ������
		for(int i = 0; i < scores.length; i++){
			Scanner in = new Scanner(System.in);
			System.out.println("�������"+i+ "����");
			scores[i] = in.nextDouble();
		}

		//3. ѭ�����
		System.out.println("===����Ľ������====");
		for(int i = 0; i < scores.length; i++){
				System.out.println("��"+ i + "��Ԫ��Ϊ" + scores[i]);
		}

	}
}