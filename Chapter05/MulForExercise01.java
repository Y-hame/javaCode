//��3����ɼ������ÿ������5��ͬѧ��
//����������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]��
//ͳ�������༰��������ÿ������5��ͬѧ��
import java.util.Scanner;

public class MulForExercise01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double sum2 = 0;
		int passNum = 0;
		//double sum = 0;//д��ѭ���ⲿ��������ÿ������ܳɼ�׼ȷ
//����Ϊ��
//(1) �ȼ���һ����ģ�����5��ѧ���ĳɼ�
//1.1 ����Scanner ����󣬽����û�����
//1.2 �õ��ð༶��ƽ���֣�����һ��double sum �����ð༶��5��ѧ���ĳɼ��ۼ�����
//(2) ͳ��3����(ÿ����5��ѧ��) ƽ����
//(3) ���а༶��ƽ����
//3.1 ����һ��double = sum2;ͳ�����а༶��ƽ����
//3.2 ѭ�������Ժ�sum2/(3 )
//(4) ͳ��������ļ������� 
//	4.1 ������� int passNum = 0; ����һ��ѧ���ɼ�>= 60 ,passNum++;
//   4.2 �����Զ���һ������ȥͳ��ÿ����ļ���������int count =0;  count++;

for(int i = 1; i <= 3; i++){ //��ʾ�༶
		double sum = 0;

		int count = 0; //ͳ��ÿ����ļ�������

		for(int j =1; j <= 5; j++){//��ʾѧ��
			System.out.println("�������"+i+"���༶�ĵ�"+j+"��ѧ���ĳɼ�");
			double score=in.nextDouble();
			System.out.println("�ɼ�Ϊ"+ score);
			sum += score;
			if(score >= 60){
				count++;   // ÿ���༰������
				passNum++;   // �ܼ�������
			}
		}

		sum2 += sum;  //���а༶ѧ���ܳɼ�
		//sum Ϊ5��ѧ�����ܳɼ�
		System.out.println("��"+i+"���༶��sum =" + sum + "ƽ����= "+ (sum/5));
		System.out.println("��"+i+"���༶�ļ���������"+ count);
		System.out.println("====================================================");
		
	}

		System.out.println("���а༶��ƽ����"+(sum2/(3*5)));
		System.out.println("���а༶�ļ�������"+passNum);

	}
}