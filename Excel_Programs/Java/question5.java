// Move all the negative elements to one side of the array 
import java.util.*;
class question5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be entered");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++)
        {
            System.out.print("Enter a number : ");
            arr[i] = sc.nextInt();
        }
        int neg=0,pos=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
                neg++;
            if(arr[i]>0)
                pos++;
        }
        int arrneg[] = new int[neg];
        int arrpos[] = new int[pos];

        for(int i = 0,j=0,k=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                arrneg[j]=arr[i];
                j++;
            }
            if(arr[i]>0)
            {
                arrpos[k]=arr[i];
                k++;
            }
        }
        for(int i=0 ;i<neg;i++)
        {
            arr[i] =arrneg[i];
        }
        for(int i=0;i<pos;i++)
        {
            arr[neg+i]=arrpos[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        sc.close();

    }
}
