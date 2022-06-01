 
ventas = [
    
    #Posición 0 de la lista
    # idProducto = 2001 / Este esta en la posicion 0 de la tupla
    (2001,'rosca', 'PT29872',2,45,'Luis Molero',3456,'12/06/2020'),
    
    # Posición 1 de la lista
    # idProducto = 2010  / Este esta en la posicion 0 de la tupla
    (2010,'bujía', 'MS9512',4,15,'Carlos Rondon',1256,'12/06/2020'),
    
    # Posición 2 de la lista 
    # idProducto = 2010  / Este esta en la posicion 0 de la tupla
    (2010,'bujía', 'ER6523',9,36,'Pedro Montes',1243,'12/06/2020'),
    
    #Posición 3 de la lista 
    # idProducto = 3578 / Este esta en la posicion 0 de la tupla
    (3578,'tijera', 'QW8523',1,128,'Pedro Faria',1456,'12/06/2020'),
    
    #Posición 4 de la lista 
    # idProducto = 9251 / Este esta en la posicion 0 de la tupla
    (9251,'piñón', 'EN5698',0,8,'Juan Peña',565,'12/06/2020')

]


"""ventas = [
            #0
            (5489,'tornillo', 'RS8512',5,33,'Julio Perez',3654213,'13/06/2020'),
            #1
            (3215,'zocalo', 'UM8587',2,125,'Laura Macias',1256321,'13/06/2020'),
            #2
            (3698,'biela', 'PT3218',1,78,'Luis Peña',14565487,'13/06/2020'),
            #3
            (8795,'cilindro', 'AZ8794',2,96,'Carlos Casio',5612405,'13/06/2020')

]"""


#Funcion Autopartes que recibe una lista de tuplas. Retorna un Diccionario
def AutoPartes(ventas:list):
    
    # la variable diccionario contiene el procedimiento que convierte la lista en diccionario
    diccionario = dict(zip(range(len(ventas)),ventas))
     
     #Retorna un diccionario 
    # print(diccionario)
    return diccionario
 
 


# Funcion que recibe la lista de tupolas y el idProducto 
def consultaRegistro(ventas: dict, idProducto):
    dic={}
    for i in range(len(ventas)):
        # No esta funcionando: Entra a la lista en la posicion 0 y la imprime 
        #Debería entrar a lista recorrerla entrar a la tupla en su posicion 0 y
        #verificar si el idProducto es igual al que se le pasa como argumento e imprimir
        
        if  (ventas[i][0] == idProducto) : 
            dic[i]=ventas[i]
            dProducto = ventas[i][1]
            pnProducto = ventas [i][2]
            cvProducto = ventas[i][3]
            sProducto = ventas[i][4]
            nComprador = ventas[i][5]
            cComprador = ventas[i][6]
            fVenta = ventas[i][7] 
        
            res+= f"Producto consultado : {idProducto} Descripción {dProducto} #Parte {pnProducto} Cantidad vendida {cvProducto} Stock {sProducto} Comprador {nComprador} Documento {cComprador} Fecha Venta {fVenta} "
        
        # Si el idProducto que se pasa como parametro no esta en la tupla retorna ese mensaje
        elif len(dic)==0: 
            res="No hay registro de venta de ese producto"
    return print(res) 

#print(AutoPartes(ventas))


consultaRegistro(AutoPartes(ventas), 2010)
# AutoPartes(ventas)



# ventas2
#ConsultaRegistro(AutoPartes(ventas), 5489)
#ConsultaRegistro(AutoPartes(ventas), 3215)
#ConsultaRegistro(AutoPartes(ventas), 3698)
#ConsultaRegistro(AutoPartes(ventas), 8795)

