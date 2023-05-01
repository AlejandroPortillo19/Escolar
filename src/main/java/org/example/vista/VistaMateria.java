package org.example.vista;

import javax.swing.*;

public class VistaMateria extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelNorte;
    private JPanel panelCentro;
    private JPanel panelSur;
    public JButton btnNuevo;
    public JButton btnGuardar;
    public JButton btnSalir;
    private JLabel lblClave;
    private JLabel lblNombre;
    public JTextField jtxClave;
    public JTextField jtxNombre;
    private JButton btnModificar;
    private JButton btnEliminar;

    public VistaMateria() {
        setTitle("Calendario de Materia");
        setContentPane(panelPrincipal);
        setSize(500,210);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
