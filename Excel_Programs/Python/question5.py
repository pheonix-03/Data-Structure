# Move all the negative elements to one side of the array 
import numpy as np
arr = np.array([-12, 11, -13, -5, 6, -7, 5, -3, -6])
print(arr)
neg = 0
pos = 0
arrneg =[]
arrpos =[]
for i in range(len(arr)):
    if arr[i]<0:
        neg+=1
        arrneg.append(arr[i])
    if arr[i]>0:
        pos+=1
        arrpos.append(arr[i])
j=0
#print(arrneg)
#print(arrpos)
for i in range(len(arr)):
    if i<neg:
        arr[i]=arrneg[i]
        #print(i,"neg")
    elif i>=neg:
        arr[i]=arrpos[j]
        #print(i)
        j+=1
print(arr)
