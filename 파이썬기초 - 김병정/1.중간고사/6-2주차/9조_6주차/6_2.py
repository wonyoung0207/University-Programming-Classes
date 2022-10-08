#3,6,9각형 break와 continue

import turtle


i=0


for i in [3,4,5,6,7,8,9]:

    if i % 3 == 0:
        
        kak = 360 / i

        for j in range(i):
            turtle.right(kak)   
            turtle.forward(100)
    else:
        continue
