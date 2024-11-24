public class ForExercise02{
	public static void main(String[] args){
		
	// 先死后活
	//(1)先输出 0 - 5
	//(2)后面的都是 5 -i
		 
		int n =10;
		for(int i =0; i <= n; i++){
			
				System.out.println(i +"+"+(n-i) + "=" + n);
		}
	}
}

// //化繁为简
// 	//(1)先输出 0 - 5
// 	//(2)后面的都是 5 -i
// 		for(int i =0; i <= 5; i++){
			
// 				System.out.println(i +"+"+(5-i) + "=5");
// 		}