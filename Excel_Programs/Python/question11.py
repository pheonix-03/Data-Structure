n=int(input("Enter the number of elements to be entered : "))
arr=[]
for i in range(n):
    arr.append(int(input("Enter a number : ")))
x=0
re=0

for i in range(len(arr)):
    c=0
    for j in range(len(arr)):
        if arr[i] == arr[j]:
            c+=1
    if(c>1):
        x=c
        re=arr[i]
print(re," ",x)
