/*
 * Program Name: PlatinumMember.java
 * Description: This class represents a Platinum member in a membership system.
 * It extends the abstract class Member and provides additional functionality specific to Platinum members.
 */

import java.text.DecimalFormat;

public class PlatinumMember extends Member{
    // Intialize variables.
    private double entertainmentPurchases;
    private double recurringPurchases;
    private double transportationPurchases;

    /**
     * Constructor to initialize a PlatinumMember object.
     * @param name The name of the membership holder as a String.
     * @param age The age of the membership holder as an integer greater than or equal to 18.
     * @param yearsMember The number of years that the customer has been a member as an integer.
     * @param phone The member's telephone number as a String.
     * @param goodStanding True if the customer's membership is paid, false otherwise.
     * @param memberID The member's ID as an integer.
     * @param monthJoined The month that the member joined as an integer between 1 and 12.
     * @param yearJoined The year that the member joined as an integer greater than or equal to 2013.
     * @param entertainmentPurchases The amount the member has spent on entertainment in the year, as a double value.
     * @param recurringPurchases The amount the member has spent on recurring purchases in the year, as a double value.
     * @param transportationPurchases The amount the member has spent on transportation in the year, as a double value.
     * @throws BadMember If any of the provided parameters are invalid or out of range.
     */
    public PlatinumMember(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID, int monthJoined, int yearJoined, double entertainmentPurchases, double recurringPurchases, double transportationPurchases) throws BadMember {
        // Invoking the constructor of the Member class.
        super(name, age, yearsMember, phone, goodStanding, memberID, monthJoined, yearJoined);
        setEntertainmentPurchases(entertainmentPurchases);
        setRecurringPurchases(recurringPurchases);
        setTransportationPurchases(transportationPurchases);
    }

    /**
     * Sets a double value representation of the amount spent on entertainment purchases by the Platinum member.
     * @param entertainmentPurchases The amount the member has spent on entertainment in the year, as a double value.
     * @throws BadMember If entertainment purchases is less than zero dollars.
     */
    public void setEntertainmentPurchases(double entertainmentPurchases) throws BadMember{
        // Check if the dollar amount entered is greater than 0.
        if(entertainmentPurchases < 0){
            throw new BadMember("Invalid value entered! Entertainment purchases cannot be less than zero! Please enter a double value greater or equal to zero!");
        } else {
            this.entertainmentPurchases = entertainmentPurchases;
        }
    }

    /**
     * Sets a double value representation of the amount spent on recurring purchases by the Platinum member.
     * @param recurringPurchases The amount the member has spent on recurring purchases in the year, as a double value.
     * @throws BadMember If recurring purchases is less than zero dollars.
     */
    public void setRecurringPurchases(double recurringPurchases) throws BadMember{
        // Check if the dollar amount entered is greater than 0.
        if(recurringPurchases < 0){
            throw new BadMember("Invalid value entered! Recurring purchases cannot be less than zero! Please enter a double value greater or equal to zero!");
        } else {
            this.recurringPurchases = recurringPurchases;
        }
    }

    /**
     * Sets a double value representation of the amount spent on transportation purchases by the Platinum member.
     * @param transportationPurchases The amount the member has spent on transportation in the year, as a double value.
     * @throws BadMember If transportation purchases is less than zero dollars.
     */
    public void setTransportationPurchases(double transportationPurchases) throws BadMember{
        // Check if the dollar amount entered is greater than 0.
        if(transportationPurchases < 0){
            throw new BadMember("Invalid value entered! Transportation purchases cannot be less than zero! Please enter a double value greater or equal to zero!");
        } else {
            this.transportationPurchases = transportationPurchases;
        }
    }

    /**
     * Returns a double value representation of the amount spent on entertainment purchases by the Platinum member.
     * @return The amount the member has spent on entertainment in the year, as a double value.
     */
    public double getEntertainmentPurchases(){
        return entertainmentPurchases;
    }

    /**
     * Returns a double value representation of the amount spent on recurring purchases by the Platinum member.
     * @return The amount the member has spent on recurring purchases in the year, as a double value.
     */
    public double getRecurringPurchases(){
        return recurringPurchases;
    }

    /**
     * Returns a double value representation of the amount spent on transportation purchases by the Platinum member.
     * @return The amount the member has spent on transportation in the year, as a double value.
     */
    public double getTransportationPurchases(){
        return transportationPurchases;
    }

    /**
     * Returns a String representation of the PlatinumMember object.
     * @return A String containing information about the member's name and the amount they spent this year on entertainment, transportation, and recurring purchases.
     */
    @Override
    public String toString(){
        return "This year, Platinum member " + getName() + " spent $" + getEntertainmentPurchases() + " on entertainment, $" + getRecurringPurchases() + " on recurring purchases, and $" + getTransportationPurchases() + " on transportation.";
    }

    /**
     * Calculates and returns the cashback amount for the Platinum member based on their restaurant and travel purchases, as a double value.
     * @return The cashback amount for the Platinum member, as a double value.
     */
    @Override
    public double calculateCashBack() {
        double cashback = (getEntertainmentPurchases() * 0.02) + (getRecurringPurchases() * 0.01) + (getTransportationPurchases() * 0.05);
        DecimalFormat df = new DecimalFormat("#.##");      
        cashback = Double.valueOf(df.format(cashback));
        return cashback;
    }

    /**
     * Calculates and returns the annual dues for the Platinum member, as a double value.
     * @return The annual dues for the Platinum member, as a double value.
     */
    @Override
    public double calculateDues() {
        double yearlyDues = 150.0;
        if (getYearsOfMember() > 10 && getGoodStanding())
            yearlyDues *= 0.8;
        return yearlyDues;
    }
    
}
