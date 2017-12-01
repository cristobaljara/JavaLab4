package ca.ciccc.java.jara.model;
/**
 * 
 * @author jara
 * We create Professor class that extends Employee, implementing the comparable Professor
 */
public class Professor extends Employee implements Comparable<Professor> {
/**
 * 
 *  We define the instance variable named teachingMajor
 */
	private String teachingMajor;

	/**
	 * 
	 * @param name
	 * is called from employee class
	 * @param teachingMajor
	 * is set up
	 */
	public Professor(String name, String teachingMajor) {
		super(name);
		this.teachingMajor = teachingMajor;
	}

	@Override
	public DressCode getDressCode() {
		// TODO Auto-generated method stub
		return DressCode.FANCY;

	}

	@Override
	public boolean isPaidSalary() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getWorkVerb() {
		// TODO Auto-generated method stub
		return "teach";
	}

	@Override
	public double getOverTimePayRate() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((teachingMajor == null) ? 0 : teachingMajor.hashCode());
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

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		Professor other = (Professor) obj;
		if (!this.teachingMajor.equals(other.teachingMajor)) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Professor other) {
		return this.teachingMajor.compareTo(other.teachingMajor);
	}

	@Override
	public String toString() {
		return "Professor [teachingMajor=" + teachingMajor + ", getName()=" + getName() + "]";
	}

}
