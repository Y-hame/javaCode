public class ForceConvertDetail{
    public static void main (String[] args){
        //��ʾǿ������ת��
        //ǿ�Ʒ���ֻ���������Ĳ�������Ч��������ʹ��С�����������ȼ�
        //int x = (int)10*3.5+6*1.5; //�������double -> int
        int x = (int)(10*3.5+6*1.5);
        System.out.println(x);  //44
        
        char c1 = 100;
        int m =100;
        // char c2 = m;
        char c3 = (char)m;
        System.out.println(c3); // 100 ��Ӧ���ַ���d�ַ�
    }
}