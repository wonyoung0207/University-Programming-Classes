import turtle

list = [3,4,5,6]

i=0

for i in range(0,4,1):

    for j in range(list[i]):

        kak = 360 / list[i]
    
        turtle.right(kak)    
        turtle.forward(100)
        
    i = i + 1
