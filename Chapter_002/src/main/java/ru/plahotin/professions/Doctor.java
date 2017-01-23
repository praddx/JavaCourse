package ru.plahotin.professions;

/**...
 * Doctor class. Extends class "Specialist"
 * @author ALexander Plakhotin
 * @since 21/01/2017
 */
public class Doctor extends Specialist {

	/**...
	 * Default constructor
	 */
	Doctor() {
		super();
	}

	/**...
	 * Constructor with initial data
	 * @param name - Name
	 * @param age - age
	 * @param qualification - qualification
	 */
	Doctor(String name, int age, int qualification) {
		super(name, age, qualification);
	}

	/**...
	 * method 1
	 */
	public void examinePatient() { }

	/**...
	 * method 2
	 */
	public void makeDiagnose() { }

	/**...
	 * method 3
	 */
	public void orderProcedures() { }
}