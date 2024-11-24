//参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰。并且根据性别提示
//进入男子组还是女子组。输入成绩和性别，进行判断和输出信息。
import java.util.Scanner;

public class NestedIf{

	public static void main(String[] args){
		char gender ;
		double score;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入您的所得分数：");
		
		score = in.nextDouble();
		
		if(score > 8.0){
			System.out.println("请输入您的性别（男/女）：");
			gender = in.next().charAt(0);   //怎么把字符串转换成字符char -> 含义是指 把字符串的第一个字符得到 
										    //得到S5字符串  的第一个字符‘1’
											//解读 s5.charAt(0) 得到s5 字符串的第一个字符'1'
			if(gender == '男'){                       //这里报错，表示这里不能转换成boolean 类型 应该使用==  char类型和数值有联系
				System.out.println("成功晋级，男子组");
			}
			if(gender == '女'){
				System.out.println("成功晋级，女子组");
			}
		}else{
			    System.out.println("晋级失败。");
		}

	}
}

// public class NestedIf{

// 	public static void main(String[] args){
		
// 		Scanner in = new Scanner(System.in);
// 		System.out.println("请输入您的所得分数：");
		
// 		double score = in.nextDouble();
		
// 		if(score > 8.0){
// 			System.out.println("请输入您的性别：");
// 			char gender = in.next().charAt(0);  

// 			if(gender =='男'){
// 				System.out.println("成功晋级，男子组");
// 			}else if(gender == '女'){
// 				System.out.println("成功晋级，女子组");
// 			}else {
// 				System.out.println("不要乱输，重新来！");
// 			}
// 		}else{
// 			     System.out.println("晋级失败。");
// 		}

// 	}
// }
