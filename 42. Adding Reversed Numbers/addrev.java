import java.util.*;
import java.io.*;
public class REvAdd
{
    public static int reverse(int n)
    {
        int k=0;
        while(n!=0)
        {k=k*10+n%10;
            n=(n/10);
        }
        return k;
    }
   public static void main(String arg[])throws IOException
   {
       Scanner a=new Scanner(System.in);
int i; 
int s;
int m;
s=a.nextInt();
int h[]=new int[s];
for(i=0;i<s;i++)
{
    int aa=a.nextInt();
    int bb=a.nextInt();
    int aaa=reverse(aa);
    int bbb=reverse(bb);
    int j=reverse(aaa+bbb);
    h[i]=j;
}
for(i=0;i<s;i++)
{System.out.println(""+h[i]);}
}
}
