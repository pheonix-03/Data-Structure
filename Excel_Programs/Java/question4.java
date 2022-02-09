//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
class question4 
{
    public static void main(String[] args) 
    {
        int arr[] = {0,2, 1, 2,0};

        int count0 =0;
        int count1 =0;
        int count2 =0;

        for (int i = 0;i<5;i++)
        {
            if(arr[i]==0)
            count0 ++;
            if(arr[i]==1)
            count1 ++;
            if(arr[i]==2)
            count2 ++;
        }
        //System.out.println(count0+" "+count1+" "+count2);
        for(int j=0;j<count0;j++)
        {
            arr[j]=0;
        }
        for(int j =count0;j<(count0+count1);j++)
        {
            arr[j]=1;
        }
        for(int j=(count0+count1);j<(count0+count1+count2);j++)
        {
            arr[j]=2;
        }
    
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
