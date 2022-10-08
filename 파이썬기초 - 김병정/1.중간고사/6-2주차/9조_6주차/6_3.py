
for i in range(100):

    kor = int(input("국어 점수 입력 : "))
    math = int(input("수학 점수 입력 : "))
    eng = int(input("영어 점수 입력 : "))

    if (kor<=60 or math<=60 or eng<=60):
        print("불합격\n")
        continue
    else:
        print("총점 : " , kor+math+eng)
        break
    
