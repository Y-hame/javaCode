public class StringToBasic{
    public static void main(String[] args){
        // ������������ -> String 
        int n1 = 100;
        float f1 = 1.1f;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + f1 + " " + d1 + " " + b1 );
        
        //String -> ��Ӧ�Ļ�����������
        String s5 = "123";
        //���漰��OOp �Ķ���
        // ʹ�û��� �������Ͷ�Ӧ�İ�װ�࣬����Ӧ�������ﵽ������������
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        Long num4 = Long.parseLong(s5);
        Byte num5 = Byte.parseByte(s5);
        boolean b = Boolean.parseBoolean("true");
        short num6 = Short.parseShort(s5);
        
        System.out.println("==================");
        System.out.println(num1);
         System.out.println(num2);
         System.out.println(num3);
         System.out.println(num4);
         System.out.println(num5);
         System.out.println(num6);
         System.out.println(b);
       
    }
}