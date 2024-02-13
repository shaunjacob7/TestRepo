package HomeWork;

abstract class MyTest{

	abstract void calculate(int a, int b);
}

class Addition extends MyTest{
	@Override
	void calculate(int a,int b) {
		System.out.println("sum="+(a+b));
	}
}

class Subtraction extends MyTest{
	@Override
	void calculate(int a,int b) {
		System.out.println("subtraction="+(a-b));
	}
}

class Multiplication extends MyTest{
	@Override
	void calculate(int a,int b) {
		System.out.println("multipication="+(a*b));
	}
}

public class AbstractImplementation {

	public static void main(String[] args) {
		Addition add=new Addition();
		add.calculate(15, 10);
		Subtraction sub=new Subtraction();
		sub.calculate(15,10);
		Multiplication mult=new Multiplication();
		mult.calculate(5, 4);
	}

}
