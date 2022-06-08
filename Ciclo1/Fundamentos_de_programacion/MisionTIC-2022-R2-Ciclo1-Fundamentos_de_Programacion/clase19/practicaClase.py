import turtle

tortuga=turtle
tortuga.setup(800,600,0,0)
tortuga.screensize(800,600)
tortuga.title('Prueba interfaz grafica')

tortuga.shape('turtle')
tortuga.color('violet','yellow')
tortuga.bgcolor('blue')

tortuga.begin_fill()
for i in range(3):
    tortuga.forward(100)
    tortuga.left(120)
tortuga.end_fill()

tortuga.hideturtle()
tortuga.Screen().exitonclick()