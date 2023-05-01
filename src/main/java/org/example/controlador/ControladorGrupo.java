package org.example.controlador;

import org.example.modelo.ModeloAlumno;
import org.example.modelo.ModeloGrupo;
import org.example.vista.VistaGrupo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class ControladorGrupo implements ActionListener  {
    private final ModeloGrupo modeloGrupo;
    private final VistaGrupo vistaGrupo;

    public ControladorGrupo(ModeloGrupo modeloGrupo, VistaGrupo vistaGrupo) {
        this.modeloGrupo = modeloGrupo;
        this.vistaGrupo = vistaGrupo;
        this.vistaGrupo.btnGuardar.addActionListener(this);
       // this.vistaGrupo.btnImprimir.addActionListener(this);
        this.vistaGrupo.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if (this.vistaGrupo.btnNuevo==e.getSource()){
            limpiar();
        }*/
        if (this.vistaGrupo.btnGuardar==e.getSource()){
            modeloGrupo.setClave(vistaGrupo.jtxClave.getText());
            modeloGrupo.getMateria().setNombre(vistaGrupo.cmbMaterias.getActionCommand());
            modeloGrupo.getCatedratico().setNombre(vistaGrupo.cmbCatedratico.getActionCommand());
            modeloGrupo.setHora(LocalTime.ofSecondOfDay(Integer.parseInt(vistaGrupo.cmbHora.getActionCommand())));
            modeloGrupo.setSalon(Integer.parseInt(vistaGrupo.jtxSalon.getText()));
            System.out.println(modeloGrupo);
            }

            System.out.println(modeloGrupo);

        if (this.vistaGrupo.btnSalir==e.getSource()){
            vistaGrupo.dispose();
        }
    }
    public void limpiar(){
        this.vistaGrupo.jtxClave.setText("");
        this.vistaGrupo.jtxSalon.setText("");
        //this.vistaGrupo.cmbHora.
    }
}