import java.util.*;
import java.util.Arrays;
class salman{
    Scanner sc=new Scanner(System.in);
    void compute()
    {
        // int size,i,j;
        // System.out.println("Enter the size of the array");
        // size=sc.nextInt();
        System.out.println("Enter the first data ");

        int First_data=Integer.parseInt(sc.nextLine(),2)

        // System.out.println("Enter the binary of the data bit by bit");
        // for(i=0;i<size;i++)
        // {
        //     arr_data[i]=sc.nextInt(); 
        // }

        // System.out.println("data bits are");
        // for(i=0;i<size;i++)
        // {
        //     System.out.print(arr_data[i]);
        // }
        System.out.println("First_data is : "+First_data);

        System.out.println("")


        int size2;
        System.out.println("Enter the size of the divisor");
        size2=sc.nextInt();
        int arr_divisor[]=new int[size2];
        System.out.println("Enter the divisor bits one by one");
        for(i=0;i<size2;i++)
        {
            arr_divisor[i]=sc.nextInt();

        }
        System.out.println("divisor bits are");
        for(i=0;i<size2;i++)
        {
            System.out.print(arr_divisor[i]);
        }
            System.out.println();

        System.out.println("Src bits are");
        int src[]=new int[size2-1];
        for(i=0;i<src.length;i++)
        {

            src[i]=0;
        }
            System.out.println();
        for(i=0;i<src.length;i++)
        {
            System.out.print(src[i]);
        }
            System.out.println();


        // String arr_data2[]=new String[arr_data.length];
        // String src2[]= new String[src.length];
        int final_data[]=new int[arr_data.length+(arr_divisor.length-1)];
        System.out.println("loop 1");
        for(i=0;i<arr_data.length;i++)
        {
            final_data[i]=arr_data[i];    
        }
        for(i=arr_data.length+1;i<arr_divisor.length;i++)
        {
            final_data[i]=arr_divisor[i];    
        }
         System.out.println("finished2");
        System.out.println("final data is ");
        for(i=0;i<final_data.length;i++)
        {
            System.out.print(((final_data[i])));
        }
        System.out.println();










        

        int rem1[]=new int[arr_divisor.length];

        if(arr_divisor!=0)
        {
            String quotient = Integer.toBinaryString((arr_data/arr_divisor));
            String remainder = Integer.toBinaryString((arr_data%arr_divisor));
            System.out.println("\nquotient is: "+quotient+" and remainder is: "+remainder);
        }
        else 
            System.out.println("\ndivisor can't be zero!");

        // for(i=0;i<final_data.length;i++)
        // {
        //     rem1[i]=final_data[i] ^= arr_divisor[i];
        // }
        // for(i=0;i<final_data.length;i++)
        // {
        //     System.out.println(rem1[i]);
        // }

        // for(i=0;i<final_data.length;i++)
        // {
        //     if(final_data[i]==1)
        //     {
        //         for(j=0;j<arr_divisor.length;j++)
        //         {
        //            rem1[j]= final_data[i+j] ^= arr_divisor[j];
        //         }
        //     }
        // }
        // System.out.println("The reminder array is=");
        // for(j=0;j<arr_divisor.length;j++)
        // {
        //     System.out.println(rem1[j]);
        // }
        // // int final_data2[]= new int[final_data.length];
        // int final_data2[]=new int[arr_data.length+(rem1.length)];
        // // for(i=0;i<arr_data.length;i++)
        // // {
        // //     final_data2[i]=arr_data[i];
        // // }
        // // for(i=arr_data.length+1;i<arr_divisor.length;i++)
        // // {
        // //     final_data2[i]=rem1[i];
        // // }
        // // System.out.println("The final 2 data is=");
        // // for(i=0;i<final_data2.length;i++)
        // // {
        // //     System.out.println(final_data2[i]);
        // // }
        // System.out.println("Enter the data bit by bit to be sent:-");
        // for(i=0;i<final_data2.length;i++)
        // {
        //     final_data2[i]=sc.nextInt();
        // }
        // System.out.println("The data which is being sent");
        // for(i=0;i<final_data2.length;i++)
        // {
        //     System.out.println(final_data2[i]);
        // }

        




        // int rem2[]=new int[arr_divisor.length];
        //  for(i=0;i<final_data2.length;i++)
        // {
        //     if(final_data2[i]==1)
        //     {
        //         for(j=0;j<arr_divisor.length;j++)
        //         {
        //            rem2[j]= final_data2[i+j] ^= arr_divisor[j];
        //         }
        //     }
        // }
        // System.out.println("The reminder2 array is=");
        // for(j=0;j<arr_divisor.length;j++)
        // {
        //     System.out.println(rem2[j]);
        // }

        // for (i=0;i<rem2.length;i++)
        // {
        //     if(rem2[i]==0)
        //     {
        //     System.out.println("The data is correct......!!");
        //     }
        // }
        // for (i=0;i<rem2.length;i++)
        // {
        //     if(rem2[i]==1)
        //     {
        //     System.out.println("The data is correpted......!!");
        //     }
        // }


        
        // // System.out.println("Enter the data to be sent bit by bit");
        // // int orginal_data[]=new int[size+(size2-1)];
        // // for (i=0;i<orginal_data.length;i++)
        // // {
        // //     orginal_data[i]=sc.nextInt();

        // // }
        // // for (i=0;i<orginal_data.length;i++)
        // // {
        // //     System.out.print(orginal_data[i]);

        // // }
        // // System.out.println();


    }
}
public class crc{
    public static void main(String args[])
    {
        salman obj= new salman();
        obj.compute();
    }
}