import java.util.Scanner;
//�ж�һ������Ƿ������꣬ ���������������������֮һ��
//(1)����ܹ���4�����������ܱ�100������(2)�ܱ�400����
//����һ������������� year    
public class IfExercise04{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		int year = 0;
		year = in.nextInt();
		if((year % 4 == 0 && year % 100 != 0)||year % 400 == 0){
			System.out.println(year +"��������");

		}else{
			System.out.println(year +"��������");
		}
	}
}