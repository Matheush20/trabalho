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

public class CadastroCategoria extends javax.swing.JFrame {

    public CadastroCategoria() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        ldescricao = new javax.swing.JLabel();
        jbconfirmar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();
        tfdescricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Categoria");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        ldescricao.setText("Descrição: ");

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

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbconfirmar)
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
                    .addComponent(jbconfirmar)
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

    private void cadastro(){
        if (validardados()) {

            Categoria categoria = new Categoria();
            categoria.setDescricao(tfdescricao.getText());
            String sql = "insert into categoria (descricao)";
            sql += "values (?)";
            try {

                Connection conn = ConexaoBanco.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, categoria.getDescricao());
                ps.execute();

                JOptionPane.showMessageDialog(this, "Categoria cadastrada com sucesso!", "Confirmação de cadastro", JOptionPane.INFORMATION_MESSAGE);
                

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(CadastroTipoProduto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        
    }
    
    private void jbconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbconfirmarActionPerformed

        cadastro();
        VizualizarCategoria vc = new VizualizarCategoria();
        dispose();
        vc.setVisible(true);

    }//GEN-LAST:event_jbconfirmarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        VizualizarCategoria vc = new VizualizarCategoria();
        vc.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbconfirmar;
    private javax.swing.JLabel ldescricao;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JTextField tfdescricao;
    // End of variables declaration//GEN-END:variables
}
