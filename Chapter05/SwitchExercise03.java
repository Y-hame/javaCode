// 3) 根据用于指定月份，打印该月份所属的季节。3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季 [课堂练习, 
// 提示 使用穿透 ]  我的理解 
// 穿透的意思就是使用一个条件能够使所有的条件都能够符合使用

import java.util.Scanner;

public class SwitchExercise03{
	public static void main(String[] args){

     	Scanner in = new Scanner(System.in);
     	System.out.println("请输入一个月份:");
     	int month = in.nextInt();

     	switch(month){
     		case 3:
     		case 4:
     		case 5:
     			System.out.println("春季");
     			break;
     		case 6:
     		case 7:
     		case 8:
     			System.out.println("夏季");
     			break;
     		case 9:
     		case 10:
     		case 11:
     			System.out.println("秋季");
     			break;
     		case 12:
     		case 1:
     		case 2:
     			System.out.println("冬季");
     			break;

     		default:
     			System.out.println("输入有误，请重新输入！！！");
     	}

	}
}