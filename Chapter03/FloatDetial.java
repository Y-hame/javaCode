public class FloatDetial{
	//编写一个main方法
	public static void main(String[] args){
	//java 的浮点型常量（具体值） 默认位double型，声明float型常量，须后加'f' 或'F'
       float a = 1.1F;
       double b = 1.1;
       double c = 1.1f;
       double d = .123;
       System.out.println(d);
       System.out.println(5.12e2);//512.0
       System.out.println(5.12e-2);//0.0512
        
        //通常情况下，应该使用double型，因为他比float型更精确
        double f = 2.123456789;
        float g =2.123456789F;
        System.out.println(f);
        System.out.println(g);
  		//浮点数的使用陷阱： 2.7 he 8.1 / 3 比较
        double h = 2.7;
        double i = 8.1/3;  //2.7
        System.out.println(h);  //2.7 
        System.out.println(i); // 接近2.7的一个小数，而不是2.7
       // 当我们对运算结果是小数的进行相等的判断，要小心
        //应该是以两个数的差的绝对值，在某个精度范围内判断
        if(h == i){
            System.out.println("相等");
        }
        
        if(Math.abs(h - i)< 0.00001){
            System.out.println("差值非常小，到我的规定精度，认为相等");
        }
        
        // 可以通过java API 来看
        System.out.println(Math.abs(h - i));
	}

}