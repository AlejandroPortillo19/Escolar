package org.example.vista;

import javax.swing.*;

public class VistaEspecialidad extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelNorte;
    private JPanel panelSur;
    private JPanel panelCentro;
    public JTextField jtxClave;
    private JLabel lbClave;
    public JTextField jtxNombre;
    private JLabel lblNombre;
    public JButton btnNuevo;
    public JButton btnGuardar;
    public JButton btnSalir;
    private JButton btnModificar;
    private JButton btnEliminar;

    public VistaEspecialidad(){
        setTitle("Catalogo de Especialidad");
        setContentPane(panelPrincipal);
        setSize(500,150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
