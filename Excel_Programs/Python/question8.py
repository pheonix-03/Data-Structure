n= int(input("Enter the number of element to be entered : "))
arr = []
for i in range(n):
    arr.append(int(input("Enter a number : ")))
s=0
for i in range(n):
    s+=arr[i]
print(s)