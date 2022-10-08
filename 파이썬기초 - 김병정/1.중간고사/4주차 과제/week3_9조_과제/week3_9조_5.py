import math
#math에 지정되어있는 함수를 사용하기 위해 import 해준다

x1 = int(input("좌표 x1 입력 : "))

y1 = int(input("좌표 y1 입력 : "))

x2 = int(input("좌표 x2 입력 : "))

y2 = int(input("좌표 y2 입력 : "))
#변수에  int형으로 값을 받아준다


x = x1 - x2
#새로운 변수에다가 계산식 중간 과정인 x1 - x2을 계산해준다
y = y1 - y2
#새로운 변수에다가 계산식 중간 과정인 y1 - y2을 계산해준다

ins = math.pow(x,2) + math.pow(y,2)
#루트를 씌우기 전 값을 pow함수를 이용해 계산해준

dis = math.sqrt(ins)
#최종 계산 값을  dis변수에 sqrt 함수를 이용해 루트를 씌워준

print("두 점 사이의 거리 = ", dis)
#최종값을 출력해준
