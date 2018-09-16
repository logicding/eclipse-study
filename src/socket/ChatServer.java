package socket;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public static void main(String[] args) {
		new ChatServer().chat();

	}
	private int port = 8910;
	public ChatServer(){}
	public ChatServer(int port) {
		this.port = port;
	}
	public void chat(){
		try{
			ServerSocket server = new ServerSocket(port);
			Socket socket = server.accept();
			try{
				DataInputStream in = new DataInputStream(socket.getInputStream());
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
				server.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}


