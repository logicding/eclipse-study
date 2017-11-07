package javaiostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintIoStream {

	//PrintStream
	//PrintWrite
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test01();//打印字节流
		System.out.println("程序结束了");//由于out是静态变量，如果被设置为文件输出流了，那么程序所有调用sysout都会打印到文件中
//		test02();//字符流
	}

	private static void test02() {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		PrintWriter pp =null;
		try {
			fw = new FileWriter("test01.dat");
			 pp = new PrintWriter();//
//			 pp.print(s);压根没有发下 字符 字节打印流的区别在哪里
			pp.print("------------------");
			pp.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(pp != null){
				pp.close();
			}
		}
	}

	private static void test01() {
		// TODO Auto-generated method stub
		FileOutputStream  out = null;
		try {
			out = new FileOutputStream("test.dat");
			PrintStream ps = new PrintStream(out);
			System.setOut(ps);//默认情况下是标准输出，现在设置到了文件输出流中了，那么字符就会写入文件中
			for(int i = 0; i <= 128; i++){
				System.out.print((char)i);
				if(i > 0 && i %10 ==0){
					System.out.println();
				}
			}
			for(int i = 0; i <= 128; i++){
				ps.print((char)i);//也可以直接使用打印字节流把数据打印在文件中去

				if(i > 0 && i %10 ==0){
					System.out.println();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
