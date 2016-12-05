/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.doctorrole;

import com.neu.business.patient.Patient;
import com.neu.business.patient.PatientSymptomsHistory;
import com.neu.business.patient.Prescription;
import com.neu.business.patient.Prescription.Dosage;
import com.neu.business.patient.PrescriptionHistory;
import com.neu.business.patient.Symptoms;
import com.neu.business.workqueue.ScheduleAppointmentWorkRequest;
import com.neu.userinterface.receptionistrole.ScheduleAppointmentJPanel;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author Soham
 */
public class DiagnosePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DiagnosePatientJPanel
     */
    private JPanel userProcessContainer;
    private Patient patient;
    private ScheduleAppointmentWorkRequest workRequest;

    public DiagnosePatientJPanel(JPanel userProcessContainer, Patient patient, ScheduleAppointmentWorkRequest workRequest) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        this.workRequest = workRequest;

        populateFields(patient);
    }

    public void populateFields(Patient patient) {
        txtFieldPatientName.setText(patient.getName());
        txtFieldPatientAge.setText(String.valueOf(patient.getAge()));
        txtFieldPatientGender.setText(patient.getGender());
        txtFieldPatientBloodGroup.setText(patient.getBloodGroup());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbDosage = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnDiagnose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldPatientGender = new javax.swing.JTextField();
        txtFieldPatientBloodGroup = new javax.swing.JTextField();
        txtFieldPatientName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFieldPatientAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPrescriptionHistory = new javax.swing.JTable();
        txtNoOfDays = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        checkIntestinalDisorder = new javax.swing.JCheckBox();
        checkInjury = new javax.swing.JCheckBox();
        checkHeadache = new javax.swing.JCheckBox();
        checkArthritis = new javax.swing.JCheckBox();
        checkInfection = new javax.swing.JCheckBox();
        checkBrokenBones = new javax.swing.JCheckBox();
        checkSprain = new javax.swing.JCheckBox();
        checkAbdominalPain = new javax.swing.JCheckBox();
        checkFibromyalgia = new javax.swing.JCheckBox();
        checkSpasm = new javax.swing.JCheckBox();
        checkCancer = new javax.swing.JCheckBox();
        checkShingles = new javax.swing.JCheckBox();
        checkBackPain = new javax.swing.JCheckBox();
        checkMSclerosis = new javax.swing.JCheckBox();
        checkNerveDamage = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Appointment");

        cmbDosage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel8.setText("tablets of codeine per day for");

        btnDiagnose.setText("Save Diagnosis & Prescribe");
        btnDiagnose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnoseActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Details"));

        jLabel2.setText("Patient Name :");

        txtFieldPatientGender.setEditable(false);

        txtFieldPatientBloodGroup.setEditable(false);

        txtFieldPatientName.setEditable(false);

        jLabel4.setText("Gender :");

        txtFieldPatientAge.setEditable(false);

        jLabel5.setText("Blood Group :");

        jLabel3.setText("Age :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldPatientBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFieldPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFieldPatientBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Prescription History"));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        tblPrescriptionHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prescription No.", "Drug Name", "Dosage", "No. of days", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPrescriptionHistory);
        if (tblPrescriptionHistory.getColumnModel().getColumnCount() > 0) {
            tblPrescriptionHistory.getColumnModel().getColumn(0).setResizable(false);
            tblPrescriptionHistory.getColumnModel().getColumn(1).setResizable(false);
            tblPrescriptionHistory.getColumnModel().getColumn(2).setResizable(false);
            tblPrescriptionHistory.getColumnModel().getColumn(3).setResizable(false);
            tblPrescriptionHistory.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("Days");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opioid Abuse Symptons"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Nausea", "Chest Pain", "Pupilory Constriction", "Bloodshot Eyes", "Joint Pain", "Muscle Tension", "Low Respiratory rate", "Self Harm", "Insomnia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Diagnosis"));

        checkIntestinalDisorder.setText("Intestinal Disorder");

        checkInjury.setText("Injury");

        checkHeadache.setText("Headache");

        checkArthritis.setText("Arthritis");

        checkInfection.setText("Infection");

        checkBrokenBones.setText("Broken Bones");

        checkSprain.setText("Sprain");

        checkAbdominalPain.setText("Abdominal Pain");

        checkFibromyalgia.setText("Fibromyalgia");

        checkSpasm.setText("Muscle Spasm");

        checkCancer.setText("Cancer");

        checkShingles.setText("Shingles");

        checkBackPain.setText("Low Back Pain");

        checkMSclerosis.setText("Multiple Sclerosis");

        checkNerveDamage.setText("Nerve Damage");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkHeadache)
                    .addComponent(checkBrokenBones)
                    .addComponent(checkAbdominalPain)
                    .addComponent(checkInfection)
                    .addComponent(checkSprain))
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkArthritis)
                    .addComponent(checkShingles)
                    .addComponent(checkInjury)
                    .addComponent(checkIntestinalDisorder)
                    .addComponent(checkNerveDamage))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkSpasm)
                    .addComponent(checkBackPain)
                    .addComponent(checkMSclerosis)
                    .addComponent(checkFibromyalgia)
                    .addComponent(checkCancer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBackPain)
                    .addComponent(checkArthritis)
                    .addComponent(checkAbdominalPain))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkHeadache)
                    .addComponent(checkMSclerosis)
                    .addComponent(checkIntestinalDisorder))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkFibromyalgia)
                    .addComponent(checkShingles)
                    .addComponent(checkInfection))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkSpasm)
                    .addComponent(checkSprain)
                    .addComponent(checkInjury))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBrokenBones)
                    .addComponent(checkCancer)
                    .addComponent(checkNerveDamage))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(cmbDosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(148, 148, 148)
                        .addComponent(btnDiagnose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnDiagnose)
                    .addComponent(txtNoOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiagnoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnoseActionPerformed
        // TODO add your handling code here:

        Symptoms symptoms = patient.getSymptomsHistory().addSymptoms();
        Prescription prescription = patient.getPrescriptionHistory().addPrescription();

        if (checkAbdominalPain.isSelected()) {
            symptoms.setHasAbdominalPain(true);
        }
        if (checkArthritis.isSelected()) {
            symptoms.setHasArthritis(true);
        }
        if (checkBackPain.isSelected()) {
            symptoms.setHasLowerBackPain(true);
        }
        if (checkBrokenBones.isSelected()) {
            symptoms.setHasBrokenBones(true);
        }
        if (checkCancer.isSelected()) {
            symptoms.setHasCancer(true);
        }
        if (checkFibromyalgia.isSelected()) {
            symptoms.setHasFibromyalgia(true);
        }
        if (checkHeadache.isSelected()) {
            symptoms.setHasHeadache(true);
        }
        if (checkInfection.isSelected()) {
            symptoms.setHasInfection(true);
        }
        if (checkInjury.isSelected()) {
            symptoms.setHasInjury(true);
        }
        if (checkIntestinalDisorder.isSelected()) {
            symptoms.setHasIntestinalDisorder(true);
        }
        if (checkMSclerosis.isSelected()) {
            symptoms.setHasMultipleSclerosis(true);
        }
        if (checkNerveDamage.isSelected()) {
            symptoms.setHasNerveDamage(true);
        }
        if (checkShingles.isSelected()) {
            symptoms.setHasShingles(true);
        }
        if (checkSpasm.isSelected()) {
            symptoms.setHasMuscleSpasm(true);
        }
        if (checkSprain.isSelected()) {
            symptoms.setHasSprain(true);
        }

        int dosage = Integer.parseInt(cmbDosage.getSelectedItem().toString());

        prescription.setNoOfDays(Integer.parseInt(txtNoOfDays.getText()));
        prescription.setDrugName("Codeine");
        prescription.setTotalOpioidsPrescribed(dosage * Integer.parseInt(txtNoOfDays.getText()));
        prescription.setOpdDate(new Date());

        workRequest.setResolveDate(new Date());
        workRequest.setStatus("Patient diagnosed");
    }//GEN-LAST:event_btnDiagnoseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnose;
    private javax.swing.JCheckBox checkAbdominalPain;
    private javax.swing.JCheckBox checkArthritis;
    private javax.swing.JCheckBox checkBackPain;
    private javax.swing.JCheckBox checkBrokenBones;
    private javax.swing.JCheckBox checkCancer;
    private javax.swing.JCheckBox checkFibromyalgia;
    private javax.swing.JCheckBox checkHeadache;
    private javax.swing.JCheckBox checkInfection;
    private javax.swing.JCheckBox checkInjury;
    private javax.swing.JCheckBox checkIntestinalDisorder;
    private javax.swing.JCheckBox checkMSclerosis;
    private javax.swing.JCheckBox checkNerveDamage;
    private javax.swing.JCheckBox checkShingles;
    private javax.swing.JCheckBox checkSpasm;
    private javax.swing.JCheckBox checkSprain;
    private javax.swing.JComboBox<String> cmbDosage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPrescriptionHistory;
    private javax.swing.JTextField txtFieldPatientAge;
    private javax.swing.JTextField txtFieldPatientBloodGroup;
    private javax.swing.JTextField txtFieldPatientGender;
    private javax.swing.JTextField txtFieldPatientName;
    private javax.swing.JTextField txtNoOfDays;
    // End of variables declaration//GEN-END:variables
}
