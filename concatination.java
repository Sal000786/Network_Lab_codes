import java.util.*;
import java.util.Arrays;

public class concatination{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
        String str1[]=new String[5];
        String str2[]=new String[5];
        
        System.out.println("Enter string for str1");
        for(int i=0;i<str1.length;i++)
        {
            str1[i]=sc.nextLine();
        }
        for(int i=0;i<str1.length;i++)
        {
            System.out.print(str1[i]);
        }


        System.out.println("Enter string for str2");
        for(int i=0;i<str2.length;i++)
        {
            str2[i]=sc.nextLine();
        }
        for(int i=0;i<str2.length;i++)
        {
            System.out.print(str2[i]);
        }


        int length=str1.length + str2.length;
        String str3[]=new String[length];
        // int pos=0;
        
        // for(int element=0;element<str1.length; element++)
        // {
        //     str3[pos]=element;
        //     pos++;
        // }
        // for(int element=0;element<str2.length; element++)
        // {
        //     str3[pos]=element;
        //     pos++;
        // }

        System.arraycopy(str1,0,str3,0,str1.length);
        System.arraycopy(str2,0,str3,0,str2.length);
        // System.arraycopy(str3.length);
        System.out.println(Arrays.toString(str3));


    }
}