import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite un número entero...");
        int numero1 = sc.nextInt();
        System.out.println("Por favor digite otro número entero...");
        int numero2 = sc.nextInt();
        System.out.println("La potencia del numero1 ^ numero2 es :"+Math.pow(numero1, numero2));
    }
}
