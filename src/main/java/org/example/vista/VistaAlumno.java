package org.example.vista;

import javax.swing.*;

public class VistaAlumno extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelSur;
    private JPanel panelCentro;
    public JTextField jtxNumControl;
    public JTextField jtxNombre;
    private JLabel lblNumControl;
    private JLabel lblNombre;
    private JLabel lblEspecialidad;
    public JTextField jtxEspecialidad;
    public JButton btnSalir;
    public JButton btnGuardar;
    public JButton btnAgregar;
    private JButton btnModificar;
    private JButton btnEliminar;


    public VistaAlumno(){
        setTitle("Registro de Alumno");
        setContentPane(panelPrincipal);
        setSize(500,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
