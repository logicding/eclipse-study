package phtread;

public class ReflectSys {
//java�ķ������
	//Class �Զ������� ��������ǰ�����Լ���һ���࣬ͨ������ʵ�����Ի�ȡ������Ժͷ�����������˽�����Ժ͹��췽����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getClass1();
		
	}
	static void getClass1(){
		Persons p = new Persons();
		Class cls = p.getClass();
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