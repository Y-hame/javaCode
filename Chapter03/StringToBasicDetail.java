//将String 类型转成 基本数据类型时，要确保String类型能够转成一个整数
//如果格式不正确，就会抛出异常，程序就会终止，这个问题在异常处理章节中会涉及到
public class StringToBasicDetail{
    public static void main(String[] args){
        String str = "hello";
        //转换成int 
        int n1 = Integer.parseInt(str);
        System.out.println(n1);
        
    }
}

