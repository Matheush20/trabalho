package Telas;

import Classes.Categoria;
import Classes.Estado;
import Classes.TipoProduto;
import DatabaseConnection.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

   
    public List<Estado> getListEstado() {
        return listEstado;
    }

    
    public void setListEstado(List<Estado> listEstado) {
        this.listEstado = listEstado;
    }

    public List<Categoria> getListcategoria() {
        return listcategoria;
    }

    public void setListcategoria(List<Categoria> listcategoria) {
        this.listcategoria = listcategoria;
    }

    public List<TipoProduto> getListtipoprod() {
        return listtipoprod;
    }

    public void setListtipoprod(List<TipoProduto> listtipoprod) {
        this.listtipoprod = listtipoprod;
    }

    private List<TipoProduto> listtipoprod;

    private List<Categoria> listcategoria;
    private  List<Estado> listEstado;

    public TelaPrincipal() {
        initComponents();
        listtipoprod = new ArrayList<>();
        listcategoria = new ArrayList<>();
        listEstado  = new ArrayList<>();
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
                getListcategoria().add(categoria);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao obter  os dados do banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
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
            JOptionPane.showMessageDialog(this, "Erro ao obter  os dados do banco de dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menubar = new javax.swing.JMenuBar();
        mvizualizar = new javax.swing.JMenu();
        jEstado = new javax.swing.JMenuItem();
        micategoria = new javax.swing.JMenuItem();
        mitipoprod = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        mvizualizar.setText("Cadastrar");

        jEstado.setText("Estado");
        jEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEstadoActionPerformed(evt);
            }
        });
        mvizualizar.add(jEstado);

        micategoria.setText("Categoria");
        micategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                micategoriaActionPerformed(evt);
            }
        });
        mvizualizar.add(micategoria);

        mitipoprod.setText("Tipo Produto");
        mitipoprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitipoprodActionPerformed(evt);
            }
        });
        mvizualizar.add(mitipoprod);

        menubar.add(mvizualizar);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void update(){
        listEstado.clear();
        listcategoria.clear();
        listtipoprod.clear();
        preencherdados();
        
    }
    
    private void mitipoprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitipoprodActionPerformed
        update();
        if (getListcategoria().isEmpty()) {
            JOptionPane.showMessageDialog(this, "É necessário cadastrar uma categoria!", "Erro", JOptionPane.ERROR_MESSAGE);
            
        } else {

            VizualizarTipoprod vtp = new VizualizarTipoprod();
            vtp.setVisible(true);
        }


    }//GEN-LAST:event_mitipoprodActionPerformed

    private void jEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoActionPerformed
        update();
        VizualizarEstados estado = new VizualizarEstados();
        estado.setVisible(true);

    }//GEN-LAST:event_jEstadoActionPerformed

    private void micategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_micategoriaActionPerformed
        update();
        VizualizarCategoria vc = new VizualizarCategoria();
        vc.setVisible(true);

    }//GEN-LAST:event_micategoriaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jEstado;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem micategoria;
    private javax.swing.JMenuItem mitipoprod;
    private javax.swing.JMenu mvizualizar;
    // End of variables declaration//GEN-END:variables
}
