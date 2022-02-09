// max and min element in array
#include<iostream>
using namespace std;

int main()
{
    int n,max,min;
    cout<<"Enter the number of elements to be entered : ";
    cin>>n;
    int arr[n];
    for(int i =0;i<n;i++)
    {
        cout<<"Enter a number : ";
        cin>>arr[i];
    }
    min=arr[0],max=0;
    for (int i =0; i<n;i++)
    {
        if(max<arr[i])
        {
            max= arr[i];
        }
        if(min>arr[i])
        {
            min=arr[i];
        }
    }
    cout<<"The max number in the array : "<<max<<"\n";
    cout<<"The min number in the array : "<<min<<"\n";
}