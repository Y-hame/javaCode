import java.util.Scanner;

public class SwitchExercise{
	public static void main(String[] args){

// 1) 使用 switch 把小写类型的 char 型转为大写(键盘输入)。只转换 a, b, c, d, e. 其它的输出 "other"。
// 2) 对学生成绩大于 60 分的，输出"合格"。低于 60 分的，输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60
// 3) 根据用于指定月份，打印该月份所属的季节。3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季 [课堂练习, 提示 使
// 	用穿透 ]
// 	
		 
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个小写英文字母a-e：");
		
		char c1 =in.next().charAt(0);
		switch(c1){
			case 'a' :
				System.out.println(c1+"的大写是"+(char)( c1 - 32));
				break; 
			case 'b' :
				System.out.println( c1+"的大写是"+(char)( c1 - 32));
				break; 
			case 'c' :
				System.out.println(c1+"的大写是"+(char)( c1 - 32));
				break; 
			case 'd' :
				System.out.println(c1+"的大写是"+(char)( c1 - 32));
				break; 
			case 'e' :
				System.out.println(c1+"的大写是"+(char)( c1 - 32));
				break; 
			default:
		 		System.out.println("other");
		}
	}
}