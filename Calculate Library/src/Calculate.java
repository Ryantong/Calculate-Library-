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
	//converts (ax+b)(cx+d) to ax^2 + bx + c 
	public static String foil(int a, int b, int c, int d, String x) {
		int f = a * c;
		int o = a * d;
		int i = b * c;
		int l = b * d;
		int oi = o + i;
		return f + x + "^2" + " + " + oi + x + " + " + l;
	}
	//returns boolean base on if int a is divisible by int b
	public static boolean isDivisibleBy(int a, int b) {
		if(a % b == 0) {
			return true;
		}else {
			return false;
		}
	}
	//returns absolute value(double) of inputed double 
	public static double absValue(double a) {
		if(a < 0) {
			return -a;
		}else {
			return a;
		}
	}
	//returns the larger value double of the two inputed doubles
	public static double max(double a, double b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	//returns the larger value double of the three inputed doubles
	public static double max(double a, double b, double c) {
		if(a > b) {
			if(a > c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b > c) {
				return b;
			}else {
				return c;
			}
		}
	}
	//returns the smaller value int of the two inputed int
	public static int min(int a, int b) {
		if(a < b) {
			return a;
		}else
			return b;
	}
	//returns a double rounded to 2 decimal places from inputed double
	public static double round2(double a) {
		if(a > 0) {
			a += 0.005;
		}else if(a == 0) {
			a = 0;
		}else {
			a -= 0.005;
		}
		a *= 100;
		double b = (int)a;
		b /= 100;
		return b;
	}
	public static double exponent(double a, int b) {
		double c = a;
		for(int count = 1; b > count; count++) {
			c *= a;	
		}
		return c;
	}
	public static int factorial(int a) {
		for(int count = a-1; count >= 1; count--) {
			a *= count;
		}
		return a;
	}
	public static boolean isPrime(int a) {
		int b = 2;
		while(b < a) {
			b++;
			if(a == 4) {
				return false;
			}
			if(a%b==0 && b!=a) {
				return false;
			}
		}
		return true;
	}
}






