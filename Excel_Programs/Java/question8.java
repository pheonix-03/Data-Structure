import java.util.*;
class question8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter the number of elements to be entered : ");
        n= sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++)
        {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
