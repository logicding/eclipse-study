package javaiostream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write();
		read();
	}
	private static void write() {
		// TODO Auto-generated method st
		RandomAccessFile raf  = null;
		try {
			raf = new RandomAccessFile("demo.dat", "rw");
			raf.writeInt(100);
			raf.writeBoolean(true);
			raf.writeChar('A');
			raf.writeUTF("java");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(raf != null){
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	private static void read() {
		// TODO Auto-generated method stub
		RandomAccessFile raf  = null;
		try {
			raf = new RandomAccessFile("demo.dat", "rw");
			raf.seek(4);
//			System.out.println(raf.readInt());
			System.out.println(raf.readBoolean());
//			raf.writeChar('A');
//			raf.seek(10);
			raf.skipBytes(2);
//			raf.seek(1);
			System.out.println(raf.readUTF());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(raf != null){
				try {
					raf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
