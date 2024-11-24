//双分支控制语句
import java.util.Scanner;


public class If02{
	public static void main(String[] args){
		int age = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入年龄。");
		    age = in.nextInt();
		 if(age >= 18){
		 	System.out.println("你已经满十八岁，不努力就去搬砖。");
		 }else {
		 	System.out.println("你还小，好好学习~");
		 }
		 System.out.println("程序继续。。。");	

	}
}