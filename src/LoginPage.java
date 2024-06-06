import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.HashMap;

public class  LoginPage implements ActionListener {

    HashMap<String,String> loginInfo = new HashMap<String,String>();
    JFrame frame = new JFrame();
    JButton submit = new JButton("Submit");
    JButton resetButton = new JButton("Reset");
    JTextArea userIdField = new JTextArea();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel("");

    LoginPage(HashMap<String, String> loginInfoOriginal)   {
        loginInfo = loginInfoOriginal;

        frame.setSize(350, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        userIDLabel.setBounds(10, 50, 80, 50);
        userIdField.setBounds(100, 50, 200, 30);

        userPasswordLabel.setBounds(10, 110, 80, 50);
        userPasswordField.setBounds(100, 110, 200, 40);

        submit.setBounds(75, 200, 100, 50);
        submit.addActionListener(this);

        resetButton.setBounds(175, 200, 100, 50);
        resetButton.addActionListener(this);

        messageLabel.setBounds(10, 250, 1000, 50);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));



        frame.add(userIDLabel);
        frame.add(userIdField);
        frame.add(userPasswordLabel);
        frame.add(userPasswordField);
        frame.add(submit);
        frame.add(resetButton);
        frame.add(messageLabel);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==  resetButton) {
            userIdField.setText("");
            userPasswordField.setText("");
            messageLabel.setText("");
        }
        if (e.getSource() == submit) {
            String IDString = userIdField.getText();
            String passwordString = String.valueOf(userPasswordField.getPassword());

            if (loginInfo.containsKey(IDString)) {
                 if (loginInfo.get(IDString).equals(passwordString)) {
                     messageLabel.setText("You successfully logged in !");
                     messageLabel.setForeground(Color.green);
                 } else {
                     messageLabel.setText("Wrong password !");
                     messageLabel.setForeground(Color.orange);
                 }
            }
        }
    }
}
