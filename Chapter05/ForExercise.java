public class ForExercise{
	public static void main(String[] args){
		// 打印 1 ~ 100 之间所有是9 的倍数的整数，统计个数 及 总和 [化繁为简][先死后活]
		// 化繁为简  : 即将复杂的需求，拆解成简单的需求， 逐步完成
		// 先死后活 ： 先考虑固定的值，然后转成可以灵活变化的值
		
			//(1) 完成输出 1 - 100 的值
			//(2) 在输出的过程中，进行过滤，只输出9 的倍数 i % 9== 0
			// (3) 统计输出个数 ，定义一个变量 int count = 0; 当条件满足的时 count ++ ；
		int count = 0;
		int sum = 0;
		int start = 1;
		int end =100;
		for(int i = start; i <= end; i++){
			if(i % 9 == 0){
				// System.out.println("是9的倍数的整数 = " + i +"；总个数为" + count++ );	 这里输出的个数会少一个因为输出的是count ++ 的值，应该在最后单独输出count
				System.out.println("是9的倍数的整数 = " + i  );
				count++;
				sum += i;
			}
			
		}
		System.out.println("一共有"+ count +"个数");
		System.out.println("总和为" + sum);

	}
}