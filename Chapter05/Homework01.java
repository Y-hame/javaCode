public class Homework01 {

    public static void main(String[] args) {
//1.���� double money ���� 100000
//2. �������⣬���Ƿ��������������
//		money > 50000
//		money >= 1000 && money <= 50000
//		money < 1000
//3. ʹ�ö��֧ if-else if -else 
//4. while + break [money < 1000], ͬʱʹ��һ������count ������ͨ����·��
// ����ʵ�֡�

        int count = 0; // �ۻ�����·��
        double money = 100000; 

        while (true) {
            double fee;

            // ���ֽ� > 50000 ʱ������Ϊ 5%
            if (money > 50000) {
               // money = money - money * 0.05;

                money *= 0.95; // �������·�ں�ʣ���Ǯ
				count++;
            } 
            // ���ֽ� <= 50000 ʱ������Ϊ 1000
            else if (money >= 1000  ) {
                
                money -= 1000; // �������
                count++;
            } 
            // ��������֧����һ�η���ʱ������ѭ��
            else {
                break;
            }
        }

        // ������ս��
        System.out.println("һ�����Ծ���" + count + "��·��");
    }
}
