package how.todefine_class01;

public class MemGC11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1.ջ�ڴ棺�ֲ����������� ������������ڴ���ͷ���
 * 2.���ڴ棺����new��GC ���ͷ��ڴ棬����û������ָ�� �ᱻ�Զ��ͷ�
 * 3.ʵ������
 * 4.��̬����
 * 
 * */
		/*int a = 1;
		int b =a;
		a = 1000;
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		change(a);
		System.out.println("a=" +a);
		
		int[] c = {1,2,3,4,5};//ʵ����Ҳ��new������
		int[] d = new int[3];
		d[0] = 1;
		d[2] = 2;
		d[1] = 3;
		int[] e = d;
		e[0] = 100000;
		System.out.println("d[0]=" + d[0]);*/
		
		Data d;
		d = new Data();
		d.setYear(2017);
		d.setMonth(9);
		d.setDay(16);
		d.showData();
		
		Data d2 = d;
		change(d2);
		d.showData();
		d2.DID = 1024;
		d.showData();
		
		
	}
	static void change(Data d){
		d.setYear(2018);
	}
	static void change(int x) {
		x = 10000;
	}
}


class Data{
	public static int DID;
	private int year;
	private int month;
	private int day;
	public void showData(){
		System.out.println(year+"-"+month+"-"+day + "-"+DID);
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	public Data(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
}