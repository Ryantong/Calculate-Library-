/*This is the client code for the Calculate Library
 * call various methods in the Calculate Library 
 * @author Ryan Tong
 * @version 0 September 6, 2018
 */
public class DoMath {
	public static void main(String[] args) {
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.cube(-2));
		System.out.println(Calculate.average(3.0, 9.0));
		System.out.println(Calculate.average(15.0, 17.0, 18.0));
		System.out.println(Calculate.toDegrees(2));
		System.out.println(Calculate.toRadians(1));
		System.out.println(Calculate.toDegrees(Calculate.toRadians(2)));//randominversetest
	}
}
