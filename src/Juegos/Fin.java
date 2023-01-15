package Juegos;

public class Fin extends DatosAutor{
    private String Patrocinador;
    private String uso;

    public Fin(String nombreJuego, String autor, String ciudad, String categoria, String patrocinador, String uso) {
        super(nombreJuego, autor, ciudad, categoria);
        Patrocinador = patrocinador;
        this.uso = uso;
    }

    public String getPatrocinador() {
        return Patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        Patrocinador = patrocinador;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    @Override
    public String Completo(){
        return ("El nopmbre del juego es: " + getNombreJuego() + " su autor es " + getAutor() + " de la ciudad de "
                + getCiudad()+ "." + "\nEl juego es de categoria de " + getCategoria() + " y patrocinado por " + getPatrocinador()+ "." +
                "\nSe lo puede usar en dispositivos como:" + getUso()+ ".");
    }
}
