package ru.plahotin.models;

/**...
 * Class that describes item in Task Tracker
 * @author Alexander Plakhotin
 * @since 20.12.16
 */
public class Item {
	String name;

	String description;

	private String createDate;

	private String id;

	/**...
	 * Default constructor
	 */
	public Item() { }

	/**...
	 * Constructor with data
	 * @param nameOfItem - name
	 * @param descriptionOfItem - description of the item
	 * @param create - date of creating an item
	 */
	public Item(String nameOfItem, String descriptionOfItem, String create) {
			this.name = nameOfItem;
			this.description = descriptionOfItem;
			this.createDate = create;
	}

	/**...
	 * Constructor with data
	 * @param nameOfItem - name
	 * @param descriptionOfItem - description of the item
	 * @param create - date of creating an item
	 * @param id - id of the item
	 */
	 public Item(String nameOfItem, String descriptionOfItem, String create, String id) {
			this.name = nameOfItem;
			this.description = descriptionOfItem;
			this.createDate = create;
			this.id = id;
	}


	/**...
	 * Method to get "name"
	 * @return name - name
	 */
	public String getName() {
		return this.name;
	}

	/**...
	 * Method to set "name"
	 * @param nameOfItem - name
	 */
	public void setName(String nameOfItem) {
		this.name = nameOfItem;
	}

	/**...
	 * Method to get contents of "description"
	 * @return description - description
	 */
	public String getDescription() {
		return this.description;
	}

	/**...
	 * Method to set "description"
	 * @param descriptionOfItem - description
	 */
	public void setDescription(String descriptionOfItem) {
		this.description = descriptionOfItem;
	}

	/**...
	 * Method to get "createDate" (date of creation)
	 * @return createDate - date of creation
	 */
	public String getCreate() {
		return this.createDate;
	}

	/**...
	 * Method to set "createDate"
	 * @param create - date of creation
	 */
	public void setCreateDate(String create) {
		this.createDate = create;
	}

	/**...
	 * Method to get "id"
	 * @return id - id of the item
	 */
	public String getId() {
		return this.id;
	}

	/**...
	 * Method to set "id"
	 * @param idForItem - id for the item
	 */
	public void setId(String idForItem) {
		this.id = idForItem;
	}

	/**...
	 * Overriding toString()
	 */
	 @Override
	 public String toString() {
		 return id + " " + name  + " " + description  + " " + createDate;
	 }
}