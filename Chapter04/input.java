import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		//��ʾ�����û�������
		//����
		//Scanner�� ��ʾ ���ı�ɨ�� �� java.util����
		//1.���롢���� Scanner�����ڵİ�
		//2. ���� Scanner ����, new ->> ����һ������
		Scanner myScanner = new Scanner(System.in);
		//3. �����û�������
		System.out.println("���������֣�");
		//������ִ�е� next �����ǣ���ȴ��û�����~~~~~~
		String name = myScanner.next(); //�����û������ַ���
		System.out.println("���������䣺");
		int age = myScanner.nextInt(); //�����û����� int 
		System.out.println("������нˮ��");
		double salary = myScanner.nextDouble(); //�����û����� double
		System.out.println("�˵���Ϣ���£�");
		System.out.println("���� = " + name 
			+ ";����=" + age + ";нˮ=" + salary );
	}
}