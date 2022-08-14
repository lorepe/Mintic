#Ejemplos listas compuestas
bdFrutas = [
    ['Pera',1200,'Importada',56],
    ['Manzana',780,57],
    ['Borojó',800,57], 
    ['Uva',4000,'Importada',51, ['Olímpica','Abastos'] ],       
    ['Mango',1100,57,'Nacional'],
    ['Importado','Banano',2000,59],
    [2000,'Feijoa',57, ['Exito'] ],
    [57,'Mandarina',600,['Mercasa','Inter','Carulla']],
    ['Kiwi','No tengo valores'],
    [1800]
]

#Recorrer la base de datos con subíndices
# for i in range(len(bdFrutas)):
#     print(f"{i+1}) Nombre Fruta: {bdFrutas[i][0]} Precio = {bdFrutas[i][1]}")

#Recorrer la base de datos con cantidad dinámica de atributos con subíndices
# for i in range(len(bdFrutas)):
#     cadenaSalidaFruta = str()
#     cadenaSalidaFruta += f"Fruta {i+1}) "
#     for j in range(len(bdFrutas[i])):        
#         cadenaSalidaFruta += f"Atributo{j+1}: {bdFrutas[i][j]}, "
#     print(cadenaSalidaFruta)

# #Recorrer la base de datos (sin subíndices)
# for fruta in bdFrutas:    
#     for atributo in fruta:
#         print(atributo,end=' ')
#     print()

#Recorrer la base de datos (minimizando subíndices)
for i,fruta in enumerate(bdFrutas):
    cadenaSalidaFruta = str()
    cadenaSalidaFruta += f"Fruta {i+1}) "
    for j,atributo in enumerate(fruta):
        cadenaSalidaFruta += f"Atributo{j+1}: {atributo}, "
    print(cadenaSalidaFruta)

#Recordando las funciones de actualización de las listas:
# Definir una función que tome la base de datos y para cada elemento filtre el número
# de cadenas de caracteres, resultando en que cada fruta tenga únicamente un 
# atributo tipo string.

#Algoritmo:
# 1) Para cada fruta de la base de datos:
# 2)  Para cada atributo de la fruta:
# 3)      Si el atributo es tipo string:
# 4)           Si no se han incluído aún atributos tipo string:
# 5)              Incorporar el atributo
# 5)      De lo contrario:
# 6)          Incorporar el atributo

#Traducción a Python

# #Modificación de la base de datos
# for i,fruta in enumerate(bdFrutas):
#     contadorCadenas = 0
#     nuevaVersionFruta = list()
#     for atributo in fruta:
#         if isinstance(atributo,str):
#             if contadorCadenas == 0:
#                 nuevaVersionFruta.append(atributo)
#                 contadorCadenas += 1
#         else:
#             nuevaVersionFruta.append(atributo)
#     bdFrutas[i] = nuevaVersionFruta

def atributoStringUnico(bd):
    for i,fruta in enumerate(bd):
        contadorCadenas = 0
        nuevaVersionFruta = list()
        for atributo in fruta:
            if isinstance(atributo,str):
                if contadorCadenas == 0:
                    nuevaVersionFruta.append(atributo)
                    contadorCadenas += 1
            else:
                nuevaVersionFruta.append(atributo)
        bd[i] = nuevaVersionFruta
        return bd


#Sección principal
atributoStringUnico(list(bdFrutas))
#atributoStringUnico(bdFrutas.copy())

#Recorrer la base de datos (minimizando subíndices)
print('-----------------------------')
for i,fruta in enumerate(bdFrutas):
    cadenaSalidaFruta = str()
    cadenaSalidaFruta += f"Fruta {i+1}) "
    for j,atributo in enumerate(fruta):
        cadenaSalidaFruta += f"Atributo{j+1}: {atributo}, "
    print(cadenaSalidaFruta)

#Propuesto -> Metodologías propuestas en clase para el requerimiento (eliminación)


