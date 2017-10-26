package javaiostream;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URI;

public class FileIO01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File j = new File("C:\\Users\\Administrator\\Desktop\\kk.txt");
        System.out.println(j.exists());
        
        //1.File描述文件和目录
        
        
        
        //2.如何构造一个文件File对象（构造方法）
        File f2 = new File("C:\\Users\\Administrator\\Desktop");
        File f3 = new File(f2, "test01.txt");
        File f4 = new File("C:\\Users\\Administrator\\Desktop", "test02.txt");
        
        File f5 = new File(URI.create("file:///C:/Users/Administrator/Desktop"));
        
        //3.路径分割符合目录分割符
        
        //test();
        
        //4.创建文件，临时文件，目录
//        test4();
       // test3();创建临时文件
//        test5();//创建目录
        
//        test6();//
        
//        test7();
        test8();//文件属性
	}
	private static void test8() {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Administrator\\Desktop\\tt.kkk");
		f.setExecutable(false);
		f.setReadOnly();
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
	}
	//文件路径
	private static void test7() {
		// TODO Auto-generated method stub
		File f = new File(".\\ttlo.loh");//File("C:\\Users\\Administrator\\Desktop\\tt.kkk");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1  " +f.getAbsolutePath());//绝对路径（当前路径 加构造方法中的路径（如果构造方法中是相对路径））
		System.out.println("2  " +f.getPath());//相对路劲 （构造方法中的路径）
		try {
			System.out.println("3  " +f.getCanonicalPath());//规范路径，把点去除
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//规范路径，吧点替换
	}

	//6.遍历文件
	private static void test6() {
		// TODO Auto-generated method stub
		File f = new File("C:\\");
//		File[] file = f.listFiles();
		File[] file = f.listFiles(new FileFilter() {
			//匿名内部类
			public boolean accept(File f){
				return f.isDirectory();
			}
		});
		for(int i = 0;i < file.length; i++){//家里的电脑没有调好居然不支持foreach
			System.out.println(file[i].getAbsolutePath());
		}
	}

	private static void test5() {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Administrator\\Desktop\\dadadddddd\\dddd\\dddd";
		File dir = new File(path);
//		dir.mkdir();//创建一个目录
		dir.mkdirs();//mkdir -p dd/dd/dd
	
	}

	private static void test3() {
		// TODO Auto-generated method stub 创建临时文件
		
		File  f =null;
		try {
			f = File.createTempFile("ding", ".log");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.getAbsolutePath());
		
	}

	private static void test4() {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\Administrator\\Desktop\\kk.txt";
		File f = new File(path);
		if(!f.exists()){
			try {
				boolean b = f.createNewFile();//创建文件
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	private static void test()
	{
		System.out.println(File.pathSeparator);//;
		System.out.println(File.pathSeparatorChar);//;
		System.out.println(File.separator);//\
		System.out.println(File.separatorChar);//\
		//为了满足java跨平台特性路径需要加上目录分割符
		 System.out.println("C:" + File.separator+"Users" + File.separator +"Administrator"+File.separator+"Desktop");
	}

}
