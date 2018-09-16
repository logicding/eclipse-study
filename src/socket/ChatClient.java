package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) {
		ChatClient01 cc =  new ChatClient01("192.168.1.145",9014);
		cc.chat();
	}
}



//������ʹ��Socket ������շ�����
class ChatClient01{
	private String host = "localhost";
	private int port = 8189;
	public ChatClient01(){}
	public ChatClient01(String host, int port) {
		this.host = host;
		this.port = port;
	}
	public void chat (){
		try {
			Socket socket = new Socket(host, port);
			try{
				DataInputStream in =new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				Scanner scaner = new Scanner(System.in);
				while(true){
					String send = scaner.nextLine();
					System.out.println("����̨���ݣ�  "+send);
					byte[] b = send.getBytes();
					out.write(b);//���û���������ݰ�enter�ͻῨ��
					byte[] r = new byte[100];  
					int len = in.read(r);//����io�л�ȡ�ֽ�����
					String ss = new String(r);//תΪstring����
					System.out.println("����� �� " + "len: " + len+"   " + ss);
					 
				}
			}finally{
				socket.close();
			}
		}catch(Exception es){
			es.printStackTrace();
		}
	}  
}
