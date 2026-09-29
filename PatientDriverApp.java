import java.util.Scanner;

/**
 * PatientDriverApp.java
 *
 * Class Description: PatientDriverApp is the driver class for the Patient
 * Management System. It reads patient information from the keyboard,
 * creates a Patient object and three Procedure objects (one using each
 * available constructor), displays all of the information in a formatted
 * tabular layout, and calculates and displays summary statistics about
 * the procedures.
 *
 * Pledge: I pledge that I have completed this programming assignment
 * independently. I have not copied the code from any other student or
 * any other source.
 *
 * Course: CMSC203 CRN 21305
 * Due Date: 09/28/2026
 * Platform/Compiler: Eclipse IDE, Java SE-25
 *
 * @author Aser Wondemu
 */
public class PatientDriverApp {

	/**
	 * Prompts the user for all patient fields using the given Scanner,
	 * reads each line of input, and returns a fully populated Patient
	 * object built using the all-attributes constructor.
	 * @param input the Scanner used to read keyboard input
	 * @return the newly created Patient object
	 */
	public static Patient inputPatient(Scanner input) {
		System.out.print("Enter first name: ");
		String first = input.nextLine();

		System.out.print("Enter middle name: ");
		String middle = input.nextLine();

		System.out.print("Enter last name: ");
		String last = input.nextLine();

		System.out.print("Enter street address: ");
		String street = input.nextLine();

		System.out.print("Enter city: ");
		String city = input.nextLine();

		System.out.print("Enter state: ");
		String state = input.nextLine();

		System.out.print("Enter zip: ");
		String zip = input.nextLine();

		System.out.print("Enter phone number (###-###-####): ");
		String phone = input.nextLine();

		System.out.print("Enter emergency contact name: ");
		String emName = input.nextLine();

		System.out.print("Enter emergency contact phone (###-###-####): ");
		String emPhone = input.nextLine();

		return new Patient(first, middle, last, street, city, state, zip, phone, emName, emPhone);
	}

	/**
	 * Creates and returns the first sample Procedure object, built using
	 * the all-attributes constructor.
	 * @return a Procedure representing a Physical Exam
	 */
	public static Procedure createProcedure1() {
		return new Procedure("Physical Exam", "07/20/2026", "Dr. Irvine", 250.00);
	}

	/**
	 * Creates and returns the second sample Procedure object, built
	 * using the name-and-date constructor. The remaining attributes
	 * (practitioner and charge) are set afterward using the mutators to
	 * ensure every attribute is populated.
	 * @return a Procedure representing an X-ray
	 */
	public static Procedure createProcedure2() {
		Procedure procedure = new Procedure("X-ray", "07/20/2026");
		procedure.setPractitionerName("Dr. Jamison");
		procedure.setCharge(550.43);
		return procedure;
	}

	/**
	 * Creates and returns the third sample Procedure object, built using
	 * the no-argument constructor. All attributes are set afterward
	 * using the mutators to ensure every attribute is populated.
	 * @return a Procedure representing a Blood Test
	 */
	public static Procedure createProcedure3() {
		Procedure procedure = new Procedure();
		procedure.setProcedureName("Blood Test");
		procedure.setDate("07/20/2026");
		procedure.setPractitionerName("Dr. Smith");
		procedure.setCharge(1400.75);
		return procedure;
	}

	/**
	 * Displays the given patient's information to the console using the
	 * Patient class's toString() method.
	 * @param patient the Patient object to display
	 */
	public static void displayPatient(Patient patient) {
		System.out.println(patient.toString());
	}

	/**
	 * Displays a single procedure as one formatted, aligned row
	 * containing its name, date, practitioner, formatted charge, and
	 * charge category.
	 * @param procedure the Procedure object to display
	 */
	public static void displayProcedure(Procedure procedure) {
		System.out.printf("%-20s%-13s%-20s%-16s%s%n", procedure.getProcedureName(), procedure.getDate(),
				procedure.getPractitionerName(), procedure.getFormattedCharge(), procedure.getChargeCategory());
	}

