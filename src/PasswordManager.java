import java.util.UUID;

public class PasswordManager {

    private String webSiteName;
    private String email;
    private String uuid;
    private String password;

    public PasswordManager(String webSiteName, String email, String password){
        this.uuid = UUID.randomUUID().toString();
        this.webSiteName = webSiteName;
        this.email = email;
        this.password = password;
    }

    public String getWebSiteName() {
        return webSiteName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PasswordManager{" +
                "webSiteName='" + webSiteName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
