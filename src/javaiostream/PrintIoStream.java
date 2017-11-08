package javaiostream;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintIoStream {

	//PrintStream
	//PrintWrite
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test01();//打印字节流
//		System.out.println("程序结束了");//由于out是静态变量，如果被设置为文件输出流了，那么程序所有调用sysout都会打印到文件中
//		test02();//字符流
		
		test03();//对比字符打印流和字节打印流的区别
	}

	private static void test03() {
		// TODO Auto-generated method stub
		try {

			byte[] sim = { (byte) 0xbc, (byte) 0xf2, // 简
					(byte) 0xcc, (byte) 0xe5, // 体
					(byte) 0xd6, (byte) 0xd0, // 中
					(byte) 0xce, (byte) 0xc4 }; // 文
			InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(sim), "GB2312");
			PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out, "GB2312"));
			PrintStream printStream = new PrintStream(System.out, true, "GB2312");
			int in;
			int count = 0;
			while ((in = inputStreamReader.read()) != -1) {

				printWriter.println((char) in);//等到字符全部输出完了并 且 流被 关闭的时候 才会打印出来
System.out.println("-------------------");
//				printStream.println((char) in);//直接把中文字符一个一个打印出来
				count ++;
			}
			System.out.println(count);
			inputStreamReader.close();

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			printWriter.close();
			printStream.close();

		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
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
