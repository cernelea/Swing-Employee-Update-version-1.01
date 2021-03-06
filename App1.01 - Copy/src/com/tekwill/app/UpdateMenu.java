/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekwill.app;

import com.tekwill.EmployeeModel.Address;
import com.tekwill.EmployeeModel.ContactDetails;
import com.tekwill.EmployeeModel.Country;
import com.tekwill.EmployeeModel.Employee;
import com.tekwill.EmployeeModel.Job;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrei
 */
public class UpdateMenu extends javax.swing.JFrame {

    /**
     * Creates new form UpdateMenu
     */
    public UpdateMenu() {
        initComponents();

        Menu.windowIsOpened = true;

        this.addYearsComboBox();
        this.addMonths();
        this.addDays();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exceptionLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        streetFIeld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        postCodeField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        comboBoxAddMenu = new javax.swing.JComboBox<>();
        countryComboBoxAddMenu = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        yearsComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        dayComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Pick Country:");

        streetFIeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetFIeldActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter day of birth");

        jLabel8.setText("Enter street");

        jLabel6.setText("Entry postcode");

        postCodeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postCodeFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Name");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comboBoxAddMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programmer", "Electrician", "Manager", "Doctor", "Director" }));
        comboBoxAddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAddMenuActionPerformed(evt);
            }
        });

        countryComboBoxAddMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moldova", "Romania", "USA", "UK", "Russia" }));

        jLabel9.setText("Pick job:");

        yearsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(exceptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(streetFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yearsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(postCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(countryComboBoxAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(53, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(streetFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yearsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(countryComboBoxAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exceptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(113, 113, 113))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void streetFIeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetFIeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetFIeldActionPerformed

    private void postCodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postCodeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postCodeFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String name = nameField.getText();

            Integer i = Menu.getjTable1().getSelectedRow();

            DefaultTableModel model = (DefaultTableModel) Menu.getjTable1().getModel();
            Integer key = Integer.parseInt(String.valueOf(model.getValueAt(i, 0)));
            ContactDetails contact = this.contact();

            Menu.service.createEmployee(name, key, contact);

            model.removeRow(i);
            Object[] rowData = Menu.getRowData();

            model.insertRow(i, rowData);

            System.out.println(Menu.service.getEmployeeMap());
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            Menu.windowIsOpened = false;
            this.dispose();

        } catch (NumberFormatException numE) {

            exceptionLabel.setText("Invalid input");

        } catch (DateTimeParseException dateE) {
            exceptionLabel.setText("Invalid Date input (YYYY-MM-DD)");

        } catch (ArrayIndexOutOfBoundsException arrE) {
            exceptionLabel.setText("No elements have been selected to update. Please try again.");

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBoxAddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAddMenuActionPerformed

    }//GEN-LAST:event_comboBoxAddMenuActionPerformed

    private void yearsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsComboBoxActionPerformed

    public static JTextField getNameField() {
        return nameField;
    }

    public static JTextField getPostCodeField() {
        return postCodeField;
    }

    public static JTextField getStreetFIeld() {
        return streetFIeld;
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
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> comboBoxAddMenu;
    private static javax.swing.JComboBox<String> countryComboBoxAddMenu;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JLabel exceptionLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> monthComboBox;
    private static javax.swing.JTextField nameField;
    private static javax.swing.JTextField postCodeField;
    private static javax.swing.JTextField streetFIeld;
    private javax.swing.JComboBox<String> yearsComboBox;
    // End of variables declaration//GEN-END:variables

    private ContactDetails contact() {
        Job job = this.jobSelection();

        Integer year = Integer.parseInt(yearsComboBox.getSelectedItem().toString());
        Integer month = Integer.parseInt(monthComboBox.getSelectedItem().toString());
        Integer day = Integer.parseInt(dayComboBox.getSelectedItem().toString());

        LocalDate birthday = LocalDate.of(year, month, day);
        Country country = this.countrySelection();
        String postCode = postCodeField.getText();
        String street = streetFIeld.getText();

        Address address = new Address(1, country, postCode, street);
        ContactDetails contact = new ContactDetails(1, job, birthday, address);

        return contact;
    }

    private Job jobSelection() {
        for (Job job : Job.values()) {
            if (job.toString().equals(comboBoxAddMenu.getSelectedItem().toString().toUpperCase())) {

                return job;

            }

        }
        return null;

    }

    private Country countrySelection() {
        for (Country country : Country.values()) {
            if (country.toString().equals(countryComboBoxAddMenu.getSelectedItem().toString().toUpperCase())) {

                return country;
            }

        }
        return null;

    }

    private void addYearsComboBox() {

        for (int i = 2018; i > 1900; i--) {

            this.yearsComboBox.addItem(String.valueOf(i));

        }

    }

    private void addMonths() {

        for (int i = 1; i < 13; i++) {

            this.monthComboBox.addItem(String.valueOf(i));

        }

    }

    private void addDays() {

        for (int i = 1; i < 32; i++) {
            this.dayComboBox.addItem(String.valueOf(i));

        }

    }

}
