alto = float(input())
ancho = float(input())
profundo = float(input())
volumen = alto * ancho * profundo
costo = volumen*5
if(alto>30):
    costo + 2000.0
if(costo >1000.0):
    costo + (costo*0.19)
print(volumen)
print(costo)

 