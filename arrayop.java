import java.util.Scanner;
class arrayop
{
  int ChangeArray(int a[],int n)
  {
    if(n==0 || n==1)
    {
      return n;
    }
    int temp[] = new int[n];
    int j=0;
    for(int i=0;i<n-1;i++)
    {
      if(arr[i]!=arr[i+1])
        temp[j++] = arr[i];
    }
    temp[j++] = arr[n-1];

    for(int i =0;i<j;i++)
    {
      arr[i] = temp[i];
    }
    return j;
  }
public static void main(String[]arg)
{
  int intarray[];
  intarray = new int[10];
  Scanner Sc = new Scanner(System.in);
  for(int i=0; i<intarray.length;i++)
    intarray[i] = Sc.nextInt();
    int length = ChangeArray(intarray,intarray.length);
    for(int i=0;i<length;i++)
    {
        System.out.println(intarray[i]+" ");
    }
  }
}
