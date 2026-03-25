package Multilevel_Inheritance;

public class Child_class extends Parent_class {
	public void subtraction() {
		int a = 50, b = 20;
		int sub = a - b;
		System.out.println("Subtraction : " + sub);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child_class cc = new Child_class();
		cc.addition();
		cc.subtraction();

	}

}
