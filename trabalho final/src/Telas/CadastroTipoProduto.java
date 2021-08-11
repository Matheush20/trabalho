package Telas;

import Classes.Categoria;
import Classes.Cliente;
import Classes.TipoProduto;
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

public class CadastroTipoProduto extends javax.swing.JFrame {

   
    public List<Categoria> getListCategoria() {
        return listCategoria;
    }

    
    public void setListCategoria(List<Categoria> listCategoria) {
        this.listCategoria = listCategoria;
    }

  
    


   
    private List<Categoria>  listCategoria;
    
    public CadastroTipoProduto() {
        initComponents();
        listCategoria = new ArrayList<>();
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
            getListCategoria().add(categoria);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao obter  os dados do banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        for(Categoria listCategoria1 : getListCategoria()) {
        
            cbcategoria.addItem(listCategoria1.getDescricao());
            
        }
        
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
        ftfupc = new javax.swing.JFormattedTextField();
        lcategoria = new javax.swing.JLabel();
        cbcategoria = new javax.swing.JComboBox<>();

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

        lupc.setText("UPC: ");

        try {
            ftfupc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lcategoria.setText("Categoria: ");

        cbcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcategoriaActionPerformed(evt);
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
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpPrincipalLayout.createSequentialGroup()
                            .addComponent(lDescricao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpPrincipalLayout.createSequentialGroup()
                            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpPrincipalLayout.createSequentialGroup()
                                    .addComponent(lupc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ftfupc))
                                .addComponent(lQuantmaxrecept))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfQuantmaxrecept)))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(lcategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
        int option = JOptionPane.showConfirmDialog(this, "Deseja mesmo sair do cadastro do tipo de produto ?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            
            VizualizarTipoprod  vtp = new VizualizarTipoprod();
            dispose();
            vtp.setVisible(true);
        }
    }//GEN-LAST:event_jbcancelarActionPerformed

    private void cadastrartipoprod() {

        if (validardados()) {
           

                TipoProduto tipoproduto = new TipoProduto();
                tipoproduto.setDescricao(tfdescricao.getText());
                tipoproduto.setQtdeMaxRecpt(Integer.parseInt(tfQuantmaxrecept.getText()));
                tipoproduto.setUPC(ftfupc.getText());
                int index = cbcategoria.getSelectedIndex();
                String nome = cbcategoria.getItemAt(index);
                int cod = 0;
                for (Categoria categoria : listCategoria) {
                
                    if (categoria.getDescricao().equals(nome)){
                        
                        cod = categoria.getCodCategoria();
                    }
                    
                }
                
                tipoproduto.setCodCategoria(cod);
                
                String sql = "insert into tipoproduto (descricao, qtdeMaxRecpt, UPC, codCategoria)";
                sql += "values (?, ?, ?, ?)";
                try {

                    Connection conn = ConexaoBanco.getConnection();
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, tipoproduto.getDescricao());
                    ps.setString(2, String.valueOf(tipoproduto.getQtdeMaxRecpt()));
                    ps.setString(3, tipoproduto.getUPC());
                    ps.setString(4, String.valueOf(tipoproduto.getCodCategoria()));
                    ps.execute();

                    JOptionPane.showMessageDialog(this, "Tipo de produto cadastrado com sucesso!", "Confirmação de cadastro", JOptionPane.INFORMATION_MESSAGE);
                    

                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(CadastroTipoProduto.class.getName()).log(Level.SEVERE, null, ex);
                }

           

        }

    }


    private void jbconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbconfirmarActionPerformed
        cadastrartipoprod();
        VizualizarTipoprod tp = new VizualizarTipoprod ();
        dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_jbconfirmarActionPerformed

    private void cbcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcategoriaActionPerformed
 
    }//GEN-LAST:event_cbcategoriaActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTipoProduto().setVisible(true);
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
