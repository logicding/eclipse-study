package extend.study;

public class FinalKeyWords {
/*
 * 1.使用final声明一个常量
 * 2.修饰的方法不能被覆盖
 * 3.放到类前面阻止被继承
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Const.DOWN);
	}

}
/*final*/ class Abc{
	int i = 1;
	final int b =2;//常量声明
	public void test(){
		i = 2;
//		b = 3;
	}
	public final void showMsg(){//阻止方法被覆盖
		
	}
}

class BC extends Abc{
//	public void showMsg(){}
}