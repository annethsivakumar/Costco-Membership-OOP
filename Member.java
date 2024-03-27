/*
 * Program Name: Member.java
 * Description: An abstract class representing a member in a membership system.
 */
public abstract class Member {
    // Intialize variables.
    private String name;
    private int age;
    private int yearsMember;
    private String phone;
    private boolean goodStanding;
    private int memberID;
    private int monthJoined;
    private int yearJoined;
    private double dues;
    public double costOrder;

    /**
     * Constructor to initialize a Member object.
     * @param name The name of the membership holder as a String.
     * @param age The age of the membership holder as an integer greater than or equal to 18.
     * @param yearsMember The number of years that the customer has been a member as an integer.
     * @param phone The member's telephone number as a String.
     * @param goodStanding True if the customer's membership is paid, false otherwise.
     * @param memberID The member's ID as an integer.
     * @param monthJoined The month that the member joined as an integer between 1 and 12.
     * @param yearJoined The year that the member joined as an integer greater than or equal to 2013.
     * @throws BadMember If any of the provided parameters are invalid or out of range.
     */
    public Member(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID, int monthJoined, int yearJoined) throws BadMember{
        setName(name);
        setAge(age);
        setYearsOfMember(yearsMember);
        setPhoneNumber(phone);
        setGoodStanding(goodStanding);
        setMemberID(memberID);
        setMonthJoined(monthJoined);
        setYearJoined(yearJoined);
        setDues();
    }

    /**
     * Sets a String representation of the name of the member.
     * @param name The name of the membership holder as a String.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets an integer representation of the age of the member.
     * @param age The age of the membership holder as an integer greater than or equal to 18.
     * @throws BadMember If the age is less than 18.
     */
    public void setAge(int age) throws BadMember{
        // Check if the age entered is greater than 18.
        if(age < 18){
            throw new BadMember("Invalid value entered! Member must be 18 or older! Please enter an integer greater or equal to 18!");
        } else {
            this.age = age;
        }
    }

    /**
     * Sets an integer representation of the number of years that the customer has been a member.
     * @param yearsMember The number of years that the customer has been a member as an integer.
     * @throws BadMember If the years of member is less than zero.
     */
    public void setYearsOfMember(int yearsMember) throws BadMember{
        if(yearsMember < 0){
            throw new BadMember("Invalid value entered! Years of membership must be zero or greater! Please enter an integer greater than zero!");
        } else {
            this.yearsMember = yearsMember;
        }
    }

    /**
     * Sets a String representation of the phone number of the member.
     * @param phone The member's telephone number as a String.
     */
    public void setPhoneNumber(String phone){
        this.phone = phone;
    }

    /**
     * Sets a boolean representation of whether the customer's membership has been paid.
     * @param goodStanding True if the customer's membership is paid, false otherwise.
     */
    public void setGoodStanding(boolean goodStanding){
        this.goodStanding = goodStanding;
    }

    /**
     * Sets an integer representation of the ID nuber of the member's.
     * @param memberID The member's ID as an integer.
     */
    public void setMemberID(int memberID){
        this.memberID = memberID;
    }

    /**
     * Sets an integer representation of the month the member joined.
     * @param monthJoined The month that the member joined as an integer between 1 and 12.
     * @throws BadMember If the month joined is not between 1 and 12.
     */
    public void setMonthJoined(int monthJoined) throws BadMember{
        // Check if the month entered is between 1 and 12.
        if(monthJoined < 1 || monthJoined > 12){
            throw new BadMember("Invalid value entered! Months must be between 1 and 12! Please enter an integer between 1 and 12!");
        } else{
            this.monthJoined = monthJoined;
        }
    }

    /**
     * Sets an integer representation of the year the member joined.
     * @param yearJoined The year that the member joined as an integer greater than or equal to 2013.
     * @throws BadMember If the year joined is before 2013.
     */
    public void setYearJoined(int yearJoined) throws BadMember{
        // Check if the year entered is greater than 2013.
        if(yearJoined < 2013){
            throw new BadMember("Invalid value entered! Costco first opened in 2013! Please enter an integer greater or equal to 2013!");
        } else{
            this.yearJoined = yearJoined;
        }
    }

    /**
     * Sets a double value representation of the dues the member has.
     */
    public void setDues(){
        this.dues = calculateDues();
    }

    /**
     * Returns a String representation of the name of the member.
     * @return The name of the membership holder as a String.
     */
    public String getName(){
        return name;
    }

