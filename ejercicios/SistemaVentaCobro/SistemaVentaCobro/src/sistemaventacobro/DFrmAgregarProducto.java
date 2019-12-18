package sistemaventacobro;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DFrmAgregarProducto extends javax.swing.JDialog {

    public DFrmAgregarProducto(DFrmVenta parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txt_cantidad.setText("");
        setTabla();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scp_tabla = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        lbl_cantidad = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scp_tabla.setViewportView(tbl_productos);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_cantidad.setText("Cantidad: ");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_cantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scp_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scp_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cantidad)
                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verIdProducto();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if(txtCantidadNoVacio()){
            DFrmVenta.getInstanceDesdeOtro().agregarDetalleFactura(agregarEnFrmVenta());
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void setTabla(){
        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] {"idProducto", "Producto", "Descripcion", "Precio Uni"}
        ));
        tbl_productos.getColumnModel().getColumn(0).setMaxWidth(0);
        tbl_productos.getColumnModel().getColumn(0).setMinWidth(0);
        tbl_productos.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    private void verIdProducto(){
        for (int i = 0; i < tbl_productos.getRowCount(); i++) {
            String msg = tbl_productos.getValueAt(i,1).toString() + " " + String.valueOf(tbl_productos.getValueAt(i,0));
            JOptionPane.showMessageDialog(null, msg);
        }
    }
    
    private void llenarTabla(){
        ArrayList<Producto> listaAux = SistemaVentaCobro.getInstance().getListaProductos();
        
        DefaultTableModel model = (DefaultTableModel) tbl_productos.getModel();
  
        //model.addRow(new Object[]{"Column 1", "Column 2", "Column 3","Column 4","Column 5"});
        
        for (int i = 0; i < listaAux.size(); i++) {
            Producto p = listaAux.get(i);
            model.addRow(new Object[]{String.valueOf(p.getIdProducto()), p.getNombre(), p.getDetalle(), String.valueOf(p.getPrecioUnitario())});
        }
    }
    
    private boolean txtCantidadNoVacio(){
        boolean ret = true;
        if (txt_cantidad.getText().equals(""))
            ret = false;
        return ret;
    }
    
    public DetalleFactura agregarEnFrmVenta(){
        Producto p = null;
        int nRow = tbl_productos.getSelectedRow();
        int idProducto = Integer.parseInt(tbl_productos.getValueAt(nRow,0).toString());
        ArrayList<Producto> listaAux = SistemaVentaCobro.getInstance().getListaProductos();
        for (int i = 0; i < listaAux.size(); i++) {
            if(listaAux.get(i).getIdProducto()==idProducto){
                p = listaAux.get(i);
                break;
            }
        }
        double subtotal = (double) p.getPrecioUnitario() * Integer.parseInt(txt_cantidad.getText());
        DetalleFactura d = new DetalleFactura(p,Integer.parseInt(txt_cantidad.getText()),subtotal);
        return d;
    }
    
    public static void mainn() {
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
            java.util.logging.Logger.getLogger(DFrmAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DFrmAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DFrmAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DFrmAgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DFrmAgregarProducto dialog = new DFrmAgregarProducto(DFrmVenta.getInstanceDesdeOtro(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {                
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JScrollPane scp_tabla;
    private javax.swing.JTable tbl_productos;
    private javax.swing.JTextField txt_cantidad;
    // End of variables declaration//GEN-END:variables
}
