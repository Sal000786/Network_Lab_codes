// Sender Side
import java.util.*;
import java.net.*;
import java.util.Scanner;
class Salman
{
    void Compute() throws Exception{
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter frames to be sent: ");
        int frames=sc.nextInt();
        Socket ss=new Socket("121.0.0.1",5555);
        PrintStream myps=new PrintStream(myps.getInputStream());

        for(int i=0;i<=frames;i++)
        {
            if(i==frames)
            {
                myps.println("Exit");
                break;
            }
        

            System.out.println("Frame no "+i+" is sent");

            myps.println(i);
            BufferedReader bf=new BufferedReader(new InputStreamReader(myps.getInputStream()));
            String ack=new bf.readLine();
            if(ack!=null)
            {
                System.out.println("Acknowledge was received from the receiver");
                i++;
                Thread.sleep(4000);
            }
            else

            {

                myps.println(i);

            }
        }
    }
    }
}
public class  Stop_wait_protocol2
{
    public static void main(String args[]) throws Exception{
    {
        Salman obj=new Salman();
        obj.Compute();
    }
    }
}