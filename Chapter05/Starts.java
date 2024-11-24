//把 5 做成一个变量，进行更好的控制   int totalLevel = 5;

public class Starts{
    public static void main(String[] args){
    	 int totalLevel = 8;  // 控制图形的层数

    	 //输出上半部分
        for(int i = 1; i <= totalLevel;i++){  //i 表示层数
            
            //在输出* 之前，还要输出空格 对应空格等于 总层数 - 当前层
            for(int k =1; k <= totalLevel-i ; k++){
             	System.out.print(" ");
             }
             
            
        	//控制打印每层的*个数	
        	for (int j = 1; j <= 2 * i - 1;  j++ ){
        		//当前行的第一个位置是* ，最后一个位置也是*
        		if(j == 1 || j == (2*i -1)  ){
        			System.out.print("*");
        		}else{
        			System.out.print(" ");
        		}
        			
        			 
        	}
        	//这里的println 会自动换行
        	System.out.println("");
        }
        //输出下半部分
        for(int i = totalLevel - 1; i > 0; i--){//控制下半部分的层数
        	
        	//控制空格的输出
        	for(int k = 1; k <= totalLevel - i;  k++ ){  //空格数量等于 总行数 - 层数   k < totalLevel - i; k = 1 ; 不成立所以不会输出空格
        		System.out.print(" ");
        	}


        	 //每层输出的* 个数	
        	for (int j = 1; j <= 2 * i - 1; j++){   
        		 if(j == 1 || j == 2 * i - 1 ){
        		 	System.out.print("*");
        		 }else {
        		 	System.out.print(" ");
        		 }


        			
        	 
        	}//这里的println 会自动换行
        	  System.out.println("");
        }
        

    }
}