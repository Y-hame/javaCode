public class Homework01 {

    public static void main(String[] args) {
//1.定义 double money 保存 100000
//2. 根据题意，我们分析出来三种情况
//		money > 50000
//		money >= 1000 && money <= 50000
//		money < 1000
//3. 使用多分支 if-else if -else 
//4. while + break [money < 1000], 同时使用一个变量count 来保存通过的路口
// 代码实现、

        int count = 0; // 累积过的路口
        double money = 100000; 

        while (true) {
            double fee;

            // 当现金 > 50000 时，交费为 5%
            if (money > 50000) {
               // money = money - money * 0.05;

                money *= 0.95; // 过了这个路口后，剩余的钱
				count++;
            } 
            // 当现金 <= 50000 时，交费为 1000
            else if (money >= 1000  ) {
                
                money -= 1000; // 更新余额
                count++;
            } 
            // 当余额不足以支付下一次费用时，结束循环
            else {
                break;
            }
        }

        // 输出最终结果
        System.out.println("一共可以经过" + count + "个路口");
    }
}
