/**
 * 演示算术运算符的使用过程
 */
public class ArithmeticOperator{
	// 编写一个main 方法
	public static void main(String[] args){
		
		// 演示 除号的使用 /
		System.out.println(10 / 4);  //从数学的角度看是2.5 ， 然而计算机程序中是2
		System.out.println(10.0 / 4);  // java 中是2.5
		double d = 10/4; // java 中 10/ 4 = 2 , 2=>2.0
		System.out.println(d);  // 2.0
		System.out.println("========================");
		// 取余符号%  的使用 
		// 在% 本质 看一个公式 a % b = a = a / b * b
		// 10 % 3 = 10 - 10 / 3 * 3 = 10 - 9 = 1;
		// -10 % 3 = -10 - (-10) / 3 *3 = -1;
		// 10 % -3 = 10 - 10 / (-3) *(-3) = 10 - 9 = 1
		// 
		System.out.println(10 % 3);  // 1
		System.out.println(-10 % 3); // -1 
		System.out.println(10 % -3); // 1
		System.out.println(-10 % -3); // -1
		System.out.println("========================");
		//++的使用
		//作为独立的语句使用的时候，前++ 和后++都是完全等价于i = i + 1;
		//
		int i = 10;
		i++; //自增 等价于 i = i +1； => i= 11
		++i;  //自增 等价于 i = i +1； => i= 12
		System.out.println("i=" + i);
 		System.out.println("========================");
		/*
		作为表达式使用 
		前++： ++i先自增后赋值
		后++： i++先赋值后自增
		 */
		int j = 8;
		int k = ++j;   //输出k = 9 , j =8
		//int k = ++j; //输出 k = 8 , j = 9   需要单独执行，定义的j
		System.out.println("k = "+ k  +"\t " + "j =" + j );


		int j1 = 8;
		int k1 = j1++; //输出 k = 8 , j = 9   需要单独执行，定义的j
		System.out.println("k1 = "+ k1  +"\t " + "j1 =" + j1 );
		 
		
		 

	}	 


}