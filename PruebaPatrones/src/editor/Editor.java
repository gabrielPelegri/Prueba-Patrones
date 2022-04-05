package editor;

import elementos.*;

public class Editor {
    public void EditarElemento(Elemento e) {
        System.out.println("Elemento simple");
        e.mostrarElemento();

    }

    public void EditarKit(Kit k, Elemento e) {
        System.out.println("Kit");
        k.sumarElemento(e);
        k.mostrarElemento();
    }

}
