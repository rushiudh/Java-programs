import java.util.Scanner;
public class countingValleys
{
  public static void main(String[]Arf)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int result = 0;
    String ch = sc.next();
    for(int i = 0;i<n;i++)
    {
      if(ch.charAt(i) == 'U')
      {
        count+=1;
        if(count == 0)
          result+=1;
      }
      else if(ch.charAt(i) == 'D')
      {
        count-=1;
      }
    }
    System.out.println(result);
  }
}
