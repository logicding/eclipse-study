package javaFanXing;

public class FanXingWay03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"tom", "kite", "rose"};
		System.out.println();
		
		System.out.println(MyClass.middle(a));
		Pen[] pa = {new Pen("tom", 1), new Pen("lite", 2),};
		System.out.println(Myclass./*<Person>���Ͳ������Ϳ��Լ�Ҳ���Բ���*/middle());
	}

}

class Pen{
	private String name;
	private int pid;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pen(String name, int pid) {
		super();
		this.name = name;
		this.pid = pid;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return pid + ": " + name;
	}
}


class Myclass{
	
	public static <T> T middle(T[] a){
		return a[a.length/2];
	}
	
	public static <T> T last(T[] a) {
		return a[a.length -1];
	}
	public static <T> T first(T[] a){
		return a[0];
	}
}