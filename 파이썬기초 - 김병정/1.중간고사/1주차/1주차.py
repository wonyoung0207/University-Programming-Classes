import turtle as a

a.shape("circle")
a.bgcolor("black")
a.speed(0)
a.color("green")

for i in range(100) :
          a.forward(i)
          a.left(40)

a.color("blue")
a.penup()
a.goto(0,0)
a.pendown()

a.begin_fill()
a.right(150)
a.forward(300)

a.left(110)
a.forward(200)

a.left(110)
a.forward(300)

a.end_fill()
a.hideturtle();
turtle.done()





