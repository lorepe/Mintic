def cliente(informacion:dict):
    if informacion['edad']>18:
        atraccion='X-Treme'
        apto=True
        if informacion['primer_ingreso']==True:
            total_bol=20000*0.95
        else:
            total_bol=20000
            
    elif informacion['edad']>=15 <=18:
        atraccion='Carros chocones'
        apto=True
        if informacion['primer_ingreso']==True:
            total_bol=5000*0.93
        else:
            total_bol=5000
    elif informacion['edad']>=7 <15:
        atraccion='Sillas voladoras'
        apto=True
        if informacion['primer_ingreso']==True:
            total_bol=10000*0.95
        else:
            total_bol=10000
    else:
        if informacion['edad']<7:
            atraccion='no aplica'
            apto=False
            if informacion['primer_ingreso']==True:
                total_bol=('N/A')
                        
            
    resultado={'nombre':informacion['nombre'],'edad':informacion['edad'],'atraccion':atraccion,'apto':apto,'primer_ingreso':informacion['primer_ingreso'],'total_boleta':total_bol}
    return resultado




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