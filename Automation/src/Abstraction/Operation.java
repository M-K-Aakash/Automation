package Abstraction;

abstract class Operation {
	abstract void add();
	abstract void sub();
	abstract void mul();
	abstract void div();
}

class child extends Operation {
	void add() {
		System.out.println("add");
	}
	void sub() {
		System.out.println("sub");
	}
	void mul() {
		System.out.println("mul");
	}
	void div() {
		System.out.println("div");
	}

	public static void main(String[] args) {
	child obj = new child();
	obj.add();
	obj.sub();
	obj.mul();
	obj.div();
	}
}