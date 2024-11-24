import java.util.Scanner;
//要求输入年龄，如果该同志的年龄大于1岁，则输出"小伙子好好学习，不然以后出去要搬砖哈~"
public class If01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		int age = in.nextInt();
		if( age >= 18){
			System.out.println("小伙子好好学习，不然以后出去要搬砖哈~");
			
		}
		System.out.println("程序继续。");
	}
}