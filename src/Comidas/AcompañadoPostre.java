package Comidas;

public class AcompañadoPostre extends TipoPlato {
    private String Acompa;
    private String Postre;

    public AcompañadoPostre(String nombre, String ciudad, String TPlato, String cosinero, String acompa, String postre) {
        super(nombre, ciudad, TPlato, cosinero);
        Acompa = acompa;
        Postre = postre;
    }

    public String getAcompa() {
        return Acompa;
    }

    public String getPostre() {
        return Postre;
    }
    @Override
    public String Ingredientes(){
        return "El Nombre del plato es: " + getNombre() + " de la ciudad de " + getCiudad() +"."+
                "\nSe sirve en un plato " + getTPlato() + " y realizado por " + getCosinero()+"."
                + "\nAcompañado de "+ getAcompa() + " con un postre de " + getPostre()+".";
    }

}
