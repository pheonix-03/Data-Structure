#Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
import numpy as np
n = int(input("Enter the number of numbers to be entered : "))
arr = []
for i in range(n):
    arr.append(int(input("Enter a number : ")))
arr.sort()
k = int(input("Enter the value of k : "))
print("The max value of kth position is :",arr[n-k])
print("The min value of kth position is :",arr[k-1])

