import java.util.ArrayList;
import java.util.Collections;

public class OrdenamientoText{
    public static void main(String[] args) {
        OrdenamientoText llamarFunc=new OrdenamientoText();
        String nombre1="Pancho Villa";
        String nombre2="Daniel Tilla";
        String nombre3="Gancho Pilla";
        ArrayList arrayNombres=new ArrayList<>();
        arrayNombres.add(nombre1);
        arrayNombres.add(nombre2);
        arrayNombres.add(nombre3);
        llamarFunc.OrdenarTxt(arrayNombres);
        System.out.println(arrayNombres);
    }
    public ArrayList OrdenarTxt(ArrayList<String> arrayNombres){
        Collections.sort(arrayNombres);
        return arrayNombres;
    }
}