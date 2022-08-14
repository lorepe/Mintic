import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite la cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite el número entero: "));
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite el número decimal: ")); 
        
        System.out.println("La cadena digitada es : " + cadena);

        System.out.println("El numero entero digitado es : " + entero);

        System.out.println("La letra digitada es : " + letra);
        
        System.out.println("El número decimal digitado es : " + decimal);
    }
}
