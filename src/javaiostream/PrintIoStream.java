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
		test01();//��ӡ�ֽ���
		System.out.println("���������");//����out�Ǿ�̬���������������Ϊ�ļ�������ˣ���ô�������е���sysout�����ӡ���ļ���
//		test02();//�ַ���
	}

	private static void test02() {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		PrintWriter pp =null;
		try {
			fw = new FileWriter("test01.dat");
			 pp = new PrintWriter();//
//			 pp.print(s);ѹ��û�з��� �ַ� �ֽڴ�ӡ��������������
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
			System.setOut(ps);//Ĭ��������Ǳ�׼������������õ����ļ���������ˣ���ô�ַ��ͻ�д���ļ���
			for(int i = 0; i <= 128; i++){
				System.out.print((char)i);
				if(i > 0 && i %10 ==0){
					System.out.println();
				}
			}
			for(int i = 0; i <= 128; i++){
				ps.print((char)i);//Ҳ����ֱ��ʹ�ô�ӡ�ֽ��������ݴ�ӡ���ļ���ȥ

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
