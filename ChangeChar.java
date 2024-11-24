//转义字符的使用 
public class ChangeChar{
    // 编写一个main 方法
    public static void main (String[] args){
        // \t 一个制表位，实现对齐功能  
        System.out.println("北京\t天津\t上海");
        // \n  换行符
   		System.out.println("jack\ntom\nmary");
         // 输出一个\
   		System.out.println("D:\\TextOPT\\JAVA_Code\\TestJavaCode");
          // 输出一个\\
        System.out.println("D:\\\\TextOPT\\\\JAVA_Code\\\\TestJavaCode");
        // 输出一个 \"
        System.out.println("周恩来:\"为中华之崛起而读书。\"");
        // 输出一个 \'
        System.out.println("周恩来:\'为中华之崛起而读书。\'");
        // \r : 一个回车 
        System.out.println("东方雄狮\r西方");
        //  \b : 退格符
        System.out.println("Hello\bWorld");   // 输出：HellWorld（o 被 \b 删除）
        //  \f : 换页符
        System.out.println("Hello\fWorld");  //输出在控制台上可能看不到明显效果，因为 \f 通常在打印时用于换页。然而，它会在一些文本编辑器中插入一个特殊符号。
        
    }
}
