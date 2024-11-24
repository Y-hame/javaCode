public class Random{
	//编写一个main方法
	public static void main(String[] args){
		for(int i = 0; i <= 10; i++){
			System.out.println((int)(Math.random() * 100 + 1)); 

			//(int)(Math.random() *100) 生成 0 - 99 的随机数
		}
		
	}
	//随机生成 1 - 100 的一个数，知道生成了97 这个数，(int)(Math.random() * 100 + 1)
}