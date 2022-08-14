import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Suma suma = new Suma();
        System.out.println("Digite el número 1");
        suma.setNumero1(sc.nextInt());
        System.out.println("Digite el número 2");
        suma.setNumero2(sc.nextInt());
        
        System.out.println("La suma es: "+suma.sumar(suma.getNumero1(),suma.getNumero2()));
        
    }
}
