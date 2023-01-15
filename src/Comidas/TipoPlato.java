package Comidas;
public  abstract class TipoPlato extends ComidaTipica {
    private String TPlato;
    private String Cosinero;

    public TipoPlato(String nombre, String ciudad, String TPlato, String cosinero) {
        super(nombre, ciudad);
        this.TPlato = TPlato;
        Cosinero = cosinero;
    }

    public String getTPlato() {
        return TPlato;
    }

    public void setTPlato(String TPlato) {
        this.TPlato = TPlato;
    }

    public String getCosinero() {
        return Cosinero;
    }

    public void setCosinero(String cosinero) {
        Cosinero = cosinero;
    }
}
