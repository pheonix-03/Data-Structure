class question9 
{
    public static void main(String[] args) 
    {
        int arr[] = {6, 12, 9, 13, 17};
        int n=arr.length;
        int min=arr[0];
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min= arr[i];
            }
            if(max<arr[i])
            {
                max= arr[i];
            }
        }
        System.out.println(max-min);
    }    
}
