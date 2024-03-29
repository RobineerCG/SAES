
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static proyecto.Alta_Alumno.a;
import static proyecto.Alta_Alumno.List_alumnos;
import static proyecto.Alta_Alumno.txt_alumnos;


public class Cons_Alumno extends javax.swing.JFrame {
    public Cons_Alumno() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            cargar_txt();
            //listarRegistro();
        } catch (Exception ex) {
            mensaje("No existe el archivo txt");
        }
        
    }
    public int idnt;
   
    public final String txt_alumnos = "Alum.txt";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        Bus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setText("ID DE ALUMNO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, -1));

        Bus.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Bus.setText("Buscar");
        Bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusActionPerformed(evt);
            }
        });
        getContentPane().add(Bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 16, -1, -1));

        tabla.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Sexo", "Direccion", "Carrera", "Asignatura"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 720, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/alumnos.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 380));

        jMenu1.setText("Menu Principal");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Menu Administrador");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem2.setText("Regresar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusActionPerformed
        listarRegistro();  
    }//GEN-LAST:event_BusActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
           Menu_Alumno in = new Menu_Alumno();
           in.setVisible(true);
           this.setVisible(false);           
           dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
           Inicio_Sesion in = new Inicio_Sesion();
           in.setVisible(true);
           this.setVisible(false);           
           dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          Inicio_Sesion in = new Inicio_Sesion();
           in.setVisible(true);
           this.setVisible(false);           
           dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
           Menu_Administrador in = new Menu_Administrador();
           in.setVisible(true);
           this.setVisible(false);
           dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

     public void cargar_txt() { // VERSION DE ALTA_ALUMNO
        File ruta = new File(txt_alumnos);
        try {

            FileReader fi = new FileReader(ruta);
            BufferedReader bu = new BufferedReader(fi);

            String linea = null;
            while ((linea = bu.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                a = new Alumno();
                a.setId(Integer.parseInt(st.nextToken()));
                a.setNombre(st.nextToken());
                a.setEdad(st.nextToken());
                a.setSexo(st.nextToken());
                a.setDireccion(st.nextToken());
                a.setCarrera(st.nextToken());
                a.setAsignatura(st.nextToken());
                a.setAsignatura1(st.nextToken());
                a.setAsignatura2(st.nextToken());
                a.setAsignatura3(st.nextToken());
                a.setAsignatura4(st.nextToken());
                a.setAsignatura5(st.nextToken());
                
                List_alumnos.agregarRegistro(a);
            }
            bu.close();
        } catch (Exception ex) {
            mensaje("Error al cargar archivo: " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }  

         public void listarRegistro() {
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        dt.addColumn("ID");
        dt.addColumn("Nombre");
        dt.addColumn("Edad");
        dt.addColumn("Sexo");
        dt.addColumn("Dirección");
        dt.addColumn("Carrera");
        dt.addColumn("Asignatura 1");
        dt.addColumn("Asignatura 2");
        dt.addColumn("Asignatura 3");
        dt.addColumn("Asignatura 4");
        dt.addColumn("Asignatura 5");
        dt.addColumn("Asignatura 6");

        Object fila[] = new Object[dt.getColumnCount()];
        for (int i = 0; i < List_alumnos.cantidadRegistro(); i++) {
            if(List_alumnos.alumnos.get(i).id == Integer.parseInt(txtId.getText()) )
            {
                
            a = List_alumnos.obtenerRegistro(i);
            fila[0] = a.getId();
            fila[1] = a.getNombre();
            fila[2] = a.getEdad();
            fila[3] = a.getSexo();
            fila[4] = a.getDireccion();
            fila[5] = a.getCarrera();
            fila[6] = a.getAsignatura();
            fila[7] = a.getAsignatura1();
            fila[8] = a.getAsignatura2();
            fila[9] = a.getAsignatura3();
            fila[10] = a.getAsignatura4();
            fila[11] = a.getAsignatura5();
            dt.addRow(fila);
            }
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }
        
    public void mensaje(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }
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
            java.util.logging.Logger.getLogger(Cons_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cons_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cons_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cons_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cons_Alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

}
