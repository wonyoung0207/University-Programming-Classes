import math


def printResult(v):
    print("함수의 부피는 : ",v,"입니다.")
    
def getVolume(h,r):
          v = (1/3)*(math.pi)*(r**2)*h
          return v
    
h = int(input("높이를 입력하세요"))
r = int(input("반지름을 입력하세요"))

printResult(getVolume(h,r))

