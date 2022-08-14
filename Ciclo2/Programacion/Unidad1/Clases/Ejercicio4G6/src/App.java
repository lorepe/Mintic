import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc=new Scanner(System.in);
        System.out.println("digite los grados");
        float numero=sc.nextFloat();
        System.out.println("farenhei es "+ convertir_farenhei(numero));
    }
    
    public static float convertir_farenhei(float numero){
        return 32+(9*numero/5);
    }
}
