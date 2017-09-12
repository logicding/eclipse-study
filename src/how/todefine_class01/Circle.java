package how.todefine_class01;

public class Circle {
	private static final double PI = 3.1415926;
	public double r;
	public double getZhouchang(){
		return 2*PI*r;
	}
	public double getMianji(){
		System.out.println("run here...");
		return PI*r*r;
	}
}
	