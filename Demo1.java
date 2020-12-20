import java.io.*;
class Demo1
{
  public static void main (String args []) throws IOException{
    long mg=0, g, kg;
      DataInputStream in = new DataInputStream(System.in);
      mg=0;

      System.out.println("Entern the weight in mg :-");
      mg = Integer.parseInt(in.readLine());

    g=mg/100;
    kg=g/100;
    System.out.println("Mg in gram ="+g);
    System.out.println("Mg in kg ="+kg);
  }
}
