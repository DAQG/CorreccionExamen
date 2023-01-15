package Comidas;

public abstract class ComidaTipica {
    String Nombre;
    String Ciudad;

    public ComidaTipica(String nombre, String ciudad) {
        Nombre = nombre;
        Ciudad = ciudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }
    public abstract String Ingredientes();
}
