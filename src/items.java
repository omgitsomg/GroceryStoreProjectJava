public class items
{

    private String name;
    private double price;
    private String expirationDate;
    private String inStoreLoc;

    public items()
    {
        name = "item #1";
        price = 5.00;
        expirationDate = "5/28/2021";
        inStoreLoc = "Snack Aisle";
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

    public void printItem()
    {
        System.out.printf(getName() + "%10d" + getPrice() + "%10s" + getExpirationDate() + "%10s" + getInStoreLoc());
    }
}
