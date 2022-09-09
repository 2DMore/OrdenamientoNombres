import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CreacionNArchivo {
    public static void main(String[] args) {
        
    }
    public void nuevoArchivoOrden(ArrayList<String> arrayNombres){
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos txt", "txt");
        FileWriter fichero = null;
        PrintWriter pw = null;
        seleccionarArchivo.setFileFilter(filtro);
        if(seleccionarArchivo.showDialog(null, "EXPORTAR TXT")==JFileChooser.APPROVE_OPTION){
            File archivo =seleccionarArchivo.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                try {
                    System.out.println(archivo.getAbsolutePath());
                    
                    fichero = new FileWriter(archivo);
                    pw = new PrintWriter(fichero);
                    for (int i=0;i<arrayNombres.size();i++) {
                        String linea = arrayNombres.get(i);
                        pw.println(linea);
                    }
        
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (fichero != null) {
                            fichero.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "El archivo no tiene la extensión csv");
            }
        }         
        

        
    }
}
