public class AutoConvertDetail{
    public static void main (String[] args){
        //细节1： 有多种类型的数据混合运算时
        //系统首先自动将所有的数据转换程容量最大的那种数据类型，然后再进行计算
        int n1= 10; 
		//float d1 = n1 + 1.1f;		结果类型是float
        //float d1 = n1 + 1.1; //错误 n1 + 1.1 =>结果类型是double
		double d1 = n1 + 1.1;


         System.out.println(d1);//11.1

         //细节2： 当我们把精度(容量) 大的数据类型赋值给精度小 的数据类型时，
         //就会报错，反之就会自动转换。
       
    	//细节3： byte,short 和 char 之间不会相互转换，当把具体数赋给 byte 时， (1)先判断该数是否再byte范围内，如是就可以转换
        byte b1 = 10; //对 -218- 127
        int n2 = 1; //n2 是int 
        byte b2 = n2;   //错  如果是变量的赋值，判断类型   int4字节 ，byte 1字节
        char c1 = b1; // 错误 byte 不能转换成 char
        
        
        //细节4： 1. byte，short ,char  他们三者可以计算，在计算时首先转换成int 类型(无论时单独运算还是混合类型运算，运算之后都会转换成 int 类型)
		byte b2 = 1;
        byte b3 =2;
        short s1 = 1;
        // short s2 = b2 +s1;  //错 b2 + s1 => int
        int s2 = b2 +s1;
        byte b4 = b2 + b3; //错 b2 + b3 => int
        
        
    }
}