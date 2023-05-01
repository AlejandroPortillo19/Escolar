package org.example;

import org.example.controlador.ControlPrincipal;
import org.example.vista.*;

public class Main {
    public static void main(String[] args) {
        VistaPrincipal vp=new VistaPrincipal();
        ControlPrincipal cp=new ControlPrincipal(vp);
    }
}
