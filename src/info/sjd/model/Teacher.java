package info.sjd.model;

public class Teacher extends User{

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public Teacher(String login, String password, String fitst_name, String last_name, String subject) {
        super(login, password, fitst_name, last_name);
        this.subject = subject;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + " " + subject;
    }

}
