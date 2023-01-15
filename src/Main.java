package Musica;
import java.util.ArrayList;
import java.util.List;


    public class Main {
        public static void main(String[] args) {
            List Musica1 = new ArrayList();
            Musica1.add(new Dispositivos("Der Einsame","Leo Rojas","Andina",
                    "Flauta,Characa","Celulares,ordenadores","mp3,mp4"));
            Musica1.add(new Dispositivos("Estuve Esperandote","SudaMery Janes","Rap",
                    "bateria,pista","celulares,ordenadores","mp3,mp4"));

            imprimirLista((ArrayList) Musica1);



        }

        private static void imprimirLista(ArrayList lista) {
            for (int i = 0; i < lista.size(); i++) {
                Musicass m = (Musicass) lista.get(i);
                m.FinMusica();
                System.out.println("_____________________________________________________________");
                System.out.println( m.FinMusica());
            }
        }
    }