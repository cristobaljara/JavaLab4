package ca.ciccc.java.jara.model;

/**
 * 
 * @author jara We create GasStationAttendant class that extends Employee,
 * implementing the comparable GasStationAttendant
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {
	/**
	 * 
	 * We define the instance variable named numberOfDollarsStolenPerDay
	 */
	private double numberOfDollarsStolenPerDay;

	/**
	 * 
	 * @param name
	 * is called from employee class
	 * @param numberOfDollarsStolenPerDay
	 * is set up
	 */
	public GasStationAttendant(String name, Double numberOfDollarsStolenPerDay) {
		super(name);
		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
	}

	@Override
	public DressCode getDressCode() {

		return DressCode.UNIFORM;
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

		return "Pump";
	}

	@Override
	public double getOverTimePayRate() {

		return 1.5;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof GasStationAttendant)) {
			return false;
		}

		GasStationAttendant other = (GasStationAttendant) obj;
		if (this.numberOfDollarsStolenPerDay != other.numberOfDollarsStolenPerDay) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(GasStationAttendant other) {

		if (this.numberOfDollarsStolenPerDay < other.numberOfDollarsStolenPerDay) {
			return 1;
		} else if (this.numberOfDollarsStolenPerDay > other.numberOfDollarsStolenPerDay) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "GasStationAttendant [numberOfDollarsStolenPerDay=" + numberOfDollarsStolenPerDay + ", getName()="
				+ getName() + "]";
	}

}
