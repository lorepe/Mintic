from functools import reduce
def ordenes(rutinaContable):
    
    #va acontener de uno en adelante sin el numero de registro     
    op1=lambda rutinaContable=0:rutinaContable[1:]
    
    #recorre la lista y multiplica la cantidad por el precio unitario 
    op = lambda tupla: tupla[1]*tupla[2]
    op2 = lambda lista : list(map(op,lista))
    
    # suma el total de las tuplas de cada factura
    op3= lambda lista : reduce(lambda acum=0, elem=0: acum+elem,lista)
    
    #mira si el valor de cada factura es menor a 600.000 pesos y le suma 25.000 pesos y lo redondea a 2 decimales
    op4=lambda factura : round(factura+25000,2) if factura<600000 else round(factura,2)
    
    #recorre la lista y guarda el primer elemento, que es el numero de factura
    op5= lambda lista=0: lista[0]
    
    #prepara el retorno
    string=lambda lista=0: "La factura {} tiene un total en pesos de {:,.2f}".format(lista[0],lista[1])
       
    #quitar el codigo de la factura 
    tuplasinNumeroDeFactura=list(map(op1,rutinaContable))
    
    #recorrer la lista y hacer la multiplicacion
    listaMultiplicadaPorCantidad=list(map(op2,tuplasinNumeroDeFactura))
    
    #sumar los elementos de cada pocicion de la lista 
    totalFactura=list(map(op3,listaMultiplicadaPorCantidad))
    
    #sumar 25000 si es emenor a 600000 y redondear a 2 cifras significativas 
    totalFacturaConAdicional=list(map(op4,totalFactura))
    
    #guarda el numero de factura
    numeroFactura=list(map(op5,rutinaContable)) 
    
    #guarda el nuemro de factura con el totalfinal
    total=list(zip(numeroFactura,totalFacturaConAdicional))  
    
    lista=list(map(string,total))
      
    print('----------------- Inicio Registro diario --------------------------')
    # print('operacion1',tuplasinNumeroDeFactura)
    # print('operacion2',listaMultiplicadaPorCantidad)
    # print('operacion3',totalFactura)
    # print('operacion4',totalFacturaConAdicional)
    # print('operacion5',numeroFactura)
    # print('operacion6',total)
    # print('operacion7',lista)
    for i in lista:
        print(i)
    print('----------------- Fin Registro diario -----------------------------')


ordenes([ 
 [1201, ("5464", 4, 25842.99), ("7854",18,23254.99), ("8521", 9, 48951.95)], 
 [1202, ("8756", 3, 115362.58),("1112",18,2354.99)],
 [1203, ("2547", 1, 125698.20), ("2635", 2, 135645.20), ("1254", 1, 13645.20),("9965", 5, 1645.20)],
 [1204, ("9635", 7, 11.99), ("7733",11,18.99), ("88112", 5, 390.95)]])

ordenes([[6587, ("3268", 4, 25842.99), ("8274",18,23254.99), ("6548", 9, 48951.95), ("2547", 5, 8951.95)],[6588, ("1254", 3, 115362.58), ("9744", 2, 99235.66)]])


ordenes([[6589, ("9874", 1, 125698.20), ("88112", 2, 135645.20), ("3218", 4, 13645.20)], [6590, ("5236", 8, 11.99), ("7733",11,18.99), ("88112", 5, 390.95)],[6591, ("7812", 2, 11.99), ("9652",11,18.99)],])



# from functools import reduce
# def ordenes(rutinaContable):
#     op1=lambda rutinaContable=0:rutinaContable[1:]
    
#     op2=lambda lista=0:list(map(lambda num: num[1]*num[2],lista))
    
#     op3= lambda lista=0:reduce(lambda acum=0, elem=0: acum+elem,lista)
    
#     op4=lambda factura=0:round(factura+25000,2) if factura<600000 else round(factura,2)
    
#     op5= lambda lista=0: lista[0]
    
#     string=lambda lista=0: "La factura {} tiene un total en pesos de {:,.2f}".format(lista[0],lista[1])
       
#     tuplasinNumeroDeFactura=list(map(op1,rutinaContable))
    
#     listaMultiplicadaPorCantidad=list(map(op2,tuplasinNumeroDeFactura))
    
#     totalFactura=list(map(op3,listaMultiplicadaPorCantidad))
    
#     totalFacturaConAdicional=list(map(op4,totalFactura))
    
#     numeroFactura=list(map(op5,rutinaContable)) 
    
#     total=list(zip(numeroFactura,totalFacturaConAdicional))  
    
#     lista=list(map(string,total))
    
#     print('------------------------ Inicio Registro diario ---------------------------------')
#     for i in lista:
#         print(i)
#     print('-------------------------- Fin Registro diario ----------------------------------')
