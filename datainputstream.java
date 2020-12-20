import java.io.DataInputStream;
public class datainputstream{
  public static void main(String []aha)
  {
    int x,y,a,s,m;
    double d;
    DataInputStream in = new DataInputStream(System.in);
    x = 0;
    y = 0;
    try{
      System.out.println("Enter first Number :");
      x = Integer.parseInt(in.readLine());
      System.out.println("Enter the second Number");
      y = Integer.parseInt(in.readLine());
    }
    catch(Exception ex){
      System.out.println("Error !");
    }
     a = x+y;
     s = x-y;
     m = x*y;
     d = x/(double) y;
     System.out.println("Addition = "+a);
     System.out.println("Substraction = "+s);
     System.out.println("Multiply = "+m);
     System.out.println("divide = "+d);
  }
}
