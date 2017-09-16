package how.todefine_class01;

import java.io.File;
import java.sql.Date;

import array.use.way.Array;

public class PackageAndImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.package 包
		//1.1.包的语法格式
		//    package 包名称 子包 点儿(.) 分隔
		//1.2对应到操作系统就是文件夹
		//1.3 命名 都是小写 子包用点儿（.） 域名的逆序 
		//1.4 最后有分号，包必须是第一条语句
		//1.5 classpath 指定java编译出的class

		//2.import 可以省略包名称  快捷键 ctrl + shift + o 导入包
		//只能导入其他包中的public类，而在一个源文件中只有一个public类，其他的类都不能导入
//		array.use.way.Array b = new array.use.way.Array();
		Array a = new Array();
		File f = new File("./uu.txt");
		Date d = new Date();
	}

}
