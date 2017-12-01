package ca.ciccc.java.jara.model;

/**
 * 
 * @author jara We create DressCode enum java class with 4 values JERSEY, FANCY,
 * ANYTHING and UNIFORM
 */

public enum DressCode {

	JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");
	/**
	 * 
	 * We set up the String "description"
	 */
	private String description;

	/**
	 * 
	 * @param description
	 *            assign a new value for description
	 */
	DressCode(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return description It will return description of itself
	 */
	public String getDescription() {
		return description;
	}

}
