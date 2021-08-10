package Telas;

import Classes.Cliente;
import Classes.TipoProduto;
import DatabaseConnection.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Cadastro_Cliente extends javax.swing.JFrame {

    public Cadastro_Cliente() {
        initComponents();
    }

    private void limpardados(){
        
        nome_empresa_box.setText("");
        cidade_box.setText("");
        cnpj_box.setText("");
        endereco_box.setText("");
        estado_box.setText("");
        telefone_box.setText("");
        
    }
    
    private boolean validardados(){
        
        boolean  validar= true;
        
        if (nome_empresa_box.getText().isEmpty()){
            validar = false;
            
        }else if (cidade_box.getText().isEmpty()){
            validar = false;
            
        }else if (cnpj_box.getText().isEmpty()){
            validar = false;
            
        }else if(endereco_box.getText().isEmpty()){
            validar = false;
                    
        }else if (estado_box.getText().isEmpty()){
            validar = false;
            
        }else if(telefone_box.getText().isEmpty()){
            validar = false;
            
        }
        
        if (!validar){
            
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos", "Erro ao cadastrar tipo produto", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return validar;
        
    }
    
    private void cadastrarCliente(){
        
        if(validardados()){
            Cliente cliente =  new Cliente();
            cliente.setNome(nome_empresa_box.getText());
            cliente.setCnpj(cnpj_box.getText());
            cliente.setEndereco(endereco_box.getText());
            cliente.setContato(telefone_box.getText());
            
            String sql = "insert into cliente (cnpj, contato, endereco)";
            sql+= "values (?, ?)";
            try {
           
            Connection conn = ConexaoBanco.getConnection();
            PreparedStatement  ps = conn.prepareStatement(sql);
            ps.setString(3, cliente.getCnpj());
            ps.setString(4, cliente.getNome());
            ps.setString(5, cliente.getContato());
            ps.setString(6, cliente.getEndereco());
            ps.execute();
            
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!", "Confirmação de cadastro", JOptionPane.INFORMATION_MESSAGE);
            limpardados();
           
            
        } catch (ClassNotFoundException  | SQLException ex) {
            Logger.getLogger(CadastroTipoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        }
            
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pprincipal = new javax.swing.JPanel();
        nome_label = new javax.swing.JLabel();
        cnpj_box = new javax.swing.JFormattedTextField();
        telefone_box = new javax.swing.JFormattedTextField();
        nome_empresa_box = new javax.swing.JTextField();
        cnpj_label = new javax.swing.JLabel();
        edereco_label = new javax.swing.JLabel();
        endereco_box = new javax.swing.JTextField();
        telefone_label = new javax.swing.JLabel();
        submit_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        cidade_label = new javax.swing.JLabel();
        cidade_box = new javax.swing.JTextField();
        estado_label = new javax.swing.JLabel();
        estado_box = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");

        pprincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Cleinte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        nome_label.setText("Nome:");

        try {
            cnpj_box.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##,###,###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cnpj_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpj_boxActionPerformed(evt);
            }
        });

        try {
            telefone_box.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefone_boxActionPerformed(evt);
            }
        });

        nome_empresa_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_empresa_boxActionPerformed(evt);
            }
        });

        cnpj_label.setText("CNPJ:");

        edereco_label.setText("Endereço:");

        telefone_label.setText("Telefone:");

        submit_button.setText("Confirmar");

        cancel_button.setText("Cancelar");
        cancel_button.setActionCommand("");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        cidade_label.setText("Cidade:");

        estado_label.setText("Estado:");

        estado_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pprincipalLayout = new javax.swing.GroupLayout(pprincipal);
        pprincipal.setLayout(pprincipalLayout);
        pprincipalLayout.setHorizontalGroup(
            pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pprincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submit_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancel_button))
                    .addGroup(pprincipalLayout.createSequentialGroup()
                        .addGroup(pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pprincipalLayout.createSequentialGroup()
                                    .addComponent(edereco_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(endereco_box, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pprincipalLayout.createSequentialGroup()
                                    .addComponent(nome_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nome_empresa_box, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pprincipalLayout.createSequentialGroup()
                                .addComponent(cnpj_label)
                                .addGap(18, 18, 18)
                                .addComponent(cnpj_box, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefone_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefone_box, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pprincipalLayout.createSequentialGroup()
                                .addComponent(cidade_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cidade_box, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pprincipalLayout.createSequentialGroup()
                                .addComponent(estado_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estado_box, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 159, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pprincipalLayout.setVerticalGroup(
            pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pprincipalLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_label)
                    .addComponent(nome_empresa_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edereco_label)
                    .addComponent(endereco_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado_label))
                .addGap(11, 11, 11)
                .addGroup(pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade_label)
                    .addComponent(cidade_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpj_label)
                    .addComponent(cnpj_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone_label)
                    .addComponent(telefone_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(pprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_button)
                    .addComponent(cancel_button))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nome_empresa_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_empresa_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_empresa_boxActionPerformed

    private void cnpj_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpj_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpj_boxActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void telefone_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefone_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefone_boxActionPerformed

    private void estado_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_boxActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JTextField cidade_box;
    private javax.swing.JLabel cidade_label;
    private javax.swing.JFormattedTextField cnpj_box;
    private javax.swing.JLabel cnpj_label;
    private javax.swing.JLabel edereco_label;
    private javax.swing.JTextField endereco_box;
    private javax.swing.JTextField estado_box;
    private javax.swing.JLabel estado_label;
    private javax.swing.JTextField nome_empresa_box;
    private javax.swing.JLabel nome_label;
    private javax.swing.JPanel pprincipal;
    private javax.swing.JButton submit_button;
    private javax.swing.JFormattedTextField telefone_box;
    private javax.swing.JLabel telefone_label;
    // End of variables declaration//GEN-END:variables
}
