public class DoWhileExercise03{
	public static void main(String[] args){

    //统计1--200 之间能被5整除但不能被3整除的个数
    //化繁为简
    //(1)使用do--while输出 1 -- 200
    //(2) 过滤 能被5整除单数不能被3整除的数%
    //(3) 统计满足条件的个数 int count = 0;
		int i = 1;
		int count = 0;
		do{
			if(i % 5 == 0 && i % 3 !=0){
				 // i++;  这里添加i++会让程序跳不出循环
				 System.out.println("i = " + i);
				 count++;

			}
			 i++; 

		}while(i>0 && i<=200);
		System.out.println("这样的数一共有："+ count);
	}
}