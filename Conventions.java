//
// FRC Team 2910 coding conventions for the Java(tm) programming language
//


// First, some basic terminology:
// A class-level variable is a static variable.
// A field is a non-static, member variable of a class or enum.
// A constant is a final class-level variable. 


// For indentation use tabs and for alignment use spaces
// Lines should not exceed 120 characters when tabs are treated as 4 spaces

public class ThisIsAClass { // Classes use UpperCamelCase
	// Order of the parts of a class is as follows.
	//
	// * class-level variables
	//     * public final
	//     * protected final
	//     * private final
	//     * public
	//     * protected
	//     * private
	// * fields
	//     * public final
	//     * protected final
	//     * private final
	//     * public
	//     * protected
	//     * private
	// * constructors
	//     * public
	//     * protected
	//     * private
	// * static methods
	//     * public
	//     * protected
	//     * private
	// * member-methods
	//     * public final
	//     * protected final
	//     * public
	//     * protected
	//     * private
	//
	// All parts must be ordered alphabetically within their categories.

	public static final double THIS_IS_A_CONSTANT = 3.14; // Constants use UPPERCASE_WITH_UNDERSCORES

	private double m_privateField = 2.71828; // private and protected fields are prefixed with a 'm_' and use 
	                                         // lowerCamelCase

	public static int getNumber() { // methods use lowerCamelCase
		return 5;
	}
}

public enum ThisIsAnEnum { // Enums use UpperCamelCase
	ENUM_VALUE, // Enum values use UPPERCASE_WITH_UNDERSCORES
}

public interface IThisIsAnInterface { // Interfaces are prefixed with a 'I' and use UpperCamelCase
	void doAThing();
}
