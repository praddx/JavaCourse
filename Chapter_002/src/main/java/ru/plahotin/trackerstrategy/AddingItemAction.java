package ru.plahotin.trackerstrategy;

import ru.plahotin.models.Item;
import ru.plahotin.start.Tracker;
import ru.plahotin.start.Input;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
/**...
 * Class that implements strategy interface "Action" for Tracker program
 */
public class AddingItemAction implements Action {
	/**...
	 * Method adds new Item to the tracker
	 * @param input - object sets input method
	 * @param tracker - tracker object
	 */
	@Override
	public void executeAction(Input input, Tracker tracker) {

		//SimpleDateFormat object to get current date
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

		String name = input.ask("Enter name of the new item: ");
		System.out.println();

		String desc = input.ask("Enter description: ");
		System.out.println();

		ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()),
													ZoneOffset.of("+3"));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println("Current date: " + zdt.format(formatter));
		String date = input.ask("Press Enter to confirm current date OR\n"
								+ "enter date in dd/mm/yy format:");
		System.out.println();
		if ("".equals(date)) {
			date = zdt.format(formatter);
		}

		tracker.addItem(new Item(name, desc, date));
	}
}