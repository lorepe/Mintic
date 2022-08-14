

class Profesor:
    
        
    #constructor
    def __init__(self,nombre=None):
        self.__nombre = nombre
        # self.__materia = materia
        
    def mostrarInfoProfesor(self):
        print('------------------------')
        print('Nombre: ', self.__nombre)
        print('Materia: ', self.__materia)
        
    ##Getters    
    def getNombre(self):
        return self.__nombre
    
    def getMateria(self):
        return self.__materia
    
    ##Seters 
    
    