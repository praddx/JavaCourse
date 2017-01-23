package ru.plahotin.professions;

/**...
 * Report class
 * @author Alexander Plakhotin
 * @since 21/0/2017
 */
public class Report {
	int month;
	int year;
	String monthlyReportText;

	/**...
	 * Constructor that sets all fields of class Report.
	 * @param montH - current month
	 * @param yeaR - current year
	 * @param reporT - text of the report
	 */
	Report(int montH, int yeaR, String reporT) {
		this.month = montH;
		this.year = yeaR;
		this.monthlyReportText = reporT;
	}
}