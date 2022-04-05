package elementos;

public interface Elemento {
    public static int c = 0;

    int getCodigo();

    int getPrecio();

    void mostrarElemento();

    Elemento crearElemento();

}
