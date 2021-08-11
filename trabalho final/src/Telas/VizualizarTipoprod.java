package Telas;

import Classes.TipoProduto;
import DatabaseConnection.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VizualizarTipoprod extends javax.swing.JFrame {

    /**
     * @return the listtipoprod
     */
    public List<TipoProduto> getListtipoprod() {
        return listtipoprod;
    }

    /**
     * @param listtipoprod the listtipoprod to set
     */
    public void setListtipoprod(List<TipoProduto> listtipoprod) {
        this.listtipoprod = listtipoprod;
    }

    public VizualizarTipoprod() {
        initComponents();

        listtipoprod = new ArrayList<>();
        preencherdados();
    }

    private List<TipoProduto> listtipoprod;

    private void preencherdados() {

        try {
            Connection conexao = ConexaoBanco.getConnection();
            String sql = "select * from tipoproduto";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int cod = rs.getInt("codTipoProduto");
                String desc = rs.getString("descricao");
                int qtde = rs.getInt("qtdeMaxRecpt");
                TipoProduto tipoprod = new TipoProduto(cod, desc, qtde);
                getListtipoprod().add(tipoprod);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao obter  os dados do banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) getTbtipoproduto().getModel();
        for (TipoProduto listtipoprod1 : getListtipoprod()) {
            model.addRow(new Object[]{listtipoprod1.getCodTipoProduto(), listtipoprod1.getDescricao(), listtipoprod1.getQtdeMaxRecept()});

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ptabelatipoproduto = new javax.swing.JPanel();
        sptipoproduto = new javax.swing.JScrollPane();
        tbtipoproduto = new javax.swing.JTable();
        pbotoes = new javax.swing.JPanel();
        jbalterar = new javax.swing.JButton();
        jbexcluir = new javax.swing.JButton();
        jbnovo = new javax.swing.JButton();

        setTitle("Tipo Produto");

        sptipoproduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sptipoprodutoFocusGained(evt);
            }
        });

        tbtipoproduto.setAutoCreateRowSorter(true);
        tbtipoproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codTipoproduto", "descricao", "qtdeMaxRecpt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbtipoproduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbtipoprodutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbtipoprodutoFocusLost(evt);
            }
        });
        tbtipoproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtipoprodutoMouseClicked(evt);
            }
        });
        sptipoproduto.setViewportView(tbtipoproduto);
        if (tbtipoproduto.getColumnModel().getColumnCount() > 0) {
            tbtipoproduto.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbtipoproduto.getColumnModel().getColumn(1).setPreferredWidth(350);
            tbtipoproduto.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        javax.swing.GroupLayout ptabelatipoprodutoLayout = new javax.swing.GroupLayout(ptabelatipoproduto);
        ptabelatipoproduto.setLayout(ptabelatipoprodutoLayout);
        ptabelatipoprodutoLayout.setHorizontalGroup(
            ptabelatipoprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sptipoproduto, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        ptabelatipoprodutoLayout.setVerticalGroup(
            ptabelatipoprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sptipoproduto, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        jbalterar.setText("Alterar");
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

        jbnovo.setText("Novo");
        jbnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pbotoesLayout = new javax.swing.GroupLayout(pbotoes);
        pbotoes.setLayout(pbotoesLayout);
        pbotoesLayout.setHorizontalGroup(
            pbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbalterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbexcluir)
                .addGap(17, 17, 17))
        );
        pbotoesLayout.setVerticalGroup(
            pbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbotoesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbalterar)
                    .addComponent(jbexcluir)
                    .addComponent(jbnovo))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ptabelatipoproduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pbotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ptabelatipoproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbtipoprodutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbtipoprodutoFocusGained


    }//GEN-LAST:event_tbtipoprodutoFocusGained

    private void tbtipoprodutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbtipoprodutoFocusLost
        if (getTbtipoproduto().getSelectedRow() < 0) {
            getJbalterar().setEnabled(false);
            getJbexcluir().setEnabled(false);

        }
    }//GEN-LAST:event_tbtipoprodutoFocusLost

    private void sptipoprodutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sptipoprodutoFocusGained

    }//GEN-LAST:event_sptipoprodutoFocusGained

    private void tbtipoprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtipoprodutoMouseClicked
        if (getTbtipoproduto().getSelectedRow() > -1) {
            getJbalterar().setEnabled(true);
            getJbexcluir().setEnabled(true);

        }
    }//GEN-LAST:event_tbtipoprodutoMouseClicked

    private void jbexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbexcluirActionPerformed
        int option = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir este tipo de produto ?", "Confirmação", JOptionPane.OK_CANCEL_OPTION);
        if (option == 0) {
            excluirtipoprod();
            getJbalterar().setEnabled(false);
            getJbexcluir().setEnabled(false);

        }
    }//GEN-LAST:event_jbexcluirActionPerformed

    private void jbalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbalterarActionPerformed

        TipoProduto ax = new TipoProduto();
        DefaultTableModel model = (DefaultTableModel) getTbtipoproduto().getModel();
        ax.setCodTipoProduto((int) model.getValueAt(getTbtipoproduto().getSelectedRow(), 0));
        ax.setDescricao((String) model.getValueAt(getTbtipoproduto().getSelectedRow(), 1));
        ax.setQtdeMaxRecept((int) model.getValueAt(getTbtipoproduto().getSelectedRow(), 2));
        AlterarTipoProduto atp = new AlterarTipoProduto();
        atp.alterartipoprod(ax);
        atp.setVisible(true);
        dispose();
        
        


    }//GEN-LAST:event_jbalterarActionPerformed

    private void jbnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovoActionPerformed
        CadastroTipoProduto ctp =  new CadastroTipoProduto();
        ctp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbnovoActionPerformed

    private void excluirtipoprod() {
        try {
            DefaultTableModel model = (DefaultTableModel) getTbtipoproduto().getModel();
            int codtipoprod = (int) model.getValueAt(getTbtipoproduto().getSelectedRow(), 0);
            String sql = "delete from tipoproduto where codTipoProduto = ?";
            Connection conn = ConexaoBanco.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, codtipoprod);
            ps.execute();
            TipoProduto ax = new TipoProduto();
            ax.setCodTipoProduto(codtipoprod);
            int indice = getListtipoprod().indexOf(ax);
            if (indice > -1) {
                getListtipoprod().remove(indice);
                model.removeRow(getTbtipoproduto().getSelectedRow());

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VizualizarTipoprod.class.getName()).log(Level.SEVERE, null, ex);
            return;

        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VizualizarTipoprod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbalterar;
    private javax.swing.JButton jbexcluir;
    private javax.swing.JButton jbnovo;
    private javax.swing.JPanel pbotoes;
    private javax.swing.JPanel ptabelatipoproduto;
    private javax.swing.JScrollPane sptipoproduto;
    private javax.swing.JTable tbtipoproduto;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jbalterar
     */
    public javax.swing.JButton getJbalterar() {
        return jbalterar;
    }

    /**
     * @param jbalterar the jbalterar to set
     */
    public void setJbalterar(javax.swing.JButton jbalterar) {
        this.jbalterar = jbalterar;
    }

    /**
     * @return the jbexcluir
     */
    public javax.swing.JButton getJbexcluir() {
        return jbexcluir;
    }

    /**
     * @param jbexcluir the jbexcluir to set
     */
    public void setJbexcluir(javax.swing.JButton jbexcluir) {
        this.jbexcluir = jbexcluir;
    }

    /**
     * @return the pbotoes
     */
    public javax.swing.JPanel getPbotoes() {
        return pbotoes;
    }

    /**
     * @param pbotoes the pbotoes to set
     */
    public void setPbotoes(javax.swing.JPanel pbotoes) {
        this.pbotoes = pbotoes;
    }

    /**
     * @return the ptabelatipoproduto
     */
    public javax.swing.JPanel getPtabelatipoproduto() {
        return ptabelatipoproduto;
    }

    /**
     * @param ptabelatipoproduto the ptabelatipoproduto to set
     */
    public void setPtabelatipoproduto(javax.swing.JPanel ptabelatipoproduto) {
        this.ptabelatipoproduto = ptabelatipoproduto;
    }

    /**
     * @return the sptipoproduto
     */
    public javax.swing.JScrollPane getSptipoproduto() {
        return sptipoproduto;
    }

    /**
     * @param sptipoproduto the sptipoproduto to set
     */
    public void setSptipoproduto(javax.swing.JScrollPane sptipoproduto) {
        this.sptipoproduto = sptipoproduto;
    }

    /**
     * @return the tbtipoproduto
     */
    public javax.swing.JTable getTbtipoproduto() {
        return tbtipoproduto;
    }

    /**
     * @param tbtipoproduto the tbtipoproduto to set
     */
    public void setTbtipoproduto(javax.swing.JTable tbtipoproduto) {
        this.tbtipoproduto = tbtipoproduto;
    }
}
