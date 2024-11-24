// 思路分析 
	// 1. 创建Scanner对象 用于接收用户的输入
	// 2. 定义String name; String passwd; 保存用户名和密码
	// 3. 循环三次[最多执行3次] 如果符合条件就跳出循环
	// 4. 定义一个变量机会 int change ; 记录还有几次登录

import java.util.Scanner;

public class BreakExercise02{
    public static void main(String[] args){
        		
        //使用for循环，控制输入次数   定义一个变量字符串 来存放，输入的名称
		 Scanner in = new Scanner(System.in);
		  String name = " ";
		  String passw = " ";
          int chance = 3; //登录一次，就减少一次
        
        for(int i = 1; i <= 3; i++){
             System.out.println("请输入姓名：");
		  		name = in.next(); 
		  	 System.out.println("请输入密码：");
		 		passw = in.next();
            if("Yhame".equals(name) && "666".equals(passw)){
                System.out.println("登陆成功");
                break;
            }
            //登录次数减少
            chance--;
            System.out.println("你还有"+chance+"次登陆机会");
            
            
        }

    }
}
	
 
