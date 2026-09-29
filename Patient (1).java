/**
 * Patient.java
 *
 * Class Description: The Patient class models a patient's personal and
 * emergency contact information for the Patient Management System. It
 * stores name, address, and contact fields, and provides constructors,
 * accessors, mutators, and helper methods to build formatted strings
 * and validate phone numbers.
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
public class Patient {

	private String firstName;
	private String middleName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String emergencyContactName;
	private String emergencyContactPhone;

	/**
	 * No-argument constructor. Initializes all fields to empty strings so
	 * that the Patient object is never left with null field values.
	 */
	public Patient() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.street = "";
		this.city = "";
		this.state = "";
		this.zip = "";
		this.phoneNumber = "";
		this.emergencyContactName = "";
		this.emergencyContactPhone = "";
	}

	/**
	 * Constructor that initializes only the first, middle, and last name.
	 * All other fields are set to empty strings.
	 * @param firstName the patient's first name
	 * @param middleName the patient's middle name
	 * @param lastName the patient's last name
	 */
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.street = "";
		this.city = "";
		this.state = "";
		this.zip = "";
		this.phoneNumber = "";
		this.emergencyContactName = "";
		this.emergencyContactPhone = "";
	}

	/**
	 * Constructor that initializes every field of the Patient object.
	 * @param firstName the patient's first name
	 * @param middleName the patient's middle name
	 * @param lastName the patient's last name
	 * @param street the patient's street address
	 * @param city the patient's city
	 * @param state the patient's state
	 * @param zip the patient's zip code
	 * @param phoneNumber the patient's phone number
	 * @param emergencyContactName the emergency contact's name
	 * @param emergencyContactPhone the emergency contact's phone number
	 */
	public Patient(String firstName, String middleName, String lastName, String street, String city, String state,
			String zip, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhone = emergencyContactPhone;
	}

	/**
	 * Returns the patient's first name.
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the patient's first name.
	 * @param firstName the first name to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the patient's middle name.
	 * @return the middle name
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Sets the patient's middle name.
	 * @param middleName the middle name to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * Returns the patient's last name.
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the patient's last name.
	 * @param lastName the last name to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the patient's street address.
	 * @return the street address
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the patient's street address.
	 * @param street the street address to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Returns the patient's city.
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the patient's city.
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Returns the patient's state.
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the patient's state.
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Returns the patient's zip code.
	 * @return the zip code
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets the patient's zip code.
	 * @param zip the zip code to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Returns the patient's phone number.
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the patient's phone number.
	 * @param phoneNumber the phone number to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Returns the emergency contact's name.
	 * @return the emergency contact name
	 */
	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	/**
	 * Sets the emergency contact's name.
	 * @param emergencyContactName the emergency contact name to set
	 */
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	/**
	 * Returns the emergency contact's phone number.
	 * @return the emergency contact phone number
	 */
	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	/**
	 * Sets the emergency contact's phone number.
	 * @param emergencyContactPhone the emergency contact phone number to set
	 */
	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	/**
	 * Builds and returns the patient's full name in the format
	 * "First Middle Last".
	 * @return the formatted full name
	 */
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}

	/**
	 * Builds and returns the patient's full address in the format
	 * "Street City State ZIP".
	 * @return the formatted address
	 */
	public String buildAddress() {
		return street + " " + city + " " + state + " " + zip;
	}

	/**
	 * Builds and returns the emergency contact information in the format
	 * "EmergencyName EmergencyPhone".
	 * @return the formatted emergency contact information
	 */
	public String buildEmergencyContact() {
		return emergencyContactName + " " + emergencyContactPhone;
	}

	/**
	 * Checks whether the patient's phone number matches the required
	 * ###-###-#### format.
	 * @return true if the phone number is valid, false otherwise
	 */
	public boolean isValidPhoneNumber() {
		return phoneNumber != null && phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}");
	}

	/**
	 * Checks whether the emergency contact's phone number matches the
	 * required ###-###-#### format.
	 * @return true if the emergency phone number is valid, false otherwise
	 */
	public boolean isValidEmergencyPhoneNumber() {
		return emergencyContactPhone != null && emergencyContactPhone.matches("\\d{3}-\\d{3}-\\d{4}");
	}

	/**
	 * Returns the patient's name in the format "Last, First Middle".
	 * @return the formatted last-first-middle name
	 */
	public String getLastFirstMiddle() {
		return lastName + ", " + firstName + " " + middleName;
	}

	/**
	 * Checks whether the given city and state match this patient's
	 * city and state (case-insensitive).
	 * @param city the city to compare
	 * @param state the state to compare
	 * @return true if both city and state match, false otherwise
	 */
	public boolean hasSameCityState(String city, String state) {
		return this.city.equalsIgnoreCase(city) && this.state.equalsIgnoreCase(state);
	}

	/**
	 * Updates the patient's street, city, state, and zip code all at once.
	 * @param street the new street address
	 * @param city the new city
	 * @param state the new state
	 * @param zip the new zip code
	 */
	public void updateAddress(String street, String city, String state, String zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	/**
	 * Builds and returns a formatted summary of the patient's contact
	 * information and their emergency contact information.
	 * @return the formatted contact summary
	 */
	public String getContactSummary() {
		return buildFullName() + " - Phone: " + phoneNumber + " | Emergency Contact: " + buildEmergencyContact();
	}

	/**
	 * Returns a formatted, multi-line String containing all of the
	 * patient's information, built using the build methods and the
	 * phone validation methods.
	 * @return the formatted patient information
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Patient Information\n");
		sb.append("-------------------\n");
		sb.append("Name: ").append(buildFullName()).append("\n");
		sb.append("Address: ").append(buildAddress()).append("\n");
		sb.append("Phone Number: ").append(phoneNumber).append("\n");
		sb.append("Emergency Contact: ").append(buildEmergencyContact()).append("\n");
		sb.append("Phone Valid: ").append(isValidPhoneNumber()).append("\n");
		sb.append("Emergency Phone Valid: ").append(isValidEmergencyPhoneNumber());
		return sb.toString();
	}
}
