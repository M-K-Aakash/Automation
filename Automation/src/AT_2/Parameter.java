package AT_2;

public class Parameter {
	int a;
	String name;
	Parameter(int i, String n)
	{
		a = i;
		name = n;
	}
	void display()
	{
		System.out.println(a + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameter B1 = new Parameter(1, "Ashwin");
		Parameter B2 = new Parameter(2, "Varnesh");
		B1.display();
		B2.display();

	}

}
