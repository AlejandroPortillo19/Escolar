package org.example.vista;

import javax.swing.*;

public class VistaCatedratico extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelEste;
    public JButton btnNuevo;
    public JButton btnGuardar;
    public JButton btnSalir;
    public JTextField jtxRFC;
    public JTextField jtxNombre;
    private JPanel panelCentro;
    private JLabel lblRFC;
    private JLabel lblNombre;
    private JButton btnModificar;
    private JButton btnEliminar;

    public VistaCatedratico(){
        setTitle("Registro de catedratico");
        setContentPane(panelPrincipal);
        setSize(500,180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
