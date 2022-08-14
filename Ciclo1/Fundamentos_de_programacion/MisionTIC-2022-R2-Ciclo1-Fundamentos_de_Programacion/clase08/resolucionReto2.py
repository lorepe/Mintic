def cliente(informacion:dict)-> dict:
    if informacion['edad']>18:
        atraccion='X-Treme'
        apto=True
        if informacion['primer_ingreso']==True:
            total_boleta = 20000 *0.95
        else:
            total_boleta = 20000
    elif informacion['edad']>=15 and informacion['edad']<= 18:
        atraccion='Carros chocones'
        apto=True
        if informacion['primer_ingreso'] == True:
            total_boleta = 5000 - (5000*0.07)
        else: 
            total_boleta = 5000
    elif informacion['edad'] >=7 and informacion['edad'] <15:
        atraccion='Sillas voladoras'
        apto= True
        if informacion['primer_ingreso'] == True:
            total_boleta = 10000 - (10000*0.05)
        else: 
            total_boleta = 10000
    else:  
        atraccion='N/A'
        total_boleta = 'N/A'
        apto= False
    resultado={'nombre':informacion['nombre'],'edad':informacion['edad'],'atraccion':atraccion,'apto':apto,'primer_ingreso':informacion['primer_ingreso'],'total_boleta':total_boleta}
    return resultado

# inf={}
# inf['id_cliente']=int(input('Digite el ID: '))
# inf['nombre']=input('Digite el nombre: ')
# inf['edad']=int(input('Digite la edad: '))
# inf['primer_ingreso']=bool(input('primer ingreso (Si=True, No=False) '))

inf1={
    'id_cliente': 1,
    'nombre': 'Johana Fernandez',
    'edad': 20,
    'primer_ingreso': True
}


inf2={
    'id_cliente': 1,
    'nombre': 'Johana Fernandez',
    'edad': 20,
    'primer_ingreso': False
}


inf3={
    'id_cliente': 2,
    'nombre': 'Gloria Suares',
    'edad': 3,
    'primer_ingreso': True
}


inf4={
    'id_cliente': 3,
    'nombre': 'Tatiana Suares',
    'edad': 17,
    'primer_ingreso': True
}


inf5={
    'id_cliente': 3,
    'nombre': 'Tatiana Suares',
    'edad': 17,
    'primer_ingreso': False
}


inf6={
    'id_cliente': 4,
    'nombre': 'Tatiana Ruiz',
    'edad': 8,
    'primer_ingreso': True
}

inf7={
    'id_cliente': 4,
    'nombre': 'Tatiana Ruiz',
    'edad': 8,
    'primer_ingreso': False
}
print(cliente(inf1))
print(cliente(inf2))
print(cliente(inf3))
print(cliente(inf4))
print(cliente(inf5))
print(cliente(inf6))
print(cliente(inf7))