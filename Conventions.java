//
// FRC Team 2910 coding conventions for the Java programming language
//

public class Conventions { // classes use UpperCamelCase

	public static final double THIS_IS_A_CONSTANT = 3.14; // constants use SCREAMING_SNAKE_CASE and are always public static final

	private double thisIsAField = 2.71828; // all fields are lowerCamelCase

	// when reading variables, use "get" and "set" as prefixes

	public int getJackInTheBotTeamNumber() { // method names are lowerCamelCase, and should describe exactly what the method does
		return 2910;
	}

	public void setExampleFieldVariable(double thisIsAField) { // method names are lowerCamelCase, and should describe exactly what the method does
		this.thisIsAField = thisIsAField;
	}

	public enum EVENT { // enums use SCREAMING_SNAKE_CASE
		SAMMAMISH,
		AUBURN,
		DISTRICT_CHAMPS,
		FIRST_CMP,
		INDIANA_ROBOTICS_INVITATIONAL,
		CHEZY_CHAMPS
	}

	public String getTeamMissionStatement() {
		return "Inspire through excellence, engage through interesting fun stuff";
	}
}
