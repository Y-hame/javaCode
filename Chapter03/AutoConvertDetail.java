public class AutoConvertDetail{
    public static void main (String[] args){
        //ϸ��1�� �ж������͵����ݻ������ʱ
        //ϵͳ�����Զ������е�����ת�����������������������ͣ�Ȼ���ٽ��м���
        int n1= 10; 
		//float d1 = n1 + 1.1f;		���������float
        //float d1 = n1 + 1.1; //���� n1 + 1.1 =>���������double
		double d1 = n1 + 1.1;


         System.out.println(d1);//11.1

         //ϸ��2�� �����ǰѾ���(����) ����������͸�ֵ������С ����������ʱ��
         //�ͻᱨ����֮�ͻ��Զ�ת����
       
    	//ϸ��3�� byte,short �� char ֮�䲻���໥ת�������Ѿ��������� byte ʱ�� (1)���жϸ����Ƿ���byte��Χ�ڣ����ǾͿ���ת��
        byte b1 = 10; //�� -218- 127
        int n2 = 1; //n2 ��int 
        byte b2 = n2;   //��  ����Ǳ����ĸ�ֵ���ж�����   int4�ֽ� ��byte 1�ֽ�
        char c1 = b1; // ���� byte ����ת���� char
        
        
        //ϸ��4�� 1. byte��short ,char  �������߿��Լ��㣬�ڼ���ʱ����ת����int ����(����ʱ�������㻹�ǻ���������㣬����֮�󶼻�ת���� int ����)
		byte b2 = 1;
        byte b3 =2;
        short s1 = 1;
        // short s2 = b2 +s1;  //�� b2 + s1 => int
        int s2 = b2 +s1;
        byte b4 = b2 + b3; //�� b2 + b3 => int
        
        
    }
}