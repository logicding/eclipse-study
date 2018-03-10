package appForSetting;

public class Person {
	private double  price = 85.0f;
	public void buy(Discourse d){
		System.out.println("т╜╪ш"+price);
		System.out.println("уш©ш" + d.discourse());
		System.out.println("уш©ш╪ш" + d.discourse()*price/100);
	}
}
