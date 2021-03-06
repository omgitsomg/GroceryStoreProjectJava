/***************************************************************
 *      Project Name:
 *      Developer's Name:
 *      Project Description:
 *      Date Created: 5/14/2021
 *      Last Modified: 6/16/2021
 *
 *
 */

import java.util.Scanner;

public class GroceryStoreProject
{
    public static void main(String [] args)
    {

        Scanner in = new Scanner(System.in);
        String userInput = "";

        GroceryStore gs1 = new GroceryStore();
        for (int i = 0; i < 48; i++)
        {
            gs1.addItem("Rice, 5.00, 06/02/2021, Grains Aisle");
        }

        System.out.println("Welcome to the grocery store!");
        System.out.println("How may we help you today?");
        System.out.println();

        while(!userInput.equals("4"))
        {
            System.out.println("1. Show Grocery Store's inventory");
            System.out.println("2. Add Item to Grocery Store");
            System.out.println("3. Buy Item from the Grocery Store");
            System.out.println("4. Exit the Grocery Store");
            userInput = in.nextLine();


            switch (userInput)
            {
                case "1": 
                {
                    gs1.printGroceryStoreInfo();
                    break;
                }            
                case "2":
                        {
                            try
                            {
                                System.out.println("Please enter the name, price, expiration date, and the location of the item\n(Name, Price, mm/dd/yyyy, location)");
                                userInput = in.nextLine();
                                gs1.addItem(userInput);
                            }
                            catch (Exception exception)
                            {
                                System.out.println("Invalid Item");
                            }
                            break;
                        }
                case "3":
                        {
                            try
                            {
                                System.out.println("Please enter the index of the item");
                                userInput = in.nextLine();
                                gs1.removeItem(Integer.parseInt(userInput) - 1);
                            }
                            catch (Exception exception)
                            {
                                System.out.println("Invalid Item");
                            }
                            break;
                        }
                case "4": 
                {
                    System.out.println("Exiting the Grocery Store");
                    break;
                }
            }
        }
    }
}

