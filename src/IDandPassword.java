import java.util.HashMap;

public class IDandPassword {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPassword() {
        loginInfo.put("Sam", "test");
        loginInfo.put("Samuel", "abcdef");
        loginInfo.put("Claude", "Crocodile");
    }

    protected  HashMap getLogin() {
        return loginInfo;
    }
}
