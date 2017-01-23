package ru.plahotin.professions;

/**...
 * Teacher class. Extends class "Specialist"
 * @author ALexander Plakhotin
 * @since 21/01/2017
 */
public class Teacher extends Specialist {

	/**...
	 * Default constructor
	 */
	Teacher() {
		super();
	}

	/**...
	 * Constructor with initial data
	 * @param name - Name
	 * @param age - age
	 * @param qualification - qualification
	 */
	Teacher(String name, int age, int qualification) {
		super(name, age, qualification);
	}

	/**...
	 * method 1
	 */
	public void teach() { }

	/**...
	 * method 2
	 */
	public void checkHomework() { }

	/**...
	 * method 3
	 */
	public void checkQuiz() { }
}