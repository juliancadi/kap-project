/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InsertWordMainPanel.java
 *
 * Created on 25/12/2010, 04:51:52 PM
 */

package com.kap.view.insert;

import com.kap.business.Language;
import com.kap.business.Type;
import com.kap.view.add.AddCategorieDialog;
import com.kap.view.add.AddInformationDialog;
import java.awt.BorderLayout;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

/**
 *
 * @author Julian Caicedo (spark990@gmail.com)
 */
public class InsertWordMainPanel extends javax.swing.JPanel {

    private java.awt.Frame parent;
    private AddInformationDialog aid;

    /** Creates new form InsertWordMainPanel */
    public InsertWordMainPanel(java.awt.Frame parent) {
        initComponents();
        this.parent = parent;
        assignFocus(jTextFieldWordSpanish);
        endInitialization();

    }

    private void assignFocus(final javax.swing.JComponent component){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 component.requestFocus();
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneVertical = new javax.swing.JSplitPane();
        jSplitPaneUp = new javax.swing.JSplitPane();
        jScrollPaneUpLeft = new javax.swing.JScrollPane();
        jPanelUpLeft = new javax.swing.JPanel();
        jPanelULTop = new javax.swing.JPanel();
        jLabelWordSpanish = new javax.swing.JLabel();
        jTextFieldWordSpanish = new javax.swing.JTextField();
        jLabelCategorie = new javax.swing.JLabel();
        jButtonCategorie = new javax.swing.JButton();
        jTextFieldCategorie = new javax.swing.JTextField();
        jLabelAddInformation = new javax.swing.JLabel();
        jTextFieldAddInformation = new javax.swing.JTextField();
        jButtonAddInformation = new javax.swing.JButton();
        jLabelLanguage = new javax.swing.JLabel();
        jComboBoxLanguage = new javax.swing.JComboBox();
        jLabelType = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox();
        jLabelSelectedCategories = new javax.swing.JLabel();
        jSeparatorUL = new javax.swing.JSeparator();
        jPanelULTraduction = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPaneUpRight = new javax.swing.JScrollPane();
        jPanelUpRight = new javax.swing.JPanel();
        jSplitPaneDown = new javax.swing.JSplitPane();
        jScrollPaneDownLeft = new javax.swing.JScrollPane();
        jPanelDownLeft = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPaneDownRight = new javax.swing.JScrollPane();
        jPanelDownRight = new javax.swing.JPanel();

        jSplitPaneVertical.setDividerLocation(400);
        jSplitPaneVertical.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jSplitPaneUp.setDividerLocation(880);
        jSplitPaneUp.setOpaque(false);
        jSplitPaneUp.setPreferredSize(new java.awt.Dimension(207, 102));

        jPanelULTop.setPreferredSize(new java.awt.Dimension(877, 222));

        jLabelWordSpanish.setLabelFor(jTextFieldWordSpanish);
        jLabelWordSpanish.setText("Word (Spanish):");

        jLabelCategorie.setLabelFor(jTextFieldCategorie);
        jLabelCategorie.setText("Categorie(s):");

        jButtonCategorie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kap/view/resources/plus.png"))); // NOI18N
        jButtonCategorie.setFocusable(false);
        jButtonCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCategorieActionPerformed(evt);
            }
        });

        jLabelAddInformation.setLabelFor(jTextFieldAddInformation);
        jLabelAddInformation.setText("Additional Information:");

        jTextFieldAddInformation.setText("...");
        jTextFieldAddInformation.setEnabled(false);

        jButtonAddInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kap/view/resources/plus.png"))); // NOI18N
        jButtonAddInformation.setFocusable(false);
        jButtonAddInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddInformationActionPerformed(evt);
            }
        });

        jLabelLanguage.setLabelFor(jComboBoxLanguage);
        jLabelLanguage.setText("Language:");

        jComboBoxLanguage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "German" }));
        jComboBoxLanguage.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxLanguageTypeItemStateChanged(evt);
            }
        });

        jLabelType.setLabelFor(jComboBoxType);
        jLabelType.setText("Type:");

        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Verb", "Substantive", "Adjective", "Adverb", "Preposition", "Pronoun", "Article", "Connector", "Other" }));
        jComboBoxType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxLanguageTypeItemStateChanged(evt);
            }
        });

        jLabelSelectedCategories.setText("SelectedCategories");

        javax.swing.GroupLayout jPanelULTopLayout = new javax.swing.GroupLayout(jPanelULTop);
        jPanelULTop.setLayout(jPanelULTopLayout);
        jPanelULTopLayout.setHorizontalGroup(
            jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelULTopLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelType)
                    .addComponent(jLabelLanguage)
                    .addComponent(jLabelAddInformation)
                    .addComponent(jLabelCategorie)
                    .addComponent(jLabelWordSpanish))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldWordSpanish, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelULTopLayout.createSequentialGroup()
                        .addComponent(jTextFieldCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSelectedCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelULTopLayout.createSequentialGroup()
                        .addGroup(jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxLanguage, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAddInformation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAddInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanelULTopLayout.setVerticalGroup(
            jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelULTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSelectedCategories)
                    .addComponent(jButtonCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelULTopLayout.createSequentialGroup()
                        .addGroup(jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelWordSpanish)
                            .addComponent(jTextFieldWordSpanish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCategorie)
                            .addComponent(jTextFieldCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelAddInformation)
                        .addComponent(jTextFieldAddInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAddInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLanguage)
                    .addComponent(jComboBoxLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelULTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelType)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelULTraductionLayout = new javax.swing.GroupLayout(jPanelULTraduction);
        jPanelULTraduction.setLayout(jPanelULTraductionLayout);
        jPanelULTraductionLayout.setHorizontalGroup(
            jPanelULTraductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
        );
        jPanelULTraductionLayout.setVerticalGroup(
            jPanelULTraductionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 149, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanelUpLeftLayout = new javax.swing.GroupLayout(jPanelUpLeft);
        jPanelUpLeft.setLayout(jPanelUpLeftLayout);
        jPanelUpLeftLayout.setHorizontalGroup(
            jPanelUpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelULTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelUpLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparatorUL, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpLeftLayout.createSequentialGroup()
                .addContainerGap(794, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanelUpLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelULTraduction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelUpLeftLayout.setVerticalGroup(
            jPanelUpLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLeftLayout.createSequentialGroup()
                .addComponent(jPanelULTop, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparatorUL, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelULTraduction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jScrollPaneUpLeft.setViewportView(jPanelUpLeft);

        jSplitPaneUp.setLeftComponent(jScrollPaneUpLeft);

        javax.swing.GroupLayout jPanelUpRightLayout = new javax.swing.GroupLayout(jPanelUpRight);
        jPanelUpRight.setLayout(jPanelUpRightLayout);
        jPanelUpRightLayout.setHorizontalGroup(
            jPanelUpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );
        jPanelUpRightLayout.setVerticalGroup(
            jPanelUpRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        jScrollPaneUpRight.setViewportView(jPanelUpRight);

        jSplitPaneUp.setRightComponent(jScrollPaneUpRight);

        jSplitPaneVertical.setTopComponent(jSplitPaneUp);

        jSplitPaneDown.setDividerLocation(670);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelDownLeftLayout = new javax.swing.GroupLayout(jPanelDownLeft);
        jPanelDownLeft.setLayout(jPanelDownLeftLayout);
        jPanelDownLeftLayout.setHorizontalGroup(
            jPanelDownLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        jPanelDownLeftLayout.setVerticalGroup(
            jPanelDownLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        jScrollPaneDownLeft.setViewportView(jPanelDownLeft);

        jSplitPaneDown.setLeftComponent(jScrollPaneDownLeft);

        javax.swing.GroupLayout jPanelDownRightLayout = new javax.swing.GroupLayout(jPanelDownRight);
        jPanelDownRight.setLayout(jPanelDownRightLayout);
        jPanelDownRightLayout.setHorizontalGroup(
            jPanelDownRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        jPanelDownRightLayout.setVerticalGroup(
            jPanelDownRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jScrollPaneDownRight.setViewportView(jPanelDownRight);

        jSplitPaneDown.setRightComponent(jScrollPaneDownRight);

        jSplitPaneVertical.setRightComponent(jSplitPaneDown);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneVertical, javax.swing.GroupLayout.DEFAULT_SIZE, 1341, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneVertical, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCategorieActionPerformed
        AddCategorieDialog acd = new AddCategorieDialog(parent , true);
    }//GEN-LAST:event_jButtonCategorieActionPerformed

    private void jButtonAddInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddInformationActionPerformed
        aid.setVisible(true);
        jTextFieldAddInformation.setText(aid.getText());
        jComboBoxLanguage.requestFocus();
    }//GEN-LAST:event_jButtonAddInformationActionPerformed

    private void jComboBoxLanguageTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxLanguageTypeItemStateChanged
        updateView(jComboBoxLanguage.getSelectedIndex(), jComboBoxType.getSelectedIndex());
    }//GEN-LAST:event_jComboBoxLanguageTypeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddInformation;
    private javax.swing.JButton jButtonCategorie;
    private javax.swing.JComboBox jComboBoxLanguage;
    private javax.swing.JComboBox jComboBoxType;
    private javax.swing.JLabel jLabelAddInformation;
    private javax.swing.JLabel jLabelCategorie;
    private javax.swing.JLabel jLabelLanguage;
    private javax.swing.JLabel jLabelSelectedCategories;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JLabel jLabelWordSpanish;
    private javax.swing.JPanel jPanelDownLeft;
    private javax.swing.JPanel jPanelDownRight;
    private javax.swing.JPanel jPanelULTop;
    private javax.swing.JPanel jPanelULTraduction;
    private javax.swing.JPanel jPanelUpLeft;
    private javax.swing.JPanel jPanelUpRight;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneDownLeft;
    private javax.swing.JScrollPane jScrollPaneDownRight;
    private javax.swing.JScrollPane jScrollPaneUpLeft;
    private javax.swing.JScrollPane jScrollPaneUpRight;
    private javax.swing.JSeparator jSeparatorUL;
    private javax.swing.JSplitPane jSplitPaneDown;
    private javax.swing.JSplitPane jSplitPaneUp;
    private javax.swing.JSplitPane jSplitPaneVertical;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAddInformation;
    private javax.swing.JTextField jTextFieldCategorie;
    private javax.swing.JTextField jTextFieldWordSpanish;
    // End of variables declaration//GEN-END:variables

    private void endInitialization() {
        aid = new AddInformationDialog(parent, true);
        updateView(jComboBoxLanguage.getSelectedIndex(), jComboBoxType.getSelectedIndex());
    }

    private void changeView(JComponent panel){
        jPanelULTraduction.removeAll();
        jPanelULTraduction.setLayout(new BorderLayout());
        jPanelULTraduction.add(panel);
        jPanelULTraduction.updateUI();
    }

    private EnglishVerbPanel englishVerbPanel;
    private EnglishSubstantivePanel englishSubstantivePanel;
    private EnglishAdjectivePanel englishAdjectivePanel;
    private EnglishAdverbPanel englishAdverbPanel;
    private EnglishPrepositionPanel englishPrepositionPanel;
    private EnglishPronounPanel englishPronounPanel;
    private EnglishArticlePanel englishArticlePanel;
    private EnglishConnectorPanel englishConnectorPanel;
    private EnglishOtherPanel englishOtherPanel;
    private GermanVerbPanel germanVerbPanel;
    private GermanSubstantivePanel germanSubstantivePanel;
    private GermanAdjectivePanel germanAdjectivePanel;
    private GermanAdverbPanel germanAdverbPanel;
    private GermanPrepositionPanel germanPrepositionPanel;
    private GermanPronounPanel germanPronounPanel;
    private GermanArticlePanel germanArticlePanel;
    private GermanConnectorPanel germanConnectorPanel;
    private GermanOtherPanel germanOtherPanel;

    private void updateView(int language, int type) {
        switch(language){
            case Language.ENGLISH:
                switch(type){
                    case Type.VERB:
                        englishVerbPanel = new EnglishVerbPanel();
                        changeView(englishVerbPanel);
                    break;
                    case Type.SUBSTANTIVE:
                        englishSubstantivePanel = new EnglishSubstantivePanel();
                        changeView(englishSubstantivePanel);
                    break;
                    case Type.ADJECTIVE:
                        englishAdjectivePanel = new EnglishAdjectivePanel();
                        changeView(englishAdjectivePanel);
                    break;
                    case Type.ADVERB:
                        englishAdverbPanel = new EnglishAdverbPanel();
                        changeView(englishAdverbPanel);
                    break;
                    case Type.PREPOSITION:
                        englishPrepositionPanel = new EnglishPrepositionPanel();
                        changeView(englishPrepositionPanel);
                    break;
                    case Type.PRONOUN:
                        englishPronounPanel = new EnglishPronounPanel();
                        changeView(englishPronounPanel);
                    break;
                    case Type.ARTICLE:
                        englishArticlePanel = new EnglishArticlePanel();
                        changeView(englishArticlePanel);
                    break;
                    case Type.CONNECTOR:
                        englishConnectorPanel = new EnglishConnectorPanel();
                        changeView(englishConnectorPanel);
                    break;
                    case Type.OTHER:
                        englishOtherPanel = new EnglishOtherPanel();
                        changeView(englishOtherPanel);
                    break;
                }
            break;
            case Language.GERMAN:
                switch(type){
                    case Type.VERB:
                        germanVerbPanel = new GermanVerbPanel();
                        changeView(germanVerbPanel);
                    break;
                    case Type.SUBSTANTIVE:
                        germanSubstantivePanel = new GermanSubstantivePanel();
                        changeView(germanSubstantivePanel);
                    break;
                    case Type.ADJECTIVE:
                        germanAdjectivePanel = new GermanAdjectivePanel();
                        changeView(germanAdjectivePanel);
                    break;
                    case Type.ADVERB:
                        germanAdverbPanel = new GermanAdverbPanel();
                        changeView(germanAdverbPanel);
                    break;
                    case Type.PREPOSITION:
                        germanPrepositionPanel = new GermanPrepositionPanel();
                        changeView(germanPrepositionPanel);
                    break;
                    case Type.PRONOUN:
                        germanPronounPanel = new GermanPronounPanel();
                        changeView(germanPronounPanel);
                    break;
                    case Type.ARTICLE:
                        germanArticlePanel = new GermanArticlePanel();
                        changeView(germanArticlePanel);
                    break;
                    case Type.CONNECTOR:
                        germanConnectorPanel = new GermanConnectorPanel();
                        changeView(germanConnectorPanel);
                    break;
                    case Type.OTHER:
                        germanOtherPanel = new GermanOtherPanel();
                        changeView(germanOtherPanel);
                    break;
                }
            break;
        }
    }

}
