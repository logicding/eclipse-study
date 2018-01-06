package eclipseuseway;

public class Oragetwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------");
	}

}


abstract class Demo001{
	abstract void getPart();
}



class Demo01 extends Demo001{
	int b ;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + b;
		return result;
	}
	/* (non-Javadoc)
	 * @see eclipseuseway.Demo001#getPart()
	 */
	@Override
	void getPart() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo01 other = (Demo01) obj;
		if (b != other.b)
			return false;
		return true;
	}
	static int a = 100;
}