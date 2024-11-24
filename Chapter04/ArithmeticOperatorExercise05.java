public class ArithmeticOperatorExercise05{
	public static void main(String[] args){
		//定义一个变量保存华氏温度，华氏温度转换摄氏温度的
		//公式为:5/9*(华氏温度-100),请求出华氏温度[Fahrenheit]对应的摄氏温度[Celsius]。[234.5]
		//
		//思路分析
		//(1) 先定义一个 double 变量 保存 Fahrenheit 
		//(2) Celsius=  5 /9 (Fahrenheit - 100)
		//(3) 将结果保存到 double Celsius
		double Fahrenheit = 134.6;
		double Celsius = 5.0 / 9 *(Fahrenheit - 100);  //这里注意5/9 为0 ，需要变成 5.0才是double 类型运算
		System.out.println("华氏温度" + Fahrenheit + "对应的摄氏温度=" + Celsius);
	}
}

// Fahrenheit = (Celsius * 9.0 / 5) + 32;