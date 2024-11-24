public class SwitchDetail{
	public static void main(String[] args){
		//1.表达式数据类型，应和case 后的常量类型一致，或者是可以自动转成可以相互比较的
		//		类型，比如输入的是字符，而常量是 int
		//		
		//2. Switch 中表达式的返回值必须是：
		//		(byte.short,int, char ,enmu[枚举], String)
		//
		//3. case 子句中的值必须是常量(1, 'a')或者常量表达式，而不能是变量
		//
		//4. default子句是可选的，当没有case 时，执行default  ，不写default 语句也可以，就会没有输出
		//
		//5. break语句用来在执行完一个case分支后使程序跳出switch语句块;如果没有写
		// 		break，程序会顺序执行到switch结尾,除非遇到break;
		// 		
		char c = 'a';
		System.out.println(c);  //输出 a 
		System.out.println((int)c);  //输出 97 

		switch(c){
			case 'a':
				System.out.println("ok1");
				break;
			case 'b':
				System.out.println("ok1");
				break;
			case 20:     //这里的char 类型的本质就是整数，
				System.out.println("ok1");
				break;
			default:
				System.out.println("输入错误。");
		}

		// char d = "a"

		// switch(c){
		// 	case "a":
		// 		System.out.println("ok1");
		// 		break;
		// 	case "b":
		// 		System.out.println("ok1");
		// 		break;
		// 	case 20:     //这里 会报错，这里的类型和String类型不能转换
		// 		System.out.println("ok1");
		// 		break;
		// 	default:
		// 		System.out.println("输入错误。");
		// }
	}
}