package IoPack;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class SerializeEmployee {

	public static void main(String[] args) {
		try {
			Employye s1=new Employye(2,"shaun");
			FileOutputStream fout=new FileOutputStream("D:\\LUMINAR JAVA\\FileW.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("success...");
	}catch(Exception ex) {
		ex.printStackTrace();
	}

 }
}
