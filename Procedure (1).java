/**
 * Procedure.java
 *
 * Class Description: The Procedure class models a single medical procedure
 * performed on a patient, including its name, date, practitioner, and
 * charge amount. It provides constructors, accessors, mutators, and
 * helper methods for formatting and categorizing the charge.
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
public class Procedure {

	private String procedureName;
	private String date;
	private String practitionerName;
	private double charge;

	/**
	 * No-argument constructor. Initializes the name, date, and
	 * practitioner to empty strings and the charge to 0.0.
	 */
	public Procedure() {
		this.procedureName = "";
		this.date = "";
		this.practitionerName = "";
		this.charge = 0.0;
	}

	/**
	 * Constructor that initializes the procedure name and date only.
	 * The practitioner name is set to an empty string and the charge
	 * is set to 0.0.
	 * @param procedureName the name of the procedure
	 * @param date the date the procedure was performed
	 */
	public Procedure(String procedureName, String date) {
		this.procedureName = procedureName;
		this.date = date;
		this.practitionerName = "";
		this.charge = 0.0;
	}

	/**
	 * Constructor that initializes every field of the Procedure object.
	 * @param procedureName the name of the procedure
	 * @param date the date the procedure was performed
	 * @param practitionerName the name of the practitioner who performed it
	 * @param charge the dollar amount charged for the procedure
	 */
	public Procedure(String procedureName, String date, String practitionerName, double charge) {
		this.procedureName = procedureName;
		this.date = date;
		this.practitionerName = practitionerName;
		this.charge = charge;
	}

	/**
	 * Returns the procedure's name.
	 * @return the procedure name
	 */
	public String getProcedureName() {
		return procedureName;
	}

	/**
	 * Sets the procedure's name.
	 * @param procedureName the procedure name to set
	 */
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	/**
	 * Returns the date the procedure was performed.
	 * @return the procedure date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the date the procedure was performed.
	 * @param date the procedure date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Returns the name of the practitioner who performed the procedure.
	 * @return the practitioner name
	 */
	public String getPractitionerName() {
		return practitionerName;
	}

	/**
	 * Sets the name of the practitioner who performed the procedure.
	 * @param practitionerName the practitioner name to set
	 */
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}

	/**
	 * Returns the dollar amount charged for the procedure.
	 * @return the charge amount
	 */
	public double getCharge() {
		return charge;
	}

	/**
	 * Sets the dollar amount charged for the procedure.
	 * @param charge the charge amount to set
	 */
	public void setCharge(double charge) {
		this.charge = charge;
	}

	/**
	 * Checks whether this procedure is considered expensive, defined as
	 * a charge of 1000.00 or more.
	 * @return true if the charge is 1000.00 or greater, false otherwise
	 */
	public boolean isExpensiveProcedure() {
		return charge >= 1000.00;
	}

	/**
	 * Applies a percentage discount to the procedure's charge. Only
	 * percentages between 0 and 100 (inclusive) are applied; any other
	 * value is ignored and the charge remains unchanged.
	 * @param percent the discount percentage to apply (0-100)
	 */
	public void applyDiscount(double percent) {
		if (percent >= 0 && percent <= 100) {
			charge = charge - (charge * (percent / 100.0));
		}
	}

	/**
	 * Categorizes the procedure's charge as "Low" (under $500), "Medium"
	 * (between $500 and $999.99), or "High" ($1000 or more).
	 * @return the charge category as a String
	 */
	public String getChargeCategory() {
		if (charge >= 1000.00) {
			return "High";
		} else if (charge >= 500.00) {
			return "Medium";
		} else {
			return "Low";
		}
	}

	/**
	 * Checks whether the given practitioner name matches the practitioner
	 * who performed this procedure (case-insensitive).
	 * @param practitionerName the practitioner name to compare
	 * @return true if the names match, false otherwise
	 */
	public boolean isPerformedBy(String practitionerName) {
		return this.practitionerName.equalsIgnoreCase(practitionerName);
	}

	/**
	 * Returns the procedure's charge formatted as a dollar amount with a
	 * dollar sign, comma thousands separators, and two decimal places
	 * (e.g., "$1,400.75").
	 * @return the formatted charge
	 */
	public String getFormattedCharge() {
		return String.format("$%,.2f", charge);
	}

	/**
	 * Returns a formatted, multi-line String containing all of the
	 * procedure's information.
	 * @return the formatted procedure information
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Procedure Name: ").append(procedureName).append("\n");
		sb.append("Date: ").append(date).append("\n");
		sb.append("Practitioner: ").append(practitionerName).append("\n");
		sb.append("Charge: ").append(getFormattedCharge()).append("\n");
		sb.append("Category: ").append(getChargeCategory());
		return sb.toString();
	}
}
