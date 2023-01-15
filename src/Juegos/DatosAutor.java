package Juegos;

public abstract class  DatosAutor  extends Juegos{
    private String Ciudad;
    private String categoria;

    public DatosAutor(String nombreJuego, String autor, String ciudad, String categoria) {
        super(nombreJuego, autor);
        Ciudad = ciudad;
        this.categoria = categoria;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

