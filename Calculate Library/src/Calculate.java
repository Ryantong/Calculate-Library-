/* This class contains the methods to do various math related tasks. 
 * @author Ryan Tong 
 * @version 0 September 6, 2018
 */
public class Calculate {
	//returns the square of an integer 
	public static int square(int number) {
		return number * number;
	}
	//returns the cube of an integer 
	public static int cube(int number) {
		return number * number * number;
	}
	//returns the average of two doubles
	public static double average(double num1, double num2) {
		return (num1 + num2)/2;
	}
	//overloaded method, returns average of three doubles
	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3)/3;
	}
	//returns degrees(double) of the inputed radians(double)
	public static double toDegrees(double radians) {
		return radians * 180 / 3.14159;
	}
	//returns radians(double) of the inputed degrees(double)
	public static double toRadians(double degrees) {
		return degrees * 3.14159 / 180;
	}
}







