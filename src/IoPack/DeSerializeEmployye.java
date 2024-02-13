package IoPack;

import java.io.FileInputStream;

import java.io.ObjectInputStream;


public class DeSerializeEmployye {

	public static void main(String[] args) {
		try {
			/*
			 * FileInputStream fout=new FileInputStream("D:\\LUMINAR JAVA\\FileW.txt");
			 * ObjectInputStream out=new ObjectInputStream(fout);
			 */
			ObjectInputStream oin=new ObjectInputStream(new FileInputStream("D:\\LUMINAR JAVA\\FileW.txt") );
			Employye emp=(Employye)oin.readObject();
			System.out.println(emp.empId+"  "+emp.Name);
			oin.close();
	}catch(Exception ex) {
		ex.printStackTrace();
	}

 }
}
