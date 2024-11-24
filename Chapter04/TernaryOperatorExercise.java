public class TernaryOperatorExercise{
	public static void main (String[] args) {
		// 案例： 实现三个数的最大值
		int n1  = 55;
		int n2 = 33;
		int n3 = 123;

		int max1 = n1 > n2 ? n1 :n2;
		int max2 = max1 > n3 ? max1 : n3;

			int max = n1 > n2 ?(n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

		System.out.println("最大数为"+ max2 );

	}
}

// public class TernaryOperatorExercise{
//     public static void main (String[] args) {
//         // 案例： 实现三个数的最大值
//         int n1  = 55;
//         int n2 = 33;
//         int n3 = 123;

//         // 分步写法
//         int max1 = n1 > n2 ? n1 : n2;
//         int max2 = max1 > n3 ? max1 : n3;

//         // 嵌套写法
//         int max2 = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

//         System.out.println("最大数为 " + max2);
//     }
// }
