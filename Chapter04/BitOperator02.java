public class BitOperator02{
	public static void main(String[] args){
		String str = "18";
		System.out.println(str);
		int num2 = Integer.parseInt(str);  // ���ַ��� "18" ����Ϊ���� 18
		System.out.println(num2);  // ������Ϊ 18


		System.out.println(1>>2); // 0 
		System.out.println(1<<2); // 4
		System.out.println(4<<3); //4 * 2 * 2 * 2 = 32
		System.out.println(4>>3); //4 / 2 / 2 / 2 = 0
	}
}

