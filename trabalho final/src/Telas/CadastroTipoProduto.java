
package Telas;

import Classes.TipoProduto;
import DatabaseConnection.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CadastroTipoProduto extends javax.swing.JFrame {

  
    public CadastroTipoProduto() {
        initComponents();
    }
    
    
    private void limpardados(){
        
        tfdescricao.setText("");
        tfQuantmaxrecept.setText("");
        
    }
    
    
    
    
    private boolean validardados(){
        
        boolean  validar= true;
        
        if (tfdescricao.getText().isEmpty()){
            validar = false;
            
        }else if (tfQuantmaxrecept.getText().isEmpty()){
            validar = false;
            
        }
        
        if (!validar){
            
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos", "Erro ao cadastrar tipo produto", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return validar;
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        lDescricao = new javax.swing.JLabel();
        tfdescricao = new javax.swing.JTextField();
        lQuantmaxrecept = new javax.swing.JLabel();
        tfQuantmaxrecept = new javax.swing.JTextField();
        jbconfirmar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Tipo Produto");

        jpPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Tipo Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lDescricao.setText("Descricao: ");

        lQuantmaxrecept.setText("Quatidade máxima em um receptáculo: ");
        lQuantmaxrecept.setToolTipText("");

        jbconfirmar.setText("Confirmar");
        jbconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbconfirmarActionPerformed(evt);
            }
        });

        jbcancelar.setText("Cancelar");
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(lDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(lQuantmaxrecept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuantmaxrecept)))
                .addGap(0, 131, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbconfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbcancelar))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDescricao)
                    .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lQuantmaxrecept)
                    .addComponent(tfQuantmaxrecept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbconfirmar)
                    .addComponent(jbcancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        int option  = JOptionPane.showConfirmDialog(this, "Deseja mesmo sair do cadastro do tipo de produto ?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == 0){
            dispose();             
        }
    }//GEN-LAST:event_jbcancelarActionPerformed

    private void cadastrartipoprod(){
        
        if(validardados()){
            TipoProduto tipoproduto =  new TipoProduto();
            tipoproduto.setDescricao(tfdescricao.getText());
            tipoproduto.setQtdeMaxRecept(Integer.parseInt(tfQuantmaxrecept.getText()));
            
            String sql = "insert into tipoproduto (descricao, qtdeMaxRecpt)";
            sql+= "values (?, ?)";
            try {
           
            Connection conn = ConexaoBanco.getConnection();
            PreparedStatement  ps = conn.prepareStatement(sql);
            ps.setString(1, tipoproduto.getDescricao());
            ps.setString(2, String.valueOf(tipoproduto.getQtdeMaxRecept()));
            ps.execute();
            
            JOptionPane.showMessageDialog(this, "Tipo produto cadastrado com sucesso!", "Confirmação de cadastro", JOptionPane.INFORMATION_MESSAGE);
            limpardados();
           
            
        } catch (ClassNotFoundException  | SQLException ex) {
            Logger.getLogger(CadastroTipoProduto.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        }
            
        
    }
    
    
    private void jbconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbconfirmarActionPerformed
        cadastrartipoprod();
    }//GEN-LAST:event_jbconfirmarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTipoProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbconfirmar;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lDescricao;
    private javax.swing.JLabel lQuantmaxrecept;
    private javax.swing.JTextField tfQuantmaxrecept;
    private javax.swing.JTextField tfdescricao;
    // End of variables declaration//GEN-END:variables
}
