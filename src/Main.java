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
