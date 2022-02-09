//Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
#include<iostream>
using namespace std;
int main()
{
    int n,temp,k;
    cout<<"Enter the number of elements to be entered : ";
    cin>>n;
    int arr[n];
    for(int i =0;i<n;i++)
    {
        cout<<"Enter a number : ";
        cin>>arr[i];
    }
    cout<<"\nThe numbers enterd in the array : ";

    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if (arr[i]<arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    cout<<"\nenter the value of k : ";
    cin>>k;
    cout<<"\nThe max number of kth position : "<<arr[n-k];
    cout<<"\nThe min number of kth position : "<<arr[k-1];
    cout<<"\n";
    return 100;
}
1 2 3 4