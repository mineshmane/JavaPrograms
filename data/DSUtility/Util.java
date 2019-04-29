package DSUtility;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Util {
	private static Node head;

	public void writeTofile(LinkedList list,String path) {
		if(list==null) {
			return;
		}
		Node curr=head;
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter(path,false));{
				while(curr!=null) {
					bw.write(curr.GetData().toString());
					curr=curr.next;
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
