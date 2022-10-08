
sum = 0
avg = 0

korea  = int(input("국어점수 : "))
math  = int(input("수학점수 : "))
english  = int(input("영어점수 : "))

sum = korea + math + english
avg = sum/3

print("총점 : ",sum)
print("평균 : :",avg)

if avg >= 90:
          print("A등급입니다.")
elif avg >= 80 and avg <= 89:
          print("B등급입니다.")
elif avg >= 70 and avg <= 79:
          print("C등급입니다.:")
else:
          print("다시 도전하세요.")

                
