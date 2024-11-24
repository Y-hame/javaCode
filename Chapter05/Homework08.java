// 8.求出1-1/2+1/3-1/4.+5.-6...1/100的和
public class Homework08{
	public static void main(String [] args){

		double sum = 0;
		for(double i = 1; i <= 100; i++){
			if(i % 2 == 0){
			 sum -= 1.0 / i ;
			}
			else {
			 sum += 1.0 / i ;
			}


		}
		System.out.println("结果为"+sum);
	}
}