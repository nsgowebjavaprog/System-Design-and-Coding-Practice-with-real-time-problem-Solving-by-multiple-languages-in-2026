def _2nd_large_ele(arr):
    larger = arr[0]
    sec_larger = -1
    
    for i in arr:
        if i > larger:
            sec_larger = larger
            larger = i
        elif i > sec_larger and i != larger:
            sec_larger = i
    return sec_larger

print(_2nd_large_ele([1,4,7,9,18,4,3,2]))            