package ru.plahotin;

/**...
* Program checks that a String contains another string
* @author Alexander Plakhotin
* @since 11.12.16
*/

public class SubStringCheck {
	/**...
	 * Method that takes 2 strings and checks if second string is a substring of the first string
	 * @param initString - strings
	 * @param possibleSubstr - possible substring
	 * @return - false if second string is not a substring of the first string
	 */
	public boolean substringCheck(String initString, String possibleSubstr) {
		int sizeStr = initString.length();
		int sizeSub = possibleSubstr.length();
		int counter;
		char[] initStringArray = new char[sizeStr];
		char[] possibleSubstrArray = new char[sizeSub];
		initString.getChars(0, sizeStr, initStringArray, 0);
		possibleSubstr.getChars(0, sizeSub, possibleSubstrArray, 0);
		for (int i = 0; i < sizeStr - sizeSub; i++) {
			if (possibleSubstrArray[0] == initStringArray[i]) {
				counter = 0;
				for (int j = 1; j < sizeSub; j++) {
					if (possibleSubstrArray[j] != initStringArray[j + i]) {
						counter++;
					}
				}
				if (counter == 0) {
					return true;
				}
			}
		}
		return false;
	}
}