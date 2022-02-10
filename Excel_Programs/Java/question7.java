import java.util.*;
class question7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements to be entered : ");
        n = sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter a number : ");
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0,j=n-1;i<n;i++)
        {
            temp= arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            
        }
        System.out.println();
        for(int i =0; i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
