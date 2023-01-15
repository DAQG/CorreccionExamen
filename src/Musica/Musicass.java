package Musica;

public abstract class Musicass {
    String NombreMusica;
    String Compositor;

    public Musicass(String nombreMusica, String compositor) {
        NombreMusica = nombreMusica;
        Compositor = compositor;
    }

    public String getNombreMusica() {
        return NombreMusica;
    }

    public void setNombreMusica(String nombreMusica) {
        NombreMusica = nombreMusica;
    }

    public String getCompositor() {
        return Compositor;
    }

    public void setCompositor(String compositor) {
        Compositor = compositor;
    }
    public abstract  String  FinMusica();
}
