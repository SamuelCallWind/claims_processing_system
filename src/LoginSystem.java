import java.awt.*;

class LoginSystem {

    int height = 600;
    int width = 500;

    LoginSystem() {

        Frame frame = new Frame();

        Label l = new Label("employee id:");

        Button b = new Button("Submit");

        TextField t = new TextField();

        l.setBounds(50, 50, 100, 30);
        b.setBounds(50, 150, 100, 30);
        t.setBounds(50, 100, 200, 30);

        frame.add(l);
        frame.add(t);
        frame.add(b);

        frame.setTitle("Login");

        frame.setSize(width, height);

        frame.setLayout(null);
        frame.setVisible(true);


    }

    public static void main(String args[]) {

        LoginSystem newLogin = new LoginSystem();


    }
}

