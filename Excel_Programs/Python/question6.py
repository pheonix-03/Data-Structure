n=int(input("Enter number of elements to be entered : "))
arr=[]
arr2=[]
for i in range(n):
    arr.append(int(input("Enter a number : ")))
arr.sort()
n=int(input("Enter number of elements to be entered : "))
for i in range(n):
    arr2.append(int(input("Enter a number : ")))
arr2.sort()
print(arr)
print(arr2)
c=0
for i in range(len(arr)):
    for j in range(len(arr2)):
        if arr[i]==arr2[j]:
            c+=1
print("The value of intersetion =",c)
x= (len(arr)-c)+(len(arr2)-c)+c
print("the value of union =",x)

