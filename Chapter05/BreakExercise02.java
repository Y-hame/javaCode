// ˼·���� 
	// 1. ����Scanner���� ���ڽ����û�������
	// 2. ����String name; String passwd; �����û���������
	// 3. ѭ������[���ִ��3��] �����������������ѭ��
	// 4. ����һ���������� int change ; ��¼���м��ε�¼

import java.util.Scanner;

public class BreakExercise02{
    public static void main(String[] args){
        		
        //ʹ��forѭ���������������   ����һ�������ַ��� ����ţ����������
		 Scanner in = new Scanner(System.in);
		  String name = " ";
		  String passw = " ";
          int chance = 3; //��¼һ�Σ��ͼ���һ��
        
        for(int i = 1; i <= 3; i++){
             System.out.println("������������");
		  		name = in.next(); 
		  	 System.out.println("���������룺");
		 		passw = in.next();
            if("Yhame".equals(name) && "666".equals(passw)){
                System.out.println("��½�ɹ�");
                break;
            }
            //��¼��������
            chance--;
            System.out.println("�㻹��"+chance+"�ε�½����");
            
            
        }

    }
}
	
 
