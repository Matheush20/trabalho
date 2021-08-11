
package Telas;

import Classes.TipoProduto;
import java.util.ArrayList;
import java.util.List;


public class TelaPrincipal extends javax.swing.JFrame {

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

    
    private List<TipoProduto> listtipoprod;
    
 
    public TelaPrincipal() {
        initComponents();
        listtipoprod = new ArrayList();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menubar = new javax.swing.JMenuBar();
        mvizualizar = new javax.swing.JMenu();
        jEstado = new javax.swing.JMenuItem();
        micategoria = new javax.swing.JMenuItem();
        mitipoprod = new javax.swing.JMenuItem();
        jCidade = new javax.swing.JMenuItem();

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

        jCidade.setText("Cidade");
        jCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCidadeActionPerformed(evt);
            }
        });
        mvizualizar.add(jCidade);

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

    private void mitipoprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitipoprodActionPerformed
        VizualizarTipoprod vtp = new VizualizarTipoprod ();
        vtp.setVisible(true);
    }//GEN-LAST:event_mitipoprodActionPerformed

    private void jEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEstadoActionPerformed
        VizualizarEstados estado = new VizualizarEstados();
        estado.setVisible(true);
        
    }//GEN-LAST:event_jEstadoActionPerformed

    private void micategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_micategoriaActionPerformed
            
        VizualizarCategoria vc = new VizualizarCategoria();
        vc.setVisible(true);

    }//GEN-LAST:event_micategoriaActionPerformed

    private void jCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCidadeActionPerformed
        VizualizarCidades ci = new VizualizarCidades();
        ci.setVisible(true);
    }//GEN-LAST:event_jCidadeActionPerformed

    public static void main(String args[]) {
      
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jCidade;
    private javax.swing.JMenuItem jEstado;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem micategoria;
    private javax.swing.JMenuItem mitipoprod;
    private javax.swing.JMenu mvizualizar;
    // End of variables declaration//GEN-END:variables
}
