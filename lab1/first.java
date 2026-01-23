

public class first {
	static final double PRINCIPAL = 1000.0; 
	static final double RATE = 5.0; 
	static final double TIME = 2.0; 

	public static void main(String[] args) {
		double simpleInterest = (PRINCIPAL * RATE * TIME) / 100.0;
		System.out.println("Principal: " + PRINCIPAL);
		System.out.println("Rate: " + RATE + "%");
		System.out.println("Time: " + TIME + " years");
		System.out.println("Simple Interest = " + simpleInterest);
	}
}