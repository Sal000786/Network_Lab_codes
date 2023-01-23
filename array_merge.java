import java.util.*;
class salman{
    void Compute()
    {
        int arr1[]={10,20,30};
        int arr2[]={40,50,60};
        int final_array[]=new int[arr1.length+arr2.length];
        // for (int i=0;i<arr1.length;i++)
        // {
        //     final_array[i]=arr1[i];
        // }
        // for (int i=arr1.length+1;i<arr2.length;i++)
        // {
        //     final_array[i]=arr2[i];
        // }
        System.out.println("printing array values  after marging: ");
        // for (int i=0;i<final_array.length;i++)
        // {
        //    System.out.print(final_array[i]);
        // }

        System.arraycopy(arr1, 0, final_array, 0, arr1.length); 
        System.arraycopy(arr2, 0, final_array, arr1.length, arr2.length); 
  
        // prints the resultant array 
        System.out.println(Arrays.toString(final_array));

    }
}
class array_merge{
    public static void main(String args[])
    {
        salman obj=new salman();
        obj.Compute();
    }
}