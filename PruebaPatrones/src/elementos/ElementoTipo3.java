package elementos;

public class ElementoTipo3 implements Elemento {
    int precio=3000;
    static int codigo=0;
public ElementoTipo3(){
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
        ElementoTipo3 e = new ElementoTipo3();
        return e;
    }
}
