package javaiostream;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数据流
//		test01();//用来把int double utf 类型的数据输出到文件中
		
		test02();//按照保存的顺序把数据读取出来
	}

	private static void test02() {
		// TODO Auto-generated method stub
		DataInputStream dis = null;
		try {
//			new DataInputStream//(new BufferedReader(new FileInputStream("dd.txt")));
			dis = new DataInputStream(new FileInputStream("test.dat"));
			System.out.println(dis.readInt());
			//文件中 以什么顺序保存数据的 ，就需要以什么顺序去读取数据，否则的话会报错
			System.out.println(dis.readDouble());
			
			System.out.println(dis.readUTF());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dis != null){
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	private static void test01() {
		// TODO Auto-generated method stub
		int i = 256;
		double pi = Math.PI;
		String str = "java";
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("test.dat"));
			dos.writeInt(i);
			dos.writeDouble(pi);
			dos.writeUTF(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(dos != null){
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
