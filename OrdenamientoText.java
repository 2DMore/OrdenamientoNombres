import java.util.ArrayList;
import java.util.Collections;

public class OrdenamientoText{
    public static void main(String[] args) {
        CreacionNArchivo arch=new CreacionNArchivo();
        OrdenamientoText llamarFunc=new OrdenamientoText();
        String nombre1="Pancho Villa";
        String nombre2="Daniel Tilla";
        String nombre3="Gancho Pilla";
        ArrayList<String> arrayNombres=new ArrayList<String>();
        arrayNombres.add(nombre1);
        arrayNombres.add(nombre2);
        arrayNombres.add(nombre3);
        llamarFunc.OrdenarTxt(arrayNombres);
        
        arch.nuevoArchivoOrden(arrayNombres);

    }
    public ArrayList<String> OrdenarTxt(ArrayList<String> arrayNombres){
        Collections.sort(arrayNombres);
        return arrayNombres;
    }
}