package javaFanXing;

import java.io.Serializable;

public class FanXing04 {
//泛型变量的类型的限定
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------");
		String[] sa = {"tom", "kite", "tony"};
		Myobj<String> ms = new Myobj<String>();
		System.out.println(ms.max(sa));
		System.out.println(ms.min(sa));
		MySun[] mss = {new MySun(1, "flower"), new MySun(2, "yellow"),
				new MySun(3, "roll")};
		Myobj<MySun> mm = new Myobj<MySun>();
		
		System.out.println(mm.max(mss));
		System.out.println(mm.min(mss));
	}

}

class MySun implements Comparable<MySun>,Serializable {
	@Override
	public String toString() {
		return this.count + " : " + this.name;
	};
	public int compareTo(MySun o) {
		// TODO Auto-generated method stub
		if(this.count > o.count){
			return 1;
		}else
		{
			return -1;
		}
	}
	private int count;
	private String name;
	public MySun(int count, String name) {
		super();
		this.count = count;
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class Myobj<T extends Comparable & Serializable>{//extends用来限定泛型T类必须实现comparable
	//多个限定的写法，加上&字符
	public T max(T[] a){
		T max = a[0];
		for(T x: a){
		
			if(x.compareTo(max) >= 0){//类型需要有可以比型{
				max = x;
			}
		}
		return max;
	}
	public T min(T[] a){
		T min = a[0];
		
		for(T x: a){
			System.out.println("oooooooo");
			if(x.compareTo(min) < 0){//类型需要有可以比型{
				min = x;
			}
		}
		return min;
	}
}