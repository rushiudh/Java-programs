public class Fun_overload
{
  public int Mult(int a,int b)
  {
    return a*b;
  }
  public float Mult(float a,float b)
  {
    return a*b;
  }
  public static void main(String []ar)
  {
    Fun_overload fo = new Fun_overload();
      System.out.println("Multiplication = \n"+fo.Mult(10,20));
      System.out.println("Multiplication = \n"+fo.Mult(10.2f,20.2f));
  }
}
