public class Homework3{
	public static void main (String[] args ){
		// 保存两本书的名字
		String c1 = "水浒传";
		String c2 =  "西游记"; //char 类型只能保存一个字
		System.out.println(c1 + c2);	

		// 性别应该使用char 保存
		char c3 = '男';
		char c4 = '女';
		System.out.println(c3 + c4);  //得到 男 字符码值 + 女 字符码值

		//保存两本书的价格 
		double price1 = 213.45;
		double price2 = 2553.23;
		System.out.println(price1 + price2);	

	}
}