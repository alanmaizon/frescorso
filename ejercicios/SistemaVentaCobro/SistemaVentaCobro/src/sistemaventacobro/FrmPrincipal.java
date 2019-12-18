
package sistemaventacobro;

import javax.swing.BorderFactory;

public class FrmPrincipal extends javax.swing.JFrame {

    public static FrmPrincipal frm;
    
    public static synchronized FrmPrincipal getInstance(){
        if(frm==null){
            frm = new FrmPrincipal();
            frm.run();
        }
        return frm;
    }
    
    public FrmPrincipal() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_vender = new javax.swing.JButton();
        btn_cobrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));
        setForeground(new java.awt.Color(204, 204, 0));
        setMaximumSize(new java.awt.Dimension(1024, 768));

        btn_vender.setText("VENDER");
        btn_vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venderActionPerformed(evt);
            }
        });

        btn_cobrar.setText("COBRAR");
        btn_cobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cobrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_vender, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btn_cobrar)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_vender)
                    .addComponent(btn_cobrar))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venderActionPerformed
        DFrmLogin.mainn(false);
    }//GEN-LAST:event_btn_venderActionPerformed

    private void btn_cobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cobrarActionPerformed
        DFrmLogin.mainn(true);
    }//GEN-LAST:event_btn_cobrarActionPerformed

    public void run(){
        setVisible(true);
    }
    
    public void llamarFrmVenta(){
        DFrmVenta.getInstanceDesdePrincipal();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cobrar;
    private javax.swing.JButton btn_vender;
    // End of variables declaration//GEN-END:variables
}
