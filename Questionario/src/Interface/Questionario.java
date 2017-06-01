package Interface;

import Programa.Pergunta;
import Programa.Persistencia;
import Programa.Resposta;
import Programa.Usuario;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Questionario extends javax.swing.JInternalFrame {

    ArrayList<Pergunta> listaPerguntas;
    int i = 0;
    Usuario user;
    Persistencia pers;
    public Questionario(Programa.Usuario u, Persistencia p) {
        user = u;
        pers = p;
        initComponents();
        btFinalizar.setVisible(false);
        btProximo.setVisible(false);
    }
    
    RespondePergunta du;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        NroQuestao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pergunta = new javax.swing.JTextPane();
        radioSim = new javax.swing.JRadioButton();
        radioNao = new javax.swing.JRadioButton();
        btProximo = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();
        Resposta = new javax.swing.JLabel();
        btCancelarQuestionario = new javax.swing.JButton();

        setTitle("Questionário");

        NroQuestao.setText("n°");

        jLabel2.setText(":");

        Pergunta.setEditable(false);
        Pergunta.setBackground(new java.awt.Color(240, 240, 240));
        Pergunta.setBorder(null);
        jScrollPane1.setViewportView(Pergunta);

        buttonGroup1.add(radioSim);
        radioSim.setText("Sim");
        radioSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSimActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioNao);
        radioNao.setText("Não");
        radioNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNaoActionPerformed(evt);
            }
        });

        btProximo.setText("Próximo");
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });

        btFinalizar.setText("Finalizar");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        Resposta.setText("Resposta:");

        btCancelarQuestionario.setText("Cancelar Questionário");
        btCancelarQuestionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarQuestionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NroQuestao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Resposta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioNao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelarQuestionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProximo))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btFinalizar, btProximo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NroQuestao)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btProximo)
                        .addComponent(btFinalizar)
                        .addComponent(btCancelarQuestionario))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioSim)
                        .addComponent(radioNao)
                        .addComponent(Resposta)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        if(radioSim.isSelected() || radioNao.isSelected()){
            if(i == (listaPerguntas.size()-1)){ //se for a ultima pergunta;
                btFinalizar.setVisible(true);
                btProximo.setVisible(false);
           }
           Resposta r = new Resposta();
           r.setIdPergunta(NroQuestao.getText());
           if(radioSim.isSelected())
                r.setResp("Sim");
           else
                r.setResp("Nao");
           user.addR(r);
           
           mostraPergunta();
           radioSim.setSelected(false);
           radioNao.setSelected(false); 
        }else {
            JOptionPane.showMessageDialog(null,"Responda a pergunta seu Jegue!","Erro! =(",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        if(radioSim.isSelected() || radioNao.isSelected()){
           Resposta r = new Resposta();
           r.setIdPergunta(NroQuestao.getText());
           if(radioSim.isSelected())
                r.setResp("Sim");
           else
                r.setResp("Nao");
           user.addR(r);
           pers.salvarRespostas(pers.getQuestionario(), user);
           
            JOptionPane.showMessageDialog(null,"Questionario realizado com sucesso","Sucesso! =)",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            //faz as coisas
            du.Destruir();
        }else {
            JOptionPane.showMessageDialog(null,"Responda a pergunta seu Jegue!","Erro! =(",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btFinalizarActionPerformed

    private void radioNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNaoActionPerformed
        System.out.println(i+" = "+(listaPerguntas.size()-1));
        if(i != (listaPerguntas.size())){ 
            btProximo.setVisible(true);
        }
    }//GEN-LAST:event_radioNaoActionPerformed

    private void radioSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSimActionPerformed
        if(i != (listaPerguntas.size())){ 
            btProximo.setVisible(true);
        }
    }//GEN-LAST:event_radioSimActionPerformed

    private void btCancelarQuestionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarQuestionarioActionPerformed
        this.dispose();
        du.Destruir();

    }//GEN-LAST:event_btCancelarQuestionarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NroQuestao;
    private javax.swing.JTextPane Pergunta;
    private javax.swing.JLabel Resposta;
    private javax.swing.JButton btCancelarQuestionario;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btProximo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioNao;
    private javax.swing.JRadioButton radioSim;
    // End of variables declaration//GEN-END:variables


    void setPosicao(RespondePergunta rp) {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
        du = rp;
    }
    
    public void carregarPerguntas(Programa.Questionario questionario){        
        listaPerguntas = questionario.getPerguntas();
        mostraPergunta();
    }
    
    void mostraPergunta(){        
        NroQuestao.setText(listaPerguntas.get(i).getId());
        Pergunta.setText(listaPerguntas.get(i).getDescricao());
        i++;
    }
}
