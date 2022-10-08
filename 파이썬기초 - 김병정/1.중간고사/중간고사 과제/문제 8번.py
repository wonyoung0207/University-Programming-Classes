i = 1
num = 2
cnt = 0

while(i < 100):
          print(i,"번 접으면",num," mm")
          num *= 2
          i = i+1
          if(num > 100000):
                    cnt = i
                    break
print("횟수 : ",cnt," ","두께 : ",num)
