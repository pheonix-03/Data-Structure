arr = [6, 12, 9, 13, 17]
max=0
min=arr[0]
for i in range(len(arr)):
    if(min>arr[i]):
        min=arr[i]
    if(max<arr[i]):
        max=arr[i]
print(max-min)