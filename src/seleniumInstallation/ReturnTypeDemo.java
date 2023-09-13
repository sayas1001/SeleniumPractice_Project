package seleniumInstallation;

public class ReturnTypeDemo {

	public static void main(String[] args) {
		ReturnTypeDemo type = new ReturnTypeDemo();
		type.sum(2, 4);
		
		int additionSum = type.addition(5, 5);
		System.out.println(additionSum + 5);

	}

	// access modifier //return type //name of the function // parameters/arguments
	public void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}

// access modifier    // return type   // name of the function      
	private int addition(int num1, int num2) {

		return num1 + num2;
	}
	
	public String concat(String name) {
		return name;
	}

}
