
package ca.ciccc.java.jara.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.FormatterClosedException;

import javax.swing.text.InternationalFormatter;

/**
 * 
 * @author jara We create the class "Employees"
 */
public class Employees {
	/**
	 * 
	 * We create the ArrayLists for Employee, HockeyPlayer, Professor, Parent and
	 * GasStationAttendant
	 */
	private ArrayList<Employee> employees;
	private ArrayList<HockeyPlayer> hockeyplayers;
	private ArrayList<Professor> professors;
	private ArrayList<Parent> parents;
	private ArrayList<GasStationAttendant> gasstationattendants;

	/**
	 * 
	 * We add the elements of the Arraylists: employees, hockeyplayers, professors,
	 * parents and gasstationattendants
	 */
	public Employees() {
		employees = new ArrayList<>();
		employees.add(new HockeyPlayer("Wayne Gretzky", 894));
		employees.add(new HockeyPlayer("Who Ever", 0));
		employees.add(new HockeyPlayer("Brent Gretzky", 1));
		employees.add(new HockeyPlayer("Pavel Bure", 437));
		employees.add(new HockeyPlayer("Jason Bourne", 0));
		employees.add(new Professor("Albert Einstein", "teaches Physics"));
		employees.add(new Professor("Alan Turing", "teaches Computer Systems"));
		employees.add(new Professor("Richard Feynman", "teaches Physics"));
		employees.add(new Professor("Tim Berners-Lee", "teaches Computer Systems"));
		employees.add(new Professor("Kurt Godel", "teaches Logic"));
		employees.add(new Parent("Tiger Woods", 1));
		employees.add(new Parent("Super Mom", 168));
		employees.add(new Parent("Lazy Larry", 20));
		employees.add(new Parent("Ex Hausted", 168));
		employees.add(new Parent("Super Dad", 167));
		employees.add(new GasStationAttendant("Joe Smith", 10.0));
		employees.add(new GasStationAttendant("Tony Baloney", 100.0));
		employees.add(new GasStationAttendant("Benjamin Franklin", 100.0));
		employees.add(new GasStationAttendant("Mary Fairy", 101.0));
		employees.add(new GasStationAttendant("Bee See", 1.0));

		hockeyplayers = new ArrayList<>();
		hockeyplayers.add(new HockeyPlayer("Wayne Gretzky", 894));
		hockeyplayers.add(new HockeyPlayer("Who Ever", 0));
		hockeyplayers.add(new HockeyPlayer("Brent Gretzky", 1));
		hockeyplayers.add(new HockeyPlayer("Pavel Bure", 437));
		hockeyplayers.add(new HockeyPlayer("Jason Bourne", 0));

		professors = new ArrayList<>();
		professors.add(new Professor("Albert Einstein", "Physics"));
		professors.add(new Professor("Alan Turing", "Computer Systems"));
		professors.add(new Professor("Richard Feynman", "Physics"));
		professors.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		professors.add(new Professor("Kurt Godel", "Logic"));

		parents = new ArrayList<>();
		parents.add(new Parent("Tiger Woods", 1));
		parents.add(new Parent("Super Mom", 168));
		parents.add(new Parent("Lazy Larry", 20));
		parents.add(new Parent("Ex Hausted", 168));
		parents.add(new Parent("Super Dad", 167));

		gasstationattendants = new ArrayList<>();
		gasstationattendants.add(new GasStationAttendant("Joe Smith", 10.0));
		gasstationattendants.add(new GasStationAttendant("Tony Baloney", 100.0));
		gasstationattendants.add(new GasStationAttendant("Benjamin Franklin", 100.0));
		gasstationattendants.add(new GasStationAttendant("Mary Fairy", 101.0));
		gasstationattendants.add(new GasStationAttendant("Bee See", 1.0));
	}

	/**
	 * 
	 * We create the method for printHockeyPlayers
	 */
	public void printHockeyPlayers() {
		/**
		 * 
		 * we set up the for condition for hockeyplayers
		 */
		for (HockeyPlayer hp : hockeyplayers) {
			System.out.println(hp);
		}
	}

	/**
	 * 
	 * We create the method for printProfessors
	 */
	private void printProfessors() {
		/**
		 * 
		 * we set up the for condition for professors
		 */
		for (Professor pr : professors) {
			System.out.println(pr);
		}

	}

	/**
	 * 
	 * We create the method for parents
	 */
	private void printParents() {
		/**
		 * 
		 * we set up the for condition for parents
		 */
		for (Parent pa : parents) {
			System.out.println(pa);
		}

	}

	/**
	 * 
	 * We create the method for printGasStationAttendants
	 */
	private void printGasStationAttendants() {
		/**
		 * 
		 * we set up the for condition for gasstationattendants
		 */
		for (GasStationAttendant gas : gasstationattendants) {
			System.out.println(gas);
		}

	}

	/**
	 * 
	 * We define the printing process for each single arraylist, sorting the before
	 * and after order, according to lab4 doc.
	 */
	public void run() {
		System.out.println(" == Before Sort ==\n ");
		printHockeyPlayers();

		Collections.sort(hockeyplayers);

		System.out.println("\n== After Sort ==\n ");
		printHockeyPlayers();

		System.out.println("\n== Before Sort ==\n ");
		printProfessors();

		Collections.sort(professors);

		System.out.println("\n== After Sort ==\n ");
		printProfessors();

		System.out.println("\n== Before Sort ==\n ");
		printParents();

		Collections.sort(parents);

		System.out.println("\n== After Sort ==\n ");
		printParents();

		System.out.println("\n== Before Sort ==\n ");
		printGasStationAttendants();

		Collections.sort(gasstationattendants);

		System.out.println("\n== After Sort ==\n ");
		printGasStationAttendants();

	}

	/**
	 * 
	 * 
	 * @param args we define an argument for an Employees driven that let us to print the
	 * complete list of the arraylist
	 */
	public static void main(String args[]) {
		Employees driver = new Employees();
		driver.run();
		System.out.println("\n == All Objects ==");
		;
		driver.allemployees();
	}

	/**
	 * 
	 * We define the if condition to print in secuencial order the whole arralist
	 */
	public void allemployees() {
		for (int index = 0; index < employees.size(); index++) {
			for (int index2 = index + 1; index2 < employees.size(); index2++) {
				if (employees.get(index).equals(employees.get(index2))) {
					System.out.println(employees.get(index));
					System.out.println(employees.get(index2));
				}
			}
		}
	}
}
