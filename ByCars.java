package lab7;
import java.util.Comparator;

public class ByCars
  implements Comparator<Salesperson>
{
  public int compare(Salesperson arg1, Salesperson arg2)
  {
    return arg1.getCars() - arg2.getCars();
  }
}
