#include<iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter the number of elements to be entered : ";
    cin>>n;
    int arr[n];
    int sum=0;
    for(int i =0;i<n;i++)
    {
        cout<<"Enter a number : ";
        cin>>arr[i];
    }
    for(int i=0;i<n;i++)
    {
        sum +=arr[i];
    }
    cout<<sum;
    cout<<"\n";

}