public class InverseOperator{
	public static void main(String[] args){
		 // ! 操作是取反, T -> F, F -> T
        System.out.println(60 > 20); // 输出: true (因为 60 > 20 是成立的)
        System.out.println(!(60 > 20)); // 输出: false (因为 60 > 20 为 true, 取反后为 false)

        // a^b: 逻辑异或, 当 a 和 b 不同时, 则结果为 true，否则为 false
        boolean b = (10 > 1) ^ (3 < 5);
        System.out.println("b=" + b); // 输出 b 的结果 false
	}
}