
import turtle
tortuga=turtle
tortuga.setup(800,600,0,0)
tortuga.screensize(800,600)
tortuga.title('Prueba interfaz grafica')

def cuadro(x,y):
    
    tortuga.fillcolor('yellow')
    tortuga.begin_fill()
    tortuga.penup()
    tortuga.goto(x-5, y-5)
    tortuga.pendown()
    tortuga.got(x+5,y+5)
    tortuga.got(x+5,y+5)
    tortuga.got(x-5,y+5)
    tortuga.got(x-5,y-5)
    tortuga.penup()
    tortuga.end_fill()

tortuga.hideturtle()
tortuga.penup()
tortuga.onscreenclick(cuadro,3)#boton3 es el click derecho
tortuga.mainloop()