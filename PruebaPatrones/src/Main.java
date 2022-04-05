import editor.Editor;
import elementos.Elemento;
import elementos.ElementoTipo1;

public class Main {
    public static void main(String[] args) throws Exception {
        Editor editor = new Editor();
        Elemento a = new ElementoTipo1();

        editor.EditarElemento(a);
    }
}
