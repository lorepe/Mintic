"""def AutoPartes(ventas:list):
    resultado={}
    for x in range(len(ventas)):
        resultado[x]= [ventas[x]]
        
        # resultado.update(x)
        return resultado#{Producto_Consultado  :  {idProducto}  Descripción  {dProducto} {sProducto} Comprador {nComprador} Documento {cComprador} Fecha Venta {fVenta}} 
 
#Ó 
 
#“No hay registro de venta de ese producto”
# def consultaRegistro(ventas,IdProducto):
#     resultado={}
#     res2=''
#     for i in range(len(ventas)):
#         if ventas[i][0][0]==IdProducto:
#             resultado[i]=ventas[i]    
#     if len(resultado)==0:
#         res2='No hay registro de venta de ese producto'
#     for i in range(len(resultado)):
#         res2+='Producto consultado : {}  Descripción  {}  #Parte  {}  Cantidad vendida  {}  Stock  {}  Comprador {}  Documento  {}  Fecha Venta  {}'.format(resultado[i][0],resultado[i][1],resultado[i][2],resultado[i][3],resultado[i][4],resultado[i][5],resultado[i][6],resultado[i][7])
#     return print(res2)
    
    # print(resultado)
    # print(res2)    
def AutoPartes(ventas:list):
    resultado={}
    for i in range(len(ventas)):
        resultado[i]=[ventas[i]]
    return resultado

def consultaRegistro(ventas,IdProducto):
    v=AutoPartes(ventas)
    # print(v)
    resultado={}
    res2=''
    for i in range(len(v)):
        if ventas[i][0]==IdProducto:
            resultado[i]=v[i]
            # print(resultado[i])
            for i in range(len(v)):
                idProducto=v[i][0]
                # print(idProducto)
                dProducto = resultado[i][i][1]
                pnProducto= resultado[i][i][2]
                cvProducto=resultado[i][i][3]
                sProducto= resultado[i][i][4]
                nComprador= resultado[i][i][5]
                cComprador= resultado[i][i][6]
                fVenta= resultado[i][i][7]
                
                res2+=f'Producto consultado : {idProducto} Descripción {dProducto} #Parte {pnProducto} Cantidad vendida {cvProducto} Stock {sProducto} Comprador {nComprador} Documento {cComprador} Fecha Venta {fVenta}'
        elif len(resultado)==0:
        #v=0
            res2='No hay registro de venta de ese producto'
    print(resultado)           
    return print(res2)


# a=(AutoPartes([
# (2001,'rosca', 'PT29872',2,45,'Luis Molero',3456,'12/06/2020'),
# (2010,'bujía', 'MS9512',4,15,'Carlos Rondon',1256,'12/06/2020'),
# (2010,'bujía', 'ER6523',9,36,'Pedro Montes',1243,'12/06/2020'),
# (3578,'tijera', 'QW8523',1,128,'Pedro Faria',1456,'12/06/2020'),
# (9251,'piñón', 'EN5698',2,8,'Juan Peña',565,'12/06/2020')]))

# print(a[0][0][0])
# De Luis Fernando Salas Nuñez para todos 08:21 AM
ventasLista=[
(2001,'rosca', 'PT29872',2,45,'Luis Molero',3456,'12/06/2020'),
(2010,'bujía', 'MS9512',4,15,'Carlos Rondon',1256,'12/06/2020'),
(2010,'bujía', 'ER6523',9,36,'Pedro Montes',1243,'12/06/2020'),
(3578,'tijera', 'QW8523',1,128,'Pedro Faria',1456,'12/06/2020'),
(9251,'piñón', 'EN5698',2,8,'Juan Peña',565,'12/06/2020')]
# consultaRegistro(ventasLista, 2010)
print(AutoPartes(ventasLista))
    # Producto consultado : 2010  Descripción  bujía  #Parte  MS9512  Cantidad vendida  4  Stock  15  Comprador Carlos Rondon  Documento  1256  Fecha Venta  12/06/2020
"""

def AutoPartes(ventas:list):
    # dic ={}  
    # for i in range(len(ventas)):
    #     dic[i] = ventas[i]
    dic = dict(zip(range(len(ventas)),ventas))   
    return dic 

def consultaRegistro(ventas,idProducto):
    newDic = {}
    respuesta= '' 
    conta = 0
    for i in range(len(ventas)) :
        
        if ventas[i][0] == idProducto: 
            newDic[conta]=ventas[i] 
            conta+=1
            
    if len(newDic) == 0:
        respuesta = 'No hay registro de venta de ese producto' 
    for i in range(len(newDic)):
        
        idProducto= newDic[i][0]
        dProducto = newDic[i][1]
        pnProducto = newDic[i][2]
        cvProducto = newDic[i][3]
        sProducto = newDic[i][4]
        nComprador = newDic[i][5]
        cComprador = newDic[i][6]
        fVenta = newDic[i][7]
        
        respuesta += f'Producto consultado : {idProducto}  Descripción  {dProducto}  #Parte  {pnProducto}  Cantidad vendida  {cvProducto}  Stock  {sProducto}  Comprador {nComprador}  Documento  {cComprador}  Fecha Venta  {fVenta}\n'
          
    print(respuesta)
    
    
consultaRegistro(AutoPartes([
    (9852,'Culata', 'XC9875',2,165,'Luis Molero',3455846,'14/06/2020'),
    (9852,'Culata', 'XC9875',2,165,'Jose Mejia',1355846,'14/06/2020'),
    (2564,'Cárter', 'PT29872',2,32,'Peter Cerezo',8545436,'14/06/2020'),
    (5412,'válvula', 'AZ8798',2,11,'Juan Peña',568975,'14/06/2020')]), 9852)

consultaRegistro(AutoPartes([
    (2001,'rosca', 'PT29872',2,45,'Luis Molero',3456,'12/06/2020'),
    (2010,'bujía', 'MS9512',4,15,'Carlos Rondon',1256,'12/06/2020'),
    (2010,'bujía', 'ER6523',9,36,'Pedro Montes',1243,'12/06/2020'),
    (3578,'tijera', 'QW8523',1,128,'Pedro Faria',1456,'12/06/2020'),
    (9251,'piñón', 'EN5698',2,8,'Juan Peña',565,'12/06/2020')]), 2010)
    
# print(AutoPartes([
#     (2001,'rosca', 'PT29872',2,45,'Luis Molero',3456,'12/06/2020'),
#     (2010,'bujía', 'MS9512',4,15,'Carlos Rondon',1256,'12/06/2020'),
#     (2010,'bujía', 'ER6523',9,36,'Pedro Montes',1243,'12/06/2020'),
#     (3578,'tijera', 'QW8523',1,128,'Pedro Faria',1456,'12/06/2020'),
#     (9251,'piñón', 'EN5698',2,8,'Juan Peña',565,'12/06/2020')]))

# consultaRegistro(AutoPartes([ 
#     (2001,'rosca', 'PT29872',2,45,'Luis Molero',3456,'12/06/2020'), 
#     (2010,'bujía', 'MS9512',4,15,'Carlos Rondon',1256,'12/06/2020'), 
#     (2010,'bujía', 'ER6523',9,36,'Pedro Montes',1243,'12/06/2020'),     
#     (3578,'tijera', 'QW8523',1,128,'Pedro Faria',1456,'12/06/2020'), 
#     (9251,'piñón', 'EN5698',2,8,'Juan Peña',565,'12/06/2020')]), 2010)
