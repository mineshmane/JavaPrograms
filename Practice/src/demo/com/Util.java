package demo.com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Util {
	@SuppressWarnings("unused")
	private static void WriteToFile(LinkedList user){
		  try {
		    FileOutputStream fos = new FileOutputStream ("keep.dat");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(user);
		    fos.close();
		  } 
		  catch (Exception e) {
		    System.out.println(e);   
		  }
		}

}
