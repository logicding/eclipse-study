package ExceptionsStudy;

public class Exceptions05 {
/*
 * 今天把try catch finally用法都不记得了
 * try{
 * 		可能会抛出异常的代码
 * }catch (xxx类型的异常类 e){
 * 		e.print...
 * }finally{
 * 		
 * }
 * 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			test();
		}catch (MyException e){
			e.printStackTrace();
		}
		Pan pan = new Pan(6);
		try {
			pan.use();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void test() throws MyException{
		int a = -1;
		if(a < 0){
			throw new MyException("异常发生了");//异常发生的时候需要打印的信息
		}else{
			System.out.println("没有异常");
		}
	}
}

class Pan{
	int p;
	public Pan(int p){
		this.p = p;
	}
	
	public void use() throws MyException{//这里使用的关键字是throws
		if(p > 500){
			throw new MyException("压力过大");//这里使用的关键字是throw
		}else {
			System.out.println("压力正常");
		}
	}
}


//自定义的异常类，需要使用super构造父类
class MyException extends Exception{
	public MyException(String str){
		super(str);
	}
}