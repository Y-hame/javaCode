public class BitOperator02{
	public static void main(String[] args){
		String str = "18";
		System.out.println(str);
		int num2 = Integer.parseInt(str);  // 将字符串 "18" 解析为整数 18
		System.out.println(num2);  // 输出结果为 18


		System.out.println(1>>2); // 0 
		System.out.println(1<<2); // 4
		System.out.println(4<<3); //4 * 2 * 2 * 2 = 32
		System.out.println(4>>3); //4 / 2 / 2 / 2 = 0
	}
}

