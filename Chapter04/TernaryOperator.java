public class TernaryOperator{
	public static void main(String[] args){

		int a = 10; 
		int b = 99;
		//������ a > bΪfalse  ����b--���������Ϊ��׺���ʽ �ȷ��� b ��ֵ�� Ȼ����  b - 1
		//���ؽ��Ϊ99
		int result  = a > b ? a++ : b--;
		System.out.println("result = " + result);   //���� result = 99;
		System.out.println("a = " + a);   //���� a = 10 ;
		System.out.println("b = " + b);   //���� result = 98;


	}	 
}