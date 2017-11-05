package javaiostream;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleIO02And03 {
/*
 * 内存  ---> 磁盘     write 输出
 * 
 * 磁盘  ---> 内存     read 输入
 * 
 * byte 8 bit  字节流
 * char 16 bit 字符流
 * 
 * */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Byte P = 'k';' '用来表示字符
		char g = '我';
//		System.out.println(p);
		System.out.println(g);
		test1();
		test2();
		test3();
		copy();
		outChinese();//字符输出流
		inChinese();//字符输入流
		usecharstreamtoCopy();
	}

private static void usecharstreamtoCopy() {
	// TODO Auto-generated method stub
	FileReader in = null;
	FileWriter out = null;
	try {
		in = new FileReader("test.txt");
		out = new FileWriter("test04.txt");
		char[] inbuffer = new char[1024];
		in.read(inbuffer);
		out.write(inbuffer);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		if(in != null){
			try {
				in.close();
				if(out != null){
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

private static void inChinese() {
	// TODO Auto-generated method stub
	FileReader in = null;
	try {
		in = new FileReader("test02.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	char[] buffer = new  char[1024];
	try {
		in.read(buffer);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(new String(buffer).trim());
	
	
}

private static void outChinese() {
	// TODO Auto-generated method stub
	FileWriter fw = null;
	
	try {
		fw = new FileWriter("test02.txt");
		fw.write("你好世界");
		fw.write('好');
		char[] buffer = "111111222222222333333333333".toCharArray();
		fw.write(buffer);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		if(fw != null)
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

private static void copy() {
	// TODO Auto-generated method stub
	//文件字节流
	FileOutputStream out = null;
	FileInputStream in = null;
	try {
		in = new FileInputStream("test.txt");//把文件拷贝到另外一个文件中
		out = new FileOutputStream("test02.txt");
		byte[] buffer = new byte[1024];
		in.read(buffer);
		
//		out.write(buffer);这里会把null写进文件中
		out.write(new String(buffer).trim().getBytes());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			if(in != null)
				in.close();
			if(out != null)
				out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

private static void test3() {
	// TODO Auto-generated method stub
	FileInputStream in = null;
	try {
		int i = 0;
		in = new FileInputStream("test.txt");
		byte[] buffer = new byte[1024];
//		in.read(buffer);
		in.read(buffer, 4, 45);//偏移量说的是内存的偏移，读到内存中
		System.out.println(new String(buffer).trim());//trim把空字节跳过
//		while((i=in.read()) != -1){
//			System.out.print((char)i);
//		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		if(in != null){
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

private static void test2() {
	// TODO Auto-generated method stub
	FileOutputStream out = null;
	try {
		out =  new FileOutputStream(".\\test.txt",true);
		try {
			String str = "Hello word";
//			for(int i = 0; i < str.length(); i++){
//				int c = str.charAt(i);
//				out.write(c);
//			}
//			out.write();;
//			out.write(str.getBytes());
			out.write(str.getBytes(), 2, 3);//从str的第2个开始写，写三个字节
			//偏移量说的是内存的偏移
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			if(out != null)
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

private static void test1(){
	// TODO Auto-generated method stub
	//FileOutPutStream  构建文件输出流
	File file = new File("test.txt");
//	FileOutputStream out =  new FileOutputStream("test.txt");
	try {
		FileOutputStream out =  new FileOutputStream(file, true);//内容追加，默认会覆盖原来文件内容
		out = new FileOutputStream(FileDescriptor.out);//标准输出流
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
