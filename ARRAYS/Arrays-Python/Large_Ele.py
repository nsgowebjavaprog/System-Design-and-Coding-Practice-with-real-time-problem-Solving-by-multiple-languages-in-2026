def large_ele(arr):
    largest_ele = arr[0]
    for i in arr:
        if i > largest_ele:
            largest_ele = i
    return largest_ele

print(large_ele([1,2,3,4,5,44,3,4,5,6,78]))        