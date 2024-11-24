public class charDetail{
	public static void main (String [] args){
		
// 在java中，char的本质是一个整数，在输出的时候是Unicode码对应的字符。
        char c1 =97;   //整数不用引号
        System.out.println(c1);//输出a

        char c2 = 'a';
         System.out.println((int)c2);//输出97

        char c3 = '徐';
         System.out.println((int)c3);//输出24464

         char c4 = 24464;
          System.out.println(c4);

          // char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码
          System.out.println('a'+ 10 );//107

          //课堂测试
          char c5 = 'b' + 1;
          System.out.println((int)c5); //99
          System.out.println(c5); //99->对应的字符->编码表ASCLL



	}  
}