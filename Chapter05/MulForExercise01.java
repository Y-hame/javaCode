//计3个班成绩情况，每个班有5名同学，
//求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
//统计三个班及格人数，每个班有5名同学。
import java.util.Scanner;

public class MulForExercise01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double sum2 = 0;
		int passNum = 0;
		//double sum = 0;//写到循环外部，不能让每个班的总成绩准确
//化繁为简
//(1) 先计算一个班的，接收5个学生的成绩
//1.1 创建Scanner 对象后，接受用户输入
//1.2 得到该班级的平均分，定义一个double sum 把所该班级的5个学生的成绩累加起来
//(2) 统计3个班(每个班5个学生) 平均分
//(3) 所有班级的平均分
//3.1 定义一个double = sum2;统计所有班级的平均分
//3.2 循环结束以后，sum2/(3 )
//(4) 统计三个班的及格人数 
//	4.1 定义变量 int passNum = 0; 当有一个学生成绩>= 60 ,passNum++;
//   4.2 还可以定义一个变量去统计每个班的及格人数，int count =0;  count++;

for(int i = 1; i <= 3; i++){ //表示班级
		double sum = 0;

		int count = 0; //统计每个班的及格人数

		for(int j =1; j <= 5; j++){//表示学生
			System.out.println("请输入第"+i+"个班级的第"+j+"个学生的成绩");
			double score=in.nextDouble();
			System.out.println("成绩为"+ score);
			sum += score;
			if(score >= 60){
				count++;   // 每个班及格人数
				passNum++;   // 总及格人数
			}
		}

		sum2 += sum;  //所有班级学生总成绩
		//sum 为5个学生的总成绩
		System.out.println("第"+i+"个班级的sum =" + sum + "平均分= "+ (sum/5));
		System.out.println("第"+i+"个班级的及格人数是"+ count);
		System.out.println("====================================================");
		
	}

		System.out.println("所有班级的平均分"+(sum2/(3*5)));
		System.out.println("所有班级的及格人数"+passNum);

	}
}