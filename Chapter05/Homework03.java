//
//3.�ж�һ������Ƿ�Ϊ����
//
import java.util.Scanner;

public class Homework03{
	public static void main(String[] args){
		//����һ������
		 Scanner in = new Scanner(System.in);
		 System.out.println("������һ����ݣ���������");
		 int year = in.nextInt();
          if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
          	 System.out.println(year+"�����ꡣ");
          }else{
          	System.out.println("������������������");
          }

	}
}