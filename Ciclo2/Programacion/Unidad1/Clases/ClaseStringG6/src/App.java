import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        System.out.println("Digite su nombre");
        String nombre = sc.nextLine();
        System.out.println("Digite su apellido");
        String apellido = sc.nextLine();

        String nombreApellido = nombre + " "+apellido;
        System.out.println("Sus nombres y apellidos son: "+ nombreApellido);

        //Metodos ... acceder -- nativos -- Java
        //len--- longitud ... length 
        System.out.println("La longitud de la cadena es: "+nombreApellido.length());

        //indexOf -- devuelve la posicion de el primer caracter que encuetra

        System.out.println("La posicion de la letra e es: "+nombreApellido.indexOf("e"));

        //lastIndexOf -- devuelve la posicion de la ultima letra
        System.out.println("La ultima posicion de la letra e es: "+nombreApellido.lastIndexOf("e"));


        //charAt -- conocer el caracer de cierta posicion, no se puede recorrer de derecha a izquierda con -1

        System.out.println("El caracter en esta en el indice 4 es: " + nombreApellido.charAt(4));

        // substring -- sacr un pedazo de texto de una cadena 

        System.out.println("El substrig ena (3,6) de Lorena, es: "+nombreApellido.substring(3,6));

        //toUpperCase -- convierte en mayusculas 

        System.out.println("La cadena a mayuscula: "+nombreApellido.toUpperCase());

        //toLowerCase -- convierte en minuscula

        System.out.println("La cadena a minuscula: "+nombreApellido.toLowerCase());
        
        //equal -- compara dos string, es case sesitive
        if (nombre.equals(apellido)) {
            System.out.println("Son exactamente iguales");
            
        }

        if (nombre.equalsIgnoreCase(apellido)) {
            System.out.println("Son iguales independientemente de mayusculas y minusculas");            
        }

        // trim -- quita los espacios del inicio y final

        System.out.println("Nombres y apellidos sin espacios al inicio y final: "+nombreApellido.trim());
    }
}
