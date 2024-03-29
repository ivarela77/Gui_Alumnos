package guiAlumnado;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author IvI
 */
public class AlumnoNuevo extends javax.swing.JDialog {

    /**
     * Creates new form AlumnoNuevo
     */
    public AlumnoNuevo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        this.setLocationRelativeTo(parent);
        buttonGroup1.add(rdbNoNA);
        buttonGroup1.add(rdbSiNA); 
    }

    public JTextField getTxtDniNA() {
        return txtDniNA;
    }

    public void setTxtDniNA(JTextField txtDniNA) {
        this.txtDniNA = txtDniNA;
    }

    public JComboBox<String> getCmbxCursoNA() {
        return cmbxCursoNA;
    }

    public void setCmbxCursoNA(JComboBox<String> cmbxCursoNA) {
        this.cmbxCursoNA = cmbxCursoNA;
    }

    public JRadioButton getRdbNoNA() {
        return rdbNoNA;
    }

    public void setRdbNoNA(JRadioButton rdbNoNA) {
        this.rdbNoNA = rdbNoNA;
    }

    public JRadioButton getRdbSiNA() {
        return rdbSiNA;
    }

    public void setRdbSiNA(JRadioButton rdbSiNA) {
        this.rdbSiNA = rdbSiNA;
    }

    public JTextField getTxtEdadNA() {
        return txtEdadNA;
    }

    public void setTxtEdadNA(JTextField txtEdadNA) {
        this.txtEdadNA = txtEdadNA;
    }

    public JTextField getTxtNombreNA() {
        return txtNombreNA;
    }

    public void setTxtNombreNA(JTextField txtNombreNA) {
        this.txtNombreNA = txtNombreNA;
    }

    public JTextField getTxtNotaNA() {
        return txtNotaNA;
    }

    public void setTxtNotaNA(JTextField txtNotaNA) {
        this.txtNotaNA = txtNotaNA;
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDniNA = new javax.swing.JTextField();
        txtNombreNA = new javax.swing.JTextField();
        txtEdadNA = new javax.swing.JTextField();
        cmbxCursoNA = new javax.swing.JComboBox<>();
        txtNotaNA = new javax.swing.JTextField();
        rdbSiNA = new javax.swing.JRadioButton();
        rdbNoNA = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 45)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alumno Nuevo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 397, -1));

        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EDAD");

        jLabel5.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CURSO");

        jLabel6.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOTA");

        jLabel7.setFont(new java.awt.Font("Felix Titling", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REPITE");

        txtDniNA.setBackground(new java.awt.Color(68, 72, 73));
        txtDniNA.setForeground(new java.awt.Color(255, 255, 255));
        txtDniNA.setOpaque(false);

        txtNombreNA.setBackground(new java.awt.Color(68, 72, 73));
        txtNombreNA.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreNA.setOpaque(false);

        txtEdadNA.setBackground(new java.awt.Color(68, 72, 73));
        txtEdadNA.setForeground(new java.awt.Color(255, 255, 255));
        txtEdadNA.setOpaque(false);

        cmbxCursoNA.setBackground(new java.awt.Color(67, 70, 71));
        cmbxCursoNA.setFont(new java.awt.Font("Gabriola", 0, 16)); // NOI18N
        cmbxCursoNA.setForeground(new java.awt.Color(255, 255, 255));
        cmbxCursoNA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar un curso...", "Primero", "Segundo", "Tercero", "Cuarto" }));

        txtNotaNA.setBackground(new java.awt.Color(68, 72, 73));
        txtNotaNA.setForeground(new java.awt.Color(255, 255, 255));
        txtNotaNA.setOpaque(false);

        rdbSiNA.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        rdbSiNA.setForeground(new java.awt.Color(255, 255, 255));
        rdbSiNA.setText("SI");

        rdbNoNA.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        rdbNoNA.setForeground(new java.awt.Color(255, 255, 255));
        rdbNoNA.setText("NO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreNA, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDniNA, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdadNA, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7)
                        .addGap(71, 71, 71)
                        .addComponent(rdbSiNA)
                        .addGap(18, 18, 18)
                        .addComponent(rdbNoNA))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNotaNA, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbxCursoNA, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDniNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdadNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbxCursoNA, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNotaNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rdbSiNA)
                    .addComponent(rdbNoNA))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 400, -1));

        jPanel3.setOpaque(false);

        btnCrear.setForeground(new java.awt.Color(0, 0, 0));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 412, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/[000457].jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtDniNA.setText("");
        txtNombreNA.setText("");
        txtEdadNA.setText("");
        cmbxCursoNA.setSelectedIndex(0);
        txtNotaNA.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        boolean r1=Metodos.validarDni(txtDniNA.getText());
        boolean r2=Metodos.ComprobarNombre(txtNombreNA.getText());
        boolean r3=Metodos.ComprobarEdad(txtEdadNA.getText());
        boolean r4=Metodos.ComprobarCurso((String)cmbxCursoNA.getSelectedItem());
        boolean r5=Metodos.ComprobarNota(txtNotaNA.getText());
        boolean r6=Metodos.ComprobarRepite(rdbSiNA.isSelected(),rdbNoNA.isSelected());

        if((r1==true)&&(r2==true)&&(r3==true)&&(r4==true)&&(r5==true)&&(r6==true)){
            this.dispose();
        }else if(r1==false){
            JOptionPane.showMessageDialog(this, "El Dni no es Válido, ingresa un Dni correcto", "ERROR CAMPO OBLIGATORIO", JOptionPane.ERROR_MESSAGE);
        }
        else if(r2==false){
            JOptionPane.showMessageDialog(this, "El Nombre del Alumno no puede estar vacio", "ERROR CAMPO OBLIGATORIO", JOptionPane.ERROR_MESSAGE);
        }else if(r3==false){
            JOptionPane.showMessageDialog(this, "La Edad del Alumno tiene que estar entre 1 y 125", "ERROR DE VALORES", JOptionPane.ERROR_MESSAGE);
            txtEdadNA.setText("");
            txtEdadNA.requestFocus();
        }else if(r4==false){
            JOptionPane.showMessageDialog(this, "Selecciona en que Curso está el Alumno", "ERROR CAMPO OBLIGATORIO", JOptionPane.ERROR_MESSAGE);
        }else if(r5==false){
            JOptionPane.showMessageDialog(this, "La Nota tiene que estar entre 0 y 10\n\nFormatos Admitidos: \" 5.5 - 5 \" ", "ERROR DE VALORES", JOptionPane.ERROR_MESSAGE);
            txtNotaNA.requestFocus();
        }else if(r6==false){
            JOptionPane.showMessageDialog(this, "Selecciona si el Alumno está Repitiendo curso", "ERROR CAMPO OBLIGATORIO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

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
            java.util.logging.Logger.getLogger(AlumnoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlumnoNuevo dialog = new AlumnoNuevo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbxCursoNA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rdbNoNA;
    private javax.swing.JRadioButton rdbSiNA;
    private javax.swing.JTextField txtDniNA;
    private javax.swing.JTextField txtEdadNA;
    private javax.swing.JTextField txtNombreNA;
    private javax.swing.JTextField txtNotaNA;
    // End of variables declaration//GEN-END:variables
}
