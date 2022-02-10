arr = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
n=len(arr)
print(n)
x=0
c=0
while(x<n-1):
    x += arr[x]
    #print(x)
    c+=1
print(c)