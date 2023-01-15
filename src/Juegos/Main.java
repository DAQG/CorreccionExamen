package Juegos;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List JuegoNuevo = new ArrayList();
        JuegoNuevo.add(new Fin("COD","Activision","CDMXC","guerra","XBOX","play2,play3,play4"));
        JuegoNuevo.add(new Fin("God of War","Franchise","Francia","busqueda","Sony","play3,play4"));

        imprimirLista((ArrayList) JuegoNuevo);



    }

    private static void imprimirLista(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            Juegos j = (Juegos) lista.get(i);
            j.Completo();
            System.out.println("_____________________________________________________________");
            System.out.println( j.Completo());
        }
    }
}