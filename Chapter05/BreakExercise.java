//1 -100 ���ڵ�������ͣ�������͵�һ�δ��� 20 �ĵ�ǰ����
public class BreakExercise{
	public static void main(String[] args){

		//˼·����
		//1.ѭ���� 1- 100 ��� sum 
		//2. �� sum > 20 ������¼�µ�ǰ����Ȼ��break
		//3.��for ѭ���ⲿ������һ������n   ���ѵ�ǰ i ���� n   
		//		����˵ֱ�Ӱ� i �������ⲿҲ��
		int n = 0;
		int sum = 0;

		for(int i = 1; i <= 100; i++){
			
			sum += i; //�ۻ�
			if(sum > 20){
				System.out.println("��>20��ʱ�� ��ǰ��i= " + i);
				n = i;
				break;
			}
			
		}
		System.out.println("������= " + n);
	}
}