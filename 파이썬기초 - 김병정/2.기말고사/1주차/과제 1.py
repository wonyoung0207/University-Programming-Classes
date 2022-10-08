value = 0
def calc(num1,num2,act):
          if(act == "-"):
                    value = (num1 - num2)
          elif(act == "*"):
                    value = (num1 * num2)
          elif(act == "/"):
                    value = (num1 / num2)
          else:
                    value = (num1 + num2)

          return value

num1 = int(input("첫 번째 정수를 입력하세요 :"))
num2 = int(input("두 번째 정수를 입력하세요 :"))
act = input("+,_,*,/ 중 기호 선택하시오 :")

print("두 정수에 대한 연산",num1,act,num2,"의 결과는 ",calc(num1,num2,act),"입니다.")
