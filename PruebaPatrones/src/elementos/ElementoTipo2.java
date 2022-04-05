package elementos;

public class ElementoTipo2 implements Elemento {
    int precio=2000;
    static int codigo=0;
    public ElementoTipo2(){
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
        ElementoTipo2 e = new ElementoTipo2();
        return e;
    }
}

    

