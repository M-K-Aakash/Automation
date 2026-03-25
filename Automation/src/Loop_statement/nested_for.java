package Loop_statement;

public class nested_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {
			System.out.println("Outter : " + i);
			
			for (int j = 1; j <= 4; j++) {
				System.out.println("Inner : " + j);
			}
		}
	}

}