	/**
	 * Displays all three procedures in an aligned, tabular format with a
	 * header row and a separator line, calling displayProcedure() for
	 * each individual row.
	 * @param p1 the first Procedure to display
	 * @param p2 the second Procedure to display
	 * @param p3 the third Procedure to display
	 */
	public static void displayProcedureTable(Procedure p1, Procedure p2, Procedure p3) {
		System.out.printf("%-20s%-13s%-20s%-16s%s%n", "Procedure", "Date", "Practitioner", "Charge", "Category");
		System.out.println("------------------------------------------------------------------------");
		displayProcedure(p1);
		displayProcedure(p2);
		displayProcedure(p3);
	}

	/**
	 * Calculates and returns the total charges of the three given
	 * procedures.
	 * @param p1 the first Procedure
	 * @param p2 the second Procedure
	 * @param p3 the third Procedure
	 * @return the sum of all three charges
	 */
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		return p1.getCharge() + p2.getCharge() + p3.getCharge();
	}

	/**
	 * Calculates and returns the average charge of the three given
	 * procedures.
	 * @param p1 the first Procedure
	 * @param p2 the second Procedure
	 * @param p3 the third Procedure
	 * @return the average of all three charges
	 */
	public static double calculateAverageCharge(Procedure p1, Procedure p2, Procedure p3) {
		return calculateTotalCharges(p1, p2, p3) / 3.0;
	}

	/**
	 * Compares the charges of the three given procedures and returns the
	 * Procedure object with the highest charge.
	 * @param p1 the first Procedure
	 * @param p2 the second Procedure
	 * @param p3 the third Procedure
	 * @return the Procedure with the highest charge
	 */
	public static Procedure findHighestChargeProcedure(Procedure p1, Procedure p2, Procedure p3) {
		Procedure highest = p1;
		if (p2.getCharge() > highest.getCharge()) {
			highest = p2;
		}
		if (p3.getCharge() > highest.getCharge()) {
			highest = p3;
		}
		return highest;
	}

	/**
	 * Counts how many of the three given procedures are considered
	 * expensive (charge of 1000.00 or more).
	 * @param p1 the first Procedure
	 * @param p2 the second Procedure
	 * @param p3 the third Procedure
	 * @return the number of expensive procedures, from 0 to 3
	 */
	public static int countExpensiveProcedures(Procedure p1, Procedure p2, Procedure p3) {
		int count = 0;
		if (p1.isExpensiveProcedure()) {
			count++;
		}
		if (p2.isExpensiveProcedure()) {
			count++;
		}
		if (p3.isExpensiveProcedure()) {
			count++;
		}
		return count;
	}

	/**
	 * Displays a summary of the three given procedures, including the
	 * total charges, average charge, the highest-charge procedure's
	 * name, and the count of expensive procedures.
	 * @param p1 the first Procedure
	 * @param p2 the second Procedure
	 * @param p3 the third Procedure
	 */
	public static void displaySummary(Procedure p1, Procedure p2, Procedure p3) {
		double total = calculateTotalCharges(p1, p2, p3);
		double average = calculateAverageCharge(p1, p2, p3);
		Procedure highest = findHighestChargeProcedure(p1, p2, p3);
		int expensiveCount = countExpensiveProcedures(p1, p2, p3);

		System.out.println();
		System.out.printf("Total Charges: $%,.2f%n", total);
		System.out.printf("Average Charge: $%,.2f%n", average);
		System.out.println("Highest Charge Procedure: " + highest.getProcedureName());
		System.out.println("Number of Expensive Procedures: " + expensiveCount);
	}

	/**
	 * The main method. Reads patient information from the keyboard,
	 * creates the patient and three procedures, displays all of the
	 * information in the required format, and prints the programmer's
	 * name and the current date at the end of the program.
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Patient patient = inputPatient(keyboard);
		System.out.println();
		displayPatient(patient);
		System.out.println();

		Procedure procedure1 = createProcedure1();
		Procedure procedure2 = createProcedure2();
		Procedure procedure3 = createProcedure3();

		displayProcedureTable(procedure1, procedure2, procedure3);

		displaySummary(procedure1, procedure2, procedure3);

		System.out.println();
		System.out.println("The program was developed by a Student: Aser Wondemu 09/28/26");

		keyboard.close();
	}
}
