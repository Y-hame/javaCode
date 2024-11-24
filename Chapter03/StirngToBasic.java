public class StringToBasic{
    public static void main(String[] args){
        // 基本数据类型 -> String 
        int n1 = 100;
        float f1 = 1.1f;
        double d1 = 4.5;
        boolean b1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = d1 + "";
        String s4 = b1 + "";
        System.out.println(s1 + " " + f1 + " " + d1 + " " + b1 );
        
        //String -> 对应的基本数据类型
        String s5 = "123";
        //会涉及到OOp 的东西
        // 使用基本 数据类型对应的包装类，的相应方法，达到基本数据类型
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