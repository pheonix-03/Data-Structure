import java.util.*;
class question11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of numbers to be entered : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        int x=0,re=0;
        for(int i = 0; i<n;i++)
        {
            int c=0;
            for(int j = 0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>1)
            {
                x=c;
                re=arr[i];
            }
        }
        System.out.println(re+" "+x);
        sc.close();
    }
}
