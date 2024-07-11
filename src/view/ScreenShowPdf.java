package view;

import controller.MainControl;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ScreenShowPdf extends javax.swing.JFrame {

    private final MainControl control;
    ShowMessage message = new ShowMessage();
    
    public ScreenShowPdf() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icons/dataAnalysis.png")).getImage());
        control = new MainControl(this);
        control.addDataDable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        panelControl = new javax.swing.JPanel();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        btnAddPDF = new javax.swing.JButton();
        btnDownload = new javax.swing.JButton();
        panelPage = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnBefore = new javax.swing.JButton();
        labelShowNumber = new javax.swing.JLabel();
        btnOpenPDF = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdateTable = new javax.swing.JButton();
        scrollPaneShow = new javax.swing.JScrollPane();
        labelShowPDF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Balanço");

        panelBackground.setBackground(new java.awt.Color(169, 169, 169));

        panelControl.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Titulo", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneTable.setViewportView(tableData);

        btnAddPDF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAddPDF.setText("Adicionar PDF");
        btnAddPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPDFActionPerformed(evt);
            }
        });

        btnDownload.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDownload.setText("Baixar");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        panelPage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNext.setText(">>>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnBefore.setText("<<<");
        btnBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeforeActionPerformed(evt);
            }
        });

        labelShowNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelShowNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelShowNumber.setText("0/0");

        javax.swing.GroupLayout panelPageLayout = new javax.swing.GroupLayout(panelPage);
        panelPage.setLayout(panelPageLayout);
        panelPageLayout.setHorizontalGroup(
            panelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBefore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelShowNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addContainerGap())
        );
        panelPageLayout.setVerticalGroup(
            panelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnBefore)
                    .addComponent(labelShowNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOpenPDF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnOpenPDF.setText("Abrir PDF");
        btnOpenPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPDFActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSearch.setText("Pesquisar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDelete.setText("Excluir PDF");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdateTable.setText("Atualiar Tabela");
        btnUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpenPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnUpdateTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpenPDF)
                .addGap(44, 44, 44)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateTable)
                .addGap(7, 7, 7)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnDownload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(12, 12, 12))
        );

        scrollPaneShow.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelShowPDF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scrollPaneShow.setViewportView(labelShowPDF);

        javax.swing.GroupLayout panelBackgroundLayout = new javax.swing.GroupLayout(panelBackground);
        panelBackground.setLayout(panelBackgroundLayout);
        panelBackgroundLayout.setHorizontalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneShow, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBackgroundLayout.setVerticalGroup(
            panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneShow)
                    .addComponent(panelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPDFActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            control.openPdf(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_btnOpenPDFActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        control.skipPage(1);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeforeActionPerformed
        control.skipPage(2);
    }//GEN-LAST:event_btnBeforeActionPerformed

    private void btnAddPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPDFActionPerformed
        ScreenAddPdf sdp = new ScreenAddPdf();
        sdp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddPDFActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Salvar PDF");

            fileChooser.setSelectedFile(new File(tableData.getValueAt(tableData.getSelectedRow(), 1).toString()+".pdf"));

            int conf = fileChooser.showSaveDialog(this);

            if (conf == 0) {
                File file = fileChooser.getSelectedFile();
                int number = Integer.parseInt(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
                control.getPDF(number, file.toString());
            }
        }
    }//GEN-LAST:event_btnDownloadActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            int resp = JOptionPane.showConfirmDialog(this, "Deseje remover esse arquivo?", "Confirmação", WIDTH);
            if (resp == 0) {
                int id = Integer.parseInt(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
                control.deletePDF(id);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().equals("")) {
            message.information("Preencha o campo de Pesquisa");
        } else {
            control.searchTable(txtSearch.getText());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTableActionPerformed
        control.addDataDable();
    }//GEN-LAST:event_btnUpdateTableActionPerformed

    //Gerado automaticamente
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenShowPdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ScreenShowPdf().setVisible(true);
        });
    }

    public void updateTable() {
        control.addDataDable();
    }

    public JLabel getLabelShowNumber() {
        return labelShowNumber;
    }

    public JLabel getLabelShowPDF() {
        return labelShowPDF;
    }

    public JTable getTableData() {
        return tableData;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPDF;
    private javax.swing.JButton btnBefore;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpenPDF;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateTable;
    private javax.swing.JLabel labelShowNumber;
    private javax.swing.JLabel labelShowPDF;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelPage;
    private javax.swing.JScrollPane scrollPaneShow;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
