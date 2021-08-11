package Telas;

import Classes.Categoria;
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
import javax.swing.table.DefaultTableModel;

public class VizualizarCategoria extends javax.swing.JFrame {

    public List<Categoria> getListCategoria() {
        return listCategoria;
    }

    public void setListCategoria(List<Categoria> listCategoria) {
        this.listCategoria = listCategoria;
    }

    private List<Categoria> listCategoria;

    public VizualizarCategoria() {
        initComponents();
        listCategoria = new ArrayList<>();
        preencherdados();
    }

    private void preencherdados() {
        try {
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

        DefaultTableModel model = (DefaultTableModel) tbcategoria.getModel();
        for (Categoria cate : getListCategoria()) {
            model.addRow(new Object[]{cate.getDescricao(), cate.getCodCategoria()});

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ptabelacategoria = new javax.swing.JPanel();
        sptabelacategoria = new javax.swing.JScrollPane();
        tbcategoria = new javax.swing.JTable();
        pbotoes = new javax.swing.JPanel();
        jbcadastrar = new javax.swing.JButton();
        jbalterar = new javax.swing.JButton();
        jbexcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbcategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "descricao", "codCategoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcategoriaMouseClicked(evt);
            }
        });
        sptabelacategoria.setViewportView(tbcategoria);
        if (tbcategoria.getColumnModel().getColumnCount() > 0) {
            tbcategoria.getColumnModel().getColumn(0).setPreferredWidth(250);
            tbcategoria.getColumnModel().getColumn(1).setPreferredWidth(50);
        }

        javax.swing.GroupLayout ptabelacategoriaLayout = new javax.swing.GroupLayout(ptabelacategoria);
        ptabelacategoria.setLayout(ptabelacategoriaLayout);
        ptabelacategoriaLayout.setHorizontalGroup(
            ptabelacategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sptabelacategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        ptabelacategoriaLayout.setVerticalGroup(
            ptabelacategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sptabelacategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jbcadastrar.setText("Cadastrar");
        jbcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcadastrarActionPerformed(evt);
            }
        });

        jbalterar.setText("Alterar");
        jbalterar.setToolTipText("");
        jbalterar.setEnabled(false);
        jbalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbalterarActionPerformed(evt);
            }
        });

        jbexcluir.setText("Excluir");
        jbexcluir.setEnabled(false);
        jbexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pbotoesLayout = new javax.swing.GroupLayout(pbotoes);
        pbotoes.setLayout(pbotoesLayout);
        pbotoesLayout.setHorizontalGroup(
            pbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbcadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbalterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbexcluir)
                .addContainerGap())
        );
        pbotoesLayout.setVerticalGroup(
            pbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbotoesLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(pbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcadastrar)
                    .addComponent(jbalterar)
                    .addComponent(jbexcluir))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ptabelacategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pbotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ptabelacategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pbotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcadastrarActionPerformed

        CadastroCategoria cc = new CadastroCategoria();
        cc.setVisible(true);
        hide();


    }//GEN-LAST:event_jbcadastrarActionPerformed

    private void excluir() {

        try {
            DefaultTableModel model = (DefaultTableModel) tbcategoria.getModel();
            int codcategoria = (int) model.getValueAt(tbcategoria.getSelectedRow(), 1);
            String sql = "delete from categoria where codCategoria = ?";
            Connection conn = ConexaoBanco.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(2, codcategoria);
            ps.execute();
            Categoria ax = new Categoria();
            ax.setCodCategoria(codcategoria);
            int indice = getListCategoria().indexOf(ax);
            if (indice > -1) {
                getListCategoria().remove(indice);
                model.removeRow(tbcategoria.getSelectedRow());

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VizualizarTipoprod.class.getName()).log(Level.SEVERE, null, ex);
            return;

        }
    }

    private void jbexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbexcluirActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir o item selecionado?", "Confrimação", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            excluir();
            jbalterar.setEnabled(false);
            jbexcluir.setEnabled(false);

        }
    }//GEN-LAST:event_jbexcluirActionPerformed

    private void tbcategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcategoriaMouseClicked
        if (tbcategoria.getSelectedRow() > -1) {
            jbalterar.setEnabled(true);
            jbexcluir.setEnabled(true);

        }
    }//GEN-LAST:event_tbcategoriaMouseClicked

    private void jbalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbalterarActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Deseja mesmo alterar o item selecionado?", "Confrimação", JOptionPane.YES_NO_OPTION);
        if (option == 0) {

            Categoria ax = new Categoria();
            DefaultTableModel model = (DefaultTableModel) tbcategoria.getModel();
            ax.setCodCategoria((int) model.getValueAt(tbcategoria.getSelectedRow(), 1));
            ax.setDescricao((String) model.getValueAt(tbcategoria.getSelectedRow(), 0));
            AlterarCategoria ac = new AlterarCategoria();
            ac.ax(ax);
            ac.setVisible(true);
            hide();

        }


    }//GEN-LAST:event_jbalterarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VizualizarCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbalterar;
    private javax.swing.JButton jbcadastrar;
    private javax.swing.JButton jbexcluir;
    private javax.swing.JPanel pbotoes;
    private javax.swing.JPanel ptabelacategoria;
    private javax.swing.JScrollPane sptabelacategoria;
    private javax.swing.JTable tbcategoria;
    // End of variables declaration//GEN-END:variables
}
