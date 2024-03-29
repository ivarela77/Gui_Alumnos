package guiAlumnado;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author IvI
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Alumno> listaAlumnos=new ArrayList();
    int indice;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        buttonGroup1.add(rdbSi);
        buttonGroup1.add(rdbNo);
        
        listaAlumnos=Metodos.cargarCopia();

        if(listaAlumnos.isEmpty()){
            btnEliminar.setEnabled(false);
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(false);  
        }else if(listaAlumnos.size()==1){ 
            txtDni.setText(listaAlumnos.get(0).getDni());
            txtNombre.setText(listaAlumnos.get(0).getNombre());
            txtEdad.setText(String.valueOf(listaAlumnos.get(0).getEdad()));
            txtCurso.setText(listaAlumnos.get(0).getCurso());
            txtNota.setText(String.valueOf(listaAlumnos.get(0).getNota()));
            boolean rept=listaAlumnos.get(0).isRepite();
            if(rept==true){rdbSi.setSelected(true);}
            else{rdbNo.setSelected(true);}
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(false);
            btnEliminar.setEnabled(true);
            indice=0;
        }else {
            txtDni.setText(listaAlumnos.get(0).getDni());
            txtNombre.setText(listaAlumnos.get(0).getNombre());
            txtEdad.setText(String.valueOf(listaAlumnos.get(0).getEdad()));
            txtCurso.setText(listaAlumnos.get(0).getCurso());
            txtNota.setText(String.valueOf(listaAlumnos.get(0).getNota()));
            boolean rept=listaAlumnos.get(0).isRepite();
            if(rept==true){rdbSi.setSelected(true);}
            else{rdbNo.setSelected(true);}
            btnAnterior.setEnabled(false);
            indice=0;
        }
    }

    public Image getIconImage() {
        Image imagen = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono5final.png"));
        return imagen;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdbSi = new javax.swing.JRadioButton();
        rdbNo = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/button_salir1.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setIconTextGap(-3);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/button_salir.png"))); // NOI18N
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 110, 70));

        jPanel1.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 45)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ALUMNADO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 330, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204)), "IES. Fernando Swirtz", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gabriola", 1, 26), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DNI");

        txtDni.setEditable(false);
        txtDni.setBackground(new java.awt.Color(68, 72, 73));
        txtDni.setFont(new java.awt.Font("Felix Titling", 0, 15)); // NOI18N
        txtDni.setForeground(java.awt.Color.white);
        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE");

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(68, 72, 73));
        txtNombre.setFont(new java.awt.Font("Felix Titling", 0, 15)); // NOI18N
        txtNombre.setForeground(java.awt.Color.white);
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EDAD");

        txtEdad.setEditable(false);
        txtEdad.setBackground(new java.awt.Color(68, 72, 73));
        txtEdad.setFont(new java.awt.Font("Felix Titling", 0, 15)); // NOI18N
        txtEdad.setForeground(java.awt.Color.white);
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CURSO");

        txtCurso.setEditable(false);
        txtCurso.setBackground(new java.awt.Color(68, 72, 73));
        txtCurso.setFont(new java.awt.Font("Felix Titling", 0, 15)); // NOI18N
        txtCurso.setForeground(java.awt.Color.white);
        txtCurso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOTA");

        txtNota.setEditable(false);
        txtNota.setBackground(new java.awt.Color(68, 72, 73));
        txtNota.setFont(new java.awt.Font("Felix Titling", 0, 15)); // NOI18N
        txtNota.setForeground(java.awt.Color.white);
        txtNota.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("REPITE");

        rdbSi.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        rdbSi.setForeground(new java.awt.Color(255, 255, 255));
        rdbSi.setText("SI");
        rdbSi.setEnabled(false);

        rdbNo.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        rdbNo.setForeground(new java.awt.Color(255, 255, 255));
        rdbNo.setText("NO");
        rdbNo.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(txtCurso)
                                    .addComponent(txtNota)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(txtDni)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbSi)
                        .addGap(33, 33, 33)
                        .addComponent(rdbNo)
                        .addGap(87, 87, 87))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbSi)
                        .addComponent(rdbNo))
                    .addComponent(jLabel6))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 70, 470, -1));

        jPanel3.setOpaque(false);

        btnEliminar.setBackground(new java.awt.Color(0, 102, 204));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0, 102, 204));
        btnNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(0, 102, 204));
        btnAnterior.setForeground(new java.awt.Color(0, 0, 0));
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(0, 102, 204));
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnSiguiente)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 470, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/[000457].jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Metodos.eliminarAlumno(listaAlumnos, indice);
        
        if((indice==0)&&(listaAlumnos.size()>1)){
            txtDni.setText(listaAlumnos.get(indice).getDni());
            txtNombre.setText(listaAlumnos.get(indice).getNombre());
            txtEdad.setText(String.valueOf(listaAlumnos.get(indice).getEdad()));
            txtCurso.setText(listaAlumnos.get(indice).getCurso());
            txtNota.setText(String.valueOf(listaAlumnos.get(indice).getNota()));
            buttonGroup1.clearSelection();
            btnEliminar.setEnabled(true);
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(true);
            
        }else if((indice==0)&&(listaAlumnos.size()==1)){
            txtDni.setText(listaAlumnos.get(indice).getDni());
            txtNombre.setText(listaAlumnos.get(indice).getNombre());
            txtEdad.setText(String.valueOf(listaAlumnos.get(indice).getEdad()));
            txtCurso.setText(listaAlumnos.get(indice).getCurso());
            txtNota.setText(String.valueOf(listaAlumnos.get(indice).getNota()));
            buttonGroup1.clearSelection();
            boolean rept=listaAlumnos.get(0).isRepite();
            if(rept==true){rdbSi.setSelected(true);}
            else{rdbNo.setSelected(true);}
            
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(false);
            btnEliminar.setEnabled(true);
        }else if((indice==0)&&(listaAlumnos.size()==0)){
            txtDni.setText("");
            txtNombre.setText("");
            txtEdad.setText("");
            txtCurso.setText("");
            txtNota.setText("");
            buttonGroup1.clearSelection();
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
        else if(indice==1){
            txtDni.setText(listaAlumnos.get(indice-1).getDni());
            txtNombre.setText(listaAlumnos.get(indice-1).getNombre());
            txtEdad.setText(String.valueOf(listaAlumnos.get(indice-1).getEdad()));
            txtCurso.setText(listaAlumnos.get(indice-1).getCurso());
            txtNota.setText(String.valueOf(listaAlumnos.get(indice-1).getNota()));
            boolean rept=listaAlumnos.get(indice-1).isRepite();
            if(rept==true){rdbSi.setSelected(true);}
            else{rdbNo.setSelected(true);}
            indice=indice-1;
            btnAnterior.setEnabled(false);
        }
        else if((indice>=1)&&(indice==listaAlumnos.size())){
            txtDni.setText(listaAlumnos.get(indice-1).getDni());
            txtNombre.setText(listaAlumnos.get(indice-1).getNombre());
            txtEdad.setText(String.valueOf(listaAlumnos.get(indice-1).getEdad()));
            txtCurso.setText(listaAlumnos.get(indice-1).getCurso());
            txtNota.setText(String.valueOf(listaAlumnos.get(indice-1).getNota()));
            boolean rept=listaAlumnos.get(indice-1).isRepite();
            if(rept==true){rdbSi.setSelected(true);}
            else{rdbNo.setSelected(true);}
            indice=listaAlumnos.size()-1;
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        indice=indice+1;
        if((indice>0)||(indice==listaAlumnos.size()-1)){
            btnAnterior.setEnabled(true);
        }else{
            btnAnterior.setEnabled(false);
        }
        if(indice==listaAlumnos.size()-1){
            btnSiguiente.setEnabled(false);
        }
        txtDni.setText(listaAlumnos.get(indice).getDni());
        txtNombre.setText(listaAlumnos.get(indice).getNombre());
        txtEdad.setText(String.valueOf(listaAlumnos.get(indice).getEdad()));
        txtCurso.setText(listaAlumnos.get(indice).getCurso());
        txtNota.setText(String.valueOf(listaAlumnos.get(indice).getNota()));
        boolean rept=listaAlumnos.get(indice).isRepite();
        if(rept==true){rdbSi.setSelected(true);}
        else{rdbNo.setSelected(true);}
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        indice=indice-1;
        if((indice==0)&&(indice<listaAlumnos.size())){
            btnAnterior.setEnabled(false);
            btnSiguiente.setEnabled(true);
        }
        if(indice>0){
            btnAnterior.setEnabled(true);
            btnSiguiente.setEnabled(true);
        }
        txtDni.setText(listaAlumnos.get(indice).getDni());
        txtNombre.setText(listaAlumnos.get(indice).getNombre());
        txtEdad.setText(String.valueOf(listaAlumnos.get(indice).getEdad()));
        txtCurso.setText(listaAlumnos.get(indice).getCurso());
        txtNota.setText(String.valueOf(listaAlumnos.get(indice).getNota()));
        boolean rept=listaAlumnos.get(indice).isRepite();
        if(rept==true){rdbSi.setSelected(true);}
        else{rdbNo.setSelected(true);}
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        AlumnoNuevo aln= new AlumnoNuevo(this, true);
        aln.setVisible(true);
        String dniN=aln.getTxtDniNA().getText().toUpperCase();
        String nombreN=aln.getTxtNombreNA().getText();
        int edadN=Integer.parseInt(aln.getTxtEdadNA().getText());
        int cursoNA=aln.getCmbxCursoNA().getSelectedIndex();
        String cursoN="";
        switch(cursoNA){
            case 1:{cursoN="Primero";break;}
            case 2:{cursoN="Segundo";break;}
            case 3:{cursoN="Tercero";break;}
            case 4:{cursoN="Cuarto";break;}
        }
        double notaN=Double.parseDouble(aln.getTxtNotaNA().getText());
        boolean repiteN=aln.getRdbSiNA().isSelected();
        Alumno al=new Alumno(dniN,nombreN,edadN,cursoN,notaN,repiteN);
        Metodos.aniadirAlumno(listaAlumnos, al);
        if(listaAlumnos.size()==1){
            txtDni.setText(listaAlumnos.get(0).getDni());
            txtNombre.setText(listaAlumnos.get(0).getNombre());
            txtEdad.setText(String.valueOf(listaAlumnos.get(0).getEdad()));
            
            switch(cursoNA){
                case 1:{cursoN="Primero";break;}
                case 2:{cursoN="Segundo";break;}
                case 3:{cursoN="Tercero";break;}
                case 4:{cursoN="Cuarto";break;}
            }
            txtCurso.setText(cursoN);
            txtNota.setText(String.valueOf(listaAlumnos.get(0).getNota()));
            repiteN=listaAlumnos.get(0).isRepite();
            if(repiteN==true){rdbSi.setSelected(true);}
            else{rdbNo.setSelected(true);}
            btnSiguiente.setEnabled(false);
            btnAnterior.setEnabled(false);
            btnEliminar.setEnabled(true);
        }if(listaAlumnos.size()>=2){
            txtDni.setText(listaAlumnos.get(indice).getDni());
            txtNombre.setText(listaAlumnos.get(indice).getNombre());
            txtEdad.setText(String.valueOf(listaAlumnos.get(indice).getEdad()));
            
            switch(cursoNA){
                case 1:{cursoN="Primero";break;}
                case 2:{cursoN="Segundo";break;}
                case 3:{cursoN="Tercero";break;}
                case 4:{cursoN="Cuarto";break;}
            }
            txtCurso.setText(cursoN);
            txtNota.setText(String.valueOf(listaAlumnos.get(indice).getNota()));
            repiteN=listaAlumnos.get(indice).isRepite();
            if(repiteN==true){rdbSi.setSelected(true);}
            else{rdbNo.setSelected(true);}
            btnSiguiente.setEnabled(true);
            btnAnterior.setEnabled(false);
            btnEliminar.setEnabled(true);
        }
        JOptionPane.showMessageDialog(this, "Alumno nuevo\n  AÑADIDO!!!", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Metodos.hacerCopia(listaAlumnos);
        JOptionPane.showMessageDialog(this, "Copia realizada con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
//        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rdbNo;
    private javax.swing.JRadioButton rdbSi;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
