public class charDetail{
	public static void main (String [] args){
		
// ��java�У�char�ı�����һ���������������ʱ����Unicode���Ӧ���ַ���
        char c1 =97;   //������������
        System.out.println(c1);//���a

        char c2 = 'a';
         System.out.println((int)c2);//���97

        char c3 = '��';
         System.out.println((int)c3);//���24464

         char c4 = 24464;
          System.out.println(c4);

          // char�����ǿ��Խ�������ģ��൱��һ����������Ϊ������Ӧ��Unicode��
          System.out.println('a'+ 10 );//107

          //���ò���
          char c5 = 'b' + 1;
          System.out.println((int)c5); //99
          System.out.println(c5); //99->��Ӧ���ַ�->�����ASCLL



	}  
}