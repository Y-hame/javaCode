public class Array01{
	//��дһ��main����
	public static void main(String[] args){
		//����һ������
		// {3,5,1,3.4,2,50} ��ʾ�����ֵ����Ԫ�أ����α�ʾ����ĵڼ���Ԫ��
		double [] hens = {3,5,1,3.4,2,50};

		//��������õ�����Ԫ�صĺͣ� ʹ��for 
		//
		//���ǿ���ͨ��hens[�±�] �����������Ԫ��
		//	�±��Ǵ� 0 ��ʼ��ŵģ������һ��Ԫ�ؾ���hens[0] ��������
		//2. ͨ��for �Ϳ���ѭ������ �����Ԫ��
		//3. ʹ��һ������ totalWeight ������Ԫ���ۻ�
		
		double totalWeight = 0;
		for(int i = 0; i < 6; i++){
			// System.out.println("��" + i +"��Ԫ�ص�ֵ= " + hens[i]);
			totalWeight += hens[i];

		} 
		System.out.println("������= " + totalWeight + "�� ƽ������ = " + totalWeight / 6);

			}
}