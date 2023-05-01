package org.example.controlador;
import org.example.modelo.ModeloMateria;
import org.example.vista.VistaMateria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class ControladorMateria implements ActionListener {

    private final ModeloMateria modeloMateria;
    private final VistaMateria vistaMateria;
    ArrayList<ModeloMateria> materiaArrayList = new ArrayList<ModeloMateria>();


    public ControladorMateria(ModeloMateria modeloMateria, VistaMateria vistaMateria) {
        this.modeloMateria = modeloMateria;
        this.vistaMateria = vistaMateria;
        this.vistaMateria.btnGuardar.addActionListener(this);
        this.vistaMateria.btnNuevo.addActionListener(this);
        this.vistaMateria.btnSalir.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vistaMateria.btnNuevo==e.getSource()){
            limpiar();
        }
        if (this.vistaMateria.btnGuardar==e.getSource()){
            modeloMateria.setId(Integer.parseInt(vistaMateria.jtxClave.getText()));
            modeloMateria.setNombre(vistaMateria.jtxNombre.getText());
            materiaArrayList.add(modeloMateria);
            System.out.println(modeloMateria);
            System.out.println(materiaArrayList);
        }
        if (this.vistaMateria.btnSalir==e.getSource()){
            vistaMateria.dispose();
        }
    }

    public void limpiar(){
        this.vistaMateria.jtxClave.setText("");
        this.vistaMateria.jtxNombre.setText("");
    }
}
