package org.example.controlador;

import org.example.modelo.*;
import org.example.vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPrincipal implements ActionListener {

    private final VistaPrincipal vp;
   /* private final ControladorMateria cm;
    private final ModeloMateria mm;
    private final VistaMateria vm;
   // private final ControlAlumno ca;
    private final ModeloAlumno ma;
    private final VistaAlumno va;
    private final ControlCatedratico cc;
    private final ModeloCatedratico mc;
    private final VistaCatedratico vc;
    private final ControlEspecialidad ce;
    private final ModeloEspecialidad me;
    private final VistaEspecialidad ve;*/

    public ControlPrincipal(VistaPrincipal vp) {
        this.vp = vp;
        this.vp.btnAltaMateria.addActionListener(this);
        this.vp.btnAltaAlumno.addActionListener(this);
        this.vp.btnAltaCatedratico.addActionListener(this);
        this.vp.btnAltaEspecialidad.addActionListener(this);
        this.vp.btnAltaGrupo.addActionListener(this);
        this.vp.btnSalir.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.vp.btnAltaMateria==e.getSource()){
            //vp.dispose();
            VistaMateria vm=new VistaMateria();
            ModeloMateria mm=new ModeloMateria();
            ControladorMateria cm=new ControladorMateria(mm,vm);
        }
        if (this.vp.btnAltaAlumno==e.getSource()){
            VistaAlumno va=new VistaAlumno();
            ModeloAlumno ma=new ModeloAlumno();
            ControladorAlumno ca=new ControladorAlumno(ma,va);
        }
        if (this.vp.btnAltaCatedratico==e.getSource()){
            VistaCatedratico vc=new VistaCatedratico();
            ModeloCatedratico mc=new ModeloCatedratico();
            ControladorCatedratico cc=new ControladorCatedratico(mc,vc);
        }
        if (this.vp.btnAltaEspecialidad==e.getSource()){
            VistaEspecialidad ve=new VistaEspecialidad();
            ModeloEspecialidad me=new ModeloEspecialidad();
            ControladorEspecialidad ce=new ControladorEspecialidad(me,ve);
        }
        if (this.vp.btnAltaGrupo==e.getSource()){
            VistaGrupo vg=new VistaGrupo();
            ModeloGrupo mg=new ModeloGrupo();
            ControladorGrupo cg=new ControladorGrupo(mg,vg);
        }
        if (this.vp.btnSalir==e.getSource()){
            System.exit(0);
        }

    }
}

