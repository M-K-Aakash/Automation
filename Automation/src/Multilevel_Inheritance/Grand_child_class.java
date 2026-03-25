package Multilevel_Inheritance;

public class Grand_child_class extends Child_class {
	public void multiplication() {
		int a = 20, b = 4;
		int mul = a * b;
		System.out.println("Multiplication : " + mul);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grand_child_class gc = new Grand_child_class();
		gc.addition();
		gc.subtraction();
		gc.multiplication();

	}

}
