import sys

a = [8,7,3,2,9,4,1,6,5]
temp = a[0]

for i in range(8):
          if(temp < a[i+1]):
                    temp = a[i+1]
print("최댓값 : ",temp)

for i in range(8):
          if(temp > a[i+1]):
                    temp = a[i+1]
print("최솟값 : ",temp)
