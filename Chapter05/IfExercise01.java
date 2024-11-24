import java.util.Scanner;

public class IfExercise01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入两个数a,b");
		double a = 0;
		double b = 0;
		a = in.nextDouble();
		b = in.nextDouble();
		if (a > 10.0 && b < 20.0){
			System.out.println("两个数的和是= " + (a + b));
		}
		System.out.println("程序继续");
	}
}