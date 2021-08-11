package Telas;

import Classes.Categoria;
import Classes.TipoProduto;
import DatabaseConnection.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlterarCategoria extends javax.swing.JFrame {

 
    public int getCodigo() {
        return codigo;
    }

 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    private int codigo;
    
    public AlterarCategoria() {
        initComponents();
    }


   
    private boolean validardados() {

        boolean validacao = true;

        if (tfdescricao.getText().isEmpty()) {

            validacao = false;
        }

        if (!validacao) {
            JOptionPane.showConfirmDialog(this, "Favor preencher todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);

        }

        return validacao;

    }
    
    
    public void ax (Categoria categoria){
        
        tfdescricao.setText(categoria.getDescricao());
        setCodigo(categoria.getCodCategoria());
        
        
    }
    
    
    private void alterar (){
        
        
        try {
            String sql = "update categoria set descricao = ? where codCategoria = " + String.valueOf(getCodigo());
            Connection conexao = ConexaoBanco.getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, tfdescricao.getText());
            ps.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao obter  os dados do banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);

        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        ldescricao = new javax.swing.JLabel();
        jbalterar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();
        tfdescricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alteração Categoria");

        pPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        ldescricao.setText("Descrição: ");

        jbalterar.setText("Alterar");
        jbalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbalterarActionPerformed(evt);
            }
        });

        jbcancelar.setText("Cancelar");
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbalterar)
                .addGap(9, 9, 9)
                .addComponent(jbcancelar)
                .addContainerGap())
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addComponent(ldescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 175, Short.MAX_VALUE))
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ldescricao)
                    .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbalterar)
                    .addComponent(jbcancelar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Deseja mesmo sair do cadastro de categoria?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            VizualizarCategoria vc = new VizualizarCategoria();
            dispose();
            vc.setVisible(true);
        }
    }//GEN-LAST:event_jbcancelarActionPerformed

    private void jbalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbalterarActionPerformed
        alterar();
        JOptionPane.showMessageDialog(this, "Alteração realizada com sucesso!", "Alteração cadastral", JOptionPane.INFORMATION_MESSAGE);
        
        VizualizarCategoria vc =  new VizualizarCategoria();
        dispose();
        vc.setVisible(true);
        

    }//GEN-LAST:event_jbalterarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbalterar;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JLabel ldescricao;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JTextField tfdescricao;
    // End of variables declaration//GEN-END:variables
}
