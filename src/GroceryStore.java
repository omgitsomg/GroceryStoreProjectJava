/***************************************************************
 *      Project Name:
 *      Developer's Name:
 *      Project Description:
 *      Date Created: 5/14/2021
 *      Last Modified: 5/14/2021
 *
 *
 */


public class GroceryStore
{

    static int DEFAULTINVENTORYSIZE = 50;
    static int EMPLOYEETEAMSIZE = 20;

    private items[] items;
    private String[] employees;
    private int currentInventorySize;


    public GroceryStore()
    {

        this.items = new items[DEFAULTINVENTORYSIZE];
        this.employees = new String[EMPLOYEETEAMSIZE];
        this.currentInventorySize = 0;
    }

    public GroceryStore(items[] newItems, String[] newEmployees)
    {

        this.items = new items[DEFAULTINVENTORYSIZE];
        System.arraycopy(newItems, 0, this.items, 0, DEFAULTINVENTORYSIZE);
        this.employees = new String[EMPLOYEETEAMSIZE];
        System.arraycopy(newEmployees, 0, this.employees, 0,EMPLOYEETEAMSIZE);

        this.currentInventorySize = 0;
        for(int i = 0; i < newItems.length; i++)
        {
            if (this.items[i] != null)
            {
                currentInventorySize++;
            }
        }
    }

    public void restockItem(String itemName, int itemPrice, String expirationDate, String instoreLoc)
    {

        if (currentInventorySize == DEFAULTINVENTORYSIZE)
        {
            System.out.println("The grocery store's inventory is full right now.\nCannot restock " + itemName);
        }
        else
        {
            this.items[currentInventorySize] = new items(itemName, itemPrice, expirationDate, instoreLoc);
            currentInventorySize++;
        }
    }

    public void addItem(String itemName, int itemPrice, String expirationDate, String instoreLoc)
    {

        items[currentInventorySize] = new items(itemName, itemPrice, expirationDate, instoreLoc);
        currentInventorySize++;
    }

    //public void printItem()
    //{
        //System.out.printf(getName() + "%10d" + getPrice() + "%10s" + getExpirationDate() + "%10s" + getInStoreLoc());
    //}


    public void printGroceryStoreInfo()
    {
        String itemName = "Item Name";
        String itemPrice = "Item Price";
        String expDate = "Expiration Date";
        String storeAisle = "Store Aisle";
        System.out.printf("%-35s|%-15s|%-35s|%-35s|\n", itemName, itemPrice, expDate, storeAisle);
        //System.out.printf("%-10s\n", itemName);
        System.out.println("___________________________________|_______________|___________________________________|___________________________________|");
    }

}
