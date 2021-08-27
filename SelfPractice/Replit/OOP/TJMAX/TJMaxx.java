package Replit.OOP.TJMAX;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx {

    /**
     * Private ArrayList to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private ArrayList<Item> regularItems;
    private ArrayList<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        regularItems = regularItems;
        onSaleItems = onSaleItems;
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
        regularItems.add(item);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     * @return
     */
    public ArrayList<Item> getRegularItems() {
        //TODO change from null
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public ArrayList<OnSaleItem> getOnSaleItems() {
        //TODO change from null
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        //TODO change from -1
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public ArrayList<String> getAllItemNames() {
        for (Item regularItem : getRegularItems()) {
           getAllItemNames().add(regularItem.getName());
        }
        for (OnSaleItem onSaleItem : getOnSaleItems()) {
            getAllItemNames().add(onSaleItem.getName());
        }
        return getAllItemNames();
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {
        for (Item regularItem : regularItems) {
            if (regularItem.getCatalogNumber()==catalogNumber){
                return regularItem.getPrice();
            }
        }
        for (OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getCatalogNumber()==catalogNumber){
                return onSaleItem.getCatalogNumber();
            }
        }
        return 0.0;
    }

    /**
     * accepts a name then searches among onSaleItems.
     *  Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    {
        for (OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getName()==name){
                return onSaleItem;
            }
        }
        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        for (Item regularItem : regularItems) {
            if (regularItem.getCatalogNumber()==catalogNumber){
                regularItems.remove(regularItem);
            }
        }
        for (OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getCatalogNumber()==catalogNumber){
                onSaleItems.remove(onSaleItem);
            }
        }
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
        for (Item regularItem : regularItems) {
            if (regularItem.getCatalogNumber()==catalogNumber){
                int quantity= regularItem.getQuantity();
                if (quantity>0){
                    regularItem.setQuantity(regularItem.getQuantity()-1);
                }else {
                    regularItems.remove(regularItem);
                }

            }
        }
        for (OnSaleItem onSaleItem : onSaleItems) {
            if (onSaleItem.getCatalogNumber()==catalogNumber){
                int quantity= onSaleItem.getQuantity();
                if (quantity>0){
                    onSaleItem.setQuantity(onSaleItem.getQuantity()-1);
                }else {
                    onSaleItems.remove(onSaleItem);
                }
            }
        }



    }


}
