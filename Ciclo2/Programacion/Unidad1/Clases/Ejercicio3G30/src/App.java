import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite un número entero");
        int numero = sc.nextInt();
        System.out.println("El doble del número es: " + dobleNumero(numero));
        System.out.println("El triple del número es: " + tripleNumero(numero));
    }   
    public static int dobleNumero(int numero){
        return numero*2;
    }
    public static int tripleNumero(int numero){
        return numero*3;
    }
}
