/***************************************************************
 *      Project Name:
 *      Developer's Name:
 *      Project Description:
 *      Date Created: 5/14/2021
 *      Last Modified: 5/16/2021
 *
 *
 */

import java.util.Scanner;

public class GroceryStoreProject
{
    public static void main(String [] args)
    {

        Scanner in = new Scanner(System.in);
        String userInput;

        GroceryStore gs1 = new GroceryStore();
        for (int i = 0; i < 50; i++)
        {
            gs1.addItem("Rice", 5.00, "06/02/2021", "Grains Aisle");
        }
        gs1.printGroceryStoreInfo();
        gs1.addItem("Last Rice", 5.00, "06/02/2021", "Grains Aisle");


        //while(userInput != null)
        //{
           // System.out.println("Welcome to the grocery store!");
            //System.out.println("How may we help you today?");
            //System.out.println();
            //System.out.println("1. Show Grocery Store's inventory");
            //System.out.println("2. Add Item to Grocery Store");
            //System.out.println("3. Buy Item from the Grocery Store");

            //switch ();
            //{

            //}



    }
}

