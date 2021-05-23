/***************************************************************
 *      Project Name:
 *      Developer's Name:
 *      Project Description:
 *      Date Created: 5/14/2021
 *      Last Modified: 5/16/2021
 *
 *
 */

import java.util.Random;

public class items
{

    private String name;
    private double price;
    private String expirationDate;
    private String inStoreLoc;
    private int serialNum;
    private Random randomNumGen;

    public items()
    {
        name = "Empty";
        price = 0.00;
        expirationDate = "Empty";
        inStoreLoc = "Empty";
        serialNum = 0;
    }

    public items(String newName, double newPrice, String newExpiration, String newLoc)
    {
        this.name = newName;
        this.price = newPrice;
        this.expirationDate = newExpiration;
        this.inStoreLoc = newLoc;
        randomNumGen = new Random();
        this.serialNum = randomNumGen.nextInt(50);
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public String getExpirationDate()
    {
        return expirationDate;
    }

    public String getInStoreLoc()
    {
        return inStoreLoc;
    }

    public int getSerialNum()
    {
        return serialNum;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setExpirationDate(String expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    public void setInStoreLoc(String inStoreLoc)
    {
        this.inStoreLoc = inStoreLoc;
    }

    public void setSerialNum(int serialNum)
    {
        this.serialNum = serialNum;
    }

}
