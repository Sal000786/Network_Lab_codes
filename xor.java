import java.util.*;
import java.io.*;
public class xor{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int arr[]={1,0,0,1,0,0,0,0,0,1};
    // System.out.println("enter arr");
    //  for (int i=0;i<arr.length;i++)
    // {
    //    arr[i]=sc.nextInt();
    // }
    //  System.out.println("enter arr2");
    int arr2[]={1,0,1,0,1};
    // for (int i=0;i<arr2.length;i++)
    // {
    //     arr2[i]=sc.nextInt();
    // }
    System.out.println("finished");

    int data[]=new int[arr.length];
    for (int i=0;i<arr.length;i++)
    {
        data[i]=arr[i]^=arr2[i];
    }
     System.out.println("data");
    for (int i=0;i<data.length;i++)
    {
        System.out.print(data[i]);
    }
}
}