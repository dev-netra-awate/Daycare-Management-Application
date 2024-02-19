
package Controller;

import models.Daycare;
import models.Student;
import models.StudentEagerSingletonFactory;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AddStudent {

    JPanel container;
    private Daycare daycare;
    private StudentMain studentprevController;

    private View.NewStudent panel;
    
    public javax.swing.JTextField id;
    public javax.swing.JTextField lastName;
    public javax.swing.JTextField firstName;
    public javax.swing.JButton addNewStudentButton;
    public javax.swing.JTextField age;
    public javax.swing.JButton backButton;
    public javax.swing.JTextField fatherName;
    public javax.swing.JTextField motherName;
    public javax.swing.JTextField enrollDate;
    public javax.swing.JTextField address;
    public javax.swing.JTextField phoneNum;
    public javax.swing.JComboBox ageGroupAssigned;
    


    public AddStudent(JPanel container, Daycare daycare, StudentMain prevController) {
        this.container = container;
        this.daycare = daycare;
        this.studentprevController = prevController;

        this.panel = new View.NewStudent();

        this.addNewStudentButton = panel.addStudentButton;
        this.phoneNum = panel.phoneNumberValue;
        this.age = panel.ageValue;
        this.backButton = panel.backButton;
        this.address = panel.addressValue;
        this.firstName = panel.studentLastNameValue;
        this.lastName = panel.studentFirstNameValue;
        this.fatherName = panel.fatherNameValue;
        this.ageGroupAssigned = panel.ageGroupAssignedValue;
        this.motherName = panel.motherNameValue;
        this.id = panel.idValue;
        this.enrollDate = panel.enrolledOn;
        
        

        backButton.addActionListener(l -> {
            goBackHandler();
        });

        addNewStudentButton.addActionListener(l -> {
            addStudentToSchool();
        });

    }
    
    private void goBackHandler() {
         container.remove(panel); 
        CardLayout layout = (CardLayout) container.getLayout();
       
        layout.previous(container);
        
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        studentprevController.populateTable();
    }

    public View.NewStudent fetchStudentPanel() {
        panel.idValue.setText(String.valueOf(daycare.getListStudent().size()+1));
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        panel.enrolledOn.setText(date);
        return panel;
    }

    private void addStudentToSchool() {
        String idField = id.getText();
        String lastNameField = lastName.getText();
        String enrolledOnField = enrollDate.getText();
        String ageField = age.getText();
        String firstNameField = firstName.getText();
        String fatherNameField = fatherName.getText();
        String motherNameField = motherName.getText();
        String ageGroupAssigedField =  ageGroupAssigned.getSelectedItem().toString();
        String addressField = address.getText();
        String phoneNumberField = phoneNum.getText();
        
        
        if (firstNameField.equals("") || lastNameField.equals("") || idField.equals("") || ageField.equals("") || enrolledOnField.equals("") 
                || addressField.equals("")|| phoneNumberField.equals("") || fatherNameField.equals("")|| motherNameField.equals("")) {
            JOptionPane.showMessageDialog(panel,
                    "Complete all the Necessary fields",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
         
        String stringObject = idField + "," + ageField + "," + firstNameField + "," + lastNameField + "," + enrolledOnField + "," + fatherNameField + "," + motherNameField + "," + addressField +  "," + phoneNumberField + ",false," + ageGroupAssigedField;

        try {
            
            
         
         if ((Integer.parseInt(ageField))<=0 ||(Integer.parseInt(ageField))>100 ){
            JOptionPane.showMessageDialog(null, "Your childs age does not fit our criteria of admisiion");
            return;
        }
        if (!isnumberValid(phoneNumberField) ||phoneNumberField.length()!=10 ){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Phone Number");
            return;
        }
            Student studentObj = StudentEagerSingletonFactory.getInstance().getObject(stringObject);
            daycare.addToDaycare(studentObj);
            JOptionPane.showMessageDialog(panel, "Student successfully created.");
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel,
                    "Error. Student can't be Created",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }
    
    public boolean isnumberValid(String number){
       String regex = "^[0-9]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(number);
        return m.matches();         
    }

//    private void addStudentToSchool() {
//        String idField = id.getText();
//        String lastNameField = lastName.getText();
//        String enrolledOnField = enrollDate.getText();
//        String ageField = age.getText();
//        String firstNameField = firstName.getText();
//        String fatherNameField = fatherName.getText();
//        String motherNameField = motherName.getText();
//        String ageGroupAssigedField =  ageGroupAssigned.getSelectedItem().toString();
//        String addressField = address.getText();
//        String phoneNumberField = phoneNum.getText();
//        
//
//
//        if (firstNameField.equals("") || lastNameField.equals("") || idField.equals("") || ageField.equals("") || enrolledOnField.equals("") 
//                || addressField.equals("")|| phoneNumberField.equals("") || fatherNameField.equals("")|| motherNameField.equals("")) {
//            JOptionPane.showMessageDialog(panel,
//                    "Complete all the Necessary fields",
//                    "Error Message",
//                    JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//
//        String stringObject = idField + "," + ageField + "," + firstNameField + "," + lastNameField + "," + enrolledOnField + "," + fatherNameField + "," + motherNameField + "," + addressField +  "," + phoneNumberField + ",false," + ageGroupAssigedField ;
//
//        try {
//            Student studentObj = StudentEagerSingletonFactory.getInstance().getObject(stringObject);
//            daycare.addToDaycare(studentObj);
//
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(panel,
//                    "Error. Student can't be Created",
//                    "Error Message",
//                    JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        JOptionPane.showMessageDialog(panel, "Student successfully created.");
//    }

}
