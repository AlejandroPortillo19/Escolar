package org.example.vista;

import org.example.modelo.ModeloCatedratico;

import javax.swing.*;

public class VistaGrupo extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelCemtral;
    public JTextField jtxClave;
    public JComboBox cmbMaterias;
    //public JComboBox cmbCatedratico;
    public JComboBox<ModeloCatedratico> cmbCatedratico = new JComboBox<>();

    public JComboBox cmbHora;
    public JTextField jtxSalon;
    public JList lstAlumnos;
    private JLabel lblClave;
    private JLabel lblMateria;
    private JLabel lblCatedratico;
    private JLabel lblHora;
    private JLabel lblSalon;
    private JLabel lblAlumnos;
    public JButton btnGuardar;
    public JButton btnSalir;
    private JPanel panelEste;
    private JPanel panelOeste;
    private JPanel panelNorte;
    private JButton btnModificar;
    private JButton btnEliminar;


    public VistaGrupo(){
        setTitle("Alta de Grupo");
        setContentPane(panelPrincipal);
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        //cmbCatedratico.addItem(ControladorCatedratico);



    }
}
