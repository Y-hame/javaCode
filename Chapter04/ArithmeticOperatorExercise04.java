public class ArithmeticOperatorExercise04{
	public static void main(String[] args){
		//距离放假还有59天，问有xx星期 xx天
		int day = 900;
		int week , day1;
		week = day / 7;  
		day1 = day % 7;
		System.out.println("还有 " + week + " 星期，零" + day1 + "天 放假。" );
	}
}