/**
 * Student is a person that can study.
 * @author Narut Poovorakit
 * @version 03.02.2017
 */
public class Student extends Person {

	/**
	 * Student has a name.
	 * @param name is a name of student.
	 */
	public Student(String name) {
		super(name);
	}

	/**
	 * Student can study.
	 */
	public void study() {
		System.out.println(super.getName() + "Studying");
	}
}
