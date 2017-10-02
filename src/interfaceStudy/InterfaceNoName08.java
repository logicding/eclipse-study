package interfaceStudy;

public class InterfaceNoName08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USB01 computer = new USB01(){
			//匿名内部类，new后面接  接口 ,大括号里面写实现接口的类，比如下载是computer
			/* (non-Javadoc)
			 * @see interfaceStudy.USB01#write()
			 */
			@Override
			public void write() {
				// TODO Auto-generated method stub
				System.out.println("write into ..");
			}

			/* (non-Javadoc)
			 * @see interfaceStudy.USB01#read()
			 */
			@Override
			public void read() {
				// TODO Auto-generated method stub
				System.out.println("read from ...");
			}
			
		};
		computer.read();
		computer.write();
		
		Animal03 dog = new Animal03(){

			/* (non-Javadoc)
			 * @see interfaceStudy.Animal03#eat()
			 */
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("eat ...");
			}

			/* (non-Javadoc)
			 * @see interfaceStudy.Animal03#sleep()
			 */
			@Override
			void sleep() {
				// TODO Auto-generated method stub
				System.out.println("sleep ...");
			}
			
		};//此处记得加分号，因为这个是一条完成的语句
		
		dog.eat();
		dog.sleep();
	}

}

abstract class Animal03{
	abstract void eat();
	abstract void sleep();
}

/*class Dog03 extends Animal03{

	 (non-Javadoc)
	 * @see interfaceStudy.Animal03#eat()
	 
	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	 (non-Javadoc)
	 * @see interfaceStudy.Animal03#sleep()
	 
	@Override
	void sleep() {
		// TODO Auto-generated method stub
		
	}
	
}*/

interface USB01{
	public void write();
	public void read();
}

/*class Computer02 implements USB01{
啰嗦了，多余感觉
	 (non-Javadoc)
	 * @see interfaceStudy.USB01#write()
	 
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	 (non-Javadoc)
	 * @see interfaceStudy.USB01#read()
	 
	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}
	
	
}*/