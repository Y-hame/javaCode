//1 -100 以内的数字求和，求出当和第一次大于 20 的当前数字
public class BreakExercise{
	public static void main(String[] args){

		//思路分析
		//1.循环你 1- 100 求和 sum 
		//2. 当 sum > 20 数，记录下当前数，然后break
		//3.在for 循环外部，定义一个变量n   最后把当前 i 赋给 n   
		//		或者说直接把 i 定义在外部也行
		int n = 0;
		int sum = 0;

		for(int i = 1; i <= 100; i++){
			
			sum += i; //累积
			if(sum > 20){
				System.out.println("和>20的时候 当前数i= " + i);
				n = i;
				break;
			}
			
		}
		System.out.println("当期数= " + n);
	}
}