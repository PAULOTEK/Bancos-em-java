/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author Paulo
 */
public class FuncionarioGui<salario> extends javax.swing.JFrame {

       Funcionario Diogo = new Funcionario("Diogo", 5000);
       Funcionario Geovana = new Funcionario("Geovana", 7500);
       Funcionario Pedro = new Funcionario("Pedro", 8000);
       Funcionario Igor = new Funcionario("Igor", 7500);

    /**
     * Creates new form FuncionarioGui
     */
    public FuncionarioGui() {
        initComponents();
        double salario = Diogo.getSalario();
        lblSalario.setText("R$" + salario);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        lblSalario = new javax.swing.JLabel();
        txtAumento = new javax.swing.JTextField();
        ComboFuncionario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Funcionario");

        jLabel2.setText("Salário");

        jLabel3.setText("Aumento");

        btnCalc.setText("Aumentar Salário");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        lblSalario.setText("R$ 0");

        txtAumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAumentoActionPerformed(evt);
            }
        });

        ComboFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diogo", "Geovana", "Pedro", "Igor", " " }));
        ComboFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboFuncionarioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Funcionarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnCalc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAumento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSalario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalc)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
          Funcionario funcionarioSelecionado =  null;
                switch(ComboFuncionario.getSelectedIndex()){
                    case 0:
                       funcionarioSelecionado = Diogo;
                       break;
                    case 1:
                        funcionarioSelecionado = Geovana;
                        break;
                    case 2:
                       funcionarioSelecionado = Pedro;
                        break;
                    case 3:
                        funcionarioSelecionado= Igor;
                        break;
                           }
                   double taxaAumento = Double.parseDouble(txtAumento.getText());
                   funcionarioSelecionado.aumentarSalario(taxaAumento);
                   lblSalario.setText("R$" + funcionarioSelecionado.getSalario());
                   txtAumento.setText("");
        JOptionPane.showMessageDialog(null,"Operação realizada!");
           }//GEN-LAST:event_btnCalcActionPerformed

    private void txtAumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAumentoActionPerformed

    private void ComboFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboFuncionarioActionPerformed
        // TODO add your handling code here:
        Funcionario funcionarioSelecionado =  null;
        switch(ComboFuncionario.getSelectedIndex()){
            case 0:
                funcionarioSelecionado = Diogo;
                break;
            case 1:
                funcionarioSelecionado = Geovana;
                break;
            case 2:
               funcionarioSelecionado = Pedro;
                break;
            case 3:
                funcionarioSelecionado= Igor;
                break;
                   }
                   double salario = funcionarioSelecionado.getSalario();
            lblSalario.setText("R$" + salario);

    }//GEN-LAST:event_ComboFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionarioGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboFuncionario;
    private javax.swing.JButton btnCalc;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTextField txtAumento;
    // End of variables declaration//GEN-END:variables
}