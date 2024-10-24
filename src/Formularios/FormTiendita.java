/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.ArrayListDefinida;
import Clases.Tiendita;
import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class FormTiendita extends javax.swing.JFrame {

    /**
     * Creates new form FormTiendita
     */
    private Tiendita oTiendita;
    private ArrayListDefinida oAld;
    private int posicion;
    
    public FormTiendita() {
        initComponents();
        oAld = new ArrayListDefinida();
        oTiendita = null;
        posicion = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAleatorio = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableModificar = new javax.swing.JTable();
        jButAleatorios = new javax.swing.JButton();
        jButGuardar = new javax.swing.JButton();
        jButOrdenar = new javax.swing.JButton();
        jButModificar = new javax.swing.JButton();
        jButEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("ARRAYLIST DEFINIDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTableAleatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE TIENDA", "PRODUCTO", "EXISTENCIAS", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(jTableAleatorio);

        jTableMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE TIENDA", "PRODUCTO", "EXISTENCIAS", "PRECIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMostrarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMostrar);

        jTableModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE TIENDA", "PRODUCTO", "EXISTENCIAS", "PRECIO"
            }
        ));
        jScrollPane3.setViewportView(jTableModificar);

        jButAleatorios.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButAleatorios.setText("ALEATORIOS");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jButGuardar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButGuardar.setText("GUARDAR");
        jButGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGuardarActionPerformed(evt);
            }
        });

        jButOrdenar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButOrdenar.setText("ORDENAR");
        jButOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButOrdenarActionPerformed(evt);
            }
        });

        jButModificar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButModificar.setText("MODIFICAR");
        jButModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButModificarActionPerformed(evt);
            }
        });

        jButEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jButEliminar.setText("ELIMINAR");
        jButEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButAleatorios)
                        .addGap(18, 18, 18)
                        .addComponent(jButGuardar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButOrdenar)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jButEliminar)))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(75, 28));

        jMenu1.setText("Navegar");
        jMenu1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jMenuItem1.setText("Vector de Letras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jMenuItem2.setText("ArrayList Generico");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jMenuItem3.setText("ArrayList Definido");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        jMenuItem4.setText("Volver al Menu Principal");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenuSalir.setText("Salir");
        jMenuSalir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:}
        FormVector fv = new FormVector();
        fv.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        FormPrincipal fp = new FormPrincipal();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jButModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButModificarActionPerformed
        try {
            // Se obtienen los atributos de la tienda del jTableModificar
            String nombre = jTableModificar.getValueAt(0,0).toString();
            String producto = jTableModificar.getValueAt(0,1).toString();
            int existencias = Integer.parseInt(jTableModificar.getValueAt(0,2).toString());
            double costo = Double.parseDouble(jTableModificar.getValueAt(0, 3).toString());

            // Crear el objeto Tiendita con datos nuevos 
            oTiendita = new Tiendita(nombre,producto,existencias,costo);

            // Invocar el metodo modificar
            oAld.modificar(oTiendita, posicion);

            //Invocar al maetodo mostrar
            oAld.mostrar(jTableMostrar);
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Los datos modificados son incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch(NullPointerException npe) {
            JOptionPane.showMessageDialog(rootPane, "No hay un objeto correcto seleccionado a modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButModificarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FormArrayGenerico fag = new FormArrayGenerico();
        fag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // Llamada del metodo aleatorio de Tiendita
        oTiendita = new Tiendita();
        oTiendita.aleatorio(jTableAleatorio);
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGuardarActionPerformed
        try {
            String nombre = jTableAleatorio.getValueAt(0,0).toString();
            String producto = jTableAleatorio.getValueAt(0, 1).toString();
            int existencia = Integer.parseInt(jTableAleatorio.getValueAt(0,2).toString());
            double costo = Double.parseDouble(jTableAleatorio.getValueAt(0, 3).toString());

            // Crea el objeto Tiendita con los datos de la tabla 
            oTiendita = new Tiendita(nombre, producto, existencia, costo);

            // Invocar el metodo para guardar
            oAld.guardar(oTiendita);

            // Invocar el metodo para mostrar
            oAld.mostrar(jTableMostrar);
        } catch(NullPointerException npe) {
            JOptionPane.showMessageDialog(rootPane, "Dato nulo encontrado" + npe , "Error", JOptionPane.ERROR_MESSAGE);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(rootPane, "Error en el formato" + nfe, "Error", JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_jButGuardarActionPerformed

    private void jButOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButOrdenarActionPerformed
        // Llamada del medoto ordenar y mostrar de ArrayListDefinida
        oAld.ordShell();
        oAld.mostrar(jTableMostrar);
    }//GEN-LAST:event_jButOrdenarActionPerformed

    private void jTableMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMostrarMouseClicked
        // Al hacer click en en el renglon de la tabla, esta se copia en el jTableModificar
        if (evt.getClickCount()>0) {
            jTableModificar.setValueAt(jTableMostrar.getValueAt(jTableMostrar.getSelectedRow(), 0), 0, 0);
            jTableModificar.setValueAt(jTableMostrar.getValueAt(jTableMostrar.getSelectedRow(), 1), 0, 1);
            jTableModificar.setValueAt(jTableMostrar.getValueAt(jTableMostrar.getSelectedRow(), 2), 0, 2);
            jTableModificar.setValueAt(jTableMostrar.getValueAt(jTableMostrar.getSelectedRow(), 3), 0, 3);
            
            /* Guarda la posicion para poder modificar o eliminar
            el objeto seleccionado.*/
            posicion = jTableMostrar.getSelectedRow();
        }        
    }//GEN-LAST:event_jTableMostrarMouseClicked

    private void jButEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEliminarActionPerformed
        // Llamada del metodo eliminar de ArrayListDefinida
        try {
            // Se crea un objeto tiendita obteniendo el objeto en la posicion del arrayList
            Tiendita eliminarTiendita = oAld.getArrayTiendita().get(posicion);
            
            oAld.eliminar(eliminarTiendita);

            //Invocar al metodo mostrar
            oAld.mostrar(jTableMostrar);    
        } catch(IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, "No hay un elemento a eliminar", "Error", JOptionPane.ERROR_MESSAGE);                        
        }
    }//GEN-LAST:event_jButEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FormTiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTiendita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButEliminar;
    private javax.swing.JButton jButGuardar;
    private javax.swing.JButton jButModificar;
    private javax.swing.JButton jButOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAleatorio;
    private javax.swing.JTable jTableModificar;
    private javax.swing.JTable jTableMostrar;
    // End of variables declaration//GEN-END:variables
}
