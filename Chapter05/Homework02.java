//2.ʵ���ж�һ�������������ĸ���Χ:����0;С��0;����0

import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){

	Scanner in = new Scanner(System.in);
	System.out.println("������һ��������");
	 int num = in.nextInt();

	if(num > 0 ){
		System.out.println("���������0;");
	}else if(num < 0){
		System.out.println("�����С��0;");
	}else if(num == 0){
		System.out.println("���������0;");
	}
	}
} 