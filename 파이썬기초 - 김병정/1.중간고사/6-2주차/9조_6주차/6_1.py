s = 0

for i in range(1,37):
    
    if i == 37:
        break
    elif i == 1:
        s = s + 1
        print(i , end=" ")
    elif i%3 == 0:
        s = s + i
        print("+ ", i , end=" ")
    else:
        continue
    

print(" = " ,s)
