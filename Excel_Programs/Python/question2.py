n = int(input("Enter the number of elements to be entered : "))
arr=[]
for i in range(n):
    arr.append(int(input("Enter a number : ")))
max=0
min=arr[0]
for i in range(n):
    if max<arr[i]:
        max=arr[i]
    if min>arr[i]:
        min=arr[i]
print("The max number in the array :",max)
print("The min number in the array :",min)
