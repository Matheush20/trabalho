package Telas;

import Classes.Estado;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VizualizarEstados extends javax.swing.JFrame {

    private List<Estado> listEstado;
    
    public List<Estado> getListEstado() {
        return listEstado;
    }

    public void setListEstado(List<Estado> listEstado) {
        this.listEstado = listEstado;
    }

    public VizualizarEstados() {
        initComponents();

        listEstado = new ArrayList<>();
        preencherdados();
    }

    private void preencherdados() {

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
                listEstado.add(estado);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao obter  os dados do banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) getTbEstado().getModel();
        for (Estado listEstado : listEstado) {
            model.addRow(new Object[]{listEstado.getCodEstado(), listEstado.getDescricao(), listEstado.getSigla()});

        }
    }
    
    private void excluirEstado(){
        try {
            DefaultTableModel model = (DefaultTableModel) getTbEstado().getModel();
            int codEstado = (int) model.getValueAt(getTbEstado().getSelectedRow(), 0);
            String sql = "delete from estado where codEstado = ?";
            Connection conn = ConexaoBanco.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, codEstado);
            ps.execute();
            Estado ax = new Estado();
            ax.setCodEstado(codEstado);
            int indice = getListEstado().indexOf(ax);
            if (indice > -1) {
                getListEstado().remove(indice);
                model.removeRow(getTbEstado().getSelectedRow());

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VizualizarTipoprod.class.getName()).log(Level.SEVERE, null, ex);
            return;

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ptabelaestado = new javax.swing.JPanel();
        spEstado = new javax.swing.JScrollPane();
        tbEstado = new javax.swing.JTable();
        pbotoes = new javax.swing.JPanel();
        jbalterar = new javax.swing.JButton();
        jbexcluir = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();

        setTitle("Tipo Produto");

        spEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                spEstadoFocusGained(evt);
            }
        });

        tbEstado.setAutoCreateRowSorter(true);
        tbEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo do Estado", "Descrição", "Sigla"
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
        tbEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tbEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tbEstadoFocusLost(evt);
            }
        });
        tbEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEstadoMouseClicked(evt);
            }
        });
        spEstado.setViewportView(tbEstado);
        if (tbEstado.getColumnModel().getColumnCount() > 0) {
            tbEstado.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbEstado.getColumnModel().getColumn(1).setPreferredWidth(250);
            tbEstado.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        javax.swing.GroupLayout ptabelaestadoLayout = new javax.swing.GroupLayout(ptabelaestado);
        ptabelaestado.setLayout(ptabelaestadoLayout);
        ptabelaestadoLayout.setHorizontalGroup(
            ptabelaestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        ptabelaestadoLayout.setVerticalGroup(
            ptabelaestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
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

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pbotoesLayout = new javax.swing.GroupLayout(pbotoes);
        pbotoes.setLayout(pbotoesLayout);
        pbotoesLayout.setHorizontalGroup(
            pbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCadastrar)
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
                    .addComponent(jbCadastrar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ptabelaestado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pbotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ptabelaestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbEstadoFocusGained
        
         
    }//GEN-LAST:event_tbEstadoFocusGained

    private void tbEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tbEstadoFocusLost
         if(getTbEstado().getSelectedRow() < 0){
             getJbalterar().setEnabled(false);
             getJbexcluir().setEnabled(false);
           
           }
    }//GEN-LAST:event_tbEstadoFocusLost

    private void spEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spEstadoFocusGained
     
    }//GEN-LAST:event_spEstadoFocusGained

    private void tbEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEstadoMouseClicked
        if(getTbEstado().getSelectedRow() > -1){
             getJbalterar().setEnabled(true);
             getJbexcluir().setEnabled(true);
           
           }
    }//GEN-LAST:event_tbEstadoMouseClicked

    private void jbexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbexcluirActionPerformed
        int option  = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir este estado ?", "Confirmação", JOptionPane.OK_CANCEL_OPTION);
        if (option == 0){
            excluirEstado();
            jbalterar.setEnabled(false);
            jbexcluir.setEnabled (false);
        
        }
    }//GEN-LAST:event_jbexcluirActionPerformed

    private void jbalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbalterarActionPerformed
       
       int option  = JOptionPane.showConfirmDialog(this, "Deseja mesmo alterar este estado ?", "Confirmação", JOptionPane.OK_CANCEL_OPTION);
       
       if (option == 0){
           Estado ax1 = new Estado();
           DefaultTableModel model = (DefaultTableModel) getTbEstado().getModel();
           ax1.setCodEstado((int) model.getValueAt(getTbEstado().getSelectedRow(), 0));
           ax1.setDescricao((String) model.getValueAt(getTbEstado().getSelectedRow(), 1));
           ax1.setSigla((String) model.getValueAt(getTbEstado().getSelectedRow(), 2));
           Alterar_Estado aet = new Alterar_Estado();
           aet.ax(ax1);
           aet.setVisible(true);
           dispose();
        
           
       }
    
    }//GEN-LAST:event_jbalterarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        Cadastro_Estado ce = new Cadastro_Estado();
        hide();
        ce.setVisible(true);
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void excluirtipoprod(){
            try {
            DefaultTableModel model = (DefaultTableModel) getTbEstado().getModel();      
            int codEstado = (int) model.getValueAt(tbEstado.getSelectedRow(), 0);
            String sql = "delete from estado where codEstado = ?";
            Connection conn  = ConexaoBanco.getConnection();
            PreparedStatement  ps = conn.prepareStatement(sql);
            ps.setInt(1, codEstado);
            ps.execute();
            Estado ax = new Estado();
            ax.setCodEstado(codEstado);
            int indice =  listEstado.indexOf(ax);
            if (indice > -1){
                getListEstado().remove(indice);
                model.removeRow(tbEstado.getSelectedRow());
                
            }
                    
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VizualizarEstados.class.getName()).log(Level.SEVERE, null, ex);
            return;
            
        } 
        
        
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VizualizarEstados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbalterar;
    private javax.swing.JButton jbexcluir;
    private javax.swing.JPanel pbotoes;
    private javax.swing.JPanel ptabelaestado;
    private javax.swing.JScrollPane spEstado;
    private javax.swing.JTable tbEstado;
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

   
    public javax.swing.JPanel getPtabelaEstado() {
        return ptabelaestado;
    }

  
    public void setPtabelaEstado(javax.swing.JPanel ptabelaEstado) {
        this.ptabelaestado = ptabelaEstado;
    }

  
    public javax.swing.JScrollPane getSpEsatdo() {
        return spEstado;
    }

 
    public void setSpEstado(javax.swing.JScrollPane spEstado) {
        this.spEstado = spEstado;
    }

    public javax.swing.JTable getTbEstado() {
        return tbEstado;
    }

  
    public void setTbEstado(javax.swing.JTable tbEstado) {
        this.tbEstado = tbEstado;
    }
}
