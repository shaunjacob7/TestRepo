package Collection;

import java.util.Hashtable;
import java.util.Vector;

public class BeforeJCF {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,5};
		Vector v=new Vector();
		Hashtable<Integer,String> h=new Hashtable();
		
		v.addElement(10);
		v.addElement(20);
		
		h.put(1, "shaun");
		h.put(2, "jacob");
		
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
	}

}
