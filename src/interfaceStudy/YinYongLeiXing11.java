package interfaceStudy;

public class YinYongLeiXing11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Deer d = new Deer();
		Horse h = (Horse)d;*/
		
		Deer d = new Deer();
		Animal06 amimal = d;//子类向父类转换可以自动转换：向上类型转换，up casting
		
		Animal06 ani = new Deer();
		
		Deer deer = (Deer)ani;//向下类型转换,需要强制类型转换，可能会出现类型转换异常（运行期）
		
		Cat06 cat = new Cat06();
		
		Pet06 p = (Pet06)cat;//向下类型转换
		
		System.out.println("end");
		
	}

}


//1.指鹿为马   编译期间就会报错
//2.继承关系
//3.接口实现关系

class Cat06 implements Pet06{
	
}

interface Pet06{
	
}


class Deer extends Animal06{
	
}
class Horse extends Animal06{
	
}

class Animal06{
	
}