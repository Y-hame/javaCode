
public class VarDetail{

	//编写一个main 方法
	public static void main(String[] args){
		//变量必须先声明后使用，即有顺序
		int a = 50;
		System.out.println(a);
		//该区域的数据/ 值 可以在同一类型范围内不断变化
		//a = "jack"; 不对
		a = 88; //对
		System.out.println(a);
		//变量在同一个作用域内不能重名
		// int a = 77; // 错误
	}
}

class Dog{
	public static void main(String[] args){
		 int a = 77;
	}


// 变量 = 变量名 + 值 + 数据类型