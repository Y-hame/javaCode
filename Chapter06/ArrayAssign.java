public class ArrayAssign{
	public static void main(String [] args){
		//基本数据类型赋值， 赋值方式为值拷贝 
		//n2 的变化，不会影响到n1 的值
		int n1 = 10;
		int n2 = n1;

		n2 = 80;

		System.out.println(n1);
		System.out.println(n2);
		 
		System.out.println(" ");

		//数组在默认的情况下是引用传递，赋的值是地址，赋值方式为引用传递
		//传递的是一个地址， arr2 的变化会影响到arr1
		int arr1 [] = {1,2,3};

		int arr2 [] = arr1;   // 把 arr1 赋值 给了 arr2 

		arr2[0] = 10; 

		//看看arr1 的值的变化
		System.out.println("===========arr1的值===============");
		for(int i = 0; i < arr1.length; i++){
			System.out.print( arr1[i] + " ");
		}
		System.out.println(" ");

		System.out.println("===========arr2的值===============");
		for(int i = 0; i < arr2.length; i++){
			System.out.print( arr1[i] + " ");
		}
		System.out.println(" ");
	}
}