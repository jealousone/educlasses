import java.util.*;

class Institution {
    private String name;
    private String city;
    private List<Student> students;
    private List<Teacher> teachers;

    public Institution(String name, String city) {
        this.name = name;
        this.city = city;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public Student findStudentByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public List<Student> filterStudentsByAge(int age) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getAge() == age) {
                result.add(s);
            }
        }
        return result;
    }

    public void sortStudentsByAge() {
        students.sort(Comparator.comparingInt(Student::getAge));
    }

    public String getInfo() {
        return "Institution: Name=" + name + ", City=" + city;
    }
}