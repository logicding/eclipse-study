package how.todefine_class01;

public class ClassWayUse {
	/*
	 * //1.方法的语法结构
	 访问控制符号：public, private, protected default
	 返回值 void int float 还可以是一个类类型
	 方法名称 命名 首字母小写 ，单词分割大写 sayHello
	 
	//2.方法的返回值
	//3.方法的分类
	 * 有返回值 无返回值 有参数 无参数  实例方法  类方法（static）
	//4.方法的重载
	 * 方法名称相同，参数的个数或者类型不同，可以构成重载
	//5.方法的参数
	//6.递归调用
	 * 自己调用自己：有一个结束条件
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	static int diG(int x){
		if(x == 1){
			return 1;
		}else{
			System.out.println(x);
			return x*diG(x-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	TestMethod tm;
			tm = new TestMethod();
			tm.sayHello("牛娃");
			//调用的过程叫做实际参数（实参）
			tm.sum(100, 200);
			tm.sum(1, 2);*/
			/*TestMethodOverloading tm = new TestMethodOverloading();
			tm.sum();
			System.out.println(tm.sum(1, 2));
			System.out.println(tm.sum(1.0f, 2.22f));*/
		
			int result = 5;
			/*	for(int i = 5; i > 0 ; i--){
				result *= i;
			}*/
			diG(result);
			System.out.println(diG(result));
		
		}
	}

class TestMethodOverloading{
	//返回值不能构成方法的重载
	public void sum(){
		int a = 789;
		int b = 89;
		int sum = a + b;
		System.out.println(sum);
	}
//	public void sum(){}
	public int sum(int a , int b){
		return a + b;
	}
	public float sum(float a, float b){
		return a + b;
	}
}

class TestMethod{
	//形式参数（占位符号），参变量，局部变量
	public int sum(int a, int b){
		return a+b;
	}
	public void sayHello(String name){
		System.out.println("Hello：" + name);
	}
	private void m1(){
		//return;//方法返回，返回到调用的地方
		System.out.println("private m1 ...");
	}
	private void m2(){
		System.out.println("private m2 ...");
	}
	public int m4(){
		return 1000;
	}
	public int max(int a, int b){
		if(a > b){
			return a;
		}else {
			return b;
		}
	}
}