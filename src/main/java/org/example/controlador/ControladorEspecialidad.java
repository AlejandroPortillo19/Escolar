package org.example.controlador;

import org.example.modelo.ModeloEspecialidad;
import org.example.vista.VistaEspecialidad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEspecialidad implements ActionListener {
    private final ModeloEspecialidad modelo;
    private final VistaEspecialidad vista;

    public ControladorEspecialidad(ModeloEspecialidad modelo, VistaEspecialidad vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnNuevo.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vista.btnNuevo==e.getSource()){
            limpiar();
        }
        if (this.vista.btnGuardar==e.getSource()){
            modelo.setId(Integer.parseInt(vista.jtxClave.getText()));
            modelo.setNombre(vista.jtxNombre.getText());
            System.out.println(modelo);
        }
        if (this.vista.btnSalir==e.getSource()){
            vista.dispose();
        }
    }
    public void limpiar(){
        this.vista.jtxClave.setText("");
        this.vista.jtxNombre.setText("");
    }
}
