package CollectionListSetMap;

import java.util.HashSet;
import java.util.Iterator;

public class SetWay03 {
/*set接口
 * 1.不可重复
 * 2.无序的
 * set
 * | --HashSet  数据结构是哈希表 常数阶  hashcode  equels
 * | --TreeSet  数据结构是树   对数阶  comparable
 * 
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("three");//不会添加成功
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	/*	for(String e: hs){
			System.out.println(e);
		}*/
	}

}

class Person{
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

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	
}
