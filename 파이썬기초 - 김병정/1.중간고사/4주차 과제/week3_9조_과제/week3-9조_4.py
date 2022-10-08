import math
#math에 지정되어있는 함수를 사용하기 위해 import 해준다

h = int(input("높이:"))
#변수를  int형으로 높이를 받아서 저장해준다

r = int(input("반지름:"))
#변수를  int형으로 반지름을 받아서 저장해준다

v = 1/3 * math.pi * math.pow(r,2) * h
#부피 계산식을 이용해 변수에 값을 저장해준

print("원뿔의 부피는 :" , v)
#부피를 출력해준다
