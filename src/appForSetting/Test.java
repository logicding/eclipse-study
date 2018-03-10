package appForSetting;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Person p = new Person();
//		Discourse d = new Discourse75();
//		p.buy(d);
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String classname = br.readLine();
		Class cls = Class.forName(classname);
		p.buy((Discourse)cls.newInstance());
		br.close();
	}

}
