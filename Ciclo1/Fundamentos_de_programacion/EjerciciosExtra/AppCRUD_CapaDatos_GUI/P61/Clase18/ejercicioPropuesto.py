from casosGenerados import *
import pprint as pp

#1)Obtener todas las transferencias realizadas en el último trimestre en los cajeros
#de modelo 101,2017
#2)Obtener todas las consignaciones realizadas en el último trimestre en los cajeros
#de modelo 101,2017 que se encuentran fuera de servicio
#3) Todas las transacciones de los cajeros cerrados que pertenecen a la firma integrada
# -> Convencional: Ciclando y con condicionales
# -> Funcional: Map, Filter, Zip o Reduce

#Ejemplo de acceso
print(caso1['25u8sBP']['transacciones'][0])

print('Llaves del dataset (diccionario)')
print(caso1.keys())

print('Llaves del dataset (diccionario)')
print(caso1['25u8sBP'].keys())


#1)Obtener todas las transferencias realizadas en el último trimestre en los cajeros
#de modelo 101,2017

#Algoritmo (Pseudocódigo)
#1) Obtener los cajeros (con toda su información) de los modelos solicitados
#2) Extraer las transacciones de esos cajeros de los modelos solicitados
#3) Filtrar las transferencias (solamente este tipo de transacciones interesan para el requerimiento)
#4) Filtramos las transferencias del último trimestre (marzo, abril y mayo de 2021)

#Traducción del algoritmo planteado
#1) Obtener los cajeros (con toda su información) de los modelos solicitados 101 y 2017

#Declarativa

#Filtrar -> Predicado e iterable (colección)

def cajeroModelosSolicitados(cajero):
    #return cajero[1]['modeloCajero']==101 or cajero[1]['modeloCajero']==2017
    return any([cajero[1]['modeloCajero']==101,cajero[1]['modeloCajero']==2017])

cajerosSeleccionados = list(filter(cajeroModelosSolicitados,caso1.items()))
#pp.pprint(cajerosSeleccionados)
#print(cajerosSeleccionados)

#2) Extraer las transacciones de esos cajeros de los modelos solicitados
listaListasTransacciones = list(map(lambda x:x[1]['transacciones'],cajerosSeleccionados))
#pp.pprint(listaListasTransacciones)
from functools import reduce
listaTransacciones = list(reduce(lambda acumulador=list(), elemento=dict(): acumulador + elemento ,listaListasTransacciones))
#pp.pprint(listaTransacciones)

#3) Filtrar las transferencias (solamente este tipo de transacciones interesan para el requerimiento)
transferencias = list( filter(lambda x:x['tipoMovimiento']=='transferencia',  listaTransacciones))
#pp.pprint(transferencias)

#4) Filtramos las transferencias del último trimestre (marzo, abril y mayo de 2021) (03-2021,04-2021,05-2021)
def esDelUltimoTrimestre(transaccion):
    fecha = transaccion['fechaMovimiento']
    return any([ fecha[3:]=='03-2021', fecha[3:]=='04-2021', fecha[3:]=='05-2021' ])

listadoRequerimiento = list( filter(esDelUltimoTrimestre,transferencias) ) 
pp.pprint(listadoRequerimiento)