    /**
     * Returns an integer representation of the age of the member.
     * @return The age of the membership holder as an integer.
     */
    public int getAge(){
        return age;
    }

    /**
     * Returns an integer representation of the number of years that the customer has been a member.
     * @return The number of years that the customer has been a member as an integer.
     */
    public int getYearsOfMember(){
        return yearsMember;
    }

    /**
     * Returns a String representation of the phone number of the member.
     * @return The member's telephone number as a String.
     */
    public String getPhoneNumber(){
        return phone;
    }

    /**
     * Returns a boolean representation of whether the customer's membership has been paid.
     * @return goodStanding True if the customer's membership is paid, false otherwise.
     */
    public boolean getGoodStanding(){
        return goodStanding;
    }

    /**
     * Returns an integer representation of the ID nuber of the member's.
     * @return The member's ID as an integer.
     */
    public int getMemberID(){
        return memberID;
    }

    /**
     * Returns an integer representation of the month the member joined.
     * @return The month that the member joined as an integer.
     */
    public int getMonthJoined(){
        return monthJoined;
    }

    /**
     * Returns an integer representation of the year the member joined.
     * @return The year that the member joined as an integer greater than or equal to 2013.
     */
    public int getYearJoined(){
        return yearJoined;
    }

    /**
     * Returns a double value representation of the dues the member has.
     * @return The annual fee for the customer's membership as a double value.
     */
    public double getDues(){
        return dues;
    }

    /**
     * An abstract method to be implemented by subclasses to calculate and return the cashback for the member.
     * @return The cashback amount for the member.
     */
    public abstract double calculateCashBack();

    /**
     * An abstract method to be implemented by subclasses to calculate and return the annual dues for the member.
     * @return The annual dues for the member.
     */
    public abstract double calculateDues();

    /**
     * Returns a String representation of the Member object.
     * @return A String containing information about the member's name and the number of year they have been a member.
     */
    @Override
    public String toString(){
        return "The member's name is" + getName() + ". They have been a member for" + getYearsOfMember() + "years.";
    }

    /**
     * Compares two Member objects based on the number of years they have been a member.
     * @param member1 The first Member object to compare.
     * @param member2 The second Member object to compare.
     * @return The difference in the number of years of being a member, between member2 and member1 as an integer.
     */
    public int compareTo(Member otherMember){
        return yearsMember - otherMember.yearsMember;
    }

    /**
     * Returns a double value representation of the amount spent on gas purchases by the Bronze member.
     * @return The amount that the member spent on gas in the year as a double value. 
     */
    public double getGasPurchases(){
        return getGasPurchases();
    }

    /**
     * Returns a double value representation of the amount spent on grocery purchases by the Bronze member.
     * @return The amount that the member spent on everyday purchases in the year as a double value.
     */
    public double getGroceryPurchases(){
        return getGroceryPurchases();
    }

    /**
     * Returns a double value representation of the amount spent on everyday purchases by the Bronze member.
     * @return The amount that the member spent on everyday purchases in the year as a double value.
     */
    public double getEverydayPurchases(){
        return getEverydayPurchases();
    }

    /**
     * Returns a double value representation of the amount spent on restaurant purchases by the Gold member.
     * @return The amount that the member spent at restaurants in the year as a double value.
     */
    public double getRestaurantPurchases(){
        return getRestaurantPurchases();
    }

    /**
     * Returns a double value representation of the amount spent on travel purchases by the Gold member.
     * @return The amount that the member spent on travel in the year as a double value.
     */
    public double getTravelPurchases(){
        return getTravelPurchases();
    }

    /**
     * Returns a double value representation of the amount spent on entertainment purchases by the Platinum member.
     * @return The amount the member has spent on entertainment in the year, as a double value.
     */
    public double getEntertainmentPurchases(){
        return getEntertainmentPurchases();
    }

    /**
     * Returns a double value representation of the amount spent on recurring purchases by the Platinum member.
     * @return The amount the member has spent on recurring purchases in the year, as a double value.
     */
    public double getRecurringPurchases(){
        return getRecurringPurchases();
    }

    /**
     * Returns a double value representation of the amount spent on transportation purchases by the Platinum member.
     * @return The amount the member has spent on transportation in the year, as a double value.
     */
    public double getTransportationPurchases(){
        return getTransportationPurchases();
    }

}
