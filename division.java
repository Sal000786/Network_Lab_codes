import java.util.*;
public class division{

     public static void main(String []args)
     {
        Scanner scan = new Scanner(System.in);

        String quotient=new String();
        String remainder=new String();
        String Final_new=new String();
        String Final_new3=new String();
        String quotient1=new String();
        String remainder1=new String();

        System.out.println("Enter dividend: ");
        
        /*Iteger.parseInt() method will convert the string value to 
            the integer by treating them as a binary number*/
        
        int dividend = Integer.parseInt(scan.nextLine(),2);
        System.out.println("\nEnter divisor: ");
        int divisor = Integer.parseInt(scan.nextLine(),2); 
        System.out.println("divisor is : "+Integer.toBinaryString( divisor));   
        if(divisor!=0)
        {
           quotient = Integer.toBinaryString((( dividend)=^Integer.toBinaryString( divisor)));
             remainder = Integer.toBinaryString((( dividend)%Integer.toBinaryString( divisor)));
            System.out.println("\nquotient is: "+quotient+" and remainder is: "+remainder);
        }
        else 
        {
            System.out.println("\ndivisor can't be zero!");
        }
    System.out.println("divident"+Integer.toBinaryString(dividend));
    System.out.println("divisor"+Integer.toBinaryString(divisor));
    System.out.println("remainder: "+remainder);

    //  Final_new=dividend+remainder;
     Final_new=Integer.toBinaryString(dividend)+remainder;
    //  int Final_new2=Integer.parseInt(Final_new,2);
    //   Final_new3=Integer.toBinaryString(Final_new2);
    System.out.println("final data"+Final_new);
    System.out.println("Enter the data to be sent: ");

    int Final_new4=Integer.parseInt(scan.nextLine(),2);


    System.out.println("Final_new2 data is : "+Final_new4);

    if(divisor!=0)
        {
             quotient1 = Integer.toBinaryString((Final_new4/divisor));
             remainder1 = Integer.toBinaryString((Final_new4%divisor));
            System.out.println("\nquotient is: "+quotient1+" and remainder is: "+remainder1);
        }
        else 
        {
            System.out.println("\ndivisor can't be zero!");
        }


}
}