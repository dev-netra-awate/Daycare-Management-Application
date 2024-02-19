
package Controller;

import Configuration.Daycare;
import Utils.Icon;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.MaterialOceanicTheme;


public class SignIn {

    private models.Daycare daycare;
    private View.Login login;

    
    private Map<JButton, String> iconMap = new HashMap<>();
    public SignIn() {
        
        
        
        daycare = Daycare.captureData();

        login = new View.Login(daycare);
        setIcons();
        login.pack();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
            
    }
    
    private void setIcons() {
        Icon imageHelper = new Icon();

        for (Map.Entry<JButton, String> button : iconMap.entrySet()) {
            imageHelper.setIcon(button.getValue(), button.getKey());
        }}

    
    public static void main(String[] args) {
        try {
       

      UIManager.setLookAndFeel(new MaterialLookAndFeel(new MaterialOceanicTheme()));
     } catch (UnsupportedLookAndFeelException e) {
     }
        SignIn lc = new SignIn();
    }
    
}
