package appForSetting;

public class Person {
	private double  price = 85.0f;
	public void buy(Discourse d){
		System.out.println("ԭ��"+price);
		System.out.println("�ۿ�" + d.discourse());
		System.out.println("�ۿۼ�" + d.discourse()*price/100);
	}
}
