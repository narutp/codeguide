/**
 * Exercise for OOP2 student to do.
 * @author Narut Poovorakit
 * @version 02.03.2017
 *
 */
public class Exercise {

	public static void main(String[] args) {
		/** 1. Polymorphism */

		// TODO Instantiate student object call john
		Person john = new Student("John");

		// TODO John can eat
		// System.out.println(_____);

		// TODO John can walk
		// System.out.println(_____);

		/** 2. Encapsulation */
		// TODO Complete the method in the Person class and print the name of
		// the person John
		System.out.println("John name is : " + john.getName());

		// TODO Change name from john to bill and print bill name
		System.out.println("New name of john is : " + john.getName());

	}
}
