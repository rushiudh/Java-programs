import java.util.Scanner;
class Demo1
{
  public static void main (String args []){
    long mg=0, g, kg;
      Scanner sc = new Scanner(System.in);
      mg=0;

      System.out.println("Entern the weight in mg :-");
      mg=sc.nextInt();

    g=mg/100;
    kg=g/100;
    System.out.println("Mg in gram ="+g);
    System.out.println("Mg in kg ="+kg);
  }
}
