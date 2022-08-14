import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        //Queue<Integer> cola = new Queue<Integer>();
        
        //Objeto map - Hash map- Tree map- Linked hash map

        System.out.println("***************MAPA***********");
        //Declarar
        //Clientes... cedula... nombres y apellidos

       /*  Map<Integer, String> cliente = new HashMap<>();
        
        //Asignar valores 
        //Por asignación

        cliente.put(1065,"Lorena Perez");
        cliente.put(1165,"Gloria Escobar");
        cliente.put(1455,"Rosana Escobar");
        cliente.put(1615,"Milena Vasquez");

        System.out.println(cliente);

        //Dinamicamente
        System.out.println("Digite la cantidad de clientes a crear");
        int cC= sc.nextInt();
        sc.nextLine();//Linpiar el bufer
        for(int i=0;i<cC;i++){

            System.out.println("Digite la cedula del cliente"+(i+1)+": ");
            Integer cedula = sc.nextInt();
            sc.nextLine();//Linpiar el bufer
            System.out.println("Digite el nombre del cliente"+(i+1)+": ");
            String nombre = sc.nextLine();

            cliente.put(cedula,nombre);

        }
        System.out.println("Los clientes ingresados son: "+ clientes);
            */
        //Ordenado
        //Map<String,String> lenguajes = new TreeMap<>();
        Map<Integer,String> lenguajes = new TreeMap<>();

        //Asignacion 
        // lenguajes.put(".c","C");
        // lenguajes.put(".java","Java");
        // lenguajes.put(".pl","Perl");
        // lenguajes.put(".cs","C#");
        // lenguajes.put(".php","PHP");
        // lenguajes.put(".cpp","C++");
        // lenguajes.put(".xml","XML");

        lenguajes.put(1981,"C");
        lenguajes.put(1985,"Java");
        lenguajes.put(1970,"Perl");
        lenguajes.put(1999,"C#");
        lenguajes.put(1985,"PHP");
        lenguajes.put(1960,"C++");
        lenguajes.put(1980,"XML");

        System.out.println(lenguajes);


        Map<Integer, String > mapa = new LinkedHashMap<>();

        mapa.put(1981,"C");
        mapa.put(1985,"Java");
        mapa.put(1970,"Perl");
        mapa.put(1999,"C#");
        mapa.put(1986,"PHP");
        mapa.put(1960,"C++");
        mapa.put(1980,"XML");

        System.out.println(mapa);

        //Operaciones Mapa
        String valor = mapa.get(1960);
        System.out.println("En el año 1960 fue creado el lenguaje: "+valor);

        //Comprobar si el mapa tiene una clave en especifico 
        if(mapa.containsKey(1960)){
            System.out.println("Si contiene la clave");
        
        }else{
            System.out.println("No contiene la clave");
        }

        if(mapa.containsValue("Java")){
            System.out.println("Si contiene Java");
        }else{
            System.out.println("No contiene a Java");
        }
    }
}
