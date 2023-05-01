package org.example.controlador;

import org.example.modelo.ModeloCatedratico;
import org.example.vista.VistaCatedratico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorCatedratico implements ActionListener {
    private final ModeloCatedratico modeloCatedratico;
    private final VistaCatedratico vistaCatedratico;
    ArrayList<ModeloCatedratico> catedraticoArrayList = new ArrayList<ModeloCatedratico>();
    public ControladorCatedratico(ModeloCatedratico modeloCatedratico, VistaCatedratico vistaCatedratico) {
        this.modeloCatedratico = modeloCatedratico;
        this.vistaCatedratico = vistaCatedratico;
       // this.listaCatedraticos = new ArrayList<>();
        this.vistaCatedratico.btnGuardar.addActionListener(this);
        this.vistaCatedratico.btnNuevo.addActionListener(this);
        this.vistaCatedratico.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vistaCatedratico.btnNuevo==e.getSource()){
            limpiar();
        }
        if (this.vistaCatedratico.btnGuardar==e.getSource()){
            modeloCatedratico.setRfc(vistaCatedratico.jtxRFC.getText());
            modeloCatedratico.setNombre(vistaCatedratico.jtxNombre.getText());
            catedraticoArrayList.add(modeloCatedratico);
            System.out.println(modeloCatedratico);
        }
        if (this.vistaCatedratico.btnSalir==e.getSource()){
            vistaCatedratico.dispose();
        }
    }
    public void limpiar(){
        this.vistaCatedratico.jtxRFC.setText("");
        this.vistaCatedratico.jtxNombre.setText("");
    }
}
