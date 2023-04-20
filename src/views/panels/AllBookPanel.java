/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.panels;

import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import other.SetButton;

/**
 *
 * @author ADMIN
 */
public class AllBookPanel extends javax.swing.JPanel {

    /**
     * Creates new form AllBookPanel
     */
    public AllBookPanel() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        lbNewUpdate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAllBook = new javax.swing.JPanel();

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(0, 204, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("Back");
        btnBack.setOpaque(true);
        btnBack.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel6.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbNewUpdate.setBackground(new java.awt.Color(0, 204, 102));
        lbNewUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNewUpdate.setForeground(new java.awt.Color(255, 255, 255));
        lbNewUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNewUpdate.setText("NEW UPDATE");
        lbNewUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbNewUpdate.setOpaque(true);
        jPanel6.add(lbNewUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1011, 40));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        listAllBook.setBackground(new java.awt.Color(255, 255, 255));
        listAllBook.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 25, 10, 10));
        listAllBook.setLayout(new java.awt.GridLayout(-1, 5, 10, 20));
        jScrollPane1.setViewportView(listAllBook);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, 999, 666));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1013, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(1, 1, 1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLbNewUpdate() {
        return lbNewUpdate;
    }

    public void setLbNewUpdate(JLabel lbNewUpdate) {
        this.lbNewUpdate = lbNewUpdate;
    }

    public JPanel getListAllBook() {
        return listAllBook;
    }

    public void setListAllBook(JPanel listAllBook) {
        this.listAllBook = listAllBook;
    }

    public void onBtnBack(MouseAdapter action) {
        this.btnBack.addMouseListener(new SetButton.SetBtnBack(btnBack));
        this.btnBack.addMouseListener(action);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNewUpdate;
    private javax.swing.JPanel listAllBook;
    // End of variables declaration//GEN-END:variables
}
