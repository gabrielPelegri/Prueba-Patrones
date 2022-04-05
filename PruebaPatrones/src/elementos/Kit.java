package elementos;

import java.util.ArrayList;

public class Kit implements Elemento {
    int codigo;
    int precio;
    ArrayList<Elemento> lista;

    public Kit() {
        lista=new ArrayList<>();
        this.codigo = codigo++;
        
    }

    @Override
    public int getCodigo() {
        return this.codigo;
    }

    @Override
    public int getPrecio() {
        return this.precio;

    }
    public void setPrecio(){
       int p=0;
        for (Elemento e : lista) {
            p += e.getPrecio();
        }
        this.precio = p;
    }

    @Override
    public void mostrarElemento() {
        for (Elemento e : lista) {
            e.mostrarElemento();
        }

    }

    @Override
    public Elemento crearElemento() {
        Elemento e = new Kit();
        return e;
    }
public void sumarElemento(Elemento e){
    lista.add(e);
    setPrecio();

}
}
