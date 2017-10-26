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
        
        //1.File�����ļ���Ŀ¼
        
        
        
        //2.��ι���һ���ļ�File���󣨹��췽����
        File f2 = new File("C:\\Users\\Administrator\\Desktop");
        File f3 = new File(f2, "test01.txt");
        File f4 = new File("C:\\Users\\Administrator\\Desktop", "test02.txt");
        
        File f5 = new File(URI.create("file:///C:/Users/Administrator/Desktop"));
        
        //3.·���ָ����Ŀ¼�ָ��
        
        //test();
        
        //4.�����ļ�����ʱ�ļ���Ŀ¼
//        test4();
       // test3();������ʱ�ļ�
//        test5();//����Ŀ¼
        
//        test6();//
        
//        test7();
        test8();//�ļ�����
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
	//�ļ�·��
	private static void test7() {
		// TODO Auto-generated method stub
		File f = new File(".\\ttlo.loh");//File("C:\\Users\\Administrator\\Desktop\\tt.kkk");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1  " +f.getAbsolutePath());//����·������ǰ·�� �ӹ��췽���е�·����������췽���������·������
		System.out.println("2  " +f.getPath());//���·�� �����췽���е�·����
		try {
			System.out.println("3  " +f.getCanonicalPath());//�淶·�����ѵ�ȥ��
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//�淶·�����ɵ��滻
	}

	//6.�����ļ�
	private static void test6() {
		// TODO Auto-generated method stub
		File f = new File("C:\\");
//		File[] file = f.listFiles();
		File[] file = f.listFiles(new FileFilter() {
			//�����ڲ���
			public boolean accept(File f){
				return f.isDirectory();
			}
		});
		for(int i = 0;i < file.length; i++){//����ĵ���û�е��þ�Ȼ��֧��foreach
			System.out.println(file[i].getAbsolutePath());
		}
	}

	private static void test5() {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\Administrator\\Desktop\\dadadddddd\\dddd\\dddd";
		File dir = new File(path);
//		dir.mkdir();//����һ��Ŀ¼
		dir.mkdirs();//mkdir -p dd/dd/dd
	
	}

	private static void test3() {
		// TODO Auto-generated method stub ������ʱ�ļ�
		
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
				boolean b = f.createNewFile();//�����ļ�
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
		//Ϊ������java��ƽ̨����·����Ҫ����Ŀ¼�ָ��
		 System.out.println("C:" + File.separator+"Users" + File.separator +"Administrator"+File.separator+"Desktop");
	}

}
