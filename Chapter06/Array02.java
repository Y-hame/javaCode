import java.util.Scanner;

public class Array02{
	//编写一个main方法
	public static void main(String[] args){
		//演示 数据类型 数组名[]=new 数据类型[大小]
		//循环输入5个成绩，保存到double数组，并输出
		
		//步骤 
		//1. 创建一个double 数组 大小5
		
		double scores[] = new double [5];

		//2. 循环输入
		for(int i = 0; i < scores.length; i++){
			Scanner in = new Scanner(System.in);
			System.out.println("请输入第"+i+ "个数");
			scores[i] = in.nextDouble();
		}

		//3. 循环输出
		System.out.println("===输出的结果如下====");
		for(int i = 0; i < scores.length; i++){
				System.out.println("第"+ i + "个元素为" + scores[i]);
		}

	}
}