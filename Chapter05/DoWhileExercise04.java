import java.util.Scanner;

public class DoWhileExercise4{
	public static void main(String[] args){
		// 如果李三不还钱，则Yhame一直使出五连鞭，知道李三说还钱为止
		// [System.out.println("Yhame问：还钱吗？ (y/n)")]  do... while
		Scanner in = new Scanner(System.in);
		char answer =' ';

		do{
			
			System.out.println("Yhame问：还钱吗？(y/n)");
			 answer = in.next().charAt(0);  //获取输入的第一个字符
			System.out.println("他的回答是"+ answer);
			System.out.println("Yhame使出五连鞭！");
		}while(answer !='y');
		System.out.println("还挺懂事");

		
	}
}