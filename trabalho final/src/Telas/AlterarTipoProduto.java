package Telas;

import Classes.Cliente;
import Classes.TipoProduto;
import DatabaseConnection.ConexaoBanco;
import Telas.VizualizarTipoprod;
import Telas.VizualizarTipoprod;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Classes.Categoria;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlterarTipoProduto extends javax.swing.JFrame {

    /**
     * @return the listcategoria
     */
    public List<Categoria> getListcategoria() {
        return listcategoria;
    }

    /**
     * @param listcategoria the listcategoria to set
     */
    public void setListcategoria(List<Categoria> listcategoria) {
        this.listcategoria = listcategoria;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;

    }

    private int codigo;

    private List<Categoria> listcategoria;

    public AlterarTipoProduto() {
        initComponents();
        listcategoria = new ArrayList<>();
        preencherCategorias();
    }

    
      private void  preencherCategorias(){
        try{
         Connection conexao = ConexaoBanco.getConnection();
            String sql = "select * from categoria";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            int cod = rs.getInt("codCategoria");
            String desc = rs.getString("descricao");
            Categoria categoria = new Categoria(cod, desc);
            getListcategoria().add(categoria);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao obter  os dados do banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for(Categoria listCategoria1 : getListcategoria()) {
        
            cbcategoria.addItem(listCategoria1.getDescricao());
            
        }
        
    }
    
    
    public void alterar() {

        try {
            String sql = "update tipoproduto set descricao = ?, qtdeMaxRecpt = ?, UPC = ?, codCategoria = ? where codTipoProduto = " + String.valueOf(codigo);
            Connection conexao = ConexaoBanco.getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, tfdescricao.getText());
            ps.setInt(2, Integer.valueOf(tfQuantmaxrecept.getText()));
            ps.setString(3, ftfupc.getText());
            int index = cbcategoria.getSelectedIndex();
            String nome = cbcategoria.getItemAt(index);
            int cod = 0;
            for (Categoria categoria : listcategoria) {

                if (categoria.getDescricao().equals(nome)) {

                    cod = categoria.getCodCategoria();
                }

            }
            ps.setInt(4,cod);
            ps.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao obter  os dados do banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void alterartipoprod(TipoProduto tipoprod) {

        tfdescricao.setText(tipoprod.getDescricao());
        tfQuantmaxrecept.setText(String.valueOf(tipoprod.getQtdeMaxRecpt()));
        ftfupc.setText(tipoprod.getUPC());
        Categoria cat = new Categoria();
        cat.setCodCategoria(tipoprod.getCodCategoria());
        int index = getListcategoria().indexOf(cat);
        cat = getListcategoria().get(index);
        cbcategoria.setSelectedItem(cat.getDescricao());
        setCodigo(tipoprod.getCodTipoProduto());

    }

    private boolean validardados() {

    boolean validar = true;

        if (tfdescricao.getText().isEmpty()) {
            validar = false;

        } else if (tfQuantmaxrecept.getText().isEmpty()) {
            validar = false;

        }else if (ftfupc.getText().isEmpty()){
            validar = false;
            
        }else if (cbcategoria.getSelectedIndex() < 0){
            
           validar = false;
        }
        
        

        if (!validar) {

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
        lupc = new javax.swing.JLabel();
        lcategoria = new javax.swing.JLabel();
        cbcategoria = new javax.swing.JComboBox<>();
        ftfupc = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Tipo Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jpPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar Tipo Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        lDescricao.setText("Descricao: ");

        lQuantmaxrecept.setText("Quatidade máxima em um receptáculo: ");
        lQuantmaxrecept.setToolTipText("");

        jbconfirmar.setText("Alterar");
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

        lupc.setText("UPC: ");

        lcategoria.setText("Categoria: ");

        try {
            ftfupc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfupc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfupcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbconfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbcancelar))
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(lDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(lQuantmaxrecept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuantmaxrecept))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(lupc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfupc))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(lcategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 131, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lupc)
                    .addComponent(ftfupc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcategoria)
                    .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
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
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Deseja mesmo sair da alteração do tipo de produto ?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == 0) {           
            dispose();
        }
    }//GEN-LAST:event_jbcancelarActionPerformed


    private void jbconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbconfirmarActionPerformed
        alterar();
        JOptionPane.showMessageDialog(this, "Tipo de produto alterado com sucesso!", "Alteração tipo de produto", JOptionPane.INFORMATION_MESSAGE);
        VizualizarTipoprod tp = new VizualizarTipoprod();

        dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_jbconfirmarActionPerformed

    private void ftfupcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfupcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfupcActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        VizualizarTipoprod tp = new VizualizarTipoprod ();
        tp.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarTipoProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbcategoria;
    private javax.swing.JFormattedTextField ftfupc;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbconfirmar;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lDescricao;
    private javax.swing.JLabel lQuantmaxrecept;
    private javax.swing.JLabel lcategoria;
    private javax.swing.JLabel lupc;
    private javax.swing.JTextField tfQuantmaxrecept;
    private javax.swing.JTextField tfdescricao;
    // End of variables declaration//GEN-END:variables
}
