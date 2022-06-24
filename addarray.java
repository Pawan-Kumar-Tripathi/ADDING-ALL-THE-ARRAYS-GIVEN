import java.util.*;
class addarray 
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" please enter the size of array ");
        int size  = sc.nextInt();
        int arr[] = new int[size];
        int i ,sum=0;
        for(i =0;i<size ;i++)
        {
            System.out.println("Enter the elements of array" );
            arr[i] = sc.nextInt();
            
            sum = sum+arr[i];
            
        }
        System.out.println("The sum is ="+ sum);
    }
}
            