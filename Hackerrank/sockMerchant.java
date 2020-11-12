import java.util.*;
public class sockMerchant
{
  public static void main(String[]arg)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ar[] =  new int[n];
    for(int i = 0; i<n; i++)
    {
      ar[i] = sc.nextInt();
    }
    int count = 0;
    Arrays.sort(ar);
    for(int i = 0;i< n-1; i++)
    {
      if(i<n && ar[i] == ar[i+1])
        count+=1;
        i+=1;
    }
    System.out.println(count);
  }
}
