public class FloatDetial{
	//��дһ��main����
	public static void main(String[] args){
	//java �ĸ����ͳ���������ֵ�� Ĭ��λdouble�ͣ�����float�ͳ���������'f' ��'F'
       float a = 1.1F;
       double b = 1.1;
       double c = 1.1f;
       double d = .123;
       System.out.println(d);
       System.out.println(5.12e2);//512.0
       System.out.println(5.12e-2);//0.0512
        
        //ͨ������£�Ӧ��ʹ��double�ͣ���Ϊ����float�͸���ȷ
        double f = 2.123456789;
        float g =2.123456789F;
        System.out.println(f);
        System.out.println(g);
  		//��������ʹ�����壺 2.7 he 8.1 / 3 �Ƚ�
        double h = 2.7;
        double i = 8.1/3;  //2.7
        System.out.println(h);  //2.7 
        System.out.println(i); // �ӽ�2.7��һ��С����������2.7
       // �����Ƕ���������С���Ľ�����ȵ��жϣ�ҪС��
        //Ӧ�������������Ĳ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
        if(h == i){
            System.out.println("���");
        }
        
        if(Math.abs(h - i)< 0.00001){
            System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���");
        }
        
        // ����ͨ��java API ����
        System.out.println(Math.abs(h - i));
	}

}