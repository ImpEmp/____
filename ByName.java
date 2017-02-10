package lab7;
import java.util.Comparator;

public class ByName
  implements Comparator<Salesperson>
{
  public int compare(Salesperson arg1, Salesperson arg2)
  {
    return -arg1.getName().compareTo(arg2.getName());
  }
}
