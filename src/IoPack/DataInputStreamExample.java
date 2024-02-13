package IoPack;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {

	public static void main(String[] args) {
		int rollNo=0;
		String name ="";
		Float marks=0.0f;
		
		DataInputStream dis=new DataInputStream(System.in);
		try {
			System.out.println("enter roll no");
			rollNo=Integer.parseInt(dis.readLine());
			name=dis.readLine();
			marks=Float.parseFloat(dis.readLine());
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);
	}

}
