// 2) 对学生成绩大于 60 分的，输出"合格"。低于 60 分的，输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60
import java.util.Scanner;
//这里使用编程思路，将成绩的范围转换成一个整数类型来进行判断，
//  [0-60]使用除法的思想把转换成一个整数
//  [60- 100] 同理使用相同的思路

public class SwitchExercise02{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的分数：");
 		int grade = in.nextInt();

 		if(grade>=0 && grade <=100){

 			switch((int)(grade / 60) ){

				case  0:
			 	System.out.println("不合格");
			 		break;

		 		case  1:
			 	System.out.println("合格");
			 		break;

			 	default:
			 	System.out.println("输入有误，请重新输入！！！");
			 	
		}
 	// 		switch(grade){
		// 	case (int)(grade / 60) == 0:
		// 	 System.out.println("不合格");
		// 	 break;

		//  	case (int)(grade / 60) ==1:
		// 	 System.out.println("合格");
		// 	 break;

		// 	 default:
		// 	 	System.out.println("输入有误，请重新输入！！！");

		// } //这段代码的错误之处在于，对于switch 语句需要使用的条件加以更改，注意case 的使用细节
		
 		}
		
	}
}