// 4.�ж�һ�������Ƿ���ˮ�ɻ�����
//    ��νˮ�ɻ�����ָһ��3λ����
//    �����λ�����������͵����䱾��
//    ����:153=1*1*1+3*3*3+5*5*5
import java.util.Scanner;

public class Homework04{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.println("������һ����λ��������");
		int num = in.nextInt();
		
		if(num > 99 && num < 1000){
			int ones = num % 10;
			int tens = (num % 100 )/ 10;
			int hundreds = num / 100;
			  	int result = ones * ones * ones + tens * tens * tens + hundreds * hundreds * hundreds;
			
			if(result == num ){

				System.out.println(num + "��һ��ˮ�ɻ���");
			}
			else{
				System.out.println(num + "����һ��ˮ�ɻ���");
			}
			
		}else{

				System.out.println("�������벻�ԣ�������һ����λ������!!!!");
		}	
		
		
		 
		 

	}
}