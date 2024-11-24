//出票系统：根据淡旺季的月份和年龄，打印票价
//4-10旺季：
//	成人（18-60）：60
//	儿童（<18) : 半价
//	老人（<60) : 1/3
//	
//淡季 ： 
//	 成人：40 
//	 其他：20
import java.util.Scanner;

public class NestedIf01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("请输入购票月份：");
		int month = in.nextInt();

		System.out.println("请输入您的年龄：");
		int age = in.nextInt();

		  // 检查月份是否在合理范围内
        if (month < 1 || month > 12) {
            System.out.println("无效的月份，请输入1到12之间的月份。");
            return;
        }

	 
		// 旺季
			if(month >= 4 && month <= 10){
			
				if(age>=18 && age <= 60){
					System.out.println("你的票价为 ~60~");
				}else if(age < 18){
					System.out.println("你的票价为 ~40~");	
				}
				else{
					System.out.println("你的票价为 ~20~");
				}
			}
			//淡季
			else {
				 
					if(age>=18 && age <= 60){
						System.out.println("你的票价为 ~40~");
					}
					if(age < 18 || age > 60 ){
						System.out.println("你的票价为 ~20~");	
					}

		}


	 	
	}
}