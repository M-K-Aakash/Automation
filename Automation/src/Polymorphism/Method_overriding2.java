package Polymorphism;

public class Method_overriding2{
	public void house() {
		System.out.println("The color of house - blue ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overriding1 mr1 = new Method_overriding1();
		Method_overriding2 mr2 = new Method_overriding2();

		mr1.house();
		mr2.house();
	}

}
