import java.util.*;
class question10 
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n = arr.length;
        int x = 0,c = 0;
        while(x<n-1)
        {
            x +=arr[x];
            c++;
        }
        System.out.println(c);
    }
}
