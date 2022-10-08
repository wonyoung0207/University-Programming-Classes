import turtle as t
t.speed(0)
t.shape("circle")
n = -200

for j in range(4):
          t.penup()
          t.goto(n,200)
          t.pendown()
          t.begin_fill()
          t.color("yellow")
          if(j == 3):
                    t.circle(100)
          
          for i in range(5):
                    t.forward(40)
                    t.left(72)
                    t.forward(40)
                    t.right(144)
          n += 150
          t.end_fill()
t.color("brown")
t.penup()
t.goto(-500,-300)
t.pendown()
t.forward(900)
t.penup()
t.goto(-250,-300)
t.pendown()
t.left(90)
t.forward(100)
s = ("red","yellow","brown","pink")
for k in range(100):
          t.color(s[k%4])
          t.forward(k/2)
          t.left(36)
          t.left(2)
          
          
