import java.util.*;
class SalmanFaizi
{
    void Compute()
    {
        Scanner sc=new Scanner(System.in);
        // String quotient=new String();
        // String rem=new String();
        // String Final_data=new String();
        // int Final_data;
        // String Fianl_data2=new String();



        System.out.println("Enter data: ");
        int data=Integer.parseInt(sc.nextLine(),2);

        System.out.println("Enter Divisor: ");
        int divisor=Integer.parseInt(sc.nextLine(),2);

        // if(divisor!=0)
        // {
        // }
        // else 
        // {
        //     System.out.println("\ndivisor can't be zero!");
        // }


          String quotient = Integer.toBinaryString((data^=divisor));
          String  rem = Integer.toBinaryString((data^=divisor));

            System.out.println("\nquotient is: "+quotient+" and remainder is: "+rem);


// String x1=new String();
// String y1=new String();
// int x_bin;
// int x_bin2;
// String convert=new String();

//         x1=String.valueOf(data);
//          x_bin=Integer.parseInt(x1);
//         y1=String.valueOf(divisor);
//          x_bin2=Integer.parseInt(y1);
//         Final_data =x_bin+x_bin2;
//         convert=Integer.toBinaryString(Final_data);

//         //  Fianl_data2=Integer.toBinaryString(x);
//         // Final_data =data+divisor;
//         // System.out.println(String.valueOf(data));
//         // System.out.println(String.valueOf(divisor));
//         // System.out.println(divisor);
//         System.out.println("Final data is : "+convert);








    }
}
public class crc2
{
    public static void main(String args[])
    {
        SalmanFaizi obj=new SalmanFaizi();
        obj.Compute();
    }
}