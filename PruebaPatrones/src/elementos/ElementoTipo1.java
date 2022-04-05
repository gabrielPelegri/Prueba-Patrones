package elementos;

public class ElementoTipo1 implements Elemento {

    int precio = 1000;

    static int codigo=0;

    public ElementoTipo1() {
codigo++;
this.codigo=codigo;
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public void mostrarElemento() {
        System.out.print("Precio: " + this.precio);
        System.out.println("Código: " + this.codigo);
    }

    @Override
    public Elemento crearElemento() {
        ElementoTipo1 e = new ElementoTipo1();
        return e;
    }
}
