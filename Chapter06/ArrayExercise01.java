public class ArrayExercise01{
	public static void main(String[] args){

		//����һ��char���͵�26��Ԫ�ص����飬�ֱ����'A'-'Z'
		//ʹ��forѭ����������Ԫ�ز���ӡ��������ʾ:char������������'A'+2->'C'
		char [] chars = new char[26];
		for(int i = 0; i < chars.length; i++){
			// char[i] ��char
			//chars ��char[] 
			chars[i] = (char)('A' + i); // 'A' + i ��int ��Ҫǿ��ת��
		}

		System.out.println("===chars����===");
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
	}
}