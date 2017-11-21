package javaFanXing;

public class FanXing05 {
//泛型代码和虚拟机处理机制
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//补偿和翻译
		PairOne po = new PairOne("tom");
		String str = (String)po.getObj();
		System.out.println(str);
		po.showObj();
	}

}
//虚拟机中是没有泛型对象的


//擦除过程
class PairOne{
	private Object obj;

	/**
	 * @return the obj
	 */
	public Object getObj() {
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(Object obj) {
		this.obj = obj;
	}

	public PairOne(Object obj) {
		super();
		this.obj = obj;
	}
	public void showObj(){
		System.out.println(this.obj + ":" + this.obj.getClass().getName());
	}
}

/*class PairOne<T>{
	private T obj;

	*//**
	 * @return the obj
	 *//*
	public T getObj() {
		return obj;
	}

	*//**
	 * @param obj the obj to set
	 *//*
	public void setObj(T obj) {
		this.obj = obj;
	}

	public PairOne(T obj) {
		super();
		this.obj = obj;
	}
	public showObj(){
		System.out.println(this.obj + ":" + this.obj.getClass().getName());
	}
}*/