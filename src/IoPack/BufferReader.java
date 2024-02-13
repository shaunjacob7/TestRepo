package IoPack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReader {

	public static void main(String[] args) throws Exception {
		try {
			File f1=new File("D:\\LUMINAR JAVA\\FileR.txt");
			BufferedReader br=new BufferedReader(new FileReader(f1));
			String str;
			while((str=br.readLine())!=null){
			System.out.print(str);
		}
			br.close();
	}catch(Exception ex) {
		ex.printStackTrace();
	}

  }
}