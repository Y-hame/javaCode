public class LogicOperator02{
	public static void main (String[] args){

		// ��·��||  ���߼��� | ������ʾ
		// ���������� �е�һ������ֻҪ��һ�����������Ϊtrue,����Ϊfalse
		int age = 50;

		if(age > 20 || age < 90 ){
			System.out.println("ok100");
								}
		//�߼����ʹ��
		if(age > 20 | age < 90 ){
			System.out.println("ok200");}


		// ���� ��·Ч�ʸ�
		// ��·��&&���ǵ�һ��Ϊ�٣����治ִ�У���·��||�ǵ�һ��Ϊ����治ִ��
		int a = 4;
		int b = 9;
		if(a < 1 || ++b < 50 ){
			System.out.println("ok400");
		}
		System.out.println("a = " + a + " b = " + b);

	}
}