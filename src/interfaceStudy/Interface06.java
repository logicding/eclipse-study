package interfaceStudy;

public class Interface06 {
//��̬static�ڲ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outee01.Inner.mb();//����Ҫʵ�����ⲿ�࣬���Է��ʾ�̬�ڲ���
		
		int[] a = {2,4,5,3,6,7,111,233,3443};
		MaxMin.Pair pair = MaxMin.Pair.getMinMax(a);
		System.out.println(pair.getMax());
		System.out.println(pair.getMin());
	}

}


class MaxMin{
	static class Pair{
		static int min, max;
		static Pair getMinMax(int[] a){
			min = a[0];
			max = a[0];
			for(int x: a){
				if(x < min) min = x;
				if(x > max) max = x;
			}
			return new Pair();
		}
		/**
		 * @return the min
		 */
		public int getMin() {
			return min;
		}

		/**
		 * @param min the min to set
		 */
		public void setMin(int min) {
			this.min = min;
		}

		/**
		 * @return the max
		 */
		public int getMax() {
			return max;
		}

		/**
		 * @param max the max to set
		 */
		public void setMax(int max) {
			this.max = max;
		}

		public Pair(int min, int max) {
			super();
			this.min = min;
			this.max = max;
		}
		public Pair() {
			
		}
	}
}

class Outee01{
	static int i ;
	static void ma(){}
	
	static class Inner{
		static int a;
		static void mb(){
			
		}
	}
	
}