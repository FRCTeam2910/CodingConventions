//
// FRC Team 2910 coding conventions for the Java(tm) programming language
//  Based off the Google Java Style Guide
//

/*
    First, some basic terminology:
        - A class-level variable is a static variable.
        - A field is a non-static, member variable of a class or enum.
        - A constant is a final class-level variable. 

    Always use curly braces even for single line statements.
    Curly braces start on the same line.

    Indentation is 4 spaces.

    Function names should be descriptive
        - Name a function after the action it performs.
        - Getters/Setters should start with "get" and "set"
        - Functions that return a bool should be phrased as a question.
             - Ex. isReady(), doesThingExist(), hasThing()

    Use comments and newlines to explain and organize code.
    Use asserts.

    Avoid using public member variables. Prefer to use Getters/Setters.
*/

public class ThisIsAClass { // Classes use UpperCamelCase

    public static final double THIS_IS_A_CONSTANT = 3.14; // Constants use UPPERCASE_WITH_UNDERSCORES

    private double fieldVariable = 2.71828; // No prefixes used for variable names

    public int getNumber() { // Method names are lowerCamelCase
        int newVariable;        // Declare one variable per line
        int anotherVariable;    // Local variables are lowerCamelCase

        // Always use curly braces even for single-line statements
        if (foo.method()) { // Curly braces start on the same line
            return 0;
        }
        else { // Start related control blocks on a new line
            return 5;
        }
    }
}

public class Derived extends Base {

    // Use annotations wherever applicable
    @Override
    public void foo() {};

    @Nullable
    public Result getIfExists() {};
}

public enum ThisIsAnEnum { // Enums use UpperCamelCase
    ENUM_VALUE, // Enum values use UPPERCASE_WITH_UNDERSCORES
    ANOTHER_VALUE
}

public interface IThisIsAnInterface { // Interfaces are prefixed with a 'I' and use UpperCamelCase
    void doAThing();
}
