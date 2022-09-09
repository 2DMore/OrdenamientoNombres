package Ordenamiento;
import java.util.ArrayList;
import java.util.Iterator;

//import static java.lang.System.*;
//import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class ModText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        
        //Scanner myObj = new Scanner(System.in);
        nombre = "éHúaÑ ávilÁ IsAAc mAÚRICío";/*myObj.nextLine();*/
        System.out.println("Nombre: " + nombre);
        nombre = arreglarCadena(nombre);
        System.out.println("Nombre: " + nombre);
    }

    public static String arreglarCadena(String cadenaNombre) {
        //Convertimos el String en una cadena de carácteres para
        //una mejor manipulación de cada caracter
        char[] caracteres = cadenaNombre.toCharArray();
        //Se sabe que la primera letra es mayúscula
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        // el -2 es para evitar una excepción al caernos del arreglos
        for (int i = 0; i < cadenaNombre.length()- 2; i++){
            // Para saber que las demás son la primera letra, entonces antes debe
            // de haber un espacio, sino, es una letra normal
            if (caracteres[i] == ' '){
                // Reemplazamos
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
            } else{
                // Reemplazamos
                caracteres[i + 1] = Character.toLowerCase(caracteres[i + 1]);
            }
            
        }
        return new String(caracteres);
    }

    public static ArrayList<String> arreglarArray(ArrayList<String> cadenas){
        ArrayList<String> normalizado = new ArrayList<>();
        Iterator<String> iterador = cadenas.iterator();
        while(iterador.hasNext()){
            normalizado.add(arreglarCadena(iterador.next()));
        }
        return normalizado;
    }
    
}
