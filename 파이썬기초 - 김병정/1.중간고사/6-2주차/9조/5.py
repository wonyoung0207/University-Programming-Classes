import turtle

#list = [3,4,5,6]

i=0
j = 3
k = 0

while i<4:

    while j<=6:

        k = 0

        kak = 360 / j

        while k<j:
    
            turtle.right(kak)    
            turtle.forward(100)

            k = k + 1

        j = j + 1
        
    i = i + 1
