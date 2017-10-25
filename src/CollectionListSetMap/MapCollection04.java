package CollectionListSetMap;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapCollection04 {
/*Map: key:value 键值对，key是唯一的，value是可以重复的，通过key可以获得value值
 * 
 * HashMap TreeMap
 *  数据结构 hashtable  tree
 * */
	public static void main(String[] args) {
		// TODSTRING-generated method stub
		HashMap<String,String> hs = new HashMap<String, String>();
		hs.put("1", "onew");//1.put
		hs.put("2", "onew2");
		hs.put("3", "onew3");
		hs.put("4", "onew4");
		hs.put("5", "onew5");//字符型key中已经实现了hashcode 和 equels
		//3.remove
		
		hs.remove("5");//传键
		
		//4.contains
		System.out.println(hs.containsKey("5"));
		
		//2遍历
		
		Set<String> keys = hs.keySet();
//		for(String e: keys){
//			System.out.println("value=" +" "+ hs.get(e));
//		}
		
		MyInt i1 = new MyInt(1);
		MyInt i2 = new MyInt(2);
		MyInt i3 = new MyInt(3);
		
		HashMap<MyInt, String> hm = new HashMap<MyInt, String>();
		
		hm.put(i1, "onw");
		hm.put(i2, "onw2");
		hm.put(i3, "onw4");
//		for(MyInt i: hm.keySet()){
//			System.out.println(i + hm.get(i));
//		}
		
//		TreeMap<String, String> tm = new TreeMap<String,String>();
//		tm.put("1", "one");
//		tm.put("2", "one2");
//		tm.put("3", "one3");
//		tm.put("4", "one4");
//		for(String e : tm.keySet()){
//			System.out.println(e + ":" + tm.get(e));
//		}
		
		TreeMap<MyInt,String> tm = new TreeMap<MyInt,String>();
		tm.put(i1, "onw");
		tm.put(i2, "onw2");//TreeMap里面的key也要保证唯一性，通过继承Comparable<>并实现其中的方法
		tm.put(i3, "onw4");
		for(MyInt e : tm.keySet()){
			System.out.println(e + ":" + tm.get(e));
		}
	}

}

class MyInt implements Comparable<MyInt>{
	private int i;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInt other = (MyInt) obj;
		if (i != other.i)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return i + "   ";
	}

	public MyInt(int i) {
		this.i = i;
	};
	@Override
	public int compareTo(MyInt o) {
		// TODO Auto-generated method stub
		if(o.i > this.i){
			return -1;
		}else if(o.i < this.i){
			return 1;
		} else {
			return 0;
		}
	}
}
