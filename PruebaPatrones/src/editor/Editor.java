package editor;

import elementos.*;

public class Editor {
    public void EditarElemento(Elemento e) {
        e.mostrarElemento();

    }

    public void EditarKit(Kit k, Elemento e) {
        k.sumarElemento(e);
        k.mostrarElemento();
    }

}
