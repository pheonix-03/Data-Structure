import java.util.*;
class question6
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,temp;
        System.out.println("Enter the number of elements to be entered in the array :");
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            System.out.println("Enter a number : ");
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println();
        System.out.print("Enter the number of elements to be entered in the array :");
        n=sc.nextInt();
        int arr2[]=new int[n];
        for(int i =0;i<n;i++)
        {
            System.out.print("Enter a number : ");
            arr2[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(arr2[i]<arr2[j])
                {
                    temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]= temp;
                }
            }
        }
        System.out.println("The 1st array :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The 2nd array : ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr2[j]==arr[i])
                {
                    count++;
                }
            }
        }
        System.out.println("The intersection number : "+count);
        System.out.println("The union value : "+(((arr.length)-count)+((arr2.length)-count)+count));
    }
}