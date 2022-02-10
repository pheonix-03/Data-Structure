#include<iostream>
using namespace std;
int main()
{
    int arr[] = {6, 12, 9, 13, 17};
    int n= sizeof(arr)/4;
    int k;
    cout<<"Enter value of k : ";
    cin>>k;
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

    
    cout<<"\n"<<(max-min);
}