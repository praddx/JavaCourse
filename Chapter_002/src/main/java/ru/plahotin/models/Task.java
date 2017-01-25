package ru.plahotin.models;

/**...
 * Class that extends class Item
 * for training purposes
 */
public class Task extends Item {

	/**...
	 * constructor
	 * @param name - name
	 * @param desc - description
	 */
	public Task(String name, String desc) {
		this.name = name;
		this.description = desc;
	}
}