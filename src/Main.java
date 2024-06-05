import java.awt.*;

public class Main {

    public static void main(String args[]) {

        IDandPassword idPassword = new IDandPassword();

        LoginPage loginPage = new LoginPage(idPassword.getLogin());

    }
}

