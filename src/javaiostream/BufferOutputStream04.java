package javaiostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferOutputStream04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_buffer_output_stream();
		test_buffer_input_strea();
		test_buffer_char_write();
		testBufferedCharRead();
	}

	private static void testBufferedCharRead() {
		// TODO Auto-generated method stub
		//�����ַ�������
		BufferedReader in = null; 
		try {
			in = new BufferedReader(new FileReader("test06.txt"));
			char[] rr = new char[1024];
			in.read(rr);
			System.out.println(rr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void test_buffer_char_write() {
		// TODO Auto-generated method stub
		//�����ַ������
		BufferedWriter out ;
		try {
			out = new BufferedWriter(new FileWriter("test06.txt"));
			char[] bufer = "��ã�����".toCharArray();
			out.write(bufer);
			out.write("��ã�����");
			out.flush();//��ջ�����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void test_buffer_input_strea() {
		// TODO Auto-generated method stub
		//�ֽڻ���������
		BufferedInputStream in = null; 
		try {
			in= new BufferedInputStream(new FileInputStream("test05.txt"));
			byte[] b = new byte[1024];
			in.read(b);
			System.out.println(new String(b).trim());
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

	private static void test_buffer_output_stream() {
		// TODO Auto-generated method stub
		//�ֽڻ��������
		BufferedOutputStream out = null;
		try {
			
			out = new BufferedOutputStream(new FileOutputStream("test05.txt"));
			out.write("Hello Word".getBytes());
			out.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(out != null){
				try {
					out.close();//ֻ�ùر�һ����
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
