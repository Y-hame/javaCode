public class Array01{
	//编写一个main方法
	public static void main(String[] args){
		//定义一个数组
		// {3,5,1,3.4,2,50} 表示数组的值、或元素，依次表示数组的第几个元素
		double [] hens = {3,5,1,3.4,2,50};

		//遍历数组得到所有元素的和， 使用for 
		//
		//我们可以通过hens[下标] 来访问数组的元素
		//	下标是从 0 开始编号的，比如第一个元素就是hens[0] 依次类推
		//2. 通过for 就可以循环访问 数组的元素
		//3. 使用一个变量 totalWeight 将各个元素累积
		
		double totalWeight = 0;
		for(int i = 0; i < 6; i++){
			// System.out.println("第" + i +"个元素的值= " + hens[i]);
			totalWeight += hens[i];

		} 
		System.out.println("总体重= " + totalWeight + "， 平均体重 = " + totalWeight / 6);

			}
}