/*
 * Program Name: BadMember.java
 * Description: This class represents a custom exception, used to handle errors that may occur with the Costco memberships.
 */
public class BadMember extends Exception {
    /**
     * Constructs a new BadMember exception with the specified error message.
     * @param message The error message to be associated with the exception.
     */
    public BadMember(String message){
        super(message);
    }
}
