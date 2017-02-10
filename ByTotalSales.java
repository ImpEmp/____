package lab7;
import java.util.Comparator;

public class ByTotalSales
  implements Comparator<Salesperson>
{
  public int compare(Salesperson arg1, Salesperson arg2)
  {
    return arg1.getCars() + arg1.getTrucks() - (arg2.getCars() + arg2.getTrucks());
  }
}
