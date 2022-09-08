import java.util.ArrayList;

public class OrdenamientoText{
    public static void main(String[] args) {
        String nombre1="Pancho Villa";
        String nombre2="Daniel Tilla";
        String nombre3="Gancho Pilla";
        ArrayList<String> arrayNombres=new ArrayList<>();
        arrayNombres.add(nombre1);
        arrayNombres.add(nombre2);
        arrayNombres.add(nombre3);
        ((OrdenamientoText)arrayNombres).OrdenarTxt(arrayNombres);
    }
    public void OrdenarTxt(ArrayList<String> arrayNombres){

    }
}