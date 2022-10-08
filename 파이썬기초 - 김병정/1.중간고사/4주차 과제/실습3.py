import math

r = int(input("원의 반지름 입력하세요 : "))
s = math.pi * r**2
l = 2*math.pi*r
v = 4/3*(math.pi*r**3)

print("원의 넓이는 s = ",s,"\n원의 둘래는 l = ", l, "\n구의 부피는 v = ",v)
