package IoPack;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		try {
			FileReader fr=new FileReader("D:\\LUMINAR JAVA\\FileR.txt");
			int i;
			while((i=fr.read())!=-1){
			System.out.print((char)i);
		}
			fr.close();
	}catch(Exception ex) {
		ex.printStackTrace();
	}

  }
}
