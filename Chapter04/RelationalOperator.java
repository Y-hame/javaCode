//演示关系运算符的使用
public class RelationalOperator{
	public static void main (String[] args ){
			int a = 9;    //开发中尽量不可以使用 a b a1,bc, n1 , n2 ...
			int b = 8;
			System.out.println(a > b);  // True
			System.out.println(a >= b);  //True
			System.out.println(a <= b);  //False
			System.out.println(a < b);  //
			System.out.println(a == b);
			System.out.println(a != b);
			boolean flag = a > b; //True
			System.out.println("flag = " + flag);

			// true
			// true
			// false
			// false
			// false
			// true
			// flag = true
	}		
}