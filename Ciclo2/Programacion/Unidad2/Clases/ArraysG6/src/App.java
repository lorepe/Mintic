import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //Por asignación
   //     Scanner sc = new Scanner(System.in);
   //     //tipo de datos [] nombre vector = new int[dimension]
   //     System.out.println("Por favor digite la cantidad de numeros que desea igresat al Array - Vector");
   //     int cantidad = sc.nextInt();

   //     int []vector= new int[cantidad];
   //  //    int []vector= new int[5];
   //     for (int i = 0; i <5; i++) {
   //      System.out.print("Digite el numero "+(i+1)+":  ");
   //      int numero = sc.nextInt();
   //      vector[i]=numero;

   //     }
   //     System.out.println("");
   //     System.out.println(vector);

       Scanner sc = new Scanner(System.in);
       System.out.println("Por favor ingrese la cantidad de filas");
       int filas = sc.nextInt();
       System.out.println("Por favor ingrese la cantidad de columnas");
       int columnas = sc.nextInt();

       int [][] matriz = new int[filas][columnas];
       int contar = 0;
       for (int i = 0; i < filas; i++){
         for(int j = 0; j < columnas; j++){
            System.out.println("Por favor digite el número"+ (++contar)+": ");
            int numero = sc.nextInt();
            matriz[i][j]=numero;

         }
       }

       System.out.println("");


       //Recorrer matriz 
       for(int i = 0; i<filas; i++){
         for(int j = 0; j < columnas; j++){
            System.out.print(matriz[i][j]+"        ");
         }
         System.out.println("");
       }

       System.out.println("Mostrar el indice y el valor");
       for(int i = 0; i<filas; i++){
         for(int j = 0; j < columnas; j++){
            System.out.println("En el indice "+i+", "+j+" esta el valor: "+ matriz[i][j]);
         }
       }

       
    }
}
