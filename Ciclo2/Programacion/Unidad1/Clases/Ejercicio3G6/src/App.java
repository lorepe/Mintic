import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número entero");
        Integer numero = sc.nextInt();
        System.out.println("El doble del número es: "+dobleNumero(numero));
        System.out.println("El triple del número es: "+tripleNumero(numero));
    }

    public static Integer dobleNumero(Integer numero){
        Integer doble = numero*2;
        return doble;
    }

    public static Integer tripleNumero(Integer numero){
        return numero*3;
    }
}
