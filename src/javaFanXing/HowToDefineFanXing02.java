package javaFanXing;

public class HowToDefineFanXing02 {
//1.语法:class 类名称<类型参数|类型变量>{}
	//相当于定义一个类的时候可以直接传参数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnyType<String> at = new AnyType<String>("Hello");
		at.showType();
		
		AnyType<Integer> at2 = new AnyType<Integer>(Integer.valueOf(100));
		at2.showType();
		AnyType<Person> at3 = new AnyType<Integer>(new Person("tom"));
		at3.showType();
	}

}


class Pair<T1, T2>{
	private T1 first;
	private T2 secound;
	public T1 getFirst() {
		return first;
	}
	public void setFirst(T1 first) {
		this.first = first;
	}
	public T2 getSecound() {
		return secound;
	}
	public void setSecound(T2 secound) {
		this.secound = secound;
	}
	public Pair(T1 first, T2 secound){
		this.first = first;
		this.secound = secound;
	}
	public showObj(){
		System.out.println(this.first + ":" + this.first.getClass().getName());
	}
}

class Person{
	private String name ;
	public Person(String name){
		this.name = name;
	}
}

//泛型类 Type Map<K,V> T1 ,T2
class AnyType<T>{
	private T obj;
	public AnyType(T obj){
		this.obj = obj;
	}
	public void setobj(T obj){
		this.obj = obj;
	}
	public T getObj(){
		return this.obj;
	}
	
	public void showType(){
		System.out.println(this.obj+":"+this.obj.getClass().getName());
	}
}