import turtle
tortuga=turtle
tortuga.setup(800,600,0,0)
tortuga.screensize(800,600)
tortuga.title('Prueba interfaz grafica')
tortuga.bgcolor('blue')

tortuga.hideturtle()
def punto(x,y):
    tortuga.goto(x,y)
    tortuga.dot(10,'red')
    tortuga.pendown()

def cuadro(x,y):
    tortuga.fillcolor('yellow')
    tortuga.begin_fill()
    tortuga.penup()
    tortuga.goto(x-5, y-5)
    tortuga.pendown()
    tortuga.goto(x+5,y-5)
    tortuga.goto(x+5,y+5)
    tortuga.goto(x-5,y+5)
    tortuga.goto(x-5,y-5)
    tortuga.penup()
    tortuga.end_fill()

# tortuga.hideturtle()
tortuga.penup()
tortuga.onscreenclick(punto,1)
tortuga.onscreenclick(cuadro,3)#boton3 es el click derecho
# tortuga.Screen().exitonclick()
tortuga.mainloop()



# tortuga.write('Hola mundo',True,'right',('arial',20,'bold italic'))
# tortuga.write('otra cosa')

nombre=tortuga.textinput('Titulo','¿Cual es su nombre?')
edad=tortuga.numinput('Edad','¿Cual es su edad?',18,0,100)
cordx=tortuga.numinput('Coordenada en x')

# https://github.com/luismescobarf/clasesCiclo1/tree/master/AppTortuga