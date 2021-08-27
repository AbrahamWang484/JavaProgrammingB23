package Replit.OOP.TJMAX;

public class Main {
    public static void main(String[] args) {
        TJMaxx tJMaxx1=new TJMaxx();
        OnSaleItem onSaleItem1=new OnSaleItem("Tea", 10, 101, 2, 0.1);
        OnSaleItem onSaleItem2=new OnSaleItem("Coffee", 11, 102, 2, 0.1);
        OnSaleItem onSaleItem3=new OnSaleItem("Herbs", 12, 103, 2, 0.1);
        OnSaleItem onSaleItem4=new OnSaleItem("Icetea", 13, 104, 2, 0.1);
        OnSaleItem[] items={onSaleItem1,onSaleItem2,onSaleItem3,onSaleItem4};

        tJMaxx1.addOnSaleItem(onSaleItem1);

        System.out.println(tJMaxx1.onSaleItemsCount());

        Item item1=new Item("Patato", 102, 1000, 0.5);
        Item item2=new Item("Patato", 103, 1001, 1.5);
        Item item3=new Item("Patato", 104, 1002, 0.5);
        Item item4=new Item("Patato", 105, 1003, 0.5);
        Item item5=new Item("Patato", 106, 1004, 0.5);
        Item[] itemss={item1,item2,item3,item4,item5};


        System.out.println(tJMaxx1.regularItemsCount());

        OnSaleItem onsaleItem=tJMaxx1.getOnSaleItem("Icetea");
        System.out.println("Discount: "+onsaleItem.getDiscount());

        tJMaxx1.removeItem(1000);
        System.out.println(tJMaxx1.regularItemsCount());
        tJMaxx1.removeItem(101);
        System.out.println(tJMaxx1.onSaleItemsCount());

        System.out.println(tJMaxx1.getItemPrice(1001));

        tJMaxx1.buyItem(1004);
        System.out.println(tJMaxx1.regularItemsCount());





    }
}
