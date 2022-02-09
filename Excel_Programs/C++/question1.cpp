//Reverse of array
#include<iostream>
using namespace std ;

int main()
{
    int n;
    cout<<"Enter the number of elements to be entered : ";
    cin>>n;
    int arr[n];
    int arr2[n];
    for(int i =0; i<n;i++)
    {
        cout<<"Enter a number : ";
        cin>>arr[i];
    }
    cout<<"The elements entered in the array \n";
    for(int i=0;i<n;i++)
    {
        cout<<arr[i];
        cout<<" ";
    }
    cout<<"\n";
    for(int i=0;i<n;i++)
    {
        arr2[i] = arr[n-i-1];
    }
    cout<<"The reverse of the array : ";
    for (int i =0;i<n;i++)
    {
        cout<<arr2[i];
        cout<<" ";
    }
    cout<<"\n";

    return 0;

}