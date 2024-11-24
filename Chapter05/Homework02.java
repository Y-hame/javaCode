//2.实现判断一个整数，属于哪个范围:大于0;小于0;等于0

import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){

	Scanner in = new Scanner(System.in);
	System.out.println("请输入一个整数：");
	 int num = in.nextInt();

	if(num > 0 ){
		System.out.println("这个数大于0;");
	}else if(num < 0){
		System.out.println("这个数小于0;");
	}else if(num == 0){
		System.out.println("这个数等于0;");
	}
	}
} 