import java.util.List;



public class User {

    private String username;

    private String password;

    private List<String> roles;



    public User(String username, String password, List<String> roles) {

        this.username = username;

        this.password = password;

        this.roles = roles;

    }



    public String getUsername(){

        return this.username;

    }



    public String getPassword(){

        return this.password;

    }



    public List<String> getRoles(){

        return this.roles;

    }

}
