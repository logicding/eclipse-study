package interfaceStudy;

public class InterfaceNoName08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USB01 computer = new USB01(){
			//�����ڲ��࣬new�����  �ӿ� ,����������дʵ�ֽӿڵ��࣬����������computer
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
			
		};//�˴��ǵüӷֺţ���Ϊ�����һ����ɵ����
		
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
�����ˣ�����о�
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