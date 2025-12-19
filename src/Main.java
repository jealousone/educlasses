class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return "Student: Name: " + name + ", Age: " + age + " years.";
    }
}

class Teacher {
    private int id;
    private String name;
    private String subject;

    public Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getInfo() {
        return "Teacher: Name: " + name + ", Subject: " + subject + ".";
    }
}

class Institution {
    private String name;
    private String city;

    public Institution(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInfo() {
        return "Institution: Name: " + name + ", City: " + city + ".";
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Ali", 18);
        Student student2 = new Student(2, "Amina", 19);

        Teacher teacher1 = new Teacher(101, "Aidana", "Computer Science");
        Teacher teacher2 = new Teacher(102, "Kairat", "Mathematics");

        Institution institution = new Institution("Astana IT Universitygi", "Astana");

        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(teacher1.getInfo());
        System.out.println(teacher2.getInfo());
        System.out.println(institution.getInfo());
        System.out.println();
        System.out.println("Comparisons:");
        System.out.println("Are students the same age? " + (student1.getAge() == student2.getAge()));
        System.out.println("Do teachers teach the same subject? " + teacher1.getSubject().equals(teacher2.getSubject()));
    }
}
