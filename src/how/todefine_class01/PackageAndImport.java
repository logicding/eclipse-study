package how.todefine_class01;

import java.io.File;
import java.sql.Date;

import array.use.way.Array;

public class PackageAndImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.package ��
		//1.1.�����﷨��ʽ
		//    package ������ �Ӱ� ���(.) �ָ�
		//1.2��Ӧ������ϵͳ�����ļ���
		//1.3 ���� ����Сд �Ӱ��õ����.�� ���������� 
		//1.4 ����зֺţ��������ǵ�һ�����
		//1.5 classpath ָ��java�������class

		//2.import ����ʡ�԰�����  ��ݼ� ctrl + shift + o �����
		//ֻ�ܵ����������е�public�࣬����һ��Դ�ļ���ֻ��һ��public�࣬�������඼���ܵ���
//		array.use.way.Array b = new array.use.way.Array();
		Array a = new Array();
		File f = new File("./uu.txt");
		Date d = new Date();
	}

}
