package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptions02 {
	
	public static void main(String[] args) {
		//1.Throwable
		//2.Error | Exception
		//3.RuntimeException | other
		//4.unchecked(RuntimeException) | checked
		
		try {
			FileInputStream in = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
	/*
	 * 
	 * 



FileInputStream
public FileInputStream(String name)
                throws FileNotFoundException

Creates a FileInputStream by opening a connection to an actual file, the file named by the path name name in the file system. A new FileDescriptor object is created to represent this file connection. 
First, if there is a security manager, its checkRead method is called with the name argument as its argument. 


	 * */


/*				Throwable 
 *    |                                                              |
 * Error                                                        Exception
 *    |          |       |           |                                       
 * AWTError  IOError  LinkageError ThreadDeaath
 * 
 * 
 * 
 * 
 * 
 */