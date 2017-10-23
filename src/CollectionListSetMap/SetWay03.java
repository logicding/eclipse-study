package CollectionListSetMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetWay03 {
/*set�ӿ�
 * 1.�����ظ�
 * 2.�����
 * set
 * | --HashSet  ���ݽṹ�ǹ�ϣ�� ������  hashcode  equels
 * | --TreeSet  ���ݽṹ����   ������  comparable ����ͨ��ʵ��comparato�ӿ���ʵ������
 * 
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("one");
		hs.add("uuuu");
		hs.add("two");
		hs.add("three");
		hs.add("three");//������ӳɹ�
		//����1
	/*	Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//����2
	/*	for(String e: hs){
			System.out.println(e);
		}*/
		
		HashSet<Person> p = new HashSet<Person>();
		Person p1 = new Person(1, "tom");
		Person p2 = new Person(2, "tom1");
		Person p3 = new Person(3, "tom2");
		Person p4 = new Person(3, "tom2");
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
	/*	for(Person e: p){
			System.out.println(e);
		}*/
	/*	
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("123");
		ts.add("1234");
		ts.add("12345");
		for(String e: ts){
			System.out.println(e);
		}*/
		
		TreeSet<Person> ps = new TreeSet<Person>();
		ps.add(p1);
		ps.add(p2);
		ps.add(p3);
		for(Person e: ps){
			System.out.println(e);
		}
	}

}

class Person implements Comparable<Person>{//��Ҫ�̳�Comparable
	private int pid;
	private String name;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	public Person() {
		super();
	}

	//@Override
/*	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return ((Person)arg0).pid == this.pid;//���Ԫ�ص�ʱ�����øýӿں�hashCode���ж�Ԫ���Ƿ�һ��
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pid + ":"+ name;//����system.out.println��obj����ʱ�����ø÷���
	}
/*	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.pid + this.name.hashCode();//String �����hashCode�����Ѿ�������
	}*/
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pid;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override//ʹ�ù��߲���hash��equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pid != other.pid)
			return false;
		return true;
	}
	
	//@Override 
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(pid > o.pid){
			return -1;
		}else if(pid < o.pid){
			return 1;
		}else{
			return 0;
		}
	
	}
	
}
