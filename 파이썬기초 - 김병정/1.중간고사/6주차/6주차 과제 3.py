import turtle as t
dig = 0 #각도 변수

t.speed(5)

for i in range(3,7,1):
         dig = 360 / i

         for j in range(i):
                   t.forward(100)
                   t.left(dig)
         
t.write(t.position())
t.done()

          
          
