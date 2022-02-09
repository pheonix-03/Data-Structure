// max and min in array 
import java.util.*;
class question2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int max=0,min,n;
        System.out.print("Enter the number of elements to be entered : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0 ; i<n;i++)
        {
            System.out.print("Enter a number : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The number entered in the array : ");
        for(int i =0 ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        min =arr[0];
        System.out.println();
        for(int i =0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("The max element in the array : "+max);
        System.out.println("The min element in the array : "+min);
        sc.close();
    }
}
