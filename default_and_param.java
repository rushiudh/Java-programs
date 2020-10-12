public class default_and_param
{
public  int x=0;
  public default_and_param()
  {
    x=20;
  }
  public default_and_param(int temp)
  {
    x = temp;
  }
  public static void main(String[]arg)
  {
    default_and_param dp = new default_and_param();
    System.out.println("X = "+dp.x);
    default_and_param dp1 = new default_and_param(10);
    System.out.println("x = "+dp1.x);
  }
}
