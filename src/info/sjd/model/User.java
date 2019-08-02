package info.sjd.model;

public class User {

    private String login;
    private String password;
    private String fitst_name;
    private String last_name;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFitst_name() {
        return fitst_name;
    }

    public void setFitst_name(String fitst_name) {
        this.fitst_name = fitst_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public User(String login, String password, String fitst_name, String last_name) {
        this.login = login;
        this.password = password;
        this.fitst_name = fitst_name;
        this.last_name = last_name;
    }

    public User() {
    }
    public User clone (User user) {
        User clone = new User(user.login,user.password, user.fitst_name, user.last_name);
        return clone:
    }
        @Override
                public String toString() {
            return login + " " +  password + " " + fitst_name + " " + last_name;
        }



}
