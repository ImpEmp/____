package lab7;

public class Salesperson
{
  private String myName;
  private int myCars;
  private int myTrucks;
  
  public Salesperson()
  {
    this.myName = "Vacancy";
    this.myCars = (this.myTrucks = 0);
  }
  
  public Salesperson(String x, int y, int z)
  {
    this.myName = x;
    this.myCars = y;
    this.myTrucks = z;
  }
  
  public Salesperson(Salesperson arg)
  {
    this.myName = arg.getName();
    this.myCars = arg.getCars();
    this.myTrucks = arg.getTrucks();
  }
  
  public String getName()
  {
    return this.myName;
  }
  
  public int getCars()
  {
    return this.myCars;
  }
  
  public int getTrucks()
  {
    return this.myTrucks;
  }
  
  public void setName(String x)
  {
    this.myName = x;
  }
  
  public void setCars(int x)
  {
    this.myCars = x;
  }
  
  public void setTrucks(int x)
  {
    this.myTrucks = x;
  }
  
  public String toString()
  {
    return this.myName + " (" + this.myCars + ", " + this.myTrucks + ")";
  }
}
