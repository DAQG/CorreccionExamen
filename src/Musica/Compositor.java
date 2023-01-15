package Musica;

public abstract class Compositor extends Musicass{
    private String Genero;
    private String Intrumentos;

    public Compositor(String nombreMusica, String compositor, String genero, String intrumentos) {
        super(nombreMusica, compositor);
        Genero = genero;
        Intrumentos = intrumentos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getIntrumentos() {
        return Intrumentos;
    }

    public void setIntrumentos(String intrumentos) {
        Intrumentos = intrumentos;
    }
}
