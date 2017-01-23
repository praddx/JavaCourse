package ru.plahotin.professions;

/**...
 * Parent class for professions
 * @author Alexander Plakhotin
 * @since 21/01/17
 */
public class Specialist {

	String name;
	int age;
	int qualificationYears;

	/**...
	 * Default constructor. Doesn't set fields
	 */
	 Specialist() { }

	/**...
	 * Constructor that sets name, age, qualification
	 * @param namE - Name
	 * @param agE - age
	 * @param qualification - qualification
	 */
	Specialist(String namE, int agE, int qualification) {
		this.name = namE;
		this.age = agE;
		this.qualificationYears = qualification;
	}

	/**...
	 * method that creates monthly report
	 * @param month - current month
	 * @param year - current year
	 * @param report - text of the report
	 * @return rep - report
	 */
	public Report createReport(int month, int year, String report) {
		Report rep = new Report(month, year, report);
		return rep;
	}
}