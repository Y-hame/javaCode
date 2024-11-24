//多分支的演示
//1.判断信用等级
//	信用分为100 ，信用极好
//	信用分 (80,99) 信用优秀
//	信用分(60,80) 信用3一般
//	else  信用不及格
import java.util.Scanner;


public class If03{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入您的信用积分：");   

		//如果输入的不是整数，而是hello... 
		//==》这里我们后面会涉及到异常处理机制，来搞定他。
		

		int credit = 0;
		credit = in.nextInt();
		//先对输入的信用分，进行一个范围的有效判断 1- 100 ，否则提示 输入有错误
		if(credit >= 0 && credit <= 100){
			if (credit == 100){
				System.out.println("你的信用等级：信用极好！");
			}if (credit >80 && credit <=99){
				System.out.println("你的信用等级：信用优秀！");
			}if (credit >=60 && credit <=80){
				System.out.println("你的信用等级：信用一般！");
			}if(credit >= 0 && credit <60){
				System.out.println("你的信用等级：信用不及格！");
			}

		}else{
				 System.out.println("输入有误，请重新输入！！！");
			}
		
		
		
	}
}