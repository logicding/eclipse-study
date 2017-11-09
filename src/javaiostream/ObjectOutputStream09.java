package javaiostream;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		write();
		read();
	}

	private static void read() {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		//序列化，一个对象写入硬盘
		//反序列化，从硬盘读出来
		try {
			ois = new ObjectInputStream(new FileInputStream("bbj.txt"));
			try {
				Customer c = (Customer)ois.readObject();
				System.out.println(c);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(ois != null){
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static void write() {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		//序列化，一个对象写入硬盘
		//反序列化，从硬盘读出来
		try {
			oos = new ObjectOutputStream(new FileOutputStream("bbj.txt"));
			oos.writeObject(new Customer(999, "linus", 50, 20000.00));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(oos != null){
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

class Customer implements Serializable/*空的接口， 无需事先其中的方法，用来标识*/ {
	private int id;
	private String name;
	private int age;
	private transient double slary;//transient关键字用来在对象被序列化的时候不会被保存在硬盘中
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:" + id +" name:" + name + " age:" + age+ " salary:"+ slary;
	}
	
	public Customer(int id, String name, int age, double slary) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.slary = slary;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the slary
	 */
	public double getSlary() {
		return slary;
	}
	/**
	 * @param slary the slary to set
	 */
	public void setSlary(double slary) {
		this.slary = slary;
	}
	
}