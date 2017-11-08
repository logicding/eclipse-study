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
//		test01();//��ӡ�ֽ���
//		System.out.println("���������");//����out�Ǿ�̬���������������Ϊ�ļ�������ˣ���ô�������е���sysout�����ӡ���ļ���
//		test02();//�ַ���
		
		test03();//�Ա��ַ���ӡ�����ֽڴ�ӡ��������
	}

	private static void test03() {
		// TODO Auto-generated method stub
		try {

			byte[] sim = { (byte) 0xbc, (byte) 0xf2, // ��
					(byte) 0xcc, (byte) 0xe5, // ��
					(byte) 0xd6, (byte) 0xd0, // ��
					(byte) 0xce, (byte) 0xc4 }; // ��
			InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(sim), "GB2312");
			PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out, "GB2312"));
			PrintStream printStream = new PrintStream(System.out, true, "GB2312");
			int in;
			int count = 0;
			while ((in = inputStreamReader.read()) != -1) {

				printWriter.println((char) in);//�ȵ��ַ�ȫ��������˲� �� ���� �رյ�ʱ�� �Ż��ӡ����
System.out.println("-------------------");
//				printStream.println((char) in);//ֱ�Ӱ������ַ�һ��һ����ӡ����
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
