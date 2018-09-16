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



//该类中使用Socket 类进行收发数据
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
			}
		}catch(Exception es){
			es.printStackTrace();
		}
	}  
}
