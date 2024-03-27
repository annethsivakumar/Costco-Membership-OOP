/*
 * Program Name: BronzeMember.java
 * Student Name: Anneth Sivakumar
 * Student Number: 20320973
 * Date: August 08, 2023
 * Description: This class represents a Bronze member in a membership system. 
 * It extends the abstract class Member and provides additional functionality specific to Bronze members.
 */

import java.text.DecimalFormat;

public class BronzeMember extends Member{
    // Intialize variables.
    private double gasPurchases;
    private double groceryPurchases;
    private double everydayPurchases;

    /**
     * Constructor to initialize a BronzeMember object.
     * @param name The name of the membership holder as a String.
     * @param age The age of the membership holder as an integer greater than or equal to 18.
     * @param yearsMember The number of years that the customer has been a member as an integer.
     * @param phone The member's telephone number as a String.
     * @param goodStanding True if the customer's membership is paid, false otherwise.
     * @param memberID The member's ID as an integer.
     * @param monthJoined The month that the member joined as an integer between 1 and 12.
     * @param yearJoined The year that the member joined as an integer greater than or equal to 2013.
     * @param gasPurchases The amount that the member spent on gas in the year as a double value.
     * @param groceryPurchases The amount that the member spent on groceries in the year as a double value.
     * @param everydayPurchases The amount that the member spent on everyday purchases in the year as a double value.
     * @throws BadMember If any of the provided parameters are invalid or out of range.
     */
    public BronzeMember(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID, int monthJoined, int yearJoined, double gasPurchases, double groceryPurchases, double everydayPurchases) throws BadMember {
        // Invoking the constructor of the Member class.
        super(name, age, yearsMember, phone, goodStanding, memberID, monthJoined, yearJoined);
        setGasPurchases(gasPurchases);
        setGroceryPurchases(groceryPurchases);
        setEverydayPurchases(everydayPurchases);
    }

    /**
     * Sets a double value representation of the amount spent on gas purchases by the Bronze member.
     * @param gasPurchases The amount that the member spent on gas in the year as a double value.
     * @throws BadMember If gas purchases is less than zero dollars.
     */
    public void setGasPurchases(double gasPurchases) throws BadMember{
        // Check if the dollar amount entered is greater than 0.
        if(gasPurchases < 0){
            throw new BadMember("Invalid value entered! Gas purchases cannot be less than zero! Please enter a double value greater or equal to zero!");
        } else{
            this.gasPurchases = gasPurchases;
        }
    }

    /**
     * Sets a double value representation of the amount spent on grocery purchases by the Bronze member.
     * @param groceryPurchases The amount that the member spent on everyday purchases in the year as a double value.
     * @throws BadMember If grocery purchases is less than zero dollars. 
     */
    public void setGroceryPurchases(double groceryPurchases) throws BadMember{
        // Check if the dollar amount entered is greater than 0.
        if(groceryPurchases < 0){
            throw new BadMember("Invalid value entered! Grocery purchases cannot be less than zero! Please enter a double value greater or equal to zero!");
        } else {
            this.groceryPurchases = groceryPurchases;
        }
    }

    /**
     * Sets a double value representation of the amount spent on everyday purchases by the Bronze member.
     * @param everydayPurchases The amount that the member spent on everyday purchases in the year as a double value.
     * @throws BadMember If everyday purchases is less than zero dollars.
     */
    public void setEverydayPurchases(double everydayPurchases) throws BadMember{
        // Check if the dollar amount entered is greater than 0.
        if(everydayPurchases < 0){
            throw new BadMember("Invalid value entered! Everyday purchases cannot be less than zero! Please enter a double value greater or equal to zero!");
        } else {
            this.everydayPurchases = everydayPurchases;
        }
    }

    /**
     * Returns a double value representation of the amount spent on gas purchases by the Bronze member.
     * @return The amount that the member spent on gas in the year as a double value. 
     */
    public double getGasPurchases(){
        return gasPurchases;
    }

    /**
     * Returns a double value representation of the amount spent on grocery purchases by the Bronze member.
     * @return The amount that the member spent on everyday purchases in the year as a double value.
     */
    public double getGroceryPurchases(){
        return groceryPurchases;
    }

    /**
     * Returns a double value representation of the amount spent on everyday purchases by the Bronze member.
     * @return The amount that the member spent on everyday purchases in the year as a double value.
     */
    public double getEverydayPurchases(){
        return everydayPurchases;
    }

    /**
     * Returns a String representation of the BronzeMember object.
     * @return A String containing information about the member's name and the amount they spent this year on gas, groceries, and everyday purchases.
     */
    @Override
    public String toString(){
        return "This year, Bronze member " + getName() + " spent $" + getGasPurchases() + " on gas, $" + getGroceryPurchases() + " on groceries, and $" + getEverydayPurchases() + " on everyday purchases.";
    }

    /**
     * Calculates and returns the cashback amount for the Bronze member based on their purchases, as a double value.
     * @return The cashback amount for the Bronze member, as a double value.
     */
    @Override
    public double calculateCashBack() {
        double cashback = (getGasPurchases() * 0.02) + (getGroceryPurchases() * 0.01) + (getEverydayPurchases() * 0.05);
        DecimalFormat df = new DecimalFormat("#.##");      
        cashback = Double.valueOf(df.format(cashback));
        return cashback;
    }

    /**
     * Calculates and returns the annual dues for the Bronze member, as a double value.
     * @return The annual dues for the Bronze member, as a double value.
     */
    @Override
    public double calculateDues() {
        return 50.0;
    }
    
}