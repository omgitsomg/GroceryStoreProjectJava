/***************************************************************
 *      Project Name: Grocery Store
 *      Developer's Name: Kevin Ly
 *      Project Description: This is my first independent project for fun and practice
 *      Date Created: 5/14/2021
 *      Last Modified: 6/16/2021
 *
 *
 */

import java.util.ArrayList;

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

    public void removeItem(int index)
    {
        if (itemList.get(index).getName().equals("Empty"))
        {
            System.out.println("Invalid Item");
        }
        else
        {
            itemList.remove(index);

            itemList.add(new items());
            currentInventorySize--;
        }
    }

    public void printItem(items item, int index)
    {
        System.out.printf("%-2d. %-35s|%-15f|%-35s|%-30s|\n", index, item.getName(), item.getPrice(), item.getExpirationDate(),  item.getInStoreLoc());
    }

    public void printGroceryStoreInfo()
    {
        String itemName = "Item Name";
        String itemPrice = "Item Price";
        String expDate = "Expiration Date";
        String storeAisle = "Store Aisle";
        System.out.printf("%-39s|%-15s|%-35s|%-30s|\n", itemName, itemPrice, expDate, storeAisle);
        System.out.println("_______________________________________|_______________|___________________________________|______________________________|");
        for (int i = 0; i < itemList.size(); i++)
        {
            printItem(itemList.get(i), i + 1);
            System.out.println("_______________________________________|_______________|___________________________________|______________________________|");
        }
    }
}

