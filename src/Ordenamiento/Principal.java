package Ordenamiento;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        ArrayList<String> nombres = null;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ruta: ");
        String rutaArchivo = teclado.nextLine();
        teclado.close();

        try {
            nombres= LectorArchivo.obtenerContenido(rutaArchivo);
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
            System.exit(1);
        }
        nombres= ModText.arreglarArray(nombres);
        nombres= OrdenamientoText.Ordenar(nombres);

        System.out.println(">Nombres normalizados y ordenados");
        for(String s: nombres){
            System.out.println(s);
        }
        System.out.println("--------------------");

        CreacionNArchivo.nuevoArchivoOrden(nombres);  
    }
    
}
