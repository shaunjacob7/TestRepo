package IoPack;

import java.util.Date;

public class JavaFormatter {

	public static void main(String[] args) {
		System.out.printf("'%s' %n","Luminar");
		System.out.printf("%S %n","Luminar");
		System.out.printf("%15S %n","Luminar");
		
		System.out.printf("%C%n",'s');
		System.out.printf("%c%n",'S');
		
		System.out.printf("%,d%n",10000);
		System.out.printf("%.2f%n",2.45678);
		
		double myDouble=2.4567;
		System.out.printf("Double upto two decimal places"+String.format("%.2f%n",2.45678));
		
		Date date=new Date();
		System.out.println(date);
		
		System.out.printf("%tT%n",date);
		
		System.out.printf("hours %tH: minutes %tM: seconds %tS%n",date,date,date);
		
		System.out.printf("%1$tA,%1$tB %1$tY %n",date);
		
		System.out.printf("%1$td %1$tm %1$ty %n",date);
		
	}

}
