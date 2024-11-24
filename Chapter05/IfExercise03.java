//定义两个变量，判断二者 的和能否被3又能被5整除
//1.定义两个变量 num1 num2 
//2. 定义一个变量 int sum = num1 + num2 ;
//3.sum % 3 && sum % 5 都等于0
//4.使用if - else 来控制流程

public class IfExercise03{
	public static void main(String[] args){
		int num1 = 10;
		int num2 = 5;
		int sum = num1 +num2;
		if (sum % 3 == 0 && sum % 5 ==0){
			System.out.println("和可以被3和5整除。");
		}else{
			System.out.println("和不 可以被整除。");
		}

	}
}