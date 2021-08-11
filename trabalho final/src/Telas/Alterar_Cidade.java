package Telas;

import Classes.Cidade;
import Classes.Estado;
import DatabaseConnection.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Alterar_Cidade extends javax.swing.JFrame {

    /**
     * @return the listEstado
     */
    public List<Estado> getListEstado() {
        return listEstado;
    }

    /**
     * @param listEstado the listEstado to set
     */
    public void setListEstado(List<Estado> listEstado) {
        this.listEstado = listEstado;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public Alterar_Cidade() {
        initComponents();
        
        listEstado = new ArrayList<>();
        preencherEstados();
    }

    private List<Estado> listEstado;
    private int codigo;
    
    private void limpardados(){
        
        cidade_box.setText("");
        estado_combo_box.setSelectedIndex(-1);
    }
    
    private boolean validardados(){
        boolean validar = true;
        
        if (cidade_box.getText().isEmpty()){
            validar = false;
            
        }else if(estado_combo_box.getSelectedIndex() == -1){
            validar = false;
        }
        
        if (!validar){
            
            JOptionPane.showMessageDialog(this, "Favor preencher todos os campos", "Erro ao cadastrar tipo produto", JOptionPane.ERROR_MESSAGE);
            
        }
        
        return validar;
    }
    
    private void preencherEstados (){
        try {
            Connection conexao = ConexaoBanco.getConnection();
            String sql = "select * from estado";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int cod = rs.getInt("codEstado");
                String desc = rs.getString("descricao");
                String sigla = rs.getString("sigla");
                Estado estado = new Estado(cod, desc, sigla);
                getListEstado().add(estado);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao obter os dados do banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for (Estado listEstado1 : getListEstado()) {
            estado_combo_box.addItem(listEstado1.getDescricao());
        }
        

    }
    
    private void alterarCidade (){
        
       try {
            String sql = "update cidade set descricao = ? where codCidade = " + String.valueOf(getCodigo());
            Connection conexao = ConexaoBanco.getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cidade_box.getText());
            ps.setInt(2, estado_combo_box.getSelectedIndex());
            ps.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao obter  os dados do banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void ax(Cidade cidade){
        Estado estado = new Estado();
        estado.setCodEstado(cidade.getCodEstado());
        int index = getListEstado().indexOf(estado);
        cidade_box.setText(cidade.getDescricao());
        estado_combo_box.setSelectedIndex(index);
        setCodigo(estado.getCodEstado());
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCadastroCidade = new javax.swing.JPanel();
        cidade_label = new javax.swing.JLabel();
        cidade_box = new javax.swing.JTextField();
        estado_label = new javax.swing.JLabel();
        estado_combo_box = new javax.swing.JComboBox<>();
        cancelButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jCadastroCidade.setBorder(javax.swing.BorderFactory.createTitledBorder("Casdastro de Cidade"));

        cidade_label.setText("Cidade:");

        estado_label.setText("Estado:");

        estado_combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_combo_boxActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");

        submitButton.setText("Alterar");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCadastroCidadeLayout = new javax.swing.GroupLayout(jCadastroCidade);
        jCadastroCidade.setLayout(jCadastroCidadeLayout);
        jCadastroCidadeLayout.setHorizontalGroup(
            jCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCadastroCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCadastroCidadeLayout.createSequentialGroup()
                        .addComponent(cidade_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidade_box, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jCadastroCidadeLayout.createSequentialGroup()
                        .addComponent(estado_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCadastroCidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addContainerGap())
        );
        jCadastroCidadeLayout.setVerticalGroup(
            jCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCadastroCidadeLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade_label)
                    .addComponent(cidade_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_label)
                    .addComponent(estado_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jCadastroCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(submitButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCadastroCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCadastroCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estado_combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_combo_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estado_combo_boxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        alterarCidade();
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
            java.util.logging.Logger.getLogger(Alterar_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alterar_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alterar_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alterar_Cidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alterar_Cidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cidade_box;
    private javax.swing.JLabel cidade_label;
    private javax.swing.JComboBox<String> estado_combo_box;
    private javax.swing.JLabel estado_label;
    private javax.swing.JPanel jCadastroCidade;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
