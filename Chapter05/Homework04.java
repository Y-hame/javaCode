// 4.判断一个整数是否是水仙花数，
//    所谓水仙花数是指一个3位数，
//    其各个位上数字立方和等于其本身。
//    例如:153=1*1*1+3*3*3+5*5*5
import java.util.Scanner;

public class Homework04{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个三位的整数：");
		int num = in.nextInt();
		
		if(num > 99 && num < 1000){
			int ones = num % 10;
			int tens = (num % 100 )/ 10;
			int hundreds = num / 100;
			  	int result = ones * ones * ones + tens * tens * tens + hundreds * hundreds * hundreds;
			
			if(result == num ){

				System.out.println(num + "是一个水仙花数");
			}
			else{
				System.out.println(num + "不是一个水仙花数");
			}
			
		}else{

				System.out.println("您的输入不对，请输入一个三位的整数!!!!");
		}	
		
		
		 
		 

	}
}