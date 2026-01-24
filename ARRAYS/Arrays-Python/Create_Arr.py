'''#
arr1 = [1,2,3,4,5]
print(arr1)

#
arr2 = []
arr2 = list(map(int, input("Enter the Elements:").split()))
print(arr2)
# input() → takes input as string
# .split() → splits by space
# map(int, ...) → converts to integers
# list() → creates array

arr3 = [1] * 5
print(arr3)

arr4 = [1,2,3,4,5]


arr4[0]        # first element
arr4[-1]       # last element
arr4[1:4]      # slicing

arr4.append(10)
print(arr4)

arr4.extend([11,22,33,44])
print(arr4)

arr4.append(10)           # add at end
arr4.insert(2, 99)        # insert at index
arr4.extend([7, 8, 9])    # add multiple elements
print(arr4)

arr4.pop()
print(arr4)

arr4.pop()                # remove last
arr4.pop(2)               # remove by index
arr4.remove(33)           # remove by value
# arr4.clear()              # remove all
'''
arr4 = [1,2,3,4,5]
print(arr4.index(4))            # index of element
print(5 in arr4)                # membership check (O(n))
print(arr4.count(1))            # frequency of element