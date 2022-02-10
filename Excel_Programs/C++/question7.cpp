#include<iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter the number of elements to be entered : ";
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cout<<"Enter a number : ";
        cin>>arr[i];
    }
    int temp;
    for(int i=0,j=n-1;i<n;i++)
    {
        temp= arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
        for(int i =0; i<n;i++)
        {
            cout<<arr[i]<<" ";
        }
        cout<<"\n";
    }
    cout<<"\n";
    for(int i =0; i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
}