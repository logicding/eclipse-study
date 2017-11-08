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
		//������
//		test01();//������int double utf ���͵�����������ļ���
		
		test02();//���ձ����˳������ݶ�ȡ����
	}

	private static void test02() {
		// TODO Auto-generated method stub
		DataInputStream dis = null;
		try {
//			new DataInputStream//(new BufferedReader(new FileInputStream("dd.txt")));
			dis = new DataInputStream(new FileInputStream("test.dat"));
			System.out.println(dis.readInt());
			//�ļ��� ��ʲô˳�򱣴����ݵ� ������Ҫ��ʲô˳��ȥ��ȡ���ݣ�����Ļ��ᱨ��
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
