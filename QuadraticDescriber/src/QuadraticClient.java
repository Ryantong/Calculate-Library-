import java.util.*;
//interactions with user
public class QuadraticClient {
	public static void main(String[] args) {
		System.out.println("Welcome to the Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		Scanner userinput = new Scanner(System.in);
		while(true) {
			System.out.print("a:");
			double a = userinput.nextDouble();
			System.out.print("b:");
			double b = userinput.nextDouble();
			System.out.print("c:");
			double c = userinput.nextDouble();
			Quadratic.quadrDescriber(a, b, c);
			System.out.println("");
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			if(userinput.next().equals("quit")) {
				userinput.close();
				break;
			}
		}
	}
}
