//
//3.判断一个年份是否为闰年
//
import java.util.Scanner;

public class Homework03{
	public static void main(String[] args){
		//创建一个对象
		 Scanner in = new Scanner(System.in);
		 System.out.println("请输入一个年份（整数）：");
		 int year = in.nextInt();
          if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
          	 System.out.println(year+"是闰年。");
          }else{
          	System.out.println("输入有误，请重新输入");
          }

	}
}