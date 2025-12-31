import java.util.*;

class Student extends Person {
    private int age;

    public Student(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getInfo() {
        return "Student: ID=" + getId() + ", Name=" + getName() + ", Age=" + age;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}