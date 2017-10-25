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
		Collections.fill(list, p1);//���list�����ǿյĻ��Ͳ�����䴦����ôlist���滹�ǿյ�
//		Collections.fill(list, p3);������list����������Ԫ�أ���ô�Ͱ�����Ԫ�ض����Ϊһ����
//		list.add(p3);
		System.out.println("-----------------------");
		for(PersonTwo e : list){
			System.out.println(e);
		}
		System.out.println("-----------------------");
		Collections.sort(list);//���򷽷�����֮ǰ����Ҫʵ��Comparable�ӿ�
		for(PersonTwo e : list){
			System.out.println(e);
		}
		
		//���ֲ���֮ǰ�����������
		int index = Collections.binarySearch(list, p3);
		System.out.println(index);
		
		//���� ����
		Collections.shuffle(list);
		for(PersonTwo e : list){
			System.out.println(e);
		}
		
		//max���ֵ��ѯ�������compara�ӿ�ʵ���йأ������������ô�������ģ���֮������С��
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