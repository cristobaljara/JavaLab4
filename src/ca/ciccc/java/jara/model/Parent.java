package ca.ciccc.java.jara.model;
/**
 * 
 * @author jara
 *We create Parent class that extends Employee, implementing the comparable Parent
 */
public class Parent extends Employee implements Comparable<Parent> {
/**
 * 
 * We define the instance variable named numberOfHoursSpentPerWeekWithKids
 */
	private int numberOfHoursSpentPerWeekWithKids;

	/**
	 * 
	 * @param name
	 * is called from employee class
	 * @param numberOfHoursSpentPerWeekWithKids
	 * is set up
	 */
	public Parent(String name , int numberOfHoursSpentPerWeekWithKids) {
		super(name);
		this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
	}

	@Override
	public DressCode getDressCode() {
		
		return DressCode.ANYTHING;
	}

	@Override
	public boolean isPaidSalary() {

		return false;
	}

	@Override
	public boolean postSecondaryEducationRequired() {

		return false;
	}

	@Override
	public String getWorkVerb() {

		return "care";
	}

	@Override
	public double getOverTimePayRate() {

		return -2;
	}
	



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfHoursSpentPerWeekWithKids;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Parent)) {
			return false;
		}

		Parent other = (Parent) obj;
		if (this.numberOfHoursSpentPerWeekWithKids != other.numberOfHoursSpentPerWeekWithKids) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Parent other) {

		return other.numberOfHoursSpentPerWeekWithKids - this.numberOfHoursSpentPerWeekWithKids;
	}

	@Override
	public String toString() {
		return "Parent [numberOfHoursSpentPerWeekWithKids=" + numberOfHoursSpentPerWeekWithKids + ", getName()="
				+ getName() + "]";
	}
	
	
}
