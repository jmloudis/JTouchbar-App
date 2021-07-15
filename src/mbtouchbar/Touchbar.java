/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbtouchbar;
import javax.swing.JFrame;
import com.thizzer.jtouchbar.JTouchBar;
import com.thizzer.jtouchbar.item.TouchBarItem;
import com.thizzer.jtouchbar.item.view.TouchBarButton;
import com.thizzer.jtouchbar.item.view.TouchBarTextField;
import com.thizzer.jtouchbar.item.view.TouchBarView;
import com.thizzer.jtouchbar.item.view.action.TouchBarViewAction;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jordan
 */
public class Touchbar extends javax.swing.JFrame {

    public Touchbar() {
        //System.out.println("Test");
        
        
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        
        JTextField textFieldUserName = new JTextField(50);
        frame.add(textFieldUserName);
        
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        
        frame.setLocationRelativeTo(null);
        
        JTouchBar jTouchBar = new JTouchBar();
        jTouchBar.setCustomizationIdentifier("MySwingJavaTouchBar");

        //label
        
        TouchBarTextField touchBarTextField = new TouchBarTextField();
        touchBarTextField.setStringValue("Test App");

        jTouchBar.addItem(new TouchBarItem("Test App", touchBarTextField, true));
        
        // button 
        
        TouchBarButton touchBarButtonImg = new TouchBarButton();
        touchBarButtonImg.setTitle("Exit");
        touchBarButtonImg.setAction(new TouchBarViewAction() {
            @Override
            public void onCall( TouchBarView view ) {
                    System.out.println("Exit");
                    frame.dispose();
                    
            }
        });
        
        jTouchBar.addItem(new TouchBarItem("Button_1", touchBarButtonImg, true));
//Image image = new Image();
//img.setName(ImageName.NSImageNameTouchBarColorPickerFill);
//touchBarButtonImg.setImage(image);

        jTouchBar.show(frame);
        
    }
    
    
    
    
    
    
    
    
}
