package Replit.OOP.CatalogProject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Catalog {


    // 3 instance fields type of ArrayList
    // has been initialized already
    // and ready to be used inside method to add items
    public ArrayList<String> items = new ArrayList<>();
    public ArrayList<Double> prices = new ArrayList<>();
    public ArrayList<Double> monthlyPayments = new ArrayList<>();

    /**
     * This method adds all listed items to <items> arraylist
     * that is already declared above
     */
    public void loadItems() {//ArrayList<String> items = new ArrayList<>();
        //TODO
        String[] itemArr = {"iPhone 6s",
                "iPhone 6s Plus",
                "iPhone X",
                "MacbookPro",
                "ThumbDrive",
                "Beats HeadPhones",
                "Mouse",
                "Charger",
                "iPad",
                "Dyson Vacuum",
                "TV",
                "Apple Watch"};
        items.addAll(Arrays.asList(itemArr));
      /*
    "iPhone 6s"
		"iPhone 6s Plus"
		"iPhone X"
		"MacbookPro"
		"ThumbDrive"
		"Beats HeadPhones"
		"Mouse"
		"Charger"
		"iPad"
		"Dyson Vacuum"
		"TV"
		"Apple Watch"
       */
    }

    /**
     * This method adds all listed prices to <prices> arraylist
     * that is already declared above
     */
    public void loadPrices() {
        //TODO
        // ArrayList<Double> prices = new ArrayList<>();
        Double[] pricesArr = {
                449.0,
                549.0,
                1149.0,
                1499.99,
                39.99,
                349.99,
                79.99,
                39.99,
                429.0,
                399.0,
                2199.0,
                559.0
        };
        prices.addAll(Arrays.asList(pricesArr));

		/*449.0
		  549.0
		  1149.0
		  1499.99
		  39.99
		  349.99
		  79.99
		  39.99
		  429.0
		  399.0
		  2199.0
		  559.0
		 */
    }

    /**
     * This method adds all listed monthly payments to <monthlyPayments> arraylist
     * that is already declared above
     */

    public void loadMonthlyPayments() {
        //TODO
//ArrayList<Double> monthlyPayments = new ArrayList<>();
        Double[] monthlyPaymentsArr = {
                18.71,
                22.88,
                56.16,
                79.49,
                2.68,
                15.12,
                8.98,
                4.56,
                18.31,
                16.25,
                89.49,
                21.18
        };
        monthlyPayments.addAll(Arrays.asList(monthlyPaymentsArr));
		/*
		  18.71
		  22.88
		  56.16
      79.49
      2.68
      15.12
		  8.98
		  4.56
		  18.31
		  16.25
		  89.49
		  21.18
		  */
    }

    /**
     * This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
     * Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
     */
    public void loadWholeCatalog() {
        //TODO
        loadItems();
        loadPrices();
        loadMonthlyPayments();
    }

    /**
     * Write a method that reads values from above ArrayLists and
     * returns a string with all item details:
     * return format(each item in new line and delimited by '-' ):
     * iPhone 6s-449.0-18.71
     * iPhone 6s Plus-549.0-22.88
     * ..
     */

    public String getWholeCatalog() {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        //TODO
        String result = "";
        for (int i = 0; i < items.size(); i++) {
            result += (items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i) + "\n");
        }
        return result;
    }

    /**
     * write a method that an item name and returns all details for it. If item
     * is not in the list then returns null
     * ex:
     * getItemDetails("ThumbDrive") -->ThumbDrive-39.99-2.68
     * getItemDetails("Charger") --> Charger-39.99-4.56
     * getItemDetails("Potato") --> null
     *
     * @param item
     * @return
     */

    public String getItemDetails(String item) {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        //TODO
        String result="";
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)){
                result = (items.get(i) + "-" + prices.get(i) + "-" + monthlyPayments.get(i));
            }
        }
        return result;
    }

    /**
     * write a method that accepts a price and returns a ArrayList<String> with
     * items with all detail that have less than or equal monthly payments
     * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
     * Charger-39.99-4.56
     * getItemsLessThanAMonthlyPrice(1.99) --> ""
     *
     * @param //double price
     * @return ArrayList<String>
     */

    public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
        //LOAD WHOLE CATALOG HERE FIRST
        String[] catalog = getWholeCatalog().split("\n");
        ArrayList<String> allItemsDetail = new ArrayList<>(Arrays.asList(catalog));
        ArrayList<String> itemsLessThanAMontylyPrice= new ArrayList<>();
        //TODO
        for (int i = 0; i < items.size(); i++) {
            if (monthlyPayments.get(i)<price){
                itemsLessThanAMontylyPrice.add(allItemsDetail.get(i));
            }
        }
        return itemsLessThanAMontylyPrice;
    }

    /**
     * Method accepts a item name and updates total Price and monthly payments
     * for that item in <items>,<prices>,<monthlyPayments> arrayLists
     * When assigning monthlyPayments do =>  newPrice/12 <= to get monthly payments
     *
     * @param item     name
     * @param newPrice
     */

    public void updatePrice(String item, double newPrice) {
        //LOAD WHOLE CATALOG HERE FIRST
        loadWholeCatalog();
        //TODO
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)){
                prices.set(i,newPrice);
                monthlyPayments.set(i,newPrice/12);
            }
        }
    }

    /**
     * Method looks for an item in the catalog and removes
     * all details for that item including item name, price, monthlypayments
     *
     * @param item
     */

    public void deleteItemFromCatalog(String item) {
        //LOAD WHOLE CATALOG HERE FIRST

        //TODO
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)){
                items.remove(i);
                prices.remove(i);
                monthlyPayments.remove(i);
            }
        }
    }

}