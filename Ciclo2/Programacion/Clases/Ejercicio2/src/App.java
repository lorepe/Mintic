import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite un número entero");
        Integer numero = sc.nextInt();
        System.out.println("El numero "+ numero + " tiene "+ numeroDigitos(numero)+" cifras");
        
    }
    public static Integer numeroDigitos(Integer numero){
        Integer cifras = 0;
        while(numero!=0){
            numero/=10;
            cifras++;
        }
        return cifras;
    }
}
