
package sistemaventacobro;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class DFrmVenta extends javax.swing.JDialog {

    public static DFrmVenta frm;

    ArrayList<DetalleFactura> listaAux = new ArrayList<>();
    
    public static synchronized DFrmVenta getInstanceDesdePrincipal(){
        if(frm==null){
            mainn();
            return frm;
        }else{
            frm.seteo();
            frm.setVisible(true);
            return frm;
        }
    }
    
    public static synchronized DFrmVenta getInstanceDesdeOtro(){
        return frm;
    }
    
    public DFrmVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        txt_numeroFactura.setHorizontalAlignment(SwingConstants.RIGHT);
        txt_fecha.setHorizontalAlignment(SwingConstants.RIGHT);
        txt_total.setHorizontalAlignment(SwingConstants.RIGHT);
        seteo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_numeroFactura = new javax.swing.JLabel();
        txt_numeroFactura = new javax.swing.JTextField();
        lbl_fecha = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        scp_tabla = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();
        btn_agregarProducto = new javax.swing.JButton();
        lbl_total = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_numeroFactura.setText("N° Factura");

        lbl_fecha.setText("Fecha");

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

        btn_agregarProducto.setText("Agregar");
        btn_agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarProductoActionPerformed(evt);
            }
        });

        lbl_total.setText("TOTAL: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(scp_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_numeroFactura)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_numeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbl_fecha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_agregarProducto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_total)
                        .addGap(18, 18, 18)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_numeroFactura)
                    .addComponent(txt_numeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fecha)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scp_tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btn_agregarProducto)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarProductoActionPerformed
        abrirDFrmAgregarProducto();
    }//GEN-LAST:event_btn_agregarProductoActionPerformed
    
    public void seteo(){
        txt_numeroFactura.setText(String.valueOf(SistemaVentaCobro.getInstance().generarNumeroFactura()));
        txt_fecha.setText(String.valueOf(SistemaVentaCobro.getInstance().getFechaActual()));
        txt_total.setText("0");
        setTabla();
    }
    
    private void setTabla(){
        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] {"idProducto", "Producto", "Descripcion", "Precio Uni,", "Cantidad", "Subtotal"}
        ));
        tbl_productos.getColumnModel().getColumn(0).setMaxWidth(0);
        tbl_productos.getColumnModel().getColumn(0).setMinWidth(0);
        tbl_productos.getColumnModel().getColumn(0).setPreferredWidth(0);

    }
    
    public void abrirDFrmAgregarProducto(){
        DFrmAgregarProducto.mainn();
    }
    
    public void agregarDetalleFactura(DetalleFactura d){
        listaAux.add(d);
        
        setTabla();
        
        DefaultTableModel model = (DefaultTableModel) tbl_productos.getModel();
 
        //model.addRow(new Object[]{"idProducto", "Producto", "Descripcion", "Precio Uni,", "Cantidad", "Subtotal"});
        
        for (int i = 0; i < listaAux.size(); i++) {
            DetalleFactura d1 = listaAux.get(i);
            Producto p1 = d1.getP();
            double subtotal = (double) d1.getPrecio();
            model.addRow(new Object[]{String.valueOf(p1.getIdProducto()), p1.getNombre(), p1.getDetalle(), String.valueOf(p1.getPrecioUnitario()), String.valueOf(d1.getCantidad()), String.valueOf(subtotal)});
        }
        
        calcularTotal();    
    }
    
    private void calcularTotal(){
        double aux = 0;
        for (int i = 0; i < listaAux.size(); i++) {
            aux += listaAux.get(i).getPrecio();  
        }
        txt_total.setText(String.valueOf(aux));
    }
    
    public static void mainn() {

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
            java.util.logging.Logger.getLogger(DFrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DFrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DFrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DFrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frm = new DFrmVenta(FrmPrincipal.getInstance(), true);
                frm.addWindowListener(new java.awt.event.WindowAdapter() {                
                });
                frm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarProducto;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_numeroFactura;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JScrollPane scp_tabla;
    private javax.swing.JTable tbl_productos;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_numeroFactura;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
