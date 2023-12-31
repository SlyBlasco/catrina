/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.catrina.ui;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import mx.itson.catrina.entities.AccountStatement;
import mx.itson.catrina.entities.Customer;
import mx.itson.catrina.entities.Transactions;
import mx.itson.catrina.enums.TypeTransaction;

/**
 *
 * @author Luis Blasco, Mario Le Blohic, Emiliano Bojorquez
 */
public class FormAccount extends javax.swing.JFrame {

    /**
     * Creates new form FormAccount
     */
    public FormAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoad = new javax.swing.JButton();
        lblAccountStatement = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        lblSummary = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSummary = new javax.swing.JTable();
        lblTransactions = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTransactions = new javax.swing.JTable();
        lblFinalBalance = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAccountStatement = new javax.swing.JTable();
        lblTittle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLoad.setText("Load file...");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        lblAccountStatement.setBackground(new java.awt.Color(51, 51, 255));
        lblAccountStatement.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAccountStatement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccountStatement.setText("Account Statement");

        tblInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane1.setViewportView(tblInfo);

        lblSummary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSummary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSummary.setText("Period Summary");

        tblSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane3.setViewportView(tblSummary);

        lblTransactions.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTransactions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTransactions.setText("Transactions");

        tblTransactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DATE", "DESCRIPTION", "DEPOSITS", "WITHDRAWALS", "SUBTOTAL"
            }
        ));
        jScrollPane4.setViewportView(tblTransactions);
        if (tblTransactions.getColumnModel().getColumnCount() > 0) {
            tblTransactions.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        lblFinalBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFinalBalance.setText("Final Balance");

        tblAccountStatement.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblAccountStatement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane5.setViewportView(tblAccountStatement);

        lblTittle.setBackground(new java.awt.Color(51, 51, 255));
        lblTittle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittle.setText("Estado de Cuenta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 142, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(594, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSummary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFinalBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccountStatement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccountStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFinalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Método para reconocer si la transaccion es de tipo DEPOSIT (deposito).
    private double deposit(Transactions transaction) {
        if (transaction.getType() == TypeTransaction.DEPOSIT) {
            return transaction.getAmount();
        }
        return 0; // Retorna 0 en caso de que no sea un deposito.
    }
    
    // Método para reconocer si la transaccion es de tipo WITHDRAW (retiro).
    private double withdraw(Transactions transaction) {
        if (transaction.getType() == TypeTransaction.WITHDRAW) {
            return transaction.getAmount();
        }
        return 0; // Retorna 0 en caso de que no sea un retiro.
    }
    
    // Boton que busca el archivo json para la deserealizacion para rellenar todas las tablas y labels.
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                byte fileBytes[] = Files.readAllBytes(file.toPath());
                String contenido = new String(fileBytes, StandardCharsets.UTF_8);

                AccountStatement account = new AccountStatement().deserialize(contenido);

                if (account != null) {
                    // Tabla Info
                    DefaultTableModel modelInfo = (DefaultTableModel) tblInfo.getModel();
                    modelInfo.setRowCount(5);

                    modelInfo.setValueAt(account.getCustomer().getName(), 0, 0);
                    modelInfo.setValueAt("RFC: "+account.getCustomer().getRfc(), 1, 0);
                    modelInfo.setValueAt(account.getCustomer().getAddress(), 2, 0);
                    modelInfo.setValueAt(account.getCustomer().getCity(), 3, 0);
                    modelInfo.setValueAt("Zip Code: "+account.getCustomer().getZipCode(), 4, 0);
                    
                    //Tabla AccountStatement
                    DefaultTableModel modelAS = (DefaultTableModel) tblAccountStatement.getModel();
                    modelAS.setRowCount(3);
                    
                    modelAS.setValueAt("Account", 0, 0);
                    modelAS.setValueAt("CLABE", 1, 0);
                    modelAS.setValueAt("Currency", 2, 0);
                    
                    modelAS.setValueAt(account.getAccount(), 0, 1);
                    modelAS.setValueAt(account.getClabe(), 1, 1);
                    modelAS.setValueAt(account.getCurrency(), 2, 1);
                    
                    //Tabla Transactions
                    DefaultTableModel modelTransactions = (DefaultTableModel) tblTransactions.getModel();
                    modelTransactions.setRowCount(0);
                    
                    double deposit = 0;
                    double withdraw = 0;
                    double subtotal = 0;
                    // Ciclo para sumar el total de depositos, total de retiros, saca el subtotal, y agrega cada fila junto con su informacion conforme la lista de Transactions.
                    for (Transactions t : account.getTransactions()) {
                        deposit += deposit(t);
                        withdraw += withdraw(t);
                        subtotal += deposit(t) - withdraw(t);
                        modelTransactions.addRow(new Object[]{
                            t.getDate(), t.getDescription(), deposit(t), withdraw(t), subtotal
                        });
                    }
                    double finalBalance = (double) modelTransactions.getValueAt(modelTransactions.getRowCount()-1, 4);
                    lblFinalBalance.setText("Final Balance " + finalBalance);
                    
                    //Tabla Summary
                    DefaultTableModel modelSummary = (DefaultTableModel) tblSummary.getModel();
                    modelSummary.setNumRows(3);
                    
                    modelSummary.setValueAt("Deposits", 0, 0);
                    modelSummary.setValueAt("Withdrawals", 1, 0);
                    modelSummary.setValueAt("Final Balance", 2, 0);
                    
                    modelSummary.setValueAt(deposit, 0, 1);
                    modelSummary.setValueAt(withdraw, 1, 1);
                    modelSummary.setValueAt(finalBalance, 2, 1);
                    
                }
            }
        } catch (Exception ex) {
            System.err.println("Ocurrio un error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnLoadActionPerformed

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
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAccountStatement;
    private javax.swing.JLabel lblFinalBalance;
    private javax.swing.JLabel lblSummary;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JLabel lblTransactions;
    private javax.swing.JTable tblAccountStatement;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTable tblSummary;
    private javax.swing.JTable tblTransactions;
    // End of variables declaration//GEN-END:variables
}
