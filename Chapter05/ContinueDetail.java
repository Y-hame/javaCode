public class ContinueDetail {

	public static void main(String[] args){

		label1:
		for(int j = 0; j < 4; j++){
			label2:
			for(int i = 0; i < 10; i++){
				if(i == 2){
					//看以下语句分别输出什么值，
					// continue;    //等价与 lable2  就近原则
					// continue lanel1;    
					// continue lanel2;
				}
			}
		}

	}
}