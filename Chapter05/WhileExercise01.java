public class WhileExercise01{
	public static void main(String[] args){
		int i = 1;
		while(i<=100 ){
			if( i % 3 == 0){
				System.out.println("i = " + i);
			}
			
			i++;  //将 i++ 写在 if 语句内部，会导致 i 在其他情况下无法递增，最终引发无限循环。

		}
		System.out.println("程序继续运行");
	}
}