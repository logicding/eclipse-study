package interfaceStudy;

public class Interface01 {
	public static void main(String[] args) {
		/*
		 * 1.接口的定义
		 * 1.1 语法 方法修饰符（public） interface {常量或者方法的声明}
		 * */
		Mobile m = new Mobile();
		Computer co = new Computer();
		m.read();
		co.write();
	}
}

interface USB{
	public void read();
	public void write();//不能有方法体 
	public static final int TYPE = 2;
}

class Computer implements USB{//实现一个接口类必须实现其所有的方法
							  //和抽象类一样，需要实现所有的抽象方法
							 //但是抽象类中的方法需要有abstract修饰

	/* (non-Javadoc)
	 * @see interfaceStudy.USB#read()
	 */
	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("read from computer");
	}

	/* (non-Javadoc)
	 * @see interfaceStudy.USB#write()
	 */
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("write to computer");
	}
	
}


class Mobile implements USB{

	/* (non-Javadoc)
	 * @see interfaceStudy.USB#read()
	 */
	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("read from mobile");
	}

	/* (non-Javadoc)
	 * @see interfaceStudy.USB#write()
	 */
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("write to mobile");
	}
	
}