public class Break02 {
    public static void main(String[] args) {
        lable1: // �������ѭ����ǩ lable1
        for (int j = 0; j < 4; j++) {
            // System.out.println("j= " + j); // ������ѭ������ j
            
            lable2: // �����ڲ�ѭ����ǩ lable2
            for (int i = 0; i < 10; i++) {
                if (i == 2) {
                    break ; // �� i == 2 ʱ���������ѭ�� lable1
                }
                System.out.println("i= " + i); // ����ڲ�ѭ������ i
            }
        }
    }
}
