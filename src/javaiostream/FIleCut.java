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

		cutBigFile(args[0], args[1]);

	}

private static void cutBigFile(String string, String string2) {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
	//文件字节流
	FileOutputStream out = null;
	FileInputStream in = null;
		try {
			long sumsize = 0;
			long size = 0;
			int count = 0;
			in = new FileInputStream(string);// 把文件切小
			out = new FileOutputStream(string2);
			byte[] buffer = new byte[1024*1024];
			while (true) {
				//System.out.println("0000000");
				
				

				sumsize += size;
				size = (long)in.read(buffer);
				
				if (size > 0) {
					out.write(new String(buffer).trim().getBytes());
					if(sumsize == 1024*1024*100){
						
						out.close();
						System.out.println("read out size is  " + sumsize);
						out = new FileOutputStream(string2 + count);
						count++;
						sumsize = 0;
					}
				}else {
					out.close();
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

