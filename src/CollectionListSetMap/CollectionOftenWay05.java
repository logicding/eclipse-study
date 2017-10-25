package CollectionListSetMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOftenWay05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<PersonTwo> list = new ArrayList<PersonTwo>();
		PersonTwo p1 = new PersonTwo(1, "tom", 29);
		PersonTwo p2 = new PersonTwo(2, "dom", 19);
		PersonTwo p3 = new PersonTwo(3, "fom", 39);
	
		list.add(p1);
		list.add(p2);
		list.add(p3);
//		Collections.fill(list, p2);
		Collections.fill(list, p1);//如果list里面是空的话就不做填充处理，那么list里面还是空的
//		Collections.fill(list, p3);填充如果list里面有三个元素，那么就把三个元素都填充为一样的
//		list.add(p3);
		System.out.println("-----------------------");
		for(PersonTwo e : list){
			System.out.println(e);
		}
		System.out.println("-----------------------");
		Collections.sort(list);//排序方法调用之前必须要实现Comparable接口
		for(PersonTwo e : list){
			System.out.println(e);
		}
		
		//二分查找之前必须进行排序
		int index = Collections.binarySearch(list, p3);
		System.out.println(index);
		
		//混排 打乱
		Collections.shuffle(list);
		for(PersonTwo e : list){
			System.out.println(e);
		}
		
		//max最大值查询，这个与compara接口实现有关，如果是升序那么就是最大的，反之就是最小的
		PersonTwo maxPer = Collections.max(list);
		System.out.println(maxPer.getAge());
		
		
	}

}


class PersonTwo implements Comparable<PersonTwo>{
	
	@Override
	public int compareTo(PersonTwo o) {
		// TODO Auto-generated method stub
		if(this.pid > o.pid){
			return 1;
		}else if(this.pid < o.pid){
			return -1;
		}else{
			return 0;
		}
	}
	private int pid;
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return pid + ":"+ name+ ":" + age;
	}
	public PersonTwo(int pid, String name, int age) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	
}