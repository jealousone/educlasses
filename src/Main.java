import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Institution institution = new Institution("Astana IT University", "Astana");

        institution.addStudent(new Student(1, "Ali", 18));
        institution.addStudent(new Student(2, "Amina", 19));
        institution.addStudent(new Student(3, "Daniyar", 18));

        institution.addTeacher(new Teacher(101, "Aidana", "Computer Science"));
        institution.addTeacher(new Teacher(102, "Kairat", "Mathematics"));

        boolean running = true;

        while (running) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Show institution info");
            System.out.println("2. Show all students");
            System.out.println("3. Show all teachers");
            System.out.println("4. Find student by name");
            System.out.println("5. Filter students by age");
            System.out.println("6. Sort students by age");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(institution.getInfo());
                    break;

                case 2:
                    System.out.println("\nStudents:");
                    for (Student s : institution.getStudents()) {
                        System.out.println(s);
                    }
                    break;

                case 3:
                    System.out.println("\nTeachers:");
                    for (Teacher t : institution.getTeachers()) {
                        System.out.println(t);
                    }
                    break;

                case 4:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    Student found = institution.findStudentByName(name);
                    System.out.println(found != null ? found : "Student not found");
                    break;

                case 5:
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    List<Student> filtered = institution.filterStudentsByAge(age);
                    if (filtered.isEmpty()) {
                        System.out.println("No students found");
                    } else {
                        for (Student s : filtered) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 6:
                    institution.sortStudentsByAge();
                    System.out.println("Students sorted by age:");
                    for (Student s : institution.getStudents()) {
                        System.out.println(s);
                    }
                    break;

                case 0:
                    running = false;
                    System.out.println("Program finished");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}