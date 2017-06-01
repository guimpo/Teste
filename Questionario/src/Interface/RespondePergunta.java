package Interface;

import Programa.BuscarPerguntas;
import Programa.Persistencia;
import Programa.Senha;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RespondePergunta extends javax.swing.JFrame {
    Programa.Questionario questionario;
    Persistencia p;
    public RespondePergunta() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    DadosUsuario iq;
    Integer verificaSeFoiCarregadoquestionario = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Arquivo = new javax.swing.JMenu();
        menuIniciarQuestionario = new javax.swing.JMenuItem();
        menuCarregarQuestionario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Responder Questionário");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        Arquivo.setText("Arquivo");

        menuIniciarQuestionario.setText("Iniciar Questionário");
        menuIniciarQuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIniciarQuestionarioActionPerformed(evt);
            }
        });
        Arquivo.add(menuIniciarQuestionario);

        menuCarregarQuestionario.setText("Carregar Questionário");
        menuCarregarQuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCarregarQuestionarioActionPerformed(evt);
            }
        });
        Arquivo.add(menuCarregarQuestionario);

        jMenuItem1.setText("Mostrar Estatisticas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Arquivo.add(jMenuItem1);

        jMenuBar1.add(Arquivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuIniciarQuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIniciarQuestionarioActionPerformed
        if (iq == null){
            if(verificaSeFoiCarregadoquestionario == 1){
                iq = new DadosUsuario(this);
                jDesktopPane1.add(iq);
                iq.setPosicao();
                iq.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Carregue um questionario primeiramente","Erro",JOptionPane.CANCEL_OPTION);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Já existe um questionario em andamento","Erro",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_menuIniciarQuestionarioActionPerformed

    private void menuCarregarQuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCarregarQuestionarioActionPerformed
        String showInputDialog = JOptionPane.showInputDialog(this, "Informe a senha", "Tela de senha", WIDTH);
        Senha s = new Senha();        
        if (s.recebeSenha(showInputDialog)){
            LerArquivo la = new LerArquivo();
            String Caminho = la.retornaCaminho();
            //*****************************************************
            p = new Persistencia();     //feito
            p.setCaminho(Caminho);
            questionario = p.getQuestionario(Caminho); //feito
            //*****************************************************
            verificaSeFoiCarregadoquestionario = 1;
        }else{
            JOptionPane.showMessageDialog(null,"Senha Inválida","Erro",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_menuCarregarQuestionarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Estatistica es = new Estatistica();
        jDesktopPane1.add(es);
        es.setPosicao();
        es.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(RespondePergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RespondePergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RespondePergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RespondePergunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RespondePergunta rp = new RespondePergunta();
                rp.setLocationRelativeTo(null);
                rp.setVisible(true);
            }
        });
    }
    public void Destruir(){
        this.iq = null;
    }
    public void Carregar(Questionario q){
        jDesktopPane1.removeAll();
        jDesktopPane1.add(q);
        jDesktopPane1.repaint();
        q.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Arquivo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuCarregarQuestionario;
    private javax.swing.JMenuItem menuIniciarQuestionario;
    // End of variables declaration//GEN-END:variables
}
