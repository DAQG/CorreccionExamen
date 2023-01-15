package Comidas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List ComidaNueva = new ArrayList();
        ComidaNueva.add(new AcompañadoPostre("Cuy", "Quito", "Cuadrado", "Ernesto"
                , "LLapigancho y mote", "Higo queso"));

        ComidaNueva.add(new AcompañadoPostre("Borrego Asado", "Cayambe", "rectangular", "Maria"
                , "Arroz y papas fritas", "Frutillas con crema"));
        imprimirLista((ArrayList) ComidaNueva);


    }

    private static void imprimirLista(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            ComidaTipica c = (ComidaTipica) lista.get(i);
            c.Ingredientes();
            System.out.println("_____________________________________________________________");
            System.out.println( c.Ingredientes());
        }
    }
}