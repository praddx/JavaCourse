package ru.plahotin.professions;

/**...
 * Engineer class. Extends class "Specialist"
 * @author ALexander Plakhotin
 * @since 21/01/2017
 */
public class Engineer extends Specialist {

	/**...
	 * Default constructor
	 */
	Engineer() {
		super();
	}

	/**...
	 * Constructor with initial data
	 * @param name - Name
	 * @param age - age
	 * @param qualification - qualification
	 */
	Engineer(String name, int age, int qualification) {
		super(name, age, qualification);
	}

	/**...
	 * method 1
	 */
	public void drawDesign() { }

	/**...
	 * method 2
	 */
	public void conductCalculation() { }

	/**...
	 * method 3
	 */
	public void collectInitialData() { }

	/**...
	 * method 4
	 */
	@Override
	public Report createReport(int month, int year, String report) {
		System.out.println("Overriden method createReport");
		Report rep = new Report(0, 0, " ");
		return rep;
	}
}