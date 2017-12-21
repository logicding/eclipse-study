import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleCut {
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

		if(args.length < 1){
			
			System.out.print("You can use the cut tool by the way:\n cut <origin file> \nThen the cuted files will show in dir named by input file name !");
			return;
		}
		if(args.length == 1){
			if(args[0] != null){
	
				cutBigFile(args[0]); 
			}
		}else{
			System.out.print("You inputed too much args!!!");
		}
		
	}

private static void cutBigFile(String string) {
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
			String newfilepath = string + "cutedfile";
			File dir = new File(newfilepath);
			dir.mkdir();
			out = new FileOutputStream(newfilepath + File.separator + "cutedfile");
			byte[] buffer = new byte[1024*1024];
			while (true) {
				//System.out.println("0000000");
				
				

				sumsize += size;
				size = (long)in.read(buffer);
				
				if (size > 0) {
					out.write(new String(buffer).trim().getBytes());
					if(sumsize == 1024*1024*100){
						
						out.close();
						out = null;//这里需要置空下，否则如果在new FileOutputStream报错的时候，走到finally又会操作一次close
						System.out.println("read out size is  " + sumsize);
						out = new FileOutputStream(newfilepath +File.separator + "cutedfile"+ count);
						count++;
						sumsize = 0;
					}
				}else {
					//out.close();
					//out = null; 这里不做关闭操作了，交给finally处理
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
				if(out != null)
					out.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

