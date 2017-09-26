package interfaceStudy;

public class Interfae07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//局部内部类
		Oter oo = new Oter();
		oo.m1();
	}

}

class Oter{
	
	int a =1, b = 2;
	public void m1(){
		if (a < b)
		{
			class Inner{
				private int x;
				public Inner(int x){
					this.x = x;
				}
				public void print(){
					System.out.println("x = " + x);
				}
			}
			Inner inner = new Inner(a);
			inner.print();;
		}
	}
}