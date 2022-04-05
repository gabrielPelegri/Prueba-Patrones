package elementos;

public interface Elemento {
    static int codigo = 1;

    int getCodigo();

    int getPrecio();

    void mostrarElemento();

    Elemento crearElemento();

}
