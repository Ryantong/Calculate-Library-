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
	//returns discriminant from 3 doubles a,b,c
	public static double discriminant(double a, double b, double c) {
		return b * b - 4 * a * c;
	}
	//returns improper fraction(String) when input mixed number(3 ints)
	public static String toImproperFrac(int wholeNum, int numer, int denom) {
		int fracNumer = denom * wholeNum + numer;
		return fracNumer + "/" + denom;
	}
	//returns mixed number(String) when input numerator and denominator 
	public static String toMixedNum(int numer, int demon) {
		int wholeNum = numer / demon;
		int newNumer = numer % demon;
		return wholeNum +"_" + newNumer + "/" + demon;
	}
	public static String foil(int a, int b, int c, int d, String x) {
		int f = a * c;
		int o = a * d;
		int i = b * c;
		int l = b * d;
		int oi = o + i;
		return f + x + "^2" + " + " + oi + x + " + " + l;
	}
	public static boolean isDivisibleBy(int a, int b) {
		if(a % b == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static double absValue(double a) {
		if(a < 0) {
			return -a;
		}else {
			return a;
		}
	}
}






