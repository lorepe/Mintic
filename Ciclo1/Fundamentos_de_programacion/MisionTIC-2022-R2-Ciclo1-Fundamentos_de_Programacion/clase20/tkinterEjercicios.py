import tkinter as tk
from tkinter import Toplevel, ttk

ventana1=tk.Tk()
ventana1.geometry('800x600')
ventana1.title('Principal')

etiq1=ttk.Label(ventana1,text='Escriba su nombre')
etiq1.grid(column=0,row=0)

ventana1.config(bg='blue')
ventana2=Toplevel(ventana1)

ventana2.withdraw()#ya no sale la secundaria


def funcion():
    btn_01.configure(text='Hola '+nombre.get())

# btn_01=ttk.Button(ventana1,text='salir',command=exit)
btn_01=ttk.Button(ventana1,text='salir',command=funcion)
btn_01.grid(column=0,row=1)

nombre=tk.StringVar()
preguntar_nombre=ttk.Entry(ventana1,width=20,textvariable=nombre)
preguntar_nombre.grid(column=1,row=0)

# preguntar_nombre.focus()
btn_01.focus()#enfoque al abrir la ventana


#listas desplegables

numero=tk.StringVar()
sel_num=ttk.Combobox(ventana1,width=15,textvariable=numero)
sel_num['values']=(1,2,5,8,10)
sel_num.grid(column=2,row=0)
sel_num.current(0)#posicion actual o inicial

#Check bottons
opc1=tk.IntVar()
casilla_1=tk.Checkbutton(ventana1,text='violet',variable=opc1,state='normal',foreground='red',font='arial')
casilla_1.grid(column=0,row=5)
casilla_1.select()

#Radio buttons
def fun_radio_b1():
    selector=opc2.get()
    if selector == 1: ventana1.configure(bg='green')

opc2=tk.IntVar()
radio_bt1=tk.Radiobutton(ventana1,text='green',variable=opc2,value=1,command=fun_radio_b1)
radio_bt1.grid(column=1,row=5)


ventana1.mainloop()