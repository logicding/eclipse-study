package reflectsys;

public class ReflectSys {
//java�ķ������
	//Class �Զ������� ��������ǰ�����Լ���һ���࣬ͨ������ʵ�����Ի�ȡ������Ժͷ�����������˽�����Ժ͹��췽����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getClass1();
		getClass2();
		getClass3();
		
	}
	//�Ƽ�ʹ�ø÷�������ȡ����������Ҫԭ���Ǹ÷�������ͨ�������ļ����޸Ĵ����߼���Ч��
	private static void getClass3() {
	// TODO Auto-generated method stub
		Class cls = null;
		try {
			cls = Class.forName("reflectsys.Persons");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cls.getName());
}
	private static void getClass2() {
	// TODO Auto-generated method stub
		Class cls = Persons.class;//ͨ��.class����
		System.out.println(cls.getName());
	
}
	static void getClass1(){
		Persons p = new Persons();
		Class cls = p.getClass();//���е��඼��һ����������
		System.out.println(cls.getName());
	}
}


class Persons{
	private int age;
	private String name;
	private int pid;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
}