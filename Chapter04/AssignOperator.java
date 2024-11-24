//演示赋值运算符的使用
public class AssignOperator{
	public static void main (String[] args){
		
		int n1 = 10;
		n1 += 4;// n1 = n1 +4;
		System.out.println(n1); //14
		n1 /= 3; // n1 = n1 / 3 
		System.out.println(n1);// 4

		//复合赋值运算符会进行类型转换
		byte b = 3;
		b += 2; // 等价于 b = (byte)(b + 2);
		//b = b + 2;  //错误由于 b + 2 会变成int 类型 而需要赋值的b  是byte类型
		b++ ; // b 也可以是认为有一个类型转换 b = (byte)(b + 1);


	}
}