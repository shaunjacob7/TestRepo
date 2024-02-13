package IoPack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {

	public static void main(String[] args) {
		BufferedReader reader=null;
		int lineCount=0;
		int wordCount=0;
		int charCount=0;
		try {
			
			reader=new BufferedReader(new FileReader("D:\\LUMINAR JAVA\\FileL.txt"));
			String currentLine=reader.readLine();
			while(currentLine != null) {
				lineCount ++;
				String[] words=currentLine.split(" ");
				wordCount = wordCount+words.length;
				for(String word:words) {
					charCount=charCount+word.length();
				}
				currentLine=reader.readLine();  //i++
			}
			System.out.println("number of lines:"+lineCount+" number of words: "+wordCount+" number of char:"+charCount);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				reader.close();
			}catch(IOException io) {
				io.printStackTrace();
			}
		}
		
	}

}
