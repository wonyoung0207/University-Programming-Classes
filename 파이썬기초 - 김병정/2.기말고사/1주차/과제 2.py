##펙토리얼 구하기
def factorial(num):
    for i in range(1,n):
        num *= i
    return num

n = int(input("n factorial 값을 구하기 위한 정수 n 을 입력하세요 : "))

print(n,"!"," = ",factorial(n))
