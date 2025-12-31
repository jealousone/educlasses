import java.util.*;

class Teacher extends Person {
    private String subject;

    public Teacher(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return "Teacher: ID=" + getId() + ", Name=" + getName() + ", Subject=" + subject;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}