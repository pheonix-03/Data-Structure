#include<iostream>
using namespace std;
 int main()
 {
     int n;
     cout<<"Enter the number of elements to be entered : ";
     cin>>n;
     int arr[n];
     for(int i =0;i<n;i++)
     {
        cout<<"Enter a number : ";
        cin>>arr[i];
     }
     cout<<"\n";
     int x=0,re=0;
        for(int i = 0; i<n;i++)
        {
            int c=0;
            for(int j = 0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>1)
            {
                x=c;
                re=arr[i];
            }
        }
        cout<<"\n"<<re<<"  "<<x<<"\n";
 }