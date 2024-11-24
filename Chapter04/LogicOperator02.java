public class LogicOperator02{
	public static void main (String[] args){

		// 短路或||  和逻辑或 | 案例演示
		// 规则都是两个 中的一个条件只要有一个成立，结果为true,否则为false
		int age = 50;

		if(age > 20 || age < 90 ){
			System.out.println("ok100");
								}
		//逻辑或的使用
		if(age > 20 | age < 90 ){
			System.out.println("ok200");}


		// 区别 短路效率高
		// 短路与&&就是第一个为假，后面不执行，短路或||是第一个为真后面不执行
		int a = 4;
		int b = 9;
		if(a < 1 || ++b < 50 ){
			System.out.println("ok400");
		}
		System.out.println("a = " + a + " b = " + b);

	}
}