public class ArithmeticOperatorExercise05{
	public static void main(String[] args){
		//����һ���������滪���¶ȣ������¶�ת�������¶ȵ�
		//��ʽΪ:5/9*(�����¶�-100),����������¶�[Fahrenheit]��Ӧ�������¶�[Celsius]��[234.5]
		//
		//˼·����
		//(1) �ȶ���һ�� double ���� ���� Fahrenheit 
		//(2) Celsius=  5 /9 (Fahrenheit - 100)
		//(3) ��������浽 double Celsius
		double Fahrenheit = 134.6;
		double Celsius = 5.0 / 9 *(Fahrenheit - 100);  //����ע��5/9 Ϊ0 ����Ҫ��� 5.0����double ��������
		System.out.println("�����¶�" + Fahrenheit + "��Ӧ�������¶�=" + Celsius);
	}
}

// Fahrenheit = (Celsius * 9.0 / 5) + 32;