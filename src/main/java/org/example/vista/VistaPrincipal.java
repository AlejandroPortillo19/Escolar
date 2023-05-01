package org.example.vista;

import javax.swing.*;

public class VistaPrincipal extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelCentral;
    public JButton btnAltaMateria;
    public JButton btnAltaAlumno;
    public JButton btnAltaCatedratico;
    public JButton btnAltaEspecialidad;
    public JButton btnAltaGrupo;
    public JButton btnSalir;

    public VistaPrincipal() {
        setTitle("Escolar_Altas");
        setContentPane(panelPrincipal);
        setSize(450, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
