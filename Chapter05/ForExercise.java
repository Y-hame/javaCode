public class ForExercise{
	public static void main(String[] args){
		// ��ӡ 1 ~ 100 ֮��������9 �ı�����������ͳ�Ƹ��� �� �ܺ� [����Ϊ��][�������]
		// ����Ϊ��  : �������ӵ����󣬲��ɼ򵥵����� �����
		// ������� �� �ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��ֵ
		
			//(1) ������ 1 - 100 ��ֵ
			//(2) ������Ĺ����У����й��ˣ�ֻ���9 �ı��� i % 9== 0
			// (3) ͳ��������� ������һ������ int count = 0; �����������ʱ count ++ ��
		int count = 0;
		int sum = 0;
		int start = 1;
		int end =100;
		for(int i = start; i <= end; i++){
			if(i % 9 == 0){
				// System.out.println("��9�ı��������� = " + i +"���ܸ���Ϊ" + count++ );	 ��������ĸ�������һ����Ϊ�������count ++ ��ֵ��Ӧ������󵥶����count
				System.out.println("��9�ı��������� = " + i  );
				count++;
				sum += i;
			}
			
		}
		System.out.println("һ����"+ count +"����");
		System.out.println("�ܺ�Ϊ" + sum);

	}
}