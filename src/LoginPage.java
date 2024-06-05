import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.util.HashMap;

public class  LoginPage implements EventListener {

    HashMap<String,String> loginInfo = new HashMap<String,String>();
    Frame frame = new Frame();
    Button submit = new Button("Submit");
    Button reset = new Button("Reset");
    TextArea userIdField = new TextArea();
    JPasswordField userPasswordField = new JPasswordField();
    Label userID = new Label("User ID:");
    Label userPassword = new Label("Password:");
    Label messageLabel = new Label();
    
    LoginPage(HashMap<String, String> loginInfoOriginal)   {
        loginInfo = loginInfoOriginal;
        frame.
    }

    public void ActionPerformed(ActionEvent e) {

    }
}
