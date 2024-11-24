public class ForDetail{
	public static void main(String[] args){
	/*
	1. For循环是返回一个布尔值的表达式

	2. For(;循环判断条件;)中的初始化和变量迭代可以写到其他地方，但是两边的分号不能省略

	3. 循环初始值可以有多条初始化语句，但要求类型一样，并且中间都好隔开，
		循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开
	4. 使用内存分析法	
	 */

	int i = 1;  //循环变量初始化
	for(; i<= 10; ){
		System.out.println("Hello" +i);
		i++;
	}
	System.out.println("i =" + i);   //如果在java中需要运行这个变量的话，需要将变量定义在for循环外面；
									//最后执行到最后，输出的是 i = 11; 

//补充
	// int j = 0;
	// for(;;){ //表示一无限循环，死循环
	// 	System.out.println("ok" + (j++));
	// }
	// 
	int count = 3;
	for(int i =0,j = 0; i < count; i++ ,j+=2){
		System.out.println("i = " + i + ";j = " + j);
	}


	}
}