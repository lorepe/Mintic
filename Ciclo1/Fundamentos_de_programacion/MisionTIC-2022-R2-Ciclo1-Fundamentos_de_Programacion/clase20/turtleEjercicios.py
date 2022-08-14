import turtle
tg=turtle

tg.setup(800,600,0,0)
tg.screensize(800,600)
tg.shape('turtle')
tg.color('blue','green')

def fun():
    tg.write('se presiono la tecla a')

tg.Screen().onkeypress(fun,'a')

def funcionArriba():
    tg.setheading(90)
    tg.forward(10)

def funcionAbajo():
    tg.setheading(270)
    tg.forward(10)

def funcionIzquierda():
    tg.setheading(180)
    tg.forward(10)

def funcionDerecha():
    tg.setheading(0)
    tg.forward(10)

tg.Screen().onkeypress(funcionArriba,'Up')
tg.Screen().onkeypress(funcionAbajo,'Down')
tg.Screen().onkeypress(funcionIzquierda,'Left')
tg.Screen().onkeypress(funcionDerecha,'Right')


tg.Screen().listen()

tg.mainloop()

tg.setheading(0)

