package lab5_alessandroreyes;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class PrincipalL extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalL
     */
    public PrincipalL() {
        initComponents();
        //Licenciaturas-------------------------------------------------------------------------------------------
        Carrera c = new Carrera("Finanzas", "Licenciatura", 8000, "Clementina");
        carreras.add(c);
        c = new Carrera("Derecho", "Licenciatura", 8000, "Clementina");
        carreras.add(c);
        c = new Carrera("Administracion de Empresa", "Licenciatura", 8000, "Clementina");
        carreras.add(c);
        c = new Carrera("Diseño Grafico", "Licenciatura", 8500, "Clementina");
        carreras.add(c);
        c = new Carrera("Mercadoctenia", "Licenciatura", 8000, "Clementina");
        carreras.add(c);
        //Ingenieras------------------------------------------------------------------------------------------------
        c = new Carrera("Sistemas Computacionales", "Ingenieria", 9000, "Reynod");
        carreras.add(c);
        c = new Carrera("Industrial y de Sistemas", "Ingenieria", 9000, "Reynold");
        carreras.add(c);
        c = new Carrera("Mecatronica", "Ingenieria", 9000, "Reynold");
        carreras.add(c);
        c = new Carrera("Biomedica", "Ingenieria", 9000, "Reynold");
        carreras.add(c);
        c = new Carrera("Energia", "Ingenieria", 9000, "Reynold");
        carreras.add(c);
        //ciencias de la salud---------------------------------------------------------------------------------------
        c = new Carrera("Medicina y Cirugia", "Ciencias de la Salud", 15000, "Marlon");
        carreras.add(c);
        c = new Carrera("Odontologia", "Ciencias de la Salud", 11000, "Marlon");
        carreras.add(c);
        c = new Carrera("Nutricion", "Ciencias de la Salud", 9000, "Marlon");
        carreras.add(c);
        c = new Carrera("Terapia Fisica y Ocupacional", "Ciencias de la Salud", 9000, "Marlon");
        carreras.add(c);
        //Estudiantes-----------------------------------------------------------------------------------------------
        Estudiante es = new Estudiante("Alessandro", "Reyes", 11911224, 19, true, carreras.get(5));
        estudiantes.add(es);
        es = new Estudiante("Alvaro", "Reyes", 11611224, 24, true, carreras.get(5));
        estudiantes.add(es);
        es = new Estudiante("Daniel", "Trimarchi", 11711224, 20, true, carreras.get(5));
        estudiantes.add(es);
        es = new Estudiante("Adriana", "Parodi", 11811224, 19, true, carreras.get(10));
        estudiantes.add(es);
        
        //------------------------------------------------------------------------------------------------
        SpinnerNumberModel YY = new SpinnerNumberModel();
        YY.setMinimum(16);
        YY.setValue(16);
        js_estu_edad.setModel(YY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crear_estudiante = new javax.swing.JDialog();
        btn_crearE_regresar = new javax.swing.JButton();
        btn_crear_estudiante = new javax.swing.JButton();
        tf_estudiante_nombre = new javax.swing.JTextField();
        tf_estudiante_apellido = new javax.swing.JTextField();
        tf_estudiante_cuenta = new javax.swing.JTextField();
        js_estu_edad = new javax.swing.JSpinner();
        cb_estu_carrera = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rb_m = new javax.swing.JRadioButton();
        rb_f = new javax.swing.JRadioButton();
        bg_genero = new javax.swing.ButtonGroup();
        jd_listar_estudiantes = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_listar_estudiantes = new javax.swing.JList<>();
        btn_listarE_regresar = new javax.swing.JButton();
        jd_arbol = new javax.swing.JDialog();
        btn_arbol_regresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_estudiantes = new javax.swing.JTree();
        pop_op_estu = new javax.swing.JPopupMenu();
        Agregar_arbol = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        Acciones = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmi_crear_estudiantes = new javax.swing.JMenuItem();
        jmi_listar_estudiantes = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmi_crear_maestros = new javax.swing.JMenuItem();
        jmi_listar_maestros = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_crear_carreras = new javax.swing.JMenuItem();
        jmi_listar_carreras = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmi_crear_clases = new javax.swing.JMenuItem();
        jmi_listar_clases = new javax.swing.JMenuItem();
        jmi_arbol = new javax.swing.JMenuItem();

        btn_crearE_regresar.setText("Regresar");
        btn_crearE_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearE_regresarMouseClicked(evt);
            }
        });

        btn_crear_estudiante.setText("Crear");
        btn_crear_estudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crear_estudianteMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Numero de cuenta");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Edad");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Genero");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Carrera");

        bg_genero.add(rb_m);
        rb_m.setSelected(true);
        rb_m.setText("M");

        bg_genero.add(rb_f);
        rb_f.setText("F");

        javax.swing.GroupLayout jd_crear_estudianteLayout = new javax.swing.GroupLayout(jd_crear_estudiante.getContentPane());
        jd_crear_estudiante.getContentPane().setLayout(jd_crear_estudianteLayout);
        jd_crear_estudianteLayout.setHorizontalGroup(
            jd_crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crear_estudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_crearE_regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jd_crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crear_estudianteLayout.createSequentialGroup()
                        .addComponent(rb_m)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_f))
                    .addGroup(jd_crear_estudianteLayout.createSequentialGroup()
                        .addComponent(cb_estu_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(btn_crear_estudiante))
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(jd_crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_estudiante_cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                        .addComponent(tf_estudiante_apellido)
                        .addComponent(tf_estudiante_nombre))
                    .addComponent(js_estu_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        jd_crear_estudianteLayout.setVerticalGroup(
            jd_crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crear_estudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_estudiante_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_estudiante_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_estudiante_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(js_estu_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_m)
                    .addComponent(rb_f))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jd_crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crear_estudianteLayout.createSequentialGroup()
                        .addGroup(jd_crear_estudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_crearE_regresar)
                            .addComponent(btn_crear_estudiante))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crear_estudianteLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_estu_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        jl_listar_estudiantes.setModel(new DefaultListModel());
        jl_listar_estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_listar_estudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_listar_estudiantes);

        btn_listarE_regresar.setText("Regresar");
        btn_listarE_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_listarE_regresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_listar_estudiantesLayout = new javax.swing.GroupLayout(jd_listar_estudiantes.getContentPane());
        jd_listar_estudiantes.getContentPane().setLayout(jd_listar_estudiantesLayout);
        jd_listar_estudiantesLayout.setHorizontalGroup(
            jd_listar_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listar_estudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_listarE_regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        jd_listar_estudiantesLayout.setVerticalGroup(
            jd_listar_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_listar_estudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_listar_estudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_listar_estudiantesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_listarE_regresar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_arbol_regresar.setText("Regresar");
        btn_arbol_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_arbol_regresarMouseClicked(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Carreras");
        jt_estudiantes.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jt_estudiantes);

        javax.swing.GroupLayout jd_arbolLayout = new javax.swing.GroupLayout(jd_arbol.getContentPane());
        jd_arbol.getContentPane().setLayout(jd_arbolLayout);
        jd_arbolLayout.setHorizontalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbolLayout.createSequentialGroup()
                .addGroup(jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_arbolLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_arbol_regresar))
                    .addGroup(jd_arbolLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jd_arbolLayout.setVerticalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_arbolLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btn_arbol_regresar)
                .addContainerGap())
        );

        Agregar_arbol.setText("Agregar al Arbol");
        Agregar_arbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_arbolActionPerformed(evt);
            }
        });
        pop_op_estu.add(Agregar_arbol);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Acciones.setText("Acciones");

        jMenu3.setText("Estudiantes");

        jmi_crear_estudiantes.setText("Crear");
        jmi_crear_estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crear_estudiantesActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_crear_estudiantes);

        jmi_listar_estudiantes.setText("Listar");
        jmi_listar_estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_listar_estudiantesActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_listar_estudiantes);

        Acciones.add(jMenu3);

        jMenu1.setText("Maestros");

        jmi_crear_maestros.setText("Crear");
        jMenu1.add(jmi_crear_maestros);

        jmi_listar_maestros.setText("Listar");
        jMenu1.add(jmi_listar_maestros);

        Acciones.add(jMenu1);

        jMenu2.setText("Carreras");

        jmi_crear_carreras.setText("Crear");
        jMenu2.add(jmi_crear_carreras);

        jmi_listar_carreras.setText("Listar");
        jMenu2.add(jmi_listar_carreras);

        Acciones.add(jMenu2);

        jMenu4.setText("Clases");

        jmi_crear_clases.setText("Crear");
        jMenu4.add(jmi_crear_clases);

        jmi_listar_clases.setText("Listar");
        jMenu4.add(jmi_listar_clases);

        Acciones.add(jMenu4);

        jmi_arbol.setText("Arbol");
        jmi_arbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_arbolActionPerformed(evt);
            }
        });
        Acciones.add(jmi_arbol);

        jMenuBar1.add(Acciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_crear_estudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crear_estudiantesActionPerformed
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(carreras.toArray());
        cb_estu_carrera.setModel(modelo);
        this.setVisible(false);
        jd_crear_estudiante.setModal(true);
        jd_crear_estudiante.pack();
        jd_crear_estudiante.setLocationRelativeTo(this);
        jd_crear_estudiante.setVisible(true);
    }//GEN-LAST:event_jmi_crear_estudiantesActionPerformed

    private void btn_crear_estudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crear_estudianteMouseClicked
        boolean bandera = true;
        for (int i = 0; i < estudiantes.size(); i++) {
            if(Integer.parseInt(tf_estudiante_cuenta.getText()) == estudiantes.get(i).getCuenta()){
                JOptionPane.showMessageDialog(jd_crear_estudiante, "Error, el numero de cuenta ya esta asignado.");
                bandera = false;
                tf_estudiante_cuenta.setText("");
                break;
            }
        }
        if(tf_estudiante_cuenta.getText() == null){
            JOptionPane.showMessageDialog(jd_crear_estudiante, "Tiene que ingresar un numero de cuenta.");
            bandera = false;
        }
        if(tf_estudiante_apellido.getText() == null){
            JOptionPane.showMessageDialog(jd_crear_estudiante, "Tiene que ingresar un apellido");
            bandera = false;
        }
        if(tf_estudiante_nombre.getText() == null){
            JOptionPane.showMessageDialog(jd_crear_estudiante, "Tiene que ingresar un nombre");
            bandera = false;
        }
        boolean g = true;
        int x=0;
        if(bandera){
            for (int i = 0; i < carreras.size(); i++) {
                if(cb_estu_carrera.getSelectedItem().toString().equals(carreras.get(i).getNombre())){
                    x = i;
                    break;
                }
            }
            if(rb_m.isSelected()){
                g = true;
            } else {
                g = false;
            }
            Estudiante e = new Estudiante(tf_estudiante_nombre.getText(), tf_estudiante_apellido.getText(),
                    Integer.parseInt(tf_estudiante_cuenta.getText()), js_estu_edad.getComponentCount(),
                    g, carreras.get(x));
            estudiantes.add(e);
            JOptionPane.showMessageDialog(jd_crear_estudiante, "El estudiante fue creado con exito.");
            tf_estudiante_apellido.setText("");
            tf_estudiante_cuenta.setText("");
            tf_estudiante_nombre.setText("");
            cb_estu_carrera.setSelectedIndex(0);
            rb_m.setSelected(true);
            SpinnerNumberModel YY = new SpinnerNumberModel();
            YY.setMinimum(16);
            YY.setValue(16);
            js_estu_edad.setModel(YY);
        }
    }//GEN-LAST:event_btn_crear_estudianteMouseClicked

    private void btn_crearE_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearE_regresarMouseClicked
        tf_estudiante_apellido.setText("");
        tf_estudiante_cuenta.setText("");
        tf_estudiante_nombre.setText("");
        cb_estu_carrera.setSelectedIndex(0);
        rb_m.setSelected(true);
        SpinnerNumberModel YY = new SpinnerNumberModel();
        YY.setMinimum(16);
        YY.setValue(16);
        js_estu_edad.setModel(YY);
        jd_crear_estudiante.setModal(false);
        jd_crear_estudiante.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(this);
    }//GEN-LAST:event_btn_crearE_regresarMouseClicked

    private void jmi_listar_estudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_listar_estudiantesActionPerformed
        DefaultListModel modeloLISTA = (DefaultListModel) jl_listar_estudiantes.getModel();
        
        for (int i = 0; i < estudiantes.size(); i++) {
            modeloLISTA.addElement(new Estudiante(estudiantes.get(i).getNombre(), estudiantes.get(i).getApellido(), 
            estudiantes.get(i).getCuenta(), estudiantes.get(i).getEdad(), estudiantes.get(i).isGenero(), estudiantes.get(i).getCarrera()));
        }
        jl_listar_estudiantes.setModel(modeloLISTA);
        this.setVisible(false);
        jd_listar_estudiantes.setModal(true);
        jd_listar_estudiantes.pack();
        jd_listar_estudiantes.setLocationRelativeTo(this);
        jd_listar_estudiantes.setVisible(true);
    }//GEN-LAST:event_jmi_listar_estudiantesActionPerformed

    private void btn_listarE_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_listarE_regresarMouseClicked
        jd_listar_estudiantes.setModal(false);
        jd_listar_estudiantes.setVisible(false);
        
        this.setVisible(true);
        this.setLocationRelativeTo(this);
    }//GEN-LAST:event_btn_listarE_regresarMouseClicked

    private void jl_listar_estudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_listar_estudiantesMouseClicked
        if (jl_listar_estudiantes.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                pop_op_estu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_listar_estudiantesMouseClicked

    private void Agregar_arbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_arbolActionPerformed
        if (jl_listar_estudiantes.getSelectedIndex() >= 0) {
            DefaultTreeModel modeloARBOL = (DefaultTreeModel) jt_estudiantes.getModel();
            DefaultMutableTreeNode raiz
                    = (DefaultMutableTreeNode) modeloARBOL.getRoot();
            //obtener la persona a guardar
            DefaultListModel modeloLISTA
                    = (DefaultListModel) jl_listar_estudiantes.getModel();
            String nombre, apellido;
            int cuenta, edad;
            boolean gene;
            Carrera ca;
            nombre = ((Estudiante) modeloLISTA.get(
                    jl_listar_estudiantes.getSelectedIndex())).getNombre();
            apellido = ((Estudiante) modeloLISTA.get(
                    jl_listar_estudiantes.getSelectedIndex())).getApellido();
            cuenta = ((Estudiante) modeloLISTA.get(
                    jl_listar_estudiantes.getSelectedIndex())).getEdad();
            edad = ((Estudiante) modeloLISTA.get(
                    jl_listar_estudiantes.getSelectedIndex())).getCuenta();
            gene = ((Estudiante) modeloLISTA.get(
                    jl_listar_estudiantes.getSelectedIndex())).isGenero();
            ca = ((Estudiante) modeloLISTA.get(
                    jl_listar_estudiantes.getSelectedIndex())).getCarrera();
            int centinela = -1;
            boolean a = false;
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().equals(ca)) {
                    for (int j = 0; j < raiz.getChildAt(i).getChildCount(); j++) {
                        if (raiz.getChildAt(i).getChildAt(j).toString().equals(nombre)) {
                            a = true;
                            JOptionPane.showMessageDialog(this, "la persona ya existe");
                            break;
                        } else if (j == raiz.getChildAt(i).getChildCount()-1
                                && !raiz.getChildAt(i).getChildAt(j).toString().equals(nombre)) {
                            a = true;
                            DefaultMutableTreeNode p
                                    = new DefaultMutableTreeNode(
                                            new Estudiante(nombre, apellido, cuenta, edad, gene, ca));
                            ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                            break;
                        }//fin del elseif
                    }//fin del for2
                    if (a == true) {
                        centinela = 1;
                    }
                }//fin if
            }//fin for1
            if (centinela == -1) {
                DefaultMutableTreeNode n
                        = new DefaultMutableTreeNode(ca);
                DefaultMutableTreeNode p
                        = new DefaultMutableTreeNode(
                                new Estudiante(nombre, apellido, cuenta, edad, gene, ca));
                n.add(p);
                raiz.add(n);
            }//fin if
            modeloARBOL.reload();
        } else {
            JOptionPane.showMessageDialog(this, "No hay persona seleccionada");
        }
    }//GEN-LAST:event_Agregar_arbolActionPerformed

    private void jmi_arbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_arbolActionPerformed
        this.setVisible(false);
        jd_arbol.setModal(true);
        jd_arbol.pack();
        jd_arbol.setLocationRelativeTo(this);
        jd_arbol.setVisible(true);
    }//GEN-LAST:event_jmi_arbolActionPerformed

    private void btn_arbol_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_arbol_regresarMouseClicked
        jd_arbol.setModal(false);
        jd_arbol.setVisible(false);
        
        this.setVisible(true);
        this.setLocationRelativeTo(this);
    }//GEN-LAST:event_btn_arbol_regresarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acciones;
    private javax.swing.JMenuItem Agregar_arbol;
    private javax.swing.ButtonGroup bg_genero;
    private javax.swing.JButton btn_arbol_regresar;
    private javax.swing.JButton btn_crearE_regresar;
    private javax.swing.JButton btn_crear_estudiante;
    private javax.swing.JButton btn_listarE_regresar;
    private javax.swing.JComboBox<String> cb_estu_carrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_arbol;
    private javax.swing.JDialog jd_crear_estudiante;
    private javax.swing.JDialog jd_listar_estudiantes;
    private javax.swing.JList<String> jl_listar_estudiantes;
    private javax.swing.JMenuItem jmi_arbol;
    private javax.swing.JMenuItem jmi_crear_carreras;
    private javax.swing.JMenuItem jmi_crear_clases;
    private javax.swing.JMenuItem jmi_crear_estudiantes;
    private javax.swing.JMenuItem jmi_crear_maestros;
    private javax.swing.JMenuItem jmi_listar_carreras;
    private javax.swing.JMenuItem jmi_listar_clases;
    private javax.swing.JMenuItem jmi_listar_estudiantes;
    private javax.swing.JMenuItem jmi_listar_maestros;
    private javax.swing.JSpinner js_estu_edad;
    private javax.swing.JTree jt_estudiantes;
    private javax.swing.JPopupMenu pop_op_estu;
    private javax.swing.JRadioButton rb_f;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JTextField tf_estudiante_apellido;
    private javax.swing.JTextField tf_estudiante_cuenta;
    private javax.swing.JTextField tf_estudiante_nombre;
    // End of variables declaration//GEN-END:variables
    private ArrayList <Estudiante> estudiantes = new ArrayList();
    private ArrayList <Carrera> carreras = new ArrayList();
    private ArrayList <Maestro> maestros = new ArrayList();
    private ArrayList <Clase> clases = new ArrayList();
}
