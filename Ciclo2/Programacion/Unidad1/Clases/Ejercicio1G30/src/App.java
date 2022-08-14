import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in,"ISO-8859-1" );
        System.out.println("Por favor digite sus nombres y apellidos");
        String nombre = sc.nextLine();
        System.out.println(saludo(nombre));
    }
    public static String saludo(String nombre){
        return "Hola "+nombre+" Bienvenid@ a este nuevo lenguaje de programación";
    }
}