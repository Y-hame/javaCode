public class WhileExercise02{
	public static void main(String[] args){
		int i =40;
		while(i>=40 && i<=200){
			if(i % 2==0){
			System.out.println("i = " + i);	
			
			}
			i++;// 不能写在if循环里面 ; 将 i++ 写在 if 语句内部，会导致 i 在奇数情况下无法递增，最终引发无限循环。
		}
		System.out.println("The process continues");
	}
}