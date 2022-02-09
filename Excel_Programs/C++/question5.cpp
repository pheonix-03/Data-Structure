// Move all the negative elements to one side of the array 
#include<iostream>
using namespace std;

int main()
{
    int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
    int neg=0,pos=0;
    for(int i=0;i<(sizeof(arr)/4);i++)
    {
        if(arr[i]<0)
        {
            neg++;
        }
        if(arr[i]>0)
        {
            pos++;
        }
    }
    int arrneg[neg],arrpos[pos];
    for(int i =0,j=0,k=0;i<sizeof(arr)/4;i++)
    {
        if(arr[i]<0)
        {
            arrneg[j]=arr[i];
            j++;
        }
        if(arr[i]>0)
        {
            arrpos[k]=arr[i];
            //cout<<arr[i]<<"\n";
            k++;
        }
    }
    int x=0;
    for(int i=0,j=0;i<neg;i++)
    {
        arr[i]=arrneg[i];
    }
    for(int i=0;i<pos;i++)
    {
        arr[i+neg] = arrpos[i];
    }
    for(int i=0;i<sizeof(arr)/4;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<"\n";
    return 100;
}