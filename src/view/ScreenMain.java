package view;

import controller.MainControl;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ScreenMain extends javax.swing.JFrame {

    private final MainControl control;
    private final ShowMessage message = new ShowMessage();

    public ScreenMain() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/image/icons/pdf-book.png")).getImage());
        control = new MainControl(this);
        control.addDataDable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelRound = new view.components.Round();
        btnOpenPDF = new javax.swing.JButton();
        btnDelete = new view.Button();
        btnAddPDF = new view.Button();
        btnDownload = new view.Button();
        scrollPaneTable = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnUpdateTable = new javax.swing.JButton();
        btnBefore = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        labelShowNumber = new javax.swing.JLabel();
        btnShowDetails = new javax.swing.JButton();
        scrollPane = new view.components.scrollPane();
        labelShowPDF = new javax.swing.JLabel();
        labelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu PDF");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setOpaque(false);

        panelRound.setBackground(new java.awt.Color(51, 51, 51));

        btnOpenPDF.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnOpenPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons/book_open.png"))); // NOI18N
        btnOpenPDF.setText("Abrir PDF");
        btnOpenPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPDFActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(255, 0, 51));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons/delete.png"))); // NOI18N
        btnDelete.setText("Excluir PDF");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAddPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons/disk.png"))); // NOI18N
        btnAddPDF.setText("Adicionar PDF");
        btnAddPDF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAddPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPDFActionPerformed(evt);
            }
        });

        btnDownload.setForeground(new java.awt.Color(255, 255, 255));
        btnDownload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons/folder_go.png"))); // NOI18N
        btnDownload.setText("Baixar");
        btnDownload.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome Arquivo", "Referencia"
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

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons/magnifier.png"))); // NOI18N
        btnSearch.setText("Pesquisar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdateTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons/table_refresh.png"))); // NOI18N
        btnUpdateTable.setText("Atualiar Tabela");
        btnUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTableActionPerformed(evt);
            }
        });

        btnBefore.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnBefore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons/resultset_previous.png"))); // NOI18N
        btnBefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeforeActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons/resultset_next.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        labelShowNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelShowNumber.setForeground(new java.awt.Color(255, 255, 255));
        labelShowNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelShowNumber.setText("0/0");

        btnShowDetails.setText("Ver Detalhes do PDF");
        btnShowDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRoundLayout = new javax.swing.GroupLayout(panelRound);
        panelRound.setLayout(panelRoundLayout);
        panelRoundLayout.setHorizontalGroup(
            panelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpenPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddPDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnUpdateTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundLayout.createSequentialGroup()
                        .addGroup(panelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnShowDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelRoundLayout.createSequentialGroup()
                                .addComponent(btnBefore)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelShowNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext))
                            .addGroup(panelRoundLayout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        panelRoundLayout.setVerticalGroup(
            panelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOpenPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelShowNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShowDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(panelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdateTable)
                .addGap(12, 12, 12)
                .addComponent(scrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labelShowPDF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scrollPane.setViewportView(labelShowPDF);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 650));

        labelBackground.setBackground(new java.awt.Color(0, 0, 0));
        labelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundImg.jpg"))); // NOI18N
        getContentPane().add(labelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        control.skipPage(1);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnOpenPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPDFActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            control.openPdf(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
        }
    }//GEN-LAST:event_btnOpenPDFActionPerformed

    private void btnBeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeforeActionPerformed
        control.skipPage(2);
    }//GEN-LAST:event_btnBeforeActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Salvar PDF");

            fileChooser.setSelectedFile(new File(tableData.getValueAt(tableData.getSelectedRow(), 1).toString() + ".pdf"));

            int conf = fileChooser.showSaveDialog(this);

            if (conf == 0) {
                File file = fileChooser.getSelectedFile();
                int number = Integer.parseInt(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
                control.getPDF(number, file.toString());
            }
        }
    }//GEN-LAST:event_btnDownloadActionPerformed

    private void btnAddPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPDFActionPerformed
        ScreenAddPdf sdp = new ScreenAddPdf();
        sdp.setVisible(true);
    }//GEN-LAST:event_btnAddPDFActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            int resp = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir os dados?", "Confirmação", JOptionPane.YES_NO_OPTION);
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

    private void btnShowDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDetailsActionPerformed
        if (tableData.getSelectedRow() < 0) {
            message.information("Selecione uma linha");
        } else {
            ScreenShowDetails show = new ScreenShowDetails();
            int id = Integer.parseInt(tableData.getValueAt(tableData.getSelectedRow(), 0).toString());
            show.AddData(id);
            show.setVisible(true);
        }
    }//GEN-LAST:event_btnShowDetailsActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScreenMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ScreenMain().setVisible(true);
        });
    }

    public JLabel getLabelShowPDF() {
        return labelShowPDF;
    }

    public JLabel getLabelShowNumber() {
        return labelShowNumber;
    }

    public JTable getTableData() {
        return tableData;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.Button btnAddPDF;
    private javax.swing.JButton btnBefore;
    private view.Button btnDelete;
    private view.Button btnDownload;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpenPDF;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowDetails;
    private javax.swing.JButton btnUpdateTable;
    private javax.swing.JLabel labelBackground;
    private javax.swing.JLabel labelShowNumber;
    private javax.swing.JLabel labelShowPDF;
    private javax.swing.JPanel panel;
    private view.components.Round panelRound;
    private view.components.scrollPane scrollPane;
    private javax.swing.JScrollPane scrollPaneTable;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
