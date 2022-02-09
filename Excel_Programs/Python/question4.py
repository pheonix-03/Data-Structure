#Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
import numpy as np
arr = np.array([0,2,1,2,0])
count0=0
count1=0
count2=0

for i in range(5):
    if(arr[i]==0):
        count0 +=1
    if(arr[i]==1):
        count1 +=1
    if(arr[i]==2):
        count2 +=1
for i in range(count0):
    arr[i]=0
for i in range(count0,(count0+count1),1):
    arr[i]=1
for i in range((count0+count1),(count0+count1+count2),1):
    arr[i]=2
for i in range(5):
    print(arr[i],end=' ')
print()
