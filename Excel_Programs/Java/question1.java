//Reverse of array
import java.util.*;
class question1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to be entered : ");
        int n = sc.nextInt();
        int ars[] = new int[n];
        int revs[] = new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter a number : ");
            ars[i] = sc.nextInt();
        }
        System.out.println("Elements entered in the array are : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(ars[i]+" ");
        }
        System.out.println();
        for(int i =0;i<n;i++)
        {
            revs[i] = ars[n-i-1];
        }
        System.out.println("The reverse of the array = ");
        for(int i =0; i<n;i++)
        {
            System.out.print(revs[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}