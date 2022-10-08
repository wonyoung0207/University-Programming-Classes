i = 1
s = 0 ## 짝수
n = 0 ## 홀수
while i <= 100:
    if(i % 2 == 0):
        s += i
        
    elif(i % 2 != 0):
        n += i
        

    i = i+1
print("짝수 합",s,end = " ")
print("홀수 합",n,end = " ")
