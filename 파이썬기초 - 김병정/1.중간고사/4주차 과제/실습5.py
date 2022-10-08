import math

x1 = int(input("x1을 입력하시오"))
x2 = int(input("x2을 입력하시오"))
y1 = int(input("y1을 입력하시오"))
y2 = int(input("y2을 입력하시오"))

print(x1,x2,y1,y2)

a = math.sqrt(math.pow((x1-x2),2) + math.pow((y1 - y2),2))

print("두점사이의 거리", a)
