public class SwitchDetail{
	public static void main(String[] args){
		//1.���ʽ�������ͣ�Ӧ��case ��ĳ�������һ�£������ǿ����Զ�ת�ɿ����໥�Ƚϵ�
		//		���ͣ�������������ַ����������� int
		//		
		//2. Switch �б��ʽ�ķ���ֵ�����ǣ�
		//		(byte.short,int, char ,enmu[ö��], String)
		//
		//3. case �Ӿ��е�ֵ�����ǳ���(1, 'a')���߳������ʽ���������Ǳ���
		//
		//4. default�Ӿ��ǿ�ѡ�ģ���û��case ʱ��ִ��default  ����дdefault ���Ҳ���ԣ��ͻ�û�����
		//
		//5. break���������ִ����һ��case��֧��ʹ��������switch����;���û��д
		// 		break�������˳��ִ�е�switch��β,��������break;
		// 		
		char c = 'a';
		System.out.println(c);  //��� a 
		System.out.println((int)c);  //��� 97 

		switch(c){
			case 'a':
				System.out.println("ok1");
				break;
			case 'b':
				System.out.println("ok1");
				break;
			case 20:     //�����char ���͵ı��ʾ���������
				System.out.println("ok1");
				break;
			default:
				System.out.println("�������");
		}

		// char d = "a"

		// switch(c){
		// 	case "a":
		// 		System.out.println("ok1");
		// 		break;
		// 	case "b":
		// 		System.out.println("ok1");
		// 		break;
		// 	case 20:     //���� �ᱨ����������ͺ�String���Ͳ���ת��
		// 		System.out.println("ok1");
		// 		break;
		// 	default:
		// 		System.out.println("�������");
		// }
	}
}