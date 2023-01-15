package Juegos;

public  abstract class Juegos {
    String NombreJuego;
    String Autor;

    public Juegos(String nombreJuego, String autor) {
        NombreJuego = nombreJuego;
        Autor = autor;
    }

    public String getNombreJuego() {
        return NombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        NombreJuego = nombreJuego;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public abstract String Completo();
}
