//���������������ж϶��� �ĺ��ܷ�3���ܱ�5����
//1.������������ num1 num2 
//2. ����һ������ int sum = num1 + num2 ;
//3.sum % 3 && sum % 5 ������0
//4.ʹ��if - else ����������

public class IfExercise03{
	public static void main(String[] args){
		int num1 = 10;
		int num2 = 5;
		int sum = num1 +num2;
		if (sum % 3 == 0 && sum % 5 ==0){
			System.out.println("�Ϳ��Ա�3��5������");
		}else{
			System.out.println("�Ͳ� ���Ա�������");
		}

	}
}