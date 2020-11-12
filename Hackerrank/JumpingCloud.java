import java.util.Scanner;
public class JumpingCloud
{
  public static void main(String[]arr)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ch[] = new int[n];
    int count = 0;
    int i = 0;
    for(i=0;i<n;i++)
    {
      ch[i] = sc.nextInt();
    }

    i = 0;
    while(i < n-1)
    {
      if(i+2 < n && ch[i+2] == 0)
      {
        i = i+2;
        count++;
      }
      else
      {
        i++;
        count++;
      }
    }
    System.out.println(count);
  }
}
