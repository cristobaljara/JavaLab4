package ca.ciccc.java.jara.model;

/**
 * 
 * @author jara We create the interface Employable
 */
public interface Employable {
	/**
	 * 
	 * @return 4 methods for this interface
	 */
	public DressCode getDressCode();

	public boolean isPaidSalary();

	public boolean postSecondaryEducationRequired();

	public String getWorkVerb();
}
