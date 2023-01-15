package Musica;

public class Dispositivos extends Compositor{
    private String Dispo;
    private String formato;

    public Dispositivos(String nombreMusica, String compositor, String genero, String intrumentos, String dispo, String formato) {
        super(nombreMusica, compositor, genero, intrumentos);
        Dispo = dispo;
        this.formato = formato;
    }

    public String getDispo() {
        return Dispo;
    }

    public void setDispo(String dispo) {
        Dispo = dispo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    @Override
    public String FinMusica(){
        return ("El nombre de la musica es: " + getNombreMusica() + " compuestob por " + getCompositor() + "."
        + " \nDe genero " + getGenero() + " usando intrumentos de " + getIntrumentos() + "."
        + "\nApto para dispositivos " + getDispo() + " en formato " + getFormato() + ".");

    }


}
