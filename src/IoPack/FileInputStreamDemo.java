package IoPack;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {
		try {
			FileInputStream fin=new FileInputStream("D:\\LUMINAR JAVA\\FileR.txt");
			int i;
			while((i=fin.read()) != -1)
				System.out.print((char)i);
			fin.close();
	}catch(Exception ex){
		ex.printStackTrace();
	}
  }
}
