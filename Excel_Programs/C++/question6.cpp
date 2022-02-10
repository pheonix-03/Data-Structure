#include<iostream>
using namespace std;
int main()
{
    int n,temp;
    cout<<"Enter the number of elements to be entered in the array :";
    cin>>n;
    int arr[n];
    for(int i =0;i<n;i++)
    {
        cout<<"Enter a number : ";
        cin>>arr[i];
    }
    for(int i =0;i<n;i++)
    {
        for(int j =0;j<n;j++)
        {
            if(arr[i]<arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }
    }
    cout<<"\n";
    cout<<"Enter the number of elements to be entered in the array :";
    cin>>n;
    int arr2[n];
    for(int i =0;i<n;i++)
    {
        cout<<"Enter a number : ";
        cin>>arr2[i];
    }
    for(int i =0;i<n;i++)
    {
        for(int j =0;j<n;j++)
        {
            if(arr2[i]<arr2[j])
            {
                temp=arr2[i];
                arr2[i]=arr2[j];
                arr2[j]= temp;
            }
        }
    }
    cout<<"The 1st array :\n";
    for(int i=0;i<(sizeof(arr)/4);i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<"\n";
    cout<<"The 2nd array : \n";
    for(int i=0;i<(sizeof(arr2)/4);i++)
    {
        cout<<arr2[i]<<" ";
    }
    cout<<"\n";
    int count=0;
    for(int i=0;i<(sizeof(arr)/4);i++)
    {
        for(int j=0;j<(sizeof(arr2)/4);j++)
        {
            if(arr2[j]==arr[i])
            {
                count++;
            }
        }
    }
    cout<<"The intersection number : "<<count<<"\n";
    cout<<"The union value : "<<(((sizeof(arr)/4)-count)+((sizeof(arr2)/4)-count)+count)<<"\n";
}
    // int intersection[count];
    // int unions[count+((sizeof(arr)/4)-count)+((sizeof(arr2)/4)-count)];
    // int x=0;
    // for(int i=0;i<(sizeof(arr)/4);i++)
    // {
    //     for(int j=0;j<(sizeof(arr2)/4);j++)
    //     {
    //         if(arr2[j]==arr[i])
    //         {
    //             intersection[x]=arr[i];
    //             x++;
    //         }
    //     }
    // }
    // cout<<"\n";
    // for(int j=0;j<(sizeof(intersection)/4);j++)
    // {
    //     cout<<intersection[j];
    // }
    // x=0;
    // for(int i=0;i<(sizeof(intersection)/4);i++)
    // {
    //     unions[i]=intersection[i];
    //     x++;
    // }
    // for(int i=0;i<sizeof(unions)/4;i++)
    // {
    //     for(int j=0;j<sizeof(arr)/4;j++)
    //     {
    //         if(unions[i]!=arr[j])
    //         {
    //             unions[x]=arr[j];
    //             x++;
    //         }
    //     }
    //     for(int j=0;j<sizeof(arr2)/4;j++)
    //     {
    //         if(unions[i]!=arr2[j])
    //         {
    //             unions[x]=arr2[j];
    //             x++;
    //         }
    //     }
    // }
    // for(int i =0;i<sizeof(unions)/4;i++)
    // {
    //     for(int j =0;j<sizeof(unions)/4;j++)
    //     {
    //         if(unions[i]<unions[j])
    //         {
    //             temp=unions[i];
    //             unions[i]=unions[j];
    //             unions[j]= temp;
    //         }
    //     }
    // }
    // cout<<"\n";

    // for(int i=0;i<sizeof(unions)/4;i++)
    // {
    //     cout<<unions[i];
    // }
    // return 19;

//}