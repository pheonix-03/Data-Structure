//Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
import java.util.*;
class question3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be entered");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp;
        for (int i =0;i<n;i++)
        {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements entered into the array : ");

        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.println("The Kth max element in the array = "+arr[n-k]);
        System.out.println("The Kth min element in the array = "+arr[k-1]);
        System.out.println();

        sc.close();


    }
}
