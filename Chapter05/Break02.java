public class Break02 {
    public static void main(String[] args) {
        lable1: // 定义外层循环标签 lable1
        for (int j = 0; j < 4; j++) {
            // System.out.println("j= " + j); // 输出外层循环变量 j
            
            lable2: // 定义内层循环标签 lable2
            for (int i = 0; i < 10; i++) {
                if (i == 2) {
                    break ; // 当 i == 2 时，跳出外层循环 lable1
                }
                System.out.println("i= " + i); // 输出内层循环变量 i
            }
        }
    }
}
