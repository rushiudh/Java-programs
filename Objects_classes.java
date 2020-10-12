 class Parent
{
    void display1()
    {
      System.out.println("THis is Parent class");
    }
}
class child extends Parent
{
  void display2()
  {
    System.out.println("This is Child Class");
  }
}
public class Objects_classes
{
  public static void main(String[]arrg)
  {
    child ch = new child();
    ch.display1();//accessing Parent class with child class object
    ch.display2();//accessing child class with child class object
  }
}
