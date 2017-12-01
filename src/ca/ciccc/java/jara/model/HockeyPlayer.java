/**
 * 
 */
package ca.ciccc.java.jara.model;

/**
 * @author jara
 *
 * We create HockeyPlayer class that extends Employee, implementing the
 * comparable HockeyPlayer
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {
	/**
	 * 
	 * We define the instance variable named numberOfGoals
	 */
	private int numberOfGoals;

	/**
	 * 
	 * @param name
	 * is called from employee class
	 * @param numberOfGoals
	 * is set up
	 */
	public HockeyPlayer(String name, int numberOfGoals) {
		super(name);
		this.numberOfGoals = numberOfGoals;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.ciccc.java.jara.model.Employable#isPaidSalary()
	 */
	@Override
	public boolean isPaidSalary() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.ciccc.java.jara.model.Employable#postSecondaryEducationRequired()
	 */
	@Override
	public boolean postSecondaryEducationRequired() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.ciccc.java.jara.model.Employable#getWorkVerb()
	 */
	@Override
	public String getWorkVerb() {
		return "Play";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.ciccc.java.jara.model.Employee#getOverTimePayRate()
	 */
	@Override
	public double getOverTimePayRate() {
		return 0;
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.JERSEY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfGoals;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof HockeyPlayer)) {
			return false;
		}

		HockeyPlayer other = (HockeyPlayer) obj;
		if (this.numberOfGoals != other.numberOfGoals) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(HockeyPlayer other) {

		return other.numberOfGoals - this.numberOfGoals;
	}

	@Override
	public String toString() {
		return "HockeyPlayer [numberOfGoals=" + numberOfGoals + ", getName()=" + getName() + "]";
	}

}
