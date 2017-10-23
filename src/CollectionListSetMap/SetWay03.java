package CollectionListSetMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetWay03 {
/*set接口
 * 1.不可重复
 * 2.无序的
 * set
 * | --HashSet  数据结构是哈希表 常数阶  hashcode  equels
 * | --TreeSet  数据结构是树   对数阶  comparable 可以通过实现comparato接口来实现排序
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
		hs.add("three");//不会添加成功
		//遍历1
	/*	Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//遍历2
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

class Person implements Comparable<Person>{//需要继承Comparable
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
		return ((Person)arg0).pid == this.pid;//添加元素的时候会调用该接口和hashCode来判断元素是否一样
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pid + ":"+ name;//调用system.out.println（obj）的时候会调用该方法
	}
/*	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.pid + this.name.hashCode();//String 对象的hashCode本身已经被覆盖
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
	@Override//使用工具产生hash和equals
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
