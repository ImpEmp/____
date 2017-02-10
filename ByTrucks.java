package lab7;

import java.util.Comparator;

public class ByTrucks
  implements Comparator<Salesperson>
{
  public int compare(Salesperson arg1, Salesperson arg2)
  {
    return arg1.getTrucks() - arg2.getTrucks();
  }
}
