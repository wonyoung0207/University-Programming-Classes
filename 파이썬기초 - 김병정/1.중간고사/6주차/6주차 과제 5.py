import turtle as t
import math

 #각도 변수

t.speed(5)
i = 3



while i <= 6:
          dig = 0
          dig = 360 / i
          j = 0
          
          

          while j <= i:
                   t.forward(100)
                   t.left(dig)
                   j+= 1
          t.penup()
          t.goto(0,0)
          t.pendown()      
          
          i += 1

          
         
t.write(t.position())
t.done()

          
          
