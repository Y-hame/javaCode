public class ForDetail{
	public static void main(String[] args){
	/*
	1. Forѭ���Ƿ���һ������ֵ�ı��ʽ

	2. For(;ѭ���ж�����;)�еĳ�ʼ���ͱ�����������д�������ط����������ߵķֺŲ���ʡ��

	3. ѭ����ʼֵ�����ж�����ʼ����䣬��Ҫ������һ���������м䶼�ø�����
		ѭ����������Ҳ�����ж�������������䣬�м��ö��Ÿ���
	4. ʹ���ڴ������	
	 */

	int i = 1;  //ѭ��������ʼ��
	for(; i<= 10; ){
		System.out.println("Hello" +i);
		i++;
	}
	System.out.println("i =" + i);   //�����java����Ҫ������������Ļ�����Ҫ������������forѭ�����棻
									//���ִ�е����������� i = 11; 

//����
	// int j = 0;
	// for(;;){ //��ʾһ����ѭ������ѭ��
	// 	System.out.println("ok" + (j++));
	// }
	// 
	int count = 3;
	for(int i =0,j = 0; i < count; i++ ,j+=2){
		System.out.println("i = " + i + ";j = " + j);
	}


	}
}