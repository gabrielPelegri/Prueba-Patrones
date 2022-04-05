import editor.Editor;
import elementos.Elemento;
import elementos.ElementoTipo1;
import elementos.ElementoTipo2;
import elementos.Kit;

public class Main {
    public static void main(String[] args) throws Exception {
        Editor editor = new Editor();
        Elemento a = new ElementoTipo1();
        Elemento b = new ElementoTipo2();
        Elemento c=new Kit();
        editor.EditarElemento(a);
        editor.EditarElemento(b);
        editor.EditarKit((Kit) c, a);
    }
}
