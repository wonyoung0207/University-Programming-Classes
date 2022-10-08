a = [1,2,3,4,5]
print("a = ",a)
print("인덱스 3전까지 값들을 출력 a[:3] = ",a[:3])
print("맨 마지막 인덱스를 출력 a[-1] = ",a[-1])
print("배열에서 인덱스 1부터 3전까지의 값들을 출력a[1:3] = ",a[1:3])
print("인덱스 3부터 마지막까지 출력 a[3:] = ",a[3:])

print("=================================================================")


a = []
print("빈 배열 a생성",a)

a.append(1)
a.append(2)
print("append 이용",a)

a.extend([3,4,5])
print("extend 이용",a)

b = [6,7,8]
c=a+b
print("배열 a와b 연산으로 더하기",c)

a.insert(0,0)
print("insert이용해서 0번째 인덱스에 0값 삽입",a)

a.remove(1)
print("remove이용해서 1값 지우기",a)

a.pop()
print("pop그냥 써줬을경우 마지막 원소 5 제거",a)

a.pop(1)
print("pop에 지우고 싶은 값의 인덱스 써줫을경우 해당 인덱스값 삭제",a)

print("index이용해서 3값이 몇번쨰 인덱스에 있는지 확인 ",a.index(3))

a.insert(1,18)
a.insert(2,45)
a.insert(5,30)
print("다시 insert이용해서 배열 a 새롭게 생성 ",a)

a.reverse()
print("reverse이용해서 배열 뒤집기 ",a)

a.sort()
print("sort이용해서 오름차순으로 정렬 ",a)

a.sort(reverse = True)
print("sort(reverse = True) 이용해서 내림차순으로 정렬",a)

a = [100,123,100,123,100,123,123,123]
print("새로운 배열 a 생성 ",a)
print("a배열에 100 이 몇개 들어가있는지 확인 ",a.count(100))
print("a배열에 123 이 몇개 들어가있는지 확인 ",a.count(123))
print("=================================================================")
won = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
print("won = ",won)
print("다차원배열 생성후 1-2번째 인덱스값 가져오기 ",won[1][2])
print("=================================================================")
a = (1,2,3,4,5)
print("튜플과 리스트 차이점 -> 1.대괄호vs소괄호 2.데이터 삽입삭제 가능vs 불가능")
print("튜플배열 a의 타입 알아보기 ",type(a))
print("튜플 배열 a 생성",a)

