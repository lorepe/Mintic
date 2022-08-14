tareas={
    '01':{
        'descripcion':'Ir a mercar',
        'estado':'pendiente',
        'tiempo': 60
    },
    '02':{
        'descripcion':'Estudiar',
        'estado':'pendiente',
        'tiempo': 180
    },
    '03':{
        'descripcion':'Hacer ejecicio',
        'estado':'pendiente',
        'tiempo': 50
    }
}



def create(tareas,identificador,tareaNueva):
    tareas[identificador] = tareaNueva
    return tareaNueva

def read(tareas):
    for identificador,tarea  in tareas.items():
        print(identificador,'--',end=' ')
        for nombre_atributo, atributo in tarea.items():
            print(atributo,', ',end=' ')
            print()

def estaElemento(identificador,tareas):
    conjuntoIdentificadores=set(tareas.keys())
    if identificador in conjuntoIdentificadores:
        return True
    else:
        return False
    
    
opcion = 0
while opcion!=5:
    print('--Aplicacion CRUD Tareas pendientes---')
    print('1. Adicionar tarea')
    print('2. Consultar tareas')
    print('3. Actualizar tarea')
    print('4. Eliminar tarea')
    print('5. Salir')
    opcion=int(input('Ingrese una opcion: '))
    
    if opcion==1:
        print()
        print('-> Adicionando tarea ')
        
        identificador=str(input('Ingrese identificador de la tarea: '))
        descripcion=str(input('Ingrese descripcion de la tarea: '))
        estado=str(input('Ingrese estado de la tarea: '))
        tiempo=str(input('Ingrese el tiempode realizacion: '))
        
        tareaNueva={
            'descripcion':descripcion,
            'estado':estado,
            'tiempo':tiempo
        }
        #Adicionar nueva tarea
        tareas= create(tareas, identificador,tareaNueva)
    elif opcion==2:
        print('Consultar tareas')
        
        #READ
        read(tareas)
    elif opcion==3:
        print('\n -> Actualidar tarea\n')
        #Solicitar a l usuario el identificador    
        identificador=str(input('Ingrese identificador de la tarea a modificar: '))
        #Revisar si encuentra el elemento solicitado
        if estaElemento(identificador,tareas):
            #Proceder a actualizar
            #===================================
            
            #modificar los campos de interes 
            nuevaDescripcion=str(input('Ingrese nueva descripcion: '))  
            if nuevaDescripcion:
                tareas[identificador]['descripcion']= nuevaDescripcion
            nuevoEstado = str(input('Ingrese nuevo estado: '))
            if nuevoEstado:
                tareas[identificador]['estado']= nuevoEstado
            nuevoTiempo=input('Nuevo tiempo: ')
            if nuevoTiempo:
                nuevoTiempo=int(nuevoTiempo)
                tareas[identificador]['tiempo'] = nuevoTiempo
        else:
            print('No ha sido encontrada la tarea!')      
    elif opcion==4:
        print('Eliminar tarea')
        
        identificador=str(input('ingrese identificador de la tarea para eliminar: '))
        conjuntoIdentificadores=set(tareas.keys())
        
        if identificador in conjuntoIdentificadores:
            tareas.pop(identificador)
        else:
            print('No ha sido encontrada la tarea para eliminar!')
    elif opcion==5:
        print('Salio')
        break
    else:
        print('Ingrese una opcion valida')