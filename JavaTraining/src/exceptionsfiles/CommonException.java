package exceptionsfiles;

public class CommonException {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		int c;
		// Identify the potential problem area
		// Surround with try-catch block
		try {
		 c = a/b;
		}
		catch(ArithmeticException ex) {
			System.out.println("Expected non zero number:"+ex.getMessage());
		}
		
			System.out.println("Program end");
		String[] states = {"MD","NY","NJ","VA"};
		for(int i = 0; i<= states.length;i++)
		{
			try {
			System.out.println(states[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro: array index out of bound");
				System.out.println(e.toString());
			}
			finally {
				System.out.println("Finished with iterating through array!!");
			}
		}
	}
}
