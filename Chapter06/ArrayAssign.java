public class ArrayAssign{
	public static void main(String [] args){
		//�����������͸�ֵ�� ��ֵ��ʽΪֵ���� 
		//n2 �ı仯������Ӱ�쵽n1 ��ֵ
		int n1 = 10;
		int n2 = n1;

		n2 = 80;

		System.out.println(n1);
		System.out.println(n2);
		 
		System.out.println(" ");

		//������Ĭ�ϵ�����������ô��ݣ�����ֵ�ǵ�ַ����ֵ��ʽΪ���ô���
		//���ݵ���һ����ַ�� arr2 �ı仯��Ӱ�쵽arr1
		int arr1 [] = {1,2,3};

		int arr2 [] = arr1;   // �� arr1 ��ֵ ���� arr2 

		arr2[0] = 10; 

		//����arr1 ��ֵ�ı仯
		System.out.println("===========arr1��ֵ===============");
		for(int i = 0; i < arr1.length; i++){
			System.out.print( arr1[i] + " ");
		}
		System.out.println(" ");

		System.out.println("===========arr2��ֵ===============");
		for(int i = 0; i < arr2.length; i++){
			System.out.print( arr1[i] + " ");
		}
		System.out.println(" ");
	}
}