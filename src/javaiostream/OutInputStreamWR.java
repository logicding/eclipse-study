package javaiostream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutInputStreamWR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test1();
		test2();
	}

	private static void test2() {
		// TODO Auto-generated method stub
		//�ֽ����ת�����ַ������
		Writer out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("test06.txt")));
			out.write("������磡����");
			out.append("hello word".charAt(8));
			out.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(out != null){
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static void test1() {
		// TODO Auto-generated method stub
		boolean flag = true;
		System.out.println("������һ�仰������bye ���������");
		while(true){
			//���� �ֽ���ת�����ַ�����system.in�Ǳ�׼������  echo
			BufferedReader bre = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
			try {
				str = bre.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!str.equals("bye")){
				System.out.println(str);
			}else{
				flag = false;
				break;
			}
		}
	}

}
