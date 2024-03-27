/*
 * Program Name: Store.java
 * Student Name: Anneth Sivakumar
 * Student Number: 20320973
 * Date: August 08, 2023
 * Description: This is the main driver class that demonstrates the use of the classes and their functionalities in the costco membership management system.
 */

import java.util.ArrayList;

public class Store{
    /**
     * This method serves as the main function to test the membership management system.
     * @param args Command-line arguments which are not used in this program.
     * @throws BadGrocery If there is an issue with grocery-related data, such as invalid values.
     * @throws BadMember If there is an issue with membership-related data, such as invalid values.
     */
    public static void main (String[] args) throws BadGrocery, BadMember{
        //Create various member objects.
        //Note testing getter methods is not necessary, as long as object is created successfully.
        ArrayList<Member> memberDB = new ArrayList<Member>();
        //Test setter methods of each member class.
        System.out.println("--------------------------------------------------");
        Member memb1 = new GoldMember("Bob Jones", 25, 5, "674-829-2342", true, 6783421, 6, 2013, 556, 234);
        //Check if only members over 18 years of age are allowed.
        // Member memb1 = new GoldMember("Bob Jones", 15, 5, "674-829-2342", true, 6783421, 6, 2018, 556, 234); //ERROR WAS THROWN, WORKS!
        //Check if month joined only accepts integer between 1 and 12.
        // Member memb1 = new GoldMember("Bob Jones", 25, 5, "674-829-2342", true, 6783421, 0, 2018, 556, 234); //ERROR WAS THROWN, WORKS!
        // Member memb1 = new GoldMember("Bob Jones", 25, 5, "674-829-2342", true, 6783421, 13, 2018, 556, 234); //ERROR WAS THROWN, WORKS!
        // Member memb1 = new GoldMember("Bob Jones", 25, 5, "674-829-2342", true, 6783421, 1, 2018, 556, 234); //ACCEPTS 1, WORKS!
        // Member memb1 = new GoldMember("Bob Jones", 25, 5, "674-829-2342", true, 6783421, 12, 2018, 556, 234); //ACCEPTS 12, WORKS!
        //Check if year joined only accepts integers greater or equal to 2013.
        // Member memb1 = new GoldMember("Bob Jones", 25, 5, "674-829-2342", true, 6783421, 12, 2012, 556, 234); //ERROR WAS THROWN, WORKS!
        //Check if restaurant purchases doesn't accept integers less than 0.
        // Member memb1 = new GoldMember("Bob Jones", 25, 5, "674-829-2342", true, 6783421, 12, 2015, -1, 234); //ERROR WAS THROWN, WORKS!
        // Member memb1 = new GoldMember("Bob Jones", 25, 5, "674-829-2342", true, 6783421, 12, 2016, 0, 234); //ACCEPTS 0, WORKS!
        //Check if travel purchases doesn't accept integers less than 0.
        // Member memb1 = new GoldMember("Bob Jones", 25, 5, "674-829-2342", true, 6783421, 12, 2015, 556, -1); //ERROR WAS THROWN, WORKS!
        // Member memb1 = new GoldMember("Bob Jones", 25, 5, "674-829-2342", true, 6783421, 12, 2016, 123, 0); //ACCEPTS 0, WORKS!
        memberDB.add(memb1);
        Member memb2 = new BronzeMember("Sally Jane", 56, 10, "896-234-8767", true, 8573623, 6, 2013, 789, 456, 324);
        //Check if gas purchases doesn't accept integers less than 0.
        // Member memb2 = new BronzeMember("Sally Jane", 56, 10, "896-234-8767", true, 8573623, 6, 2013, 0, 456, 324); //ACCEPTS 0, WORKS!
        // Member memb2 = new BronzeMember("Sally Jane", 56, 10, "896-234-8767", true, 8573623, 6, 2013, -1, 456, 324); //ERROR WAS THROWN, WORKS!
        //Check if grocery purchases doesn't accept integers less than 0.
        // Member memb2 = new BronzeMember("Sally Jane", 56, 10, "896-234-8767", true, 8573623, 6, 2013, 789, 0, 324); //ACCEPTS 0, WORKS!
        // Member memb2 = new BronzeMember("Sally Jane", 56, 10, "896-234-8767", true, 8573623, 6, 2013, 789, -1, 324); //ERROR WAS THROWN, WORKS!
        //Check if everyday purchases doesn't accept integers less than 0.
        // Member memb2 = new BronzeMember("Sally Jane", 56, 10, "896-234-8767", true, 8573623, 6, 2013, 789, 456, 0); //ACCEPTS 0, WORKS!
        // Member memb2 = new BronzeMember("Sally Jane", 56, 10, "896-234-8767", true, 8573623, 6, 2013, 789, 456, -1); //ERROR WAS THROWN, WORKS!
        memberDB.add(memb2);
        Member memb3 = new PlatinumMember("Bob Jones", 25, 5, "674-829-2342", true, 8342431, 6, 2018, 556, 234, 175);
        //Check if entertainment purchases doesn't accept integers less than 0.
        // Member memb3 = new PlatinumMember("Bob Jones", 25, 5, "674-829-2342", true, 8342431, 6, 2018, 0, 234, 175); //ACCEPTS 0, WORKS!
        // Member memb3 = new PlatinumMember("Bob Jones", 25, 5, "674-829-2342", true, 8342431, 6, 2018, -1, 234, 175); //ERROR WAS THROWN, WORKS!
        //Check if recurring purchases doesn't accept integers less than 0.
        // Member memb3 = new PlatinumMember("Bob Jones", 25, 5, "674-829-2342", true, 8342431, 6, 2018, 556, 0, 175); //ACCEPTS 0, WORKS!
        // Member memb3 = new PlatinumMember("Bob Jones", 25, 5, "674-829-2342", true, 8342431, 6, 2018, 556, -1, 175); //ERROR WAS THROWN, WORKS!
        //Check if transportation purchases doesn't accept integers less than 0.
        // Member memb3 = new PlatinumMember("Bob Jones", 25, 5, "674-829-2342", true, 8342431, 6, 2018, 556, 234, 0); //ACCEPTS 0, WORKS!
        // Member memb3 = new PlatinumMember("Bob Jones", 25, 5, "674-829-2342", true, 8342431, 6, 2018, 556, 234, -1); //ERROR WAS THROWN, WORKS!
        memberDB.add(memb3);
        Member memb4 = new PlatinumMember("Bob Jones", 25, 12, "674-829-2342", true, 6783411, 6, 2015, 556, 234, 125);
        memberDB.add(memb4);
        //Test toString methods in each member class
        for (int i = 0; i<memberDB.size(); i++) {
            System.out.println(memberDB.get(i));
        }
        System.out.println("--------------------------------------------------");


        //Test getter mehtods of Bronze member.
        System.out.println("--------------------------------------------------");
        System.out.println("Name: " + memb2.getName());
        System.out.println("Age: " + memb2.getAge());
        System.out.println("Years of Membership: " + memb2.getYearsOfMember());
        System.out.println("Phone Number: " + memb2.getPhoneNumber());
        System.out.println("Good Standing: " + memb2.getGoodStanding());
        System.out.println("Member ID: " + memb2.getMemberID());
        System.out.println("Month Joined:" + memb2.getMonthJoined());
        System.out.println("Year Joined: " + memb2.getYearJoined());
        System.out.println("Gas Purchases: $" + memb2.getGasPurchases());
        System.out.println("Grocery Purchases: $" + memb2.getGroceryPurchases());
        System.out.println("Everyday Purchases: $" + memb2.getEverydayPurchases());
        System.out.println("Dues: " + memb2.getDues());
        System.out.println("Calculate Dues: " + memb2.calculateDues());
        System.out.println("Calculate Cash Back: " + memb2.calculateCashBack());
        System.out.println("--------------------------------------------------");


        //Test getter mehtods of Gold member.
        System.out.println("--------------------------------------------------");
        System.out.println("Restaurant Purchases: $" + memb1.getRestaurantPurchases());
        System.out.println("Travel Purchases: $" + memb1.getTravelPurchases());
        System.out.println("Dues: " + memb1.getDues());
        System.out.println("Calculate Dues: " + memb1.calculateDues());
        System.out.println("Calculate Cash Back: " + memb1.calculateCashBack());
        System.out.println("--------------------------------------------------");


        //Test getter mehtods of Platinum member.
        System.out.println("--------------------------------------------------");
        System.out.println("Entertainment Purchases: $" + memb3.getEntertainmentPurchases());
        System.out.println("Recurring Purchases: $" + memb3.getRecurringPurchases());
        System.out.println("Transportation Purchases: $" + memb3.getTransportationPurchases());
        System.out.println("Dues: " + memb3.getDues());
        System.out.println("Calculate Dues: " + memb3.calculateDues());
        System.out.println("Calculate Cash Back: " + memb3.calculateCashBack());
        System.out.println("-------------------");
        System.out.println("Dues: " + memb4.getDues());
        System.out.println("Calculate Dues: " + memb4.calculateDues());
        System.out.println("Calculate Cash Back: " + memb4.calculateCashBack());
        System.out.println("--------------------------------------------------");


        //Test GroceryItem class.
        System.out.println("--------------------------------------------------");
        ArrayList<GroceryItem> order = new ArrayList<GroceryItem>();
        ArrayList<GroceryItem> orderTwo = new ArrayList<GroceryItem>();
        //Test creating object.
        GroceryItem item1 = new GroceryItem("Bananas", 1.50, 45, 32114, GroceryCategory.PRODUCE);
        GroceryItem item2 = new GroceryItem("Apple", 0.99, 45, 78345, GroceryCategory.PRODUCE);
        GroceryItem item3 = new GroceryItem("Milk", 3.25, 45, 79301, GroceryCategory.DAIRY);
        GroceryItem item4 = new GroceryItem("Pepsi", 6.75, 45, 54349, GroceryCategory.MISCELLANEOUS);
        GroceryItem item5 = new GroceryItem("Steak", 22.99, 45, 13489, GroceryCategory.MEAT);
        // GroceryItem item7 = new GroceryItem("Pork", 0, 45, 84934, GroceryCategory.MEAT);
        order.add(item1);
        order.add(item2);
        orderTwo.add(item3);
        orderTwo.add(item4);
        orderTwo.add(item5);
        //Test setPrice method with $0.
        // order.add(item7); //ERROR WAS THROWN, WORKS!
        //Test getItemName method.
        System.out.println(item1.getItemName());
        //Test getPrice method.
        System.out.println(item1.getPrice());
        //Test getInventory method.
        System.out.println(item1.getInventory());
        //Test getSKU method.
        System.out.println(item1.getSKU());
        //Test getItemCategory method.
        System.out.println(item1.getItemCategory());
        //Test toString method.
        System.out.println(item1);
        System.out.println("--------------------------------------------------");


        //Test OnlineOrder class.
        System.out.println("--------------------------------------------------");
        OnlineOrder order1 = new OnlineOrder(memb3, order);
        OnlineOrder order2 = new OnlineOrder(memb3, orderTwo);
        //Test setBasketItems with items out of stock.
        GroceryItem item6 = new GroceryItem("Oranges", 1.00, 0, 89435, GroceryCategory.PRODUCE);
        order.add(item6);
        //Test adding an item with no inventory to an order.
        // OnlineOrder order3 = new OnlineOrder(memb3, order); //ERROR WAS THROWN, WORKS!
        //Test toString method.
        System.out.println(order1);
        //Test getMember method.
        System.out.println(order1.getMember());
        //Test getCostOrder method.
        System.out.println(order1.getCostOrder());
        System.out.println(order2.getCostOrder());
        //Test getNumItems method.
        System.out.println(order1.getNumItems());
        //Test getBasketItems method.
        ArrayList<GroceryItem> orderItems = order1.getBasketItems();
        for(GroceryItem item : orderItems){
            System.out.println(item);
        }
        //Test totalCostBasket method.
        System.out.println(order1.totalCostBasket(order));
        //Test checkInventory method.
        System.out.println(order1.checkInventory());
        System.out.println(order2.checkInventory());
        System.out.println("--------------------------------------------------");

        //Test compareTo methods.
        System.out.println("--------------------------------------------------");
        System.out.println(memb4.compareTo(memb3));
        System.out.println(order2.compareTo(order1));
        System.out.println("--------------------------------------------------");
    }
}