import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor digite su nombre");
        String nombre = sc.nextLine();
        System.out.println(saludo(nombre));
    }
//Ejercicio 1
    public static String saludo(String nombre){
        return "Hola "+ nombre + ", bienvenido Dios los bendiga!!!..";
    }
}
