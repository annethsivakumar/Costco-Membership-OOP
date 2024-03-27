/*
 * Program Name: GoldMember.java
 * Description: This class represents a Gold member in a membership system.
 * It extends the abstract class Member and provides additional functionality specific to Gold members.
 */

import java.text.DecimalFormat;

public class GoldMember extends Member{
    // Intialize variables.
    private double restaurantPurchases;
    private double travelPurchases;

    /**
     * Constructor to initialize a GoldMember object.
     * @param name The name of the membership holder as a String.
     * @param age The age of the membership holder as an integer greater than or equal to 18.
     * @param yearsMember The number of years that the customer has been a member as an integer.
     * @param phone The member's telephone number as a String.
     * @param goodStanding True if the customer's membership is paid, false otherwise.
     * @param memberID The member's ID as an integer.
     * @param monthJoined The month that the member joined as an integer between 1 and 12.
     * @param yearJoined The year that the member joined as an integer greater than or equal to 2013.
     * @param restaurantPurchases The amount that the member spent at restaurants in the year as a double value.
     * @param travelPurchases The amount that the member spent on travel in the year as a double value.
     * @throws BadMember If any of the provided parameters are invalid or out of range.
     */
    public GoldMember(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID, int monthJoined, int yearJoined, double restaurantPurchases, double travelPurchases) throws BadMember {
        // Invoking the constructor of the Member class.
        super(name, age, yearsMember, phone, goodStanding, memberID, monthJoined, yearJoined);
        setRestaurantPurchases(restaurantPurchases);
        setTravelPurchases(travelPurchases);
    }

    /**
     * Sets a double value representation of the amount spent on restaurant purchases by the Gold member.
     * @param restaurantPurchases The amount that the member spent at restaurants in the year as a double value.
     * @throws Badmember If restaurant purchases is less than zero dollars.
     */
    public void setRestaurantPurchases(double restaurantPurchases) throws BadMember{
        // Check if the dollar amount entered is greater than 0.
        if(restaurantPurchases < 0){
            throw new BadMember("Invalid value entered! Restaurant purchases cannot be less than zero! Please enter a double value greater or equal to zero!");
        } else {
            this.restaurantPurchases = restaurantPurchases;
        }
    }

    /**
     * Sets a double value representation of the amount spent on travel purchases by the Gold member.
     * @param travelPurchases The amount that the member spent on travel in the year as a double value.
     * @throws BadMember If travel purchases is less than zero dollars.
     */
    public void setTravelPurchases(double travelPurchases) throws BadMember{
        // Check if the dollar amount entered is greater than 0.
        if(travelPurchases < 0){
            throw new BadMember("Invalid value entered! Travel purchases cannot be less than zero! Please enter a double value greater or equal to zero!");
        } else {
            this.travelPurchases = travelPurchases;
        }
    }

    /**
     * Returns a double value representation of the amount spent on restaurant purchases by the Gold member.
     * @return The amount that the member spent at restaurants in the year as a double value.
     */
    public double getRestaurantPurchases(){
        return restaurantPurchases;
    }

    /**
     * Returns a double value representation of the amount spent on travel purchases by the Gold member.
     * @return The amount that the member spent on travel in the year as a double value.
     */
    public double getTravelPurchases(){
        return travelPurchases;
    }

    /**
     * Returns a String representation of the GoldMember object.
     * @return A String containing information about the member's name and the amount they spent this year on restaurant, and travel purchases.
     */
    @Override
    public String toString(){
        return "This year, Gold member " + getName() + " spent $" + getRestaurantPurchases() + " at restaurants, and $" + getTravelPurchases() + " on travelling.";
    }

    /**
     * Calculates and returns the cashback amount for the Gold member based on their restaurant and travel purchases, as a double value.
     * @return The cashback amount for the Gold member, as a double value.
     */
    @Override
    public double calculateCashBack(){
        double cashback = (getRestaurantPurchases() * 0.02) + (getTravelPurchases() * 0.01);
        DecimalFormat df = new DecimalFormat("#.##");      
        cashback = Double.valueOf(df.format(cashback));
        return cashback;
    }

    /**
     * Calculates and returns the annual dues for the Gold member, as a double value.
     * @return The annual dues for the Gold member, as a double value.
     */
    @Override
    public double calculateDues(){
        return 100.0;
    }
    
}
