/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab18;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class mainFrame extends javax.swing.JFrame implements HospitalObserver {

    private ResourceBundle bundle;
    private ResourceBundle bundleFR;
    private HospitalController hospitalController;

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        bundle = ResourceBundle.getBundle("FormLanguage");
        bundleFR = ResourceBundle.getBundle("FormLanguage", Locale.FRANCE);
        Hospital.getInstance().registerObserver(this);
//        Patient patient = new Patient("Robert", "Munsch", 65);
//        Patient patient2 = new Patient("Harper", "Lee", 23);
//        Patient patient3 = new Patient("Markus", "Zusak", 65);
//        Patient patient4 = new Patient("George", "Orwell", 34);
//        Hospital hospital = Hospital.getInstance();
//        hospital.addPatient(patient);
//        hospital.addPatient(patient2);
//        hospital.addPatient(patient3);
//        hospital.addPatient(patient4);

        // Set the patient list model with the patients from the hospital.
//        setPatientListModel(hospital.getPatients());
    }

    private void setPatientListModel(List<Patient> patients) {
        DefaultListModel<String> patientListModel = new DefaultListModel<>();
        for (Patient patient : patients) {
            patientListModel.addElement(patient.getAge() + ", " + patient.getfName() + " " + patient.getlName());  // Assuming you have a getAge() method in Patient class
            
        }
        patientList.setModel(patientListModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hospitalLabel = new javax.swing.JLabel();
        patientButton = new javax.swing.JButton();
        bookListPanel = new javax.swing.JScrollPane();
        patientList = new javax.swing.JList<>();
        fNameLabel = new javax.swing.JLabel();
        lNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        fnameTextField = new javax.swing.JTextField();
        lnameTextField = new javax.swing.JTextField();
        patientAgeTextField = new javax.swing.JTextField();
        enButton = new javax.swing.JButton();
        frButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hospitalLabel.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        hospitalLabel.setText("HOSPITAL");

        patientButton.setText("Add Patient");
        patientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientButtonActionPerformed(evt);
            }
        });

        bookListPanel.setViewportView(patientList);

        fNameLabel.setLabelFor(fnameTextField);
        fNameLabel.setText("Patient First Name:");

        lNameLabel.setText("Patient Last Name:");

        ageLabel.setText("Patient Age");

        enButton.setText("English");
        enButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enButtonActionPerformed(evt);
            }
        });

        frButton.setText("French");
        frButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(hospitalLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(patientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(ageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fnameTextField)
                                .addComponent(lnameTextField)
                                .addComponent(patientAgeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enButton)
                        .addGap(18, 18, 18)
                        .addComponent(frButton)
                        .addGap(43, 43, 43))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {enButton, frButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hospitalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fNameLabel)
                            .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lNameLabel)
                            .addComponent(lnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageLabel)
                            .addComponent(patientAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frButton)
                    .addComponent(enButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(patientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        // TODO add your handling code here:
        String firstName = fnameTextField.getText();
        String lastName = lnameTextField.getText();
        String title = patientAgeTextField.getText();

        if (!firstName.isEmpty() && !lastName.isEmpty() && !title.isEmpty()) {
            Patient bookToRemove = findPatientByDetails(firstName, lastName);

            if (bookToRemove != null) {
                DatabaseManager.removePatients(bookToRemove);
                Hospital.getInstance().removePatient(bookToRemove);
                setPatientListModel(Hospital.getInstance().getPatients());
//                JOptionPane.showMessageDialog(this, "Book was removed");
            } else {
                JOptionPane.showMessageDialog(this, "Patient not found in the Hospital.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please fill in all fields to remove a Patient.");
        }

    }//GEN-LAST:event_patientButtonActionPerformed

    private void enButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enButtonActionPerformed
        // TODO add your handling code here:
        hospitalLabel.setText(bundle.getString("Hospital"));
        fNameLabel.setText(bundle.getString("FirstName"));
        lNameLabel.setText(bundle.getString("LastName"));
        ageLabel.setText(bundle.getString("Age"));
        patientButton.setText(bundle.getString("AddPatient"));
    }//GEN-LAST:event_enButtonActionPerformed

    private void frButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frButtonActionPerformed
        // TODO add your handling code here:
        hospitalLabel.setText(bundleFR.getString("Hospital"));
        fNameLabel.setText(bundleFR.getString("FirstName"));
        lNameLabel.setText(bundleFR.getString("LastName"));
        ageLabel.setText(bundleFR.getString("Age"));
        patientButton.setText(bundleFR.getString("AddPatient"));
    }//GEN-LAST:event_frButtonActionPerformed
    private Patient findPatientByDetails(String firstName, String lastName) {
        for (Patient patient : Hospital.getInstance().getPatients()) {
            if (patient.getfName().equalsIgnoreCase(firstName)
                    && patient.getlName().equalsIgnoreCase(lastName)) {
                return patient;
            }
        }
        return null;  // Return null if no match is found
    }

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }
    public void setHospitalController(HospitalController hospitalController) {
        this.hospitalController = hospitalController;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JScrollPane bookListPanel;
    private javax.swing.JButton enButton;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField fnameTextField;
    private javax.swing.JButton frButton;
    private javax.swing.JLabel hospitalLabel;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lnameTextField;
    private javax.swing.JTextField patientAgeTextField;
    private javax.swing.JButton patientButton;
    public javax.swing.JList<String> patientList;
    // End of variables declaration//GEN-END:variables

    @Override
    public void updatePatientRemoved(Patient patient) {
        setPatientListModel(Hospital.getInstance().getPatients());
        JOptionPane.showMessageDialog(this, "Patient was removed");
    }
}
