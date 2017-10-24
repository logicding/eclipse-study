package CollectionListSetMap;

import java.util.HashMap;
import java.util.Set;

public class MapCollection04 {
/*Map: key:value 键值对，key是唯一的，value是可以重复的，通过key可以获得value值
 * 
 * HashMap TreeMap
 * 
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
		MyInt i3 = new MyInt(2);
		
		HashMap<MyInt, String> hm = new HashMap<MyInt, String>();
		
		hm.put(i1, "onw");
		hm.put(i2, "onw2");
		hm.put(i3, "onw4");
		for(MyInt i: hm.keySet()){
			System.out.println(i + hm.get(i));
		}
	}

}

class MyInt{
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
	
}
