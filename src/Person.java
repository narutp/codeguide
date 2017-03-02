/**
 * A person that have name, can walk and eat.
 * @author Narut Poovorakit
 * @version 02.03.2017
 *
 */
public class Person {
	/** Name of that person */
	private String name;

	/**
	 * A person with a name
	 * @param name is a name of the person.
	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * Person can walk.
	 */
	public void walk() {
		System.out.println(this.name + " is walking");
	}

	/**
	 * Person can eat.
	 */
	public void eat() {
		System.out.println(this.name + " is ating");
	}

	/**
	 * Get a name of the person.
	 * @return a name of the person.
	 */
	public String getName() {
		//TODO Complete this method
		return "";
	}

	/**
	 * Set a new name.
	 * @param name is a new name that will change name of the person.
	 */
	public void setName(String name) {
		//TODO Complete this method
	}
}
