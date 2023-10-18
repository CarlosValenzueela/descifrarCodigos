package views;

import controllers.FindResults;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class WordInputFrame extends javax.swing.JFrame {

    private String inputText = "";

    public WordInputFrame() {
        initComponents();
        setLocationRelativeTo(null);
        addRadioButtons();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanelBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        stringCodeJtext = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        radioBtnLowerCase = new javax.swing.JRadioButton();
        radioBtnHighCase = new javax.swing.JRadioButton();
        radioBtnNumbers = new javax.swing.JRadioButton();
        radioBtnAll = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GeneradorCodigos");
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        stringCodeJtext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnGenerar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        radioBtnLowerCase.setBackground(new java.awt.Color(255, 255, 255));
        radioBtnLowerCase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioBtnLowerCase.setText("Letras Minúsculas");

        radioBtnHighCase.setBackground(new java.awt.Color(255, 255, 255));
        radioBtnHighCase.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioBtnHighCase.setText("Letras Mayúsculas");

        radioBtnNumbers.setBackground(new java.awt.Color(255, 255, 255));
        radioBtnNumbers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioBtnNumbers.setText("Números");

        radioBtnAll.setBackground(new java.awt.Color(255, 255, 255));
        radioBtnAll.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioBtnAll.setText("Todo");

        jLabel2.setText("'#' por cambio vacío");

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(stringCodeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGenerar)
                            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                                .addComponent(radioBtnLowerCase)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnHighCase)))
                        .addGap(35, 35, 35)
                        .addComponent(radioBtnNumbers)
                        .addGap(33, 33, 33)
                        .addComponent(radioBtnAll)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stringCodeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnLowerCase)
                    .addComponent(radioBtnHighCase)
                    .addComponent(radioBtnNumbers)
                    .addComponent(radioBtnAll))
                .addGap(60, 60, 60)
                .addComponent(btnGenerar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    FindResults findResults = new FindResults();
    ShowResults showResults;
    ArrayList<String> listOfResults = new ArrayList<>();

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        if (checkInput()) {
            try {
                if (radioBtnLowerCase.isSelected()) {
                    listOfResults = findResults.getResultsOnlyLowerUpperCase(inputText);

                } else if (radioBtnHighCase.isSelected()) {
                    listOfResults = findResults.getResultsOnlyHighUpperCase(inputText);

                } else if (radioBtnNumbers.isSelected()) {
                    listOfResults = findResults.getResultsOnlyNumbers(inputText);

                } else if (radioBtnAll.isSelected()) {
                    listOfResults = findResults.getAllResults(inputText);
                }
                showResults = new ShowResults(this, rootPaneCheckingEnabled, listOfResults);
                showResults.setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }


    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JRadioButton radioBtnAll;
    private javax.swing.JRadioButton radioBtnHighCase;
    private javax.swing.JRadioButton radioBtnLowerCase;
    private javax.swing.JRadioButton radioBtnNumbers;
    private javax.swing.JTextField stringCodeJtext;
    // End of variables declaration//GEN-END:variables

    private void addRadioButtons() {
        buttonGroup.add(radioBtnHighCase);
        buttonGroup.add(radioBtnLowerCase);
        buttonGroup.add(radioBtnNumbers);
        buttonGroup.add(radioBtnAll);
        radioBtnLowerCase.setSelected(true);
    }

    private boolean checkInput() {
        try {
            inputText = stringCodeJtext.getText();
            if (!inputText.isEmpty()) {
                if (inputText.length() > 1 && inputText.length() <= 40) {
                    return true;
                } else if (inputText.length() > 40) {
                    JOptionPane.showMessageDialog(null, "El código es muy grande.", "Aviso", 1);

                } else {
                    JOptionPane.showMessageDialog(null, "El código debe ser mayor a 2 digítos.", "Aviso", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El campo no debe estar vacío.", "Error", 2);
            }

        } catch (HeadlessException e) {
            System.out.println(e);
        }
        return false;
    }

}
