package IoPack;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class ReadDistinctFile {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:\\LUMINAR JAVA\\FileR.txt");
			DataInputStream dis=new DataInputStream(fis);
			BufferedReader br=new BufferedReader(new InputStreamReader(dis));
			
			List<String> listwords=new ArrayList<String>();
			String words=null;
			while((words=br.readLine()) !=null){
				StringTokenizer st=new StringTokenizer(words,"',.;\"");
				while(st.hasMoreTokens()) {
					String temp= st.nextToken().toLowerCase();
					if(!listwords.contains(temp)) {
						listwords.add(temp);
					}
				}
			}
			Collections.sort(listwords);
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
