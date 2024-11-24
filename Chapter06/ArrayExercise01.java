public class ArrayExercise01{
	public static void main(String[] args){

		//创建一个char类型的26个元素的数组，分别放置'A'-'Z'
		//使用for循环访问所有元素并打印出来。提示:char类型数据运算'A'+2->'C'
		char [] chars = new char[26];
		for(int i = 0; i < chars.length; i++){
			// char[i] 是char
			//chars 是char[] 
			chars[i] = (char)('A' + i); // 'A' + i 是int 需要强制转换
		}

		System.out.println("===chars数组===");
		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
	}
}