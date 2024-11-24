import java.util.Scanner;
//判断一个年份是否是闰年， 闰年的条件符合以下两者之一：
//(1)年份能够被4整除，但不能被100整除。(2)能被400整除
//定义一个变量保存年份 year    
public class IfExercise04{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year = 0;
		year = in.nextInt();
		if((year % 4 == 0 && year % 100 != 0)||year % 400 == 0){
			System.out.println(year +"年是闰年");

		}else{
			System.out.println(year +"不是闰年");
		}
	}
}