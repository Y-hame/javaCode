/**
 * ��ʾ�����������ʹ�ù���
 */
public class ArithmeticOperator{
	// ��дһ��main ����
	public static void main(String[] args){
		
		// ��ʾ ���ŵ�ʹ�� /
		System.out.println(10 / 4);  //����ѧ�ĽǶȿ���2.5 �� Ȼ���������������2
		System.out.println(10.0 / 4);  // java ����2.5
		double d = 10/4; // java �� 10/ 4 = 2 , 2=>2.0
		System.out.println(d);  // 2.0
		System.out.println("========================");
		// ȡ�����%  ��ʹ�� 
		// ��% ���� ��һ����ʽ a % b = a = a / b * b
		// 10 % 3 = 10 - 10 / 3 * 3 = 10 - 9 = 1;
		// -10 % 3 = -10 - (-10) / 3 *3 = -1;
		// 10 % -3 = 10 - 10 / (-3) *(-3) = 10 - 9 = 1
		// 
		System.out.println(10 % 3);  // 1
		System.out.println(-10 % 3); // -1 
		System.out.println(10 % -3); // 1
		System.out.println(-10 % -3); // -1
		System.out.println("========================");
		//++��ʹ��
		//��Ϊ���������ʹ�õ�ʱ��ǰ++ �ͺ�++������ȫ�ȼ���i = i + 1;
		//
		int i = 10;
		i++; //���� �ȼ��� i = i +1�� => i= 11
		++i;  //���� �ȼ��� i = i +1�� => i= 12
		System.out.println("i=" + i);
 		System.out.println("========================");
		/*
		��Ϊ���ʽʹ�� 
		ǰ++�� ++i��������ֵ
		��++�� i++�ȸ�ֵ������
		 */
		int j = 8;
		int k = ++j;   //���k = 9 , j =8
		//int k = ++j; //��� k = 8 , j = 9   ��Ҫ����ִ�У������j
		System.out.println("k = "+ k  +"\t " + "j =" + j );


		int j1 = 8;
		int k1 = j1++; //��� k = 8 , j = 9   ��Ҫ����ִ�У������j
		System.out.println("k1 = "+ k1  +"\t " + "j1 =" + j1 );
		 
		
		 

	}	 


}