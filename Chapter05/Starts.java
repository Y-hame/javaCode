//�� 5 ����һ�����������и��õĿ���   int totalLevel = 5;

public class Starts{
    public static void main(String[] args){
    	 int totalLevel = 8;  // ����ͼ�εĲ���

    	 //����ϰ벿��
        for(int i = 1; i <= totalLevel;i++){  //i ��ʾ����
            
            //�����* ֮ǰ����Ҫ����ո� ��Ӧ�ո���� �ܲ��� - ��ǰ��
            for(int k =1; k <= totalLevel-i ; k++){
             	System.out.print(" ");
             }
             
            
        	//���ƴ�ӡÿ���*����	
        	for (int j = 1; j <= 2 * i - 1;  j++ ){
        		//��ǰ�еĵ�һ��λ����* �����һ��λ��Ҳ��*
        		if(j == 1 || j == (2*i -1)  ){
        			System.out.print("*");
        		}else{
        			System.out.print(" ");
        		}
        			
        			 
        	}
        	//�����println ���Զ�����
        	System.out.println("");
        }
        //����°벿��
        for(int i = totalLevel - 1; i > 0; i--){//�����°벿�ֵĲ���
        	
        	//���ƿո�����
        	for(int k = 1; k <= totalLevel - i;  k++ ){  //�ո��������� ������ - ����   k < totalLevel - i; k = 1 ; ���������Բ�������ո�
        		System.out.print(" ");
        	}


        	 //ÿ�������* ����	
        	for (int j = 1; j <= 2 * i - 1; j++){   
        		 if(j == 1 || j == 2 * i - 1 ){
        		 	System.out.print("*");
        		 }else {
        		 	System.out.print(" ");
        		 }


        			
        	 
        	}//�����println ���Զ�����
        	  System.out.println("");
        }
        

    }
}