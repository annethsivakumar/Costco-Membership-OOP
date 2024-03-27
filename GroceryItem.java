/*
 * Program Name: GroceryItem.java
 * Description: This class represents a grocery item in a grocery store inventory system.
 * It stores information about the item's name, price, inventory, SKU, and category.
 */

/**
 * The GroceryCategory enum represents the different categories that a grocery item can belong to.
 * It includes Dairy, Meat, Produce, and Miscellaneous categories.
 */
enum GroceryCategory{
    DAIRY, MEAT, PRODUCE, MISCELLANEOUS
}

public class GroceryItem {
    // Intialize variables.
    private String itemName;
    private double price;
    private int inventory;
    private int SKU;
    private GroceryCategory itemCategory;

    /**
     * Constructor to initialize a GroceryItem object.
     * @param itemName The name of the item as a String.
     * @param price The price of the item as a double value.
     * @param inventory The amount of units of the item is in stock in inventory, as an integer.
     * @param SKU The SKU (barcode number) for the item as an integer.
     * @param itemCategory The category of the item.
     * @throws BadGrocery If any of the provided parameters are invalid or out of range.
     */
    public GroceryItem(String itemName, double price, int inventory, int SKU, GroceryCategory itemCategory) throws BadGrocery{
        setItemName(itemName);
        setPrice(price);
        setInventory(inventory);
        setSKU(SKU);
        setItemCategory(itemCategory);
    }

    /**
     * Sets a String representation of the name of the item.
     * @param itemName The name of the item as a String.
     */
    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    /**
     * Sets a double value representation of the price of the item.
     * @param price The price of the item as a double value.
     * @throws BadGrocery If price of item is less than zero dollars.
     */
    public void setPrice(double price) throws BadGrocery{
        // Check if the price if greater than $0.
        if(price <= 0){
            throw new BadGrocery("Invalid price entered! Price must be greater than zero. Please enter a double value greater than zero!");
        } else {
            this.price = price;
        }
    }

    /**
     * Sets an integer representation of the amount of items available.
     * @param inventory The amount of units of the item is in stock in inventory, as an integer.
     */
    public void setInventory(int inventory){
        this.inventory = inventory;
    }

    /**
     * Sets an integer representation of the SKU number.
     * @param SKU The SKU (barcode number) for the item as an integer.
     */
    public void setSKU(int SKU){
        this.SKU = SKU;
    }

    /**
     * Sets the category of the grocery item.
     * @param itemCategory The category of the item.
     */
    public void setItemCategory(GroceryCategory itemCategory){
        this.itemCategory = itemCategory;
    }

    /**
     * Returns a String representation of the name of the item.
     * @return The name of the item as a String.
     */
    public String getItemName(){
        return itemName;
    }

    /**
     * Returns a double value representation of the price of the item.
     * @return The price of the item as a double value.
     */
    public double getPrice(){
        return price;
    }

    /**
     * Returns an integer representation of the amount of items available.
     * @return The amount of units of the item is in stock in inventory, as an integer.
     */
    public int getInventory(){
        return inventory;
    }

    /**
     * Returns an integer representation of the SKU number.
     * @return The SKU (barcode number) for the item as an integer.
     */
    public int getSKU(){
        return SKU;
    }

    /**
     * Returns the category of the grocery item.
     * @return The category of the item.
     */
    public GroceryCategory getItemCategory(){
        return itemCategory;
    }

    /**
     * Returns a String representation of the GroceryItem object.
     * @return A String containing information about the grocery item's name, price, and inventory.
     */
    @Override
    public String toString(){
        return getItemName() + " costs $" + getPrice() + " and there are " + getInventory() + " units in stock.";
    }
}
