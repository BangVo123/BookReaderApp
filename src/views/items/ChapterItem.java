/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.items;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JLabel;
import models.ChapterModel;
import models.DAO.ReviewDAO;
import models.ReviewModel;
import models.entityPK.ReviewPK;
import other.SetButton;
import static utils.formatDate.formatDate;

/**
 *
 * @author ADMIN
 */
public class ChapterItem extends javax.swing.JPanel {

    /**
     * Creates new form ChapterItem
     */
    private ChapterModel chapterModels;

    public ChapterItem(ChapterModel chapterModels) throws SQLException, ParseException {
        initComponents();
        this.chapterModels = chapterModels;
        this.lbChapter.setText("Chương " + chapterModels.getSerial() + " : " + chapterModels.getTitle());
        String formatDate = formatDate("" + chapterModels.getUpdateTime());
        this.txtDate.setText(formatDate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbChapter = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        txtRate = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(32767, 50));
        setPreferredSize(new java.awt.Dimension(1252, 50));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        lbChapter.setBackground(new java.awt.Color(255, 255, 255));
        lbChapter.setText("jLabel1");
        lbChapter.setAlignmentY(0.0F);
        lbChapter.setPreferredSize(new java.awt.Dimension(940, 50));
        add(lbChapter);

        txtDate.setText("date");
        add(txtDate);

        txtRate.setPreferredSize(new java.awt.Dimension(145, 50));
        add(txtRate);

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon.png"))); // NOI18N
        btnDelete.setOpaque(true);
        btnDelete.setPreferredSize(new java.awt.Dimension(50, 48));
        add(btnDelete);
    }// </editor-fold>//GEN-END:initComponents

    public ChapterModel getChapterModels() {
        return chapterModels;
    }

    public void setChapterModels(ChapterModel chapterModels) {
        this.chapterModels = chapterModels;
    }

    public JLabel getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JLabel btnDelete) {
        this.btnDelete = btnDelete;
    }

    public void onBtnDeleteClick(MouseAdapter action) {
        this.btnDelete.addMouseListener(new SetButton.SetLabelEffectB(this.btnDelete));
        this.btnDelete.addMouseListener(action);
    }

    public JLabel getLbChapter() {
        return lbChapter;
    }

    public void setLbChapter(JLabel lbChapter) {
        this.lbChapter = lbChapter;
    }
    
    public void onLbChapterClick(MouseAdapter action) {
        this.lbChapter.addMouseListener(action);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel lbChapter;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtRate;
    // End of variables declaration//GEN-END:variables
}
