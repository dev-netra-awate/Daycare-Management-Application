
package Controller;

import Utils.Icon;
import models.AbstractPerson;
import models.Daycare;
import View.UpdateStudentProfile;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JPanel;


public class FetchStudentData {

    private JPanel container;
    private Daycare daycare;
    private AbstractPerson student;
    private StudentMain prevController;
    
    private UpdateStudentProfile panel;
    
    public JButton backButton;
    
    private Map<JButton, String> buttonIconMap = new HashMap<>();

    public FetchStudentData(JPanel container, AbstractPerson student, Daycare daycare, StudentMain prevController) {
        this.container = container;
        this.daycare = daycare;
        this.student = student;
        
        this.prevController = prevController;
        
        panel = new UpdateStudentProfile(container, student, daycare);
        
        this.backButton = panel.backButton;
        
        backButton.addActionListener(l -> {
            goToPrevScreen();
        });
    }
    
    public UpdateStudentProfile fetchStudentPanel() {
        setIcons();
        return panel;
    }
    
    private void setIcons() {
        Icon image = new Icon();
        for (Map.Entry<JButton, String> button : buttonIconMap.entrySet()) {
            image.setIcon(button.getValue(), button.getKey());
        }
    }
    
    private void goToPrevScreen() {
        container.remove(panel);
         CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        prevController.populateTable();
    }
}
