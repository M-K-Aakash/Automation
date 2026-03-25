package Inheritance;

public class Single_Inheritance {
	public void addition() {
		int a = 10, b = 20;
		int add = a + b;
		System.out.println(add);
	}
}
class child extends Single_Inheritance{
	public void Subtraction() {
		int a = 5, b = 35;
		int sub = b - a;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch = new child();
		ch.addition();
		ch.Subtraction();

	}
}


