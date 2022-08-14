import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite su nombre");
        String nombre = sc.nextLine();
        System.out.println("Por favor digite su apellido");
        String apellido = sc.nextLine();
        String nombreApellido = nombre + " "+ apellido;
        System.out.println("Bienvenido a Java "+ nombreApellido);
        // La longitud de una cadena de texto es con el metodo .length() 
        System.out.println("La longitud de la cadena es :" + nombreApellido.length());

        // Para conocer la primera posición de una letra  en una cadena de texto es con el metodo .indexOf() si no esta va a devolder un -1
        System.out.println("La primera posición de la letra a de la cadena es :" + nombreApellido.indexOf("a"));

        // Para conocer la ultima posición de una letra  en una cadena de texto es con el metodo .lastIndexOf() si no esta va a devolder un -1
        System.out.println("La última posición de la letra de la cadena es :" + nombreApellido.lastIndexOf("a"));
        // Para conocer la letra de una posición en especifica en una cadena de texto es el metodo .charAt() 
        System.out.println("La letra en la posición 8 de la cadena es :" + nombreApellido.charAt(8));

        // Para hacer un subconjunto (tajada) de una cadena de texto es substring(x,y)

        System.out.println("el subconjunto de (6,9) de la cadena de texto es :" + nombreApellido.substring(6,9));

        // convertir en mayucula
        System.out.println("La cadena de texto en mayuscula es :" + nombreApellido.toUpperCase());

        // convertir en minuscula
        System.out.println("La cadena de texto en minuscula es :" + nombreApellido.toLowerCase());

        // Comparación de String
        if(nombre.equals(apellido)){
            System.out.println("Los nombres y apellidos son iguales");
        }
        // comparacion de string sin tener en cuenta mayusculas o minusculas
        if(nombre.equalsIgnoreCase(apellido)){
            System.out.println("Son iguales sin tener en cuenta mayúsculas o minúsculas");
        }

        

        


    }
}
