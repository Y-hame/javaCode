// 6.���1-100֮��Ĳ��ܱ�5����������ÿ5��һ��

public class Homework06{
	public static void main(String [] args){
		System.out.println("������Щ�ǲ��ܱ�5����������");
		int count = 0;

		for(int i = 1; i <= 100; i++){
			if(i % 5 != 0){
					System.out.print(i + "\t");
					count++;
					
				if (count % 5 == 0){
					System.out.println();
			}	
			}
			
				 
			}
		
	}
}