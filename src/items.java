/***************************************************************
 *      Project Name:
 *      Developer's Name:
 *      Project Description:
 *      Date Created: 5/14/2021
 *      Last Modified: 5/16/2021
 *
 *
 */


public class items
{

    private String name;
    private double price;
    private String expirationDate;
    private String inStoreLoc;

    public items()
    {
        name = "Empty";
        price = 0.00;
        expirationDate = "Empty";
        inStoreLoc = "Empty";
    }

    public items(String newName, double newPrice, String newExpiration, String newLoc)
    {
        this.name = newName;
        this.price = newPrice;
        this.expirationDate = newExpiration;
        this.inStoreLoc = newLoc;
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

}
