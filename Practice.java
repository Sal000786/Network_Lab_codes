import java.util.*;
class Salman
{
    void Compute()
    {
        int data[]={1,0,0,1,0,0};
        int i,j,k,l;
        System.out.println("Data: ");
        for ( i=0;i<data.length;i++)
        {
            System.out.print(data[i]);
        }
        System.out.println();

        System.out.println("Divisor: ");
        int divisor[]={1,1,0,1};
        for ( i=0;i<divisor.length;i++)
        {
            System.out.print(divisor[i]);
        }
        System.out.println();

        int zeros[]={0,0,0};
        System.out.println("zeros divisor minus 1 bit: ");
            for ( i=0;i<zeros.length;i++)
        {
            System.out.print(zeros[i]);
        }
        System.out.println();

        int array[]=new int[data.length+zeros.length];
        for (j=0;j<data.length;j++)
        {
            array[j]=data[j];
        }
        for ( j=data.length+1;j<zeros.length;j++)
        {
            array[j]=zeros[j];
        }
        System.out.println("Array data on which division will be performed: ");
        for ( j=0;j<array.length;j++)
        {
            System.out.print(array[j]);   
        }
        System.out.println();

        int rem1[]=new int [divisor.length];
        for( k=0;k<data.length;k++)
        {
            if(array[k]==1)
            {
                for ( l=0;l<divisor.length;l++)
                {
                    rem1[l]=array[k+l] ^= divisor[l];

                }
            }
        }

                System.out.print("Crc bit is : ");
            for (l=0;l<divisor.length;l++)
                {
                    System.out.print(rem1[l]);

                }
                System.out.println();




        int Final_data[]=new int[rem1.length+data.length];

        // for (k=0; k<rem1.length;k++)
        // {
        //     Final_data[k]=rem1[k];
        // }
        // for ( j=rem1.length+1; j<Final_data.length;j++)
        // {
        //     Final_data[j]=data[j];
        // }

        //     System.out.println("The final data is : ");
        // for ( j=0;j<Final_data.length;j++)
        // {
        //     System.out.print(Final_data[j]);
        // }
        //     System.out.println();

        System.arraycopy(data, 0, Final_data, 0, data.length); 
        System.arraycopy(rem1, 0, Final_data, data.length, rem1.length); 
  
        // prints the resultant array 
        System.out.println(Arrays.toString(Final_data));



        // Again deviding the final_data array to get the reminder

        int rem2[]=new int [divisor.length];
        for( k=0;k<data.length;k++)
        {
            if(Final_data[k]==1)
            {
                for ( l=0;l<divisor.length;l++)
                {
                    rem2[l]=Final_data[k+l] ^= divisor[l];

                    System.out.println("rem2 is : "+rem2[l]);

                }
            }
        }   

         System.out.print("rem2 : ");
            for (l=0;l<divisor.length;l++)
                {
                    System.out.print(rem2[l]);

                }
                System.out.println();



        
        //     System.out.println("The final data returned after dividing with divisor : ");
        // for (i=0;i<Final_data.length;i++)
        // {
        //     System.out.print(Final_data[i]);
        // }
        //  System.out.println();
         for (i=0;i<divisor.length;i++)
         {
         if(rem2[i]==0)
         {
         System.out.println("data received successfully without any error");
         }
         else{
         System.out.println("data received UN-successfully with  error");

         }
         }

    }
}
public class Practice
{
    public static void main(String args[])
    {
        Salman obj=new Salman();
        obj.Compute();
    }
}
