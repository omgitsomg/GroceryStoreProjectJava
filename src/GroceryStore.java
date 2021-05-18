/***************************************************************
 *      Project Name: Grocery Store
 *      Developer's Name: Kevin Ly
 *      Project Description: This is my first independent project for fun and practice
 *      Date Created: 5/14/2021
 *      Last Modified: 5/16/2021
 *
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroceryStore
{

    static int DEFAULTINVENTORYSIZE = 50;
    static int EMPLOYEETEAMSIZE = 20;

    private ArrayList<items> itemList;
    private String[] employees;
    private int currentInventorySize;

    public GroceryStore()
    {
        this.itemList = new ArrayList<>(DEFAULTINVENTORYSIZE);
        for (int i = 0; i < DEFAULTINVENTORYSIZE; i++)
        {
            this.itemList.add(new items());
        }
        this.employees = new String[EMPLOYEETEAMSIZE];
        this.currentInventorySize = 0;
    }

    public GroceryStore(ArrayList<items> newItems, String[] newEmployees)
    {
        for (items item : newItems)
        {
            this.itemList.add(item);
        }
        this.employees = new String[EMPLOYEETEAMSIZE];
        System.arraycopy(newEmployees, 0, this.employees, 0,EMPLOYEETEAMSIZE);

        this.currentInventorySize = 0;
        for(int i = 0; i < newItems.size(); i++)
        {
            if (this.itemList != null)
            {
                currentInventorySize++;
            }
        }
    }

    public void restockItem(String itemName, int itemPrice, String expirationDate, String instoreLoc)
    {
        if (currentInventorySize == DEFAULTINVENTORYSIZE)
        {
            System.out.println("The grocery store's inventory is full right now.\nCannot restock " + itemName + ".");
        }
        else
        {
            this.itemList.add(new items(itemName, itemPrice, expirationDate, instoreLoc));
            currentInventorySize++;
        }
    }

    public void addItem()
    {
        if (currentInventorySize == DEFAULTINVENTORYSIZE)
        {
            System.out.println("The grocery store's inventory is full right now.\nCannot add more items.");
        }
        else
        {
            itemList.remove(currentInventorySize);
            itemList.add(currentInventorySize, new items());
            currentInventorySize++;
        }
    }

    public void addItem(String itemString)
    {
        String delim = "[,]+";
        String[] tokens = itemString.split(delim);
        String itemName = tokens[0];
        double itemPrice = Double.parseDouble(tokens[1]);
        String expirationDate = tokens[2];
        String instoreLoc = tokens[3];

        if (currentInventorySize == DEFAULTINVENTORYSIZE)
        {
            System.out.println("The grocery store's inventory is full right now.\nCannot add more items.");
        }
        else
        {
            itemList.remove(currentInventorySize);
            itemList.add(currentInventorySize, new items(itemName, itemPrice, expirationDate, instoreLoc));
            currentInventorySize++;
        }
    }

    public void removeItem(String itemString)
    {
        String delim = "[,]+";
        String[] tokens = itemString.split(delim);
        String itemName = tokens[0];
        double itemPrice = Double.parseDouble(tokens[1]);
        String expirationDate = tokens[2];
        String instoreLoc = tokens[3];

        List<items> removeList = new ArrayList<items>();

        for (items item : itemList)
        {
            if (itemName.equals(item.getName()))
            {
                if (itemPrice == item.getPrice())
                {
                    if (expirationDate.equals(item.getExpirationDate()))
                    {
                        if (instoreLoc.equals(item.getInStoreLoc()))
                        {
                            removeList.add(item);
                        }
                    }
                }
            }
        }
        itemList.removeAll(removeList);

        /**
         * The removeItem method has a small bug. When removing the item, the ArrayList will decrease to 49 from 50, so it won't show EMPTY for the 50th item because it only shows the 49 items.
         */

    }

    public void printItem(items item)
    {
        System.out.printf("%-35s|%-15f|%-35s|%-35s|\n", item.getName(), item.getPrice(), item.getExpirationDate(),  item.getInStoreLoc());
    }


    public void printGroceryStoreInfo()
    {
        String itemName = "Item Name";
        String itemPrice = "Item Price";
        String expDate = "Expiration Date";
        String storeAisle = "Store Aisle";
        System.out.printf("%-35s|%-15s|%-35s|%-35s|\n", itemName, itemPrice, expDate, storeAisle);
        System.out.println("___________________________________|_______________|___________________________________|___________________________________|");
        for (int i = 0; i < itemList.size(); i++)
        {
            printItem(itemList.get(i));
            System.out.println("___________________________________|_______________|___________________________________|___________________________________|");
        }
    }

}
