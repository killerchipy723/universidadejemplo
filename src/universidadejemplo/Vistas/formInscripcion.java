
package universidadejemplo.Vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;

import universidadejemplo.AccesoADatos.Conexion;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;


public class formInscripcion extends javax.swing.JFrame {
MateriaData mData = new MateriaData();

AlumnoData aData;
ArrayList lista;
Conexion con;
    public formInscripcion() {
        initComponents();
         setIconImage(getImageIcon());
        btnAnular.setEnabled(false);
         btnInscribir.setEnabled(false);
     mData.cargarAlumnos("alumno","idAlumno", "nombre","apellido", comboAlumnos);
     radioSi.hasFocus();
      
        
                
       // listaAlumnos(comboAlumnos);
        //lista = new ArrayList();
        //llenarComboAlumnos();
        setLocationRelativeTo(null);
        
   
       
    }
    public Image getImageIcon(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icono.png"));
        return retValue;
    }
 
    public void mostrarMaterias()
    {
        
        
    }
    public void mostrarMat(){
       
    }
    
   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        radioSi = new javax.swing.JRadioButton();
        radioNo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();
        btnInscribir = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sisema Integral - Universidad de la Punta - San Luis");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario de Inscripcion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setText("Seleccione un Alumno");

        comboAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAlumnosItemStateChanged(evt);
            }
        });
        comboAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Listado de Materia");

        radioSi.setText("Materias Inscriptas");
        radioSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSiActionPerformed(evt);
            }
        });

        radioNo.setText("Materias no Inscriptas");
        radioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoActionPerformed(evt);
            }
        });

        tablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMaterias);

        btnInscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inscripcion.png"))); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnAnular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnAnular.setText("Anular Inscripcion");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNota)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(radioSi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioNo)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnInscribir)
                .addGap(18, 18, 18)
                .addComponent(btnAnular)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNota))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSi)
                    .addComponent(radioNo))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnAnular)
                    .addComponent(btnSalir))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void radioSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSiActionPerformed
         btnInscribir.setEnabled(false);
         btnAnular.setEnabled(true);
         radioNo.setSelected(false);
         listaInsripto();
        
    
          
      
      
       
       
        
    }//GEN-LAST:event_radioSiActionPerformed

    private void radioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoActionPerformed
        btnAnular.setEnabled(false);
        btnInscribir.setEnabled(true);
         radioSi.setSelected(false);
         listaNoInscripto();
         
    
       
    }//GEN-LAST:event_radioNoActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        cargarInscripcion();
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void comboAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAlumnosActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        anularInscripcion();
    }//GEN-LAST:event_btnAnularActionPerformed

    private void comboAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAlumnosItemStateChanged
        if(radioSi.isSelected()){
           listaInsripto(); 
        }else{
            if(radioNo.isSelected()){
                listaNoInscripto();
               
            }
        }
    }//GEN-LAST:event_comboAlumnosItemStateChanged

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
            java.util.logging.Logger.getLogger(formInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    public javax.swing.JComboBox<Alumno> comboAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioNo;
    private javax.swing.JRadioButton radioSi;
    public javax.swing.JTable tablaMaterias;
    private javax.swing.JLabel txtNota;
    // End of variables declaration//GEN-END:variables

    private void listaAlumnos(JComboBox c) {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        c.setModel(combo);
       List<Alumno> alumnos = new ArrayList<>();
 try {
 String sql = "SELECT * FROM alumno WHERE estado = 1 ";
 Connection con = Conexion.Conectar();
 PreparedStatement ps = con.prepareStatement(sql);
 ResultSet rs = ps.executeQuery();
 while (rs.next()) {
 Alumno alumno = new Alumno();

alumno.setIdalumno(rs.getInt("idAlumno"));
alumno.setDni(rs.getInt("dni"));
alumno.setApellido(rs.getString("apellido"));
 alumno.setNombre(rs.getString("nombre"));
 //alumno.setFechadenacimiento(rs.getDate("fechadenacimiento").toLocalDate());
alumno.setEstado(rs.getBoolean("estado"));
combo.addElement(alumno.getIdalumno()+"-"+alumno.getApellido()+", "+alumno.getNombre());
 }
ps.close();


 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
 }

   
        
        
        
    }
    private void cargarInscripcion(){
        try {
            Connection con = Conexion.Conectar();
            String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (?,?,?)" ;
            PreparedStatement stm = con.prepareStatement(sql);
            Object idAlu = comboAlumnos.getSelectedIndex()+1;            
            stm.setString(1, "0");
            stm.setInt(2, (int) idAlu);
            int selectedRow = tablaMaterias.getSelectedRow();
            stm.setString(3, tablaMaterias.getValueAt(selectedRow, 0).toString());
             
            stm.executeUpdate();
            JOptionPane.showMessageDialog(this, "La inscripcion del Alumno se Realizó Correctamente");
            listaNoInscripto();
        } catch (SQLException ex) {
            Logger.getLogger(formInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(this,"No has seleccionado una materia");
        }
    }
     private void anularInscripcion(){
        try {
            Connection con = Conexion.Conectar();
            String sql = "DELETE FROM inscripcion  WHERE idAlumno = ? AND idMateria =?" ;
            PreparedStatement stm = con.prepareStatement(sql);
            Object idAlu = comboAlumnos.getSelectedIndex()+1;            
            System.out.println(""+idAlu);
            stm.setInt(1, (int) idAlu);
            int selectedRow = tablaMaterias.getSelectedRow();
            Object idAlumno = tablaMaterias.getValueAt(selectedRow, 0);
            int id = (int) idAlumno;
            stm.setInt(2, (int) id);
            System.out.println(""+idAlumno);
           if (JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro de eliminar la inscripcion?","Eliminar Registro de Inscripción", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                stm.executeUpdate();
                comboAlumnos.getSelectedIndex();
                JOptionPane.showMessageDialog(this, "Se eliminó el registro");
                listaInsripto();
           }
           
        } catch (SQLException ex) {
            Logger.getLogger(formInscripcion.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(this,"No has seleccionado una materia");
        }
    }
     public void listaInsripto(){
           MateriaData mt = new MateriaData();
        //mData.cargarAlumnos("alumno","idAlumno", "nombre","apellido", comboAlumnos);
        Object idAl = comboAlumnos.getSelectedIndex()+1;
        String sql = "SELECT materia.idMateria, nombre, año "
                + "FROM materia JOIN inscripcion "
                + "ON(inscripcion.idMateria=materia.idMateria) "
                + "WHERE inscripcion.idAlumno = "+idAl+"";
        
        DefaultTableModel modelo = new DefaultTableModel();
        Connection con = Conexion.Conectar();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            modelo.setColumnIdentifiers(new Object[]{"ID","NOMBRE","AÑO"});
            while(rs.next()){
                modelo.addRow(new Object[]{
                   rs.getInt("idMateria"),
                    rs.getString("nombre"),
                    rs.getInt("año")});
                
            }
            tablaMaterias.setModel(modelo);
            con.close();
        } catch (Exception e) {
          
        }
     }
     public void listaNoInscripto(){
          //mData.cargarAlumnos("alumno","idAlumno", "nombre","apellido", comboAlumnos);
        Object id = comboAlumnos.getSelectedIndex()+1;
        String sql = "SELECT materia.idMateria, nombre, año FROM materia LEFT JOIN inscripcion ON (materia.idMateria = inscripcion.idMateria AND inscripcion.idAlumno = "+id+") WHERE inscripcion.idMateria IS NULL";
        DefaultTableModel mlo = new DefaultTableModel();
        Connection con = Conexion.Conectar();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            mlo.setColumnIdentifiers(new Object[]{"ID","NOMBRE","AÑO"});
            while(rs.next()){
                mlo.addRow(new Object[]{
                   rs.getInt("idMateria"),
                    rs.getString("nombre"),
                    rs.getInt("año")});
                
            }
            tablaMaterias.setModel(mlo);
            con.close();
        } catch (Exception e) {
        }
     }

    void listaInsripto(JTable tablaMaterias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         }


 

    



