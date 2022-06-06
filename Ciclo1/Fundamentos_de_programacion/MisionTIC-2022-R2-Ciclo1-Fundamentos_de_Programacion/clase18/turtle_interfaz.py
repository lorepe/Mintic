import turtle
tortuga=turtle
#https://docs.python.org/3/library/turtle.html#
# window=turtle.Screen()
# flecha=turtle.Turtle()

# flecha.forward(100)
# flecha.left(90)
# flecha.forward(100)
# flecha.left(90)
# flecha.forward(100)
# flecha.left(90)
# flecha.forward(100)

# window.exitonclick()#para que no se cierre apenas haga la accion 

# window=turtle.Screen()
# flecha=turtle.Turtle()
tortuga.setup(800,600,0,0)#cvmdflkbm
tortuga.screensize(800,600)
tortuga.title("Nombre ventana--")
tortuga.bgcolor('black')
tortuga.color('red','blue')
tortuga.shape('turtle')
for  i in range(4):
    tortuga.forward(100)
    tortuga.left(90)
tortuga.showturtle()
tortuga.Screen().exitonclick()
# window.exitonclick()