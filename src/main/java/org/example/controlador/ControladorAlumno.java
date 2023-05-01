package org.example.controlador;

/*import org.example.modelo.ModeloAlumno;
import org.example.vista.VistaAlumno;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAlumno implements ActionListener {
    private final ModeloAlumno modeloAlumno;
    private final VistaAlumno vistaAlumno;

    public ControladorAlumno(ModeloAlumno modeloAlumno, VistaAlumno vistaAlumno) {
        this.modeloAlumno = modeloAlumno;
        this.vistaAlumno = vistaAlumno;
        this.vistaAlumno.btnGuardar.addActionListener(this);
        this.vistaAlumno.btnAgregar.addActionListener(this);
        this.vistaAlumno.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vistaAlumno.btnAgregar==e.getSource()){
            limpiar();
        }
        if (this.vistaAlumno.btnGuardar==e.getSource()){
            modeloAlumno.setNumControl(Integer.parseInt(vistaAlumno.jtxNumControl.getText()));
            modeloAlumno.setNombre(vistaAlumno.jtxNombre.getText());
            modeloAlumno.getespecialidad().setNombre(vistaAlumno.jtxEspecialidad.getText());
            System.out.println(modeloAlumno);

        }
        if (this.vistaAlumno.btnSalir==e.getSource()){
            System.exit(0);
        }
    }
    public void limpiar(){
        this.vistaAlumno.jtxNumControl.setText("");
        this.vistaAlumno.jtxNombre.setText("");
        this.vistaAlumno.jtxEspecialidad.setText("");
    }
}*/
import org.example.modelo.ModeloAlumno;
import org.example.vista.VistaAlumno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorAlumno implements ActionListener {
    private final ModeloAlumno modeloAlumno;
    private final VistaAlumno vistaAlumno;
     ArrayList<ModeloAlumno> alumnoArrayList = new ArrayList<ModeloAlumno>();

    public ControladorAlumno(ModeloAlumno modeloAlumno, VistaAlumno vistaAlumno) {
        this.modeloAlumno = modeloAlumno;
        this.vistaAlumno = vistaAlumno;
        //this.listaAlumnos = new ArrayList<>();
        this.vistaAlumno.btnGuardar.addActionListener(this);
        this.vistaAlumno.btnAgregar.addActionListener(this);
        this.vistaAlumno.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vistaAlumno.btnAgregar==e.getSource()){
            limpiar();
        }
        if (this.vistaAlumno.btnGuardar==e.getSource()){
            modeloAlumno.setNumControl(Integer.parseInt(vistaAlumno.jtxNumControl.getText()));
            modeloAlumno.setNombre(vistaAlumno.jtxNombre.getText());
            modeloAlumno.getEspecialidad().setNombre(vistaAlumno.jtxEspecialidad.getText());
            alumnoArrayList.add(modeloAlumno); // Agregar el objeto ModeloAlumno a la lista
            System.out.println(alumnoArrayList);
            //System.out.println(listaAlumnos); // Imprimir la lista de alumnos en consola

        }
        if (this.vistaAlumno.btnSalir==e.getSource()){
            vistaAlumno.dispose();
        }
    }
    public void limpiar(){
        this.vistaAlumno.jtxNumControl.setText("");
        this.vistaAlumno.jtxNombre.setText("");
        this.vistaAlumno.jtxEspecialidad.setText("");
    }
}

