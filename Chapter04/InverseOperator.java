public class InverseOperator{
	public static void main(String[] args){
		 // ! ������ȡ��, T -> F, F -> T
        System.out.println(60 > 20); // ���: true (��Ϊ 60 > 20 �ǳ�����)
        System.out.println(!(60 > 20)); // ���: false (��Ϊ 60 > 20 Ϊ true, ȡ����Ϊ false)

        // a^b: �߼����, �� a �� b ��ͬʱ, ����Ϊ true������Ϊ false
        boolean b = (10 > 1) ^ (3 < 5);
        System.out.println("b=" + b); // ��� b �Ľ�� false
	}
}