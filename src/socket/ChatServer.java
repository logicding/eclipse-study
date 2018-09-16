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
					System.out.println("控制台内容：  "+send);
					byte[] b = send.getBytes();
					out.write(b);//如果没有输入内容按enter就会卡死
					byte[] r = new byte[100];  
					int len = in.read(r);//网络io中获取字节数据
					String ss = new String(r);//转为string类型
					System.out.println("服务端 ： " + "len: " + len+"   " + ss);
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


