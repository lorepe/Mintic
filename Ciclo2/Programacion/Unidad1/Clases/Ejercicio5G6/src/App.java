import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número entero");
        int numero = sc.nextInt();
        System.out.println("El número "+numero+ " es: "+parImpar(numero));
    }
    public static String parImpar(int numero){
        return (numero%2==0)?"par":"impar";
    }
}
