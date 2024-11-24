public class TernaryOperator{
	public static void main(String[] args){

		int a = 10; 
		int b = 99;
		//不成立 a > b为false  返回b--；由于这个为后缀表达式 先返回 b 的值， 然后在  b - 1
		//返回结果为99
		int result  = a > b ? a++ : b--;
		System.out.println("result = " + result);   //返回 result = 99;
		System.out.println("a = " + a);   //返回 a = 10 ;
		System.out.println("b = " + b);   //返回 result = 98;


	}	 
}