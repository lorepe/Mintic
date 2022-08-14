import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in,"ISO-8859-1" );
        System.out.println("Por favor digite un número entero");
        Integer numero = sc.nextInt();
        System.out.println("El número "+numero+" tiene "+numeroDigitos(numero)+" digitos");
    }

    public static Integer numeroDigitos(Integer numero) {
        Integer contar=0;
        while(numero!=0){
            numero/=10;
            contar++;
        }
        return contar;
    }
}
