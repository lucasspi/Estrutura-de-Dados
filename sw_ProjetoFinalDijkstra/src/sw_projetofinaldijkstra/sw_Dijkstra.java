
package sw_projetofinaldijkstra;

import java.awt.Label;
import java.util.Arrays;

/**
 *
 * @author lucasspirandeli
 */
public class sw_Dijkstra extends javax.swing.JFrame {

    /**
     * Creates new form sw_Dijkstra
     */
    public sw_Dijkstra() {
        initComponents();
        
        Graph g = new Graph();

              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista01 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista02 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        txtResultado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Selecione a origem");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Dijkstra para blocos da UFU");

        Lista01.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1E", "1N", "1U", "3M", "5R", "1C", "3Q", "1G" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lista01);

        Lista02.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1E", "1N", "1U", "3M", "5R", "1C", "3Q", "1G" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(Lista02);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Selecione a chegada");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("A menor distância é passando pelos blocos:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        txtResultado.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sw_projetofinaldijkstra/01 cópia.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(350, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btnCalcular))
                    .addComponent(txtResultado, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCalcular))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
        Graph g = new Graph();
        g.adicionaVertice("1E", Arrays.asList(new Vertex("1N", 50), new Vertex("3M", 25),new Vertex("3Q", 98)));
	g.adicionaVertice("1N", Arrays.asList(new Vertex("1E", 50), new Vertex("1U", 35),new Vertex("3M", 35),new Vertex("5R", 15)));
	g.adicionaVertice("1U", Arrays.asList(new Vertex("5R", 15), new Vertex("1N", 35)));
	g.adicionaVertice("3M", Arrays.asList(new Vertex("1E", 25), new Vertex("1N", 35),new Vertex("1C", 15), new Vertex("3Q", 20)));
	g.adicionaVertice("5R", Arrays.asList(new Vertex("1U", 15), new Vertex("1C", 15),new Vertex("1N", 15),new Vertex("1G", 80)));
	g.adicionaVertice("1C", Arrays.asList(new Vertex("5R", 15), new Vertex("3M", 15)));
	g.adicionaVertice("3Q", Arrays.asList(new Vertex("3M", 20), new Vertex("1E", 98),new Vertex("1G", 39)));
	g.adicionaVertice("1G", Arrays.asList(new Vertex("3Q",39), new Vertex("5R", 80)));
        
        
        String start = Lista01.getSelectedValue();
        String end = Lista02.getSelectedValue();
        
        txtResultado.setText(g.menorCaminho(end, start) + " "+end);

        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(sw_Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sw_Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sw_Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sw_Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sw_Dijkstra().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista01;
    private javax.swing.JList<String> Lista02;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
