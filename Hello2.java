public class Hello2{
	public static void main (String[] args) {
		System.out.println("Yhame is Studying Java!");
	}
}
 
class dog{
    //一个源文件中最多只能有一个public类，其他的类个数不限，也可以将main方法写在费public类中，然后指定运行非public类，这样入口方法就是非public的main方法。
	public static void main (String[] args){
		System.out.println("哈喽，小狗儿！");
	}
}

class tiger{
    public static void main (String[] args){
		System.out.println("哈喽，小老虎！");
	}
}	