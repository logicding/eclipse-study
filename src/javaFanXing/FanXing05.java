package javaFanXing;

public class FanXing05 {
//���ʹ����������������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ͷ���
		PairOne po = new PairOne("tom");
		String str = (String)po.getObj();
		System.out.println(str);
		po.showObj();
	}

}
//���������û�з��Ͷ����


//��������
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