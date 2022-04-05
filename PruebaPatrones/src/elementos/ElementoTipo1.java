package elementos;

public class ElementoTipo1 implements Elemento {

    int precio = 1000;
    
    int codigo = 0;

    public ElementoTipo1() {
this.codigo=c+1;
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
