
def plus(a,b):  ##덧셈
    c = a + b  
    pl = c
    return pl

def mult(a,b):  ##곱셈
    c = a * b
    mu = c
    return mu
    
def div(a,b):   ##나눗셈
    c = a / b
    di = c
    return di

def sub(a,b):   ##뺄셈
    c = a - b
    su = c
    return su

def double(a,b): ##제곱
    c = a**b
    do = c
    return do
    
def all(a,b,value):
    if(value == "+"):
        print("덧셈 =>",a,"+", b , " = " ,plus(a,b))
    elif(value == "/"):
        print("나눗셈 => ",a,"/",b," = ",div(a,b))
    elif(value == "*"):
        print("곱셈 => ",a,"*",b," = ",mult(a,b))
    elif(value == "-"):
        print("뺄셈 => ",a,"-",b," = ",sub(a,b))
    elif(value == "^"):
        print("제곱 => ",a,"^",b," = ",double(a,b))
    else:
        print("없는 기호입니다. 다른 기호를 입력해주세요!!")
    
    
