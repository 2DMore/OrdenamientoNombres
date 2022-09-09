package Ordenamiento;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Lee los archivos de texto 
 * @author David Pat
 */
public class LectorArchivo {
    
    /**
     * Obtiene todo el contenido de un archivo de texto, separandolo por columnas y filas. 
     * @param ruta Cadena de la dirección del archivo
     * @param separador carcter por el cual separar cada fila del archivo
     * @return Arreglo con arreglos de Cadenas con el contenido del archivo
     * @throws FileNotFoundException
     */
    public static ArrayList<String> obtenerContenido(String ruta) throws FileNotFoundException{
        ArrayList<String> retornar = new ArrayList<String>();
        File archivo = new File(ruta);
        Scanner  lector;
        lector = new Scanner(archivo);
        while(lector.hasNextLine()){
            String linea = lector.nextLine();
            retornar.add(linea);
        }
        lector.close(); 
        return retornar;
    }
}
