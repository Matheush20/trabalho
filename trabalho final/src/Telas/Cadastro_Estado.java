package Telas;

import Classes.Estado;
import DatabaseConnection.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Cadastro_Estado extends javax.swing.JFrame {


    public Cadastro_Estado() {
        initComponents();
    }

  
    
    private boolean validardados(){
        boolean validar = true;
        
        if (estado_box.getText().isEmpty()){
            validar = false;
            
        }else if(sigla_box.getText().isEmpty()){
            validar = false;
        }
        
        if (!validar){
            
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos", "Erro ao cadastrar tipo produto", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return validar;
    }
    
    private void cadastrarEstado (){
        
        if(validardados()){
            Estado estado = new Estado();
            estado.setDescricao(estado_box.getText());
            estado.setSigla(sigla_box.getText());
        
            String sql = "insert into estado (descricao, sigla)";
            sql += "values (?, ?)";
            
            try {
                Connection conn = ConexaoBanco.getConnection();
                PreparedStatement  ps = conn.prepareStatement(sql);
                ps.setString(1, estado.getDescricao());
                ps.setString(2, estado.getSigla());
                ps.execute();
            
                JOptionPane.showMessageDialog(this, "Estado cadastrado com sucesso!", "Confirmação de cadastro", JOptionPane.INFORMATION_MESSAGE);
             
            } 
            catch (ClassNotFoundException  | SQLException ex) { 
                Logger.getLogger(Cadastro_Estado.class.getName()).log(Level.SEVERE, null, ex);            
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastro_panel = new javax.swing.JPanel();
        estado_label = new javax.swing.JLabel();
        estado_box = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        sigla_label = new javax.swing.JLabel();
        sigla_box = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cadastro_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Estado"));

        estado_label.setText("Estado:");

        estado_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_boxActionPerformed(evt);
            }
        });

        submitButton.setText("Cadastrar");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        sigla_label.setText("Sigla:");

        sigla_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigla_boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastro_panelLayout = new javax.swing.GroupLayout(cadastro_panel);
        cadastro_panel.setLayout(cadastro_panelLayout);
        cadastro_panelLayout.setHorizontalGroup(
            cadastro_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastro_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addGap(12, 12, 12))
            .addGroup(cadastro_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estado_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estado_box, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(sigla_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sigla_box, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        cadastro_panelLayout.setVerticalGroup(
            cadastro_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastro_panelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(cadastro_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_label)
                    .addComponent(estado_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sigla_label)
                    .addComponent(sigla_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(cadastro_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastro_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastro_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        int option  = JOptionPane.showConfirmDialog(this, "Deseja mesmo sair do cadastro de Estado ?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == 0){
            VizualizarEstados ve = new VizualizarEstados();
            
            dispose();             
            ve.setVisible(true);          
        }
        VizualizarEstados ve = new VizualizarEstados ();
        ve.setVisible(true);
              
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void estado_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_boxActionPerformed

    private void sigla_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigla_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sigla_boxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        cadastrarEstado();
        VizualizarEstados  ve = new VizualizarEstados();
        dispose();
        ve.setVisible(true);
        
        
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Estado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Estado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cadastro_panel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField estado_box;
    private javax.swing.JLabel estado_label;
    private javax.swing.JTextField sigla_box;
    private javax.swing.JLabel sigla_label;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
