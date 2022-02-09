#Reverse of array
n = int(input("Enter the number of numbers to be entered : "))
arr=[]
arr2=[]
for i in range(n):
    arr.append(int(input("Enter a number : ")))
print()
print("The numbers entered in the array : ")
for i in range(n):
    print(arr[i],end=" ")
print()

for i in range(n):
    arr2.append(arr[n-i-1])

print("The reverse of the array : ")
for i in range(n):
    print(arr2[i],end=" ")
print()