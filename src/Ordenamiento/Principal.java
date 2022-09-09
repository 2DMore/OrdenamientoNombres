package Ordenamiento;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {

        ArrayList<String> nombres = null;
        try {
            nombres= LectorArchivo.obtenerContenido("C:\\Users\\picar\\Desktop\\p.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
            System.exit(1);
        }
        nombres= ModText.arreglarArray(nombres);
        nombres= OrdenamientoText.Ordenar(nombres);

        for(String s: nombres){
            System.out.println(s);
        }

        
    }
    
}
