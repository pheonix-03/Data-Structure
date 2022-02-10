#include<iostream>
using namespace std;
int main()
{
    int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    int n = sizeof(arr)/4;
    int x = 0,c = 0;
    while(x<n-1)
    {
        x +=arr[x];
        c++;
    }
    cout<<c<<"\n";
    
}