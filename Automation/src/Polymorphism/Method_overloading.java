package Polymorphism;

public class Method_overloading {
	public void data(int Id, String name) {
		System.out.println("Employee ID : " + Id);
		System.out.println("Employee Name : " + name);
	}
	
	public void data(String dept, Float salary) {
		System.out.println("Employee Department : " + dept);
		System.out.println("Employee Salary : " + salary);
	}
	
	public void data(String email, long ph) {
		System.out.println("Employee Email : " + email);
		System.out.println("Employee Phone Number : " + ph);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading mc = new Method_overloading();
		mc.data(1, "Ashwin");
		mc.data("Automation_Testing", 24000);
		mc.data("ashwinsrinivas04@gmail.com", 936342244);

	}

}
