/*
 * Program Name: OnlineOrder.java
 * Description: This class represents an online order made by a member in a grocery store's online system.
 * It contains information about the member who placed the order, the total cost of the order, 
 * the number of items in the order, and the list of grocery items in the member's basket.
 */
import java.text.DecimalFormat;
import java.util.ArrayList;

public class OnlineOrder {
    // Intialize variables.
    private Member member;
    private double costOrder;
    private int numItems;
    private ArrayList<GroceryItem> basketItems;

    /**
     * 
     * @param member The member who is placing the order, as an Member object.
     * @param basketItems An ArrayList of GroceryItem objects in the member's basket. 
     * @throws BadGrocery If any of the provided parameters are invalid or out of range.
     */
    public OnlineOrder(Member member, ArrayList<GroceryItem> basketItems) throws BadGrocery{
        setBasketItems(basketItems);
        setMember(member);
        setCostOrder(basketItems);
        setNumItems(basketItems);
    }

    /**
     * Sets an ArrayList of GroceryItem objects as the member's order.
     * @param basketItems An ArrayList of GroceryItem objects in the member's basket.  
     * @throws BadGrocery If an item is out of stock.
     */
    public void setBasketItems(ArrayList<GroceryItem> basketItems) throws BadGrocery{
        // Check inventory for the provided basketItems
        for (GroceryItem item : basketItems) {
            if (item.getInventory() == 0) {
                throw new BadGrocery(item.getItemName() + " is out of stock.");
            }
        }
        this.basketItems = basketItems;
    }

    /**
     * Sets a Member object representation of the member who is placing the order.
     * @param member The member who is placing the order, as an Member object.
     */
    public void setMember(Member member){
        this.member = member;
    }

    /**
     * Sets a double value representation of the cost of the member's order.
     */
    public void setCostOrder(ArrayList<GroceryItem> basketItems){
        this.costOrder = totalCostBasket(basketItems);
    }

    /**
     * Set an integer value representation of the number items in the order.
     */
    public void setNumItems(ArrayList<GroceryItem> basketItems){
        this.numItems = basketItems.size();
    }

    /**
     * Returns a Member object representation of the member who is placing the order.
     * @return The member who is placing the order, as an Member object.
     */
    public Member getMember(){
        return member;
    }

    /**
     * Returns a double value representation of the cost of the member's order.
     * @return The cost of the member's order, as a double value.
     */
    public double getCostOrder(){
        return costOrder;
    }

    /**
     * Returns an integer value representation of the number items in the order.
     * @return The number of items in the order, as an integer.
     */
    public int getNumItems(){
        return numItems;
    }

    /**
     * Returns an ArrayList of GroceryItem objects as the member's order.
     * @return An ArrayList of GroceryItem objects in the member's basket.  
     */
    public ArrayList<GroceryItem> getBasketItems(){
        return basketItems;
    }

    /**
     * Returns a boolean value representation of whether all the items in the member's basket are in stock.
     * @return True if all the items in the member's basket are in stock, false otherwise 
     */
    public boolean checkInventory(){
        // loop through and check if the all item's in the member's basket are in stock.
        for (GroceryItem item : basketItems) {
            if (item.getInventory() == 0)
                return false;
        }
        return true;
    } 

    /**
     * Returns a boolean value representation of the total cost of the items in the order basket.
     * @param basket An ArrayList of GroceryItem objects in the member's basket.  
     * @return The total cost of the items in the order basket, as a double value.
     */
    public double totalCostBasket(ArrayList<GroceryItem> basket){
        // loop through and calculate the total cost of the items in the order basket.
        double totalCost = 0.0;
        for (GroceryItem item : basket) {
            totalCost += item.getPrice();
        }
        DecimalFormat df = new DecimalFormat("#.##");      
        totalCost = Double.valueOf(df.format(totalCost));
        return totalCost;    
    }

    /**
     * Returns a String representation of the OnlineOrder object.
     * @return A String containing information about the member's name, the number of items in their order, and total cost of their order.
     */
    @Override
    public String toString(){
        return member.getName() + " has a total of " + getNumItems() + " items, costing $" + getCostOrder() + ".";
    }

    /**
     * Compares two OnlineOrder objects based on the total cost their orders.
     * @param otherOrder The online order to compare.
     * @return The difference in the cost between two orders as an integer.
     */
    public double compareTo(OnlineOrder otherOrder){
        return this.costOrder - otherOrder.costOrder;
    }

}
