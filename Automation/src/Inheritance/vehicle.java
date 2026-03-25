package Inheritance;

public class vehicle {
	public void start() {
		System.out.println("Vehicle is starting!");
	}
	public void stop() {
		System.out.println("Vehicle is stopping!");
	}
}
class car extends vehicle {
	public void indicator() {
		System.out.println("Right indicator is on!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c = new car();
		c.start();
		c.stop();
		c.indicator();

	}

}
