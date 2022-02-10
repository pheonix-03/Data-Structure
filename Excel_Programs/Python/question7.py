import numpy as np
n = int(input("Enter the number of elements to be entered : "))
arr = []
for i in range(n):
    arr.append(int(input("Enter a number : ")))
arr=np.array(arr)
temp=0
for i in range(n):
    temp= arr[i];
    arr[i]=arr[n-1];
    arr[n-1]= temp;
print(arr)
