package ca.ciccc.java.jara.model;

/**
 * 
 * @author jara We create the abstract class Employee that implements Employable
 */
public abstract class Employee implements Employable {
	/**
	 * 
	 * We define the instance variable "name"
	 */
	private String name;

	/**
	 * 
	 * @param name
	 * is set up with the abstract class Employee
	 */
	public Employee(String name) {
		this.name = name;
	}

	/**
	 * We define getOverTimePayRate abstract method
	 * @return the value getOverTimePayRate
	 */
	public abstract double getOverTimePayRate();

	/**
	 *
	 * @return name
	 * We create the accessor for getName
	 */
	public String getName() {
		return name;
	}

}
