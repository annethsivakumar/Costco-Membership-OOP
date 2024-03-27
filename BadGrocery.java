/*
 * Program Name: BadGrocery.java
 * Student Name: Anneth Sivakumar
 * Student Number: 20320973
 * Date: August 08, 2023
 * Description: This class represents a custom exception, used to handle errors that may occur with the Costco orders.
 */
public class BadGrocery extends Exception{
    /**
     * Constructs a new BadGrocery exception with the specified error message.
     * @param message The error message to be associated with the exception.
     */
    public BadGrocery(String message){
        super(message);
    }
}