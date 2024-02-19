/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import javax.swing.JPanel;

import models.AbstractPerson;
import models.Daycare;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import models.Student;
import java.time.LocalDate;
import javax.swing.*;


public class StudentRenewal {
    
    JPanel container;
    private Daycare daycare;
    private StudentMain prevController;
    public javax.swing.JButton backButton;
    public javax.swing.JButton renewButton;
    private JTable RenewalTable;
    private JTable NoRenewalTable;
    

    private View.RenewalTracking panel;
    public StudentRenewal(JPanel container, Daycare daycare, StudentMain prevController){
         this.container = container;
        this.daycare = daycare;
        this.prevController = prevController;
        
        this.panel = new View.RenewalTracking();
        this.backButton = panel.backButton;
        this.RenewalTable = panel.RenewalTable;
        this.NoRenewalTable = panel.NoRenewalTable;
        this.renewButton = panel.RenewButton;
        
        
        backButton.addActionListener(l -> {
            goBack();
        });
        
        renewButton.addActionListener(l -> {
            changeEnrollmentDate();
        });
        
    }
    
    
    public View.RenewalTracking getRenewalPanel() {
        addToTable();
        return panel;
    }
    
    private void changeEnrollmentDate(){
        
       int selectedRow = RenewalTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        int studentId = (int) RenewalTable.getValueAt(selectedRow, 0);
        AbstractPerson selectedStudent = daycare.getStudentById(studentId);
        
        if (selectedStudent != null) {
            Student s = (Student) selectedStudent;
            s.setLastRegisteredData(LocalDate.now());
            s.setIsRenewRequired(false);
            s.setExpectedRenewDate(s.getLastRegisteredData().plusYears(1L));
      
            JOptionPane.showMessageDialog(panel,
                    "Student enrollment renewed successfully ",
                    "Success",
                    JOptionPane.OK_OPTION);
            
           
          
            addToTable();
            
            
            
        }
    }
    
    private void addToTable(){
        DefaultTableModel model = (DefaultTableModel) RenewalTable.getModel();
        model.setRowCount(0);
        
        
        for (Student student : daycare.gerRenewalStudentList()) {
            System.out.println(student.getId());
            Object[] row = new Object[5];
            row[0] = student.getId();
            row[1] = student.getFirstName()+ " " + student.getLastName();
            row[2] = student.getAge();
            row[3] = student.getLastRegisteredData().toString();
            row[4] = student.getExpectedRenewDate().toString();
            model.addRow(row);
        }
        DefaultTableModel m = (DefaultTableModel) NoRenewalTable.getModel();
        m.setRowCount(0);
        

       for (Student student : daycare.getNonRenewStudentList()) {
            Object[] row = new Object[5];
            row[0] = student.getId();
            row[1] = student.getFirstName()+ " " + student.getLastName();
            row[2] = student.getAge();
            row[3] = student.getLastRegisteredData().toString();
            row[4] = student.getExpectedRenewDate().toString();
            m.addRow(row);
        }
    }
    
    private void goBack() {
        container.remove(panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        prevController.populateTable();
    }
     
}
